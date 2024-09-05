package com.itsnaveenk.spring_kafka_consumer_elastic.repository;


import com.itsnaveenk.spring_kafka_consumer_elastic.entity.NotificationEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<NotificationEntity, String> {
    List<NotificationEntity> findByMessage(String text);
}
