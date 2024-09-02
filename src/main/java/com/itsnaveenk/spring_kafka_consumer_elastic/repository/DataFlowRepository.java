package com.itsnaveenk.spring_kafka_consumer_elastic.repository;

import com.itsnaveenk.spring_kafka_consumer_elastic.Entity.FoodOrderNotification;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataFlowRepository extends ElasticsearchRepository<FoodOrderNotification, String> {
}
