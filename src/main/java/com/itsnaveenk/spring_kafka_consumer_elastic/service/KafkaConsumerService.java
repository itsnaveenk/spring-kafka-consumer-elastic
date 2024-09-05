package com.itsnaveenk.spring_kafka_consumer_elastic.service;

import com.itsnaveenk.spring_kafka_consumer_elastic.entity.NotificationEntity;
import com.itsnaveenk.spring_kafka_consumer_elastic.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.AbstractElasticsearchTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    ElasticsearchService elasticsearchService;

    @KafkaListener(topics = "foodsOrder", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(Notification notification) {
        System.out.println("Received notification: " + notification);
        // Process the notification
        elasticsearchService.saveNotification(notification);

    }
}
