package com.itsnaveenk.spring_kafka_consumer_elastic.model;

public class Notification {

    private int user_id;
    private String message;
    private int recipient_id;

    public Notification() {
    }

    public Notification(int user_id, String message, int recipient_id) {
        this.user_id = user_id;
        this.message = message;
        this.recipient_id = recipient_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(int recipient_id) {
        this.recipient_id = recipient_id;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "user_id=" + user_id +
                ", message='" + message + '\'' +
                ", recipient_id=" + recipient_id +
                '}';
    }
}