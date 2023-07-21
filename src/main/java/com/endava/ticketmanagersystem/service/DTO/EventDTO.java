package com.endava.ticketmanagersystem.service.DTO;

import com.endava.ticketmanagersystem.model.EventType;
import com.endava.ticketmanagersystem.model.Venue;

import java.time.LocalDateTime;

public class EventDTO {
    public EventDTO(){};
    private int eventDtoID;
    private String eventDescription;
    private String eventName;
    private LocalDateTime eventStartDate;
    private LocalDateTime getEventEndDate;
    private Venue venue;
    private EventType eventType;

    public int getEventDtoID() {
        return eventDtoID;
    }

    public void setEventDtoID(int eventDtoID) {

        this.eventDtoID = eventDtoID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDateTime eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public LocalDateTime getGetEventEndDate() {
        return getEventEndDate;
    }

    public void setGetEventEndDate(LocalDateTime getEventEndDate) {
        this.getEventEndDate = getEventEndDate;
    }

    public com.endava.ticketmanagersystem.model.Venue getVenue() {
        return venue;
    }

    public void setVenue(com.endava.ticketmanagersystem.model.Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
