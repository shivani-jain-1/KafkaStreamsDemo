package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.nio.charset.StandardCharsets;

public class WeatherDeserializer implements Deserializer<Weather> {

    private Gson gson =
            new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();


    @Override
    public Weather deserialize(String s, byte[] bytes) {
        if (bytes == null) return null;
        return gson.fromJson(
                new String(bytes, StandardCharsets.UTF_8), Weather.class);
    }
}
