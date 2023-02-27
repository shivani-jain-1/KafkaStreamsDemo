package org.example;


import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Printed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class KtableDemo {

    private static final Logger Logger = LoggerFactory.getLogger(KtableDemo.class);

    public static void main(String[] args) {
         final Properties properties = new Properties();
            properties.put(StreamsConfig.APPLICATION_ID_CONFIG,"WeatherReport");
            properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
            properties.put(StreamsConfig.STATE_DIR_CONFIG,"tmp/state-store"); //Base directory location where application going to create your local statestore
            properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
            properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.String().getClass());

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KTable<String, String> kt0 = streamsBuilder.table("ktable-demo");
        kt0.toStream().print(Printed.<String,String>toSysOut().withLabel("KT0"));

        KTable<String, String> kt1 =kt0.filter((k,v)->k.matches("Monday")||k.matches("Thursday") && !v.isEmpty(), Materialized.as("state-store"));
        kt1.toStream().print(Printed.<String, String>toSysOut().withLabel("KT1"));

        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(),properties);

        //QueryServer

        streams.start();
        //we want to be read and display the content of local stateStore


        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            Logger.info("shutting down streams");
            streams.close();
        }));
    }
}
