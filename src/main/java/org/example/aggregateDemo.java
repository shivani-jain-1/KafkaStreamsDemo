package org.example;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Printed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Properties;

//kafka-console-producer.bat --bootstrap-server localhost:9092 --topic groupby-demo --property "parse.key=true" --property "key.separator= "
public class aggregateDemo {


    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(aggregateDemo.class);

    public static void main(String[] args) {
        final Properties properties = new Properties();
        properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "WeatherReport");
        properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(StreamsConfig.STATE_DIR_CONFIG, "tmp/state-store-aggregate"); //Base directory location where application going to create your local statestore
        properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KStream<String,String> ks0 = streamsBuilder.stream("groupby-demo");
        KStream<String,String> ks1 = ks0.flatMapValues(v-> Arrays.asList(v.toLowerCase().split(" ")));

        KGroupedStream<String,String> kgs1 = ks1.groupBy((k,v)->v);
        KTable<String,Long> Kt1 = kgs1.count();
        Kt1.toStream().print(Printed.<String,Long>toSysOut().withLabel("KT1"));

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
