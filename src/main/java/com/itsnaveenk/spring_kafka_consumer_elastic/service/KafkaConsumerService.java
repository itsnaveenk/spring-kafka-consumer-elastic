package com.itsnaveenk.spring_kafka_consumer_elastic.service;

import com.itsnaveenk.spring_kafka_consumer_elastic.Entity.FoodOrderNotification;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;



@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "foodsOrder", groupId = "springConsumerGroup1")
    public void consume(FoodOrderNotification foodOrderNotification) {
        System.out.println("Consumed message: " + foodOrderNotification.toString());
    }
}