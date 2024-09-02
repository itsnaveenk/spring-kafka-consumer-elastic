package com.itsnaveenk.spring_kafka_consumer_elastic.Entity;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "food_order_index")
public class FoodOrderNotification {
    private String user_id;
    private String message;
    private String recipient_id;

    public FoodOrderNotification(String user_id, String message, String recipient_id) {
        this.user_id = user_id;
        this.message = message;
        this.recipient_id = recipient_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(String recipient_id) {
        this.recipient_id = recipient_id;
    }

    @Override
    public String toString() {
        return "FoodOrderNotification{" +
                "user_id='" + user_id + '\'' +
                ", message='" + message + '\'' +
                ", recipient_id='" + recipient_id + '\'' +
                '}';
    }
}
