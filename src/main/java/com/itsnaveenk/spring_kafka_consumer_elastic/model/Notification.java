package com.itsnaveenk.spring_kafka_consumer_elastic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class Notification {

    private int user_Id;


    private String message;

    private int recipient_Id;

    public Notification() {
    }
    public Notification(int user_Id, String message, int recipient_Id) {
        this.user_Id = user_Id;
        this.message = message;
        this.recipient_Id = recipient_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRecipient_Id() {
        return recipient_Id;
    }

    public void setRecipient_Id(int recipient_Id) {
        this.recipient_Id = recipient_Id;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "user_Id=" + user_Id +
                ", message='" + message + '\'' +
                ", recipient_Id=" + recipient_Id +
                '}';
    }
}
