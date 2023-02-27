package org.example;

import org.apache.kafka.streams.kstream.ValueTransformer;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueIterator;
import org.apache.kafka.streams.state.KeyValueStore;
import org.example.Weather;

public class AverageTempTransform implements ValueTransformer<Weather,Double> {
    private KeyValueStore<String,Double> stateStore;
    @Override
    public void init(ProcessorContext processorContext) {
     this.stateStore = (KeyValueStore<String,Double>) processorContext.getStateStore("Store-WeatherReportPlace1");
    }

    @Override
    public Double transform(Weather weather) {

              Double avgTemp = (weather.getMinTemp()+weather.getMaxTemp())/2;
        return avgTemp;
    }

    @Override
    public void close() {

    }
}
