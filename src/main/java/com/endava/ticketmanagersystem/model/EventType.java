package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "EventType", schema = "dbo")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

    public EventType(int eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }

    public EventType(){

    }

    public int getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
