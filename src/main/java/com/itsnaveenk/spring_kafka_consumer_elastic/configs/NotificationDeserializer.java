package com.itsnaveenk.spring_kafka_consumer_elastic.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itsnaveenk.spring_kafka_consumer_elastic.model.Notification;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class NotificationDeserializer implements Deserializer<Notification> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // Any configuration can be handled here

    }

    @Override
    public Notification deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, Notification.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void close() {
        // Cleanup if needed
//        objectMapper = null;

    }
}
