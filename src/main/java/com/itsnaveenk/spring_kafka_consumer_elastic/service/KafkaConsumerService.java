package com.itsnaveenk.spring_kafka_consumer_elastic.service;

import com.itsnaveenk.spring_kafka_consumer_elastic.Entity.FoodOrderNotification;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;



@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my_topic", groupId = "my_group_id")
    public void consume(FoodOrderNotification message) {
        System.out.println("Consumed message: " + message.toString());
    }
}