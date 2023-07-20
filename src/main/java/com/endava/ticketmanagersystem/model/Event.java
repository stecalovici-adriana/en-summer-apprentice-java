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
    private int EventID;
    @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue Venue;

    @ManyToOne
    @JoinColumn(name = "EvenTypeID")
    private Event EvenType;

    @OneToMany(mappedBy = "Event",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<TicketCategory> TicketCategoryList;

    @Column(name = "EventDescription")
    private String EventDescription;

    @Column(name = "EventName")
    private String EventName;

    @Column(name = "StartDate")
    private LocalDateTime StartDate;

    @Column(name = "EndDate")
    private LocalDateTime EndDate;
    public int getEventID() {
        return EventID;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public Venue getVenueID() {
        return Venue;
    }

    public void setVenueID(Venue venueID) {
        Venue = venueID;
    }

    public Event getEvenTypeID() {
        return EvenType;
    }

    public void setEvenTypeID(Event evenTypeID) {
        EvenType = evenTypeID;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public LocalDateTime getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        StartDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime EndDate) {
        this.EndDate = EndDate;
    }

    public Event(){

    }
    public Event(int eventID, Venue venueID, Event evenTypeID, String eventDescription, String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        EventID = eventID;
        Venue = venueID;
        EvenType = evenTypeID;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }

}
