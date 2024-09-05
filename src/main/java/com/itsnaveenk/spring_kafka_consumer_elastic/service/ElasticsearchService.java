package com.itsnaveenk.spring_kafka_consumer_elastic.service;


import com.itsnaveenk.spring_kafka_consumer_elastic.entity.NotificationEntity;
import com.itsnaveenk.spring_kafka_consumer_elastic.model.Notification;
import com.itsnaveenk.spring_kafka_consumer_elastic.repository.ElasticRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ElasticsearchService {

    private final ElasticRepository elasticRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ElasticsearchService(ElasticRepository elasticRepository, ModelMapper modelMapper) {
        this.elasticRepository = elasticRepository;
        this.modelMapper = modelMapper;
    }

    public void saveNotification(Notification notification) {
        NotificationEntity notificationEntity = modelMapper.map(notification, NotificationEntity.class);
        elasticRepository.save(notificationEntity);
    }


}
