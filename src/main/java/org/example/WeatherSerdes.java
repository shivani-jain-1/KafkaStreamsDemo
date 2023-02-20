package org.example;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class WeatherSerdes implements Serde<Weather> {
    @Override
    public Serializer<Weather> serializer() {
        return new WeatherSerializer();
    }

    @Override
    public Deserializer<Weather> deserializer() {
        return new WeatherDeserializer();
    }
}
