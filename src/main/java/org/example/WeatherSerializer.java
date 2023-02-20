package org.example;

import com.google.gson.Gson;
import org.apache.kafka.common.serialization.Serializer;

import java.nio.charset.StandardCharsets;

public class WeatherSerializer implements Serializer<Weather> {

    private Gson gson = new Gson();

    @Override
    public byte[] serialize(String s, Weather weather) {
        if (weather == null) return null;
        return gson.toJson(weather).getBytes(StandardCharsets.UTF_8);
    }
}
