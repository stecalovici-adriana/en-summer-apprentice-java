package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Entity
@Table(name = "Event", schema = "dbo")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventID;

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;

    @OneToMany(mappedBy = "Event",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<TicketCategory> TicketCategoryList;

    @Column(name = "eventDescription")
    private String eventDescription;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public List<TicketCategory> getTicketCategoryList() {
        return TicketCategoryList;
    }

    public void setTicketCategoryList(List<TicketCategory> ticketCategoryList) {
        TicketCategoryList = ticketCategoryList;
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

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Event(int eventID, Venue venue, EventType eventType, List<TicketCategory> ticketCategoryList, String eventDescription, String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        TicketCategoryList = ticketCategoryList;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Event(){

    }
}
