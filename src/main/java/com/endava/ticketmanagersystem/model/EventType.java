package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "EventType", schema = "dbo")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EventTypeID;

    @Column(name = "EventTypeName")
    private String EventTypeName;

    public EventType(int eventTypeID, String eventTypeName) {
        EventTypeID = eventTypeID;
        EventTypeName = eventTypeName;
    }

    public EventType(){

    }

    public int getEventTypeID() {
        return EventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        EventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        EventTypeName = eventTypeName;
    }
}
