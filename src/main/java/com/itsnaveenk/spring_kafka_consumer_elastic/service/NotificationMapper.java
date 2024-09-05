package com.itsnaveenk.spring_kafka_consumer_elastic.service;

import com.itsnaveenk.spring_kafka_consumer_elastic.entity.NotificationEntity;
import com.itsnaveenk.spring_kafka_consumer_elastic.model.Notification;

import java.io.Serializable;
import java.util.Objects;

/**
 * Custom DTO for Notification
 */
public class NotificationMapper implements Serializable {
    private final int user_id;
    private final String message;
    private final int recipient_id;

    public NotificationMapper(int user_id, String message, int recipient_id) {
        this.user_id = user_id;
        this.message = message;
        this.recipient_id = recipient_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getMessage() {
        return message;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationMapper entity = (NotificationMapper) o;
        return Objects.equals(this.user_id, entity.user_id) &&
                Objects.equals(this.message, entity.message) &&
                Objects.equals(this.recipient_id, entity.recipient_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, message, recipient_id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "user_id = " + user_id + ", " +
                "message = " + message + ", " +
                "recipient_id = " + recipient_id + ")";
    }
}
