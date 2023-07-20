package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Venue", schema = "dbo")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VenueID;

    @Column(name = "Location")
    private String Location;

    @Column(name = "Type")
    private String Type;

    @Column(name = "Capacity")
    private int Capacity;

    public int getVenueID() {
        return VenueID;
    }

    public void setVenueID(int venueID) {
        VenueID = venueID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public Venue(int venueID, String location, String type, int capacity) {
        VenueID = venueID;
        Location = location;
        Type = type;
        Capacity = capacity;
    }

    public Venue(){

    }
}
