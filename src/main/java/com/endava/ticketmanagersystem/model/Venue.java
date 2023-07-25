package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Venue", schema = "dbo")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueID;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private int capacity;

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Venue(){

    }

    public Venue(int venueID, String location, String type, int capacity) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }
}
