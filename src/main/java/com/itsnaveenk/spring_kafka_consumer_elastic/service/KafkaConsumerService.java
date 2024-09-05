package com.itsnaveenk.spring_kafka_consumer_elastic.service;

import com.itsnaveenk.spring_kafka_consumer_elastic.model.Notification;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "foodsOrder", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(Notification notification) {
        System.out.println("Received notification: " + notification);
        // Process the notification
    }

}
