package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "TicketCategory", schema = "dbo")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketCategoryID;

    @ManyToOne
    @JoinColumn(name = "EventID")
    private Event Event;

    @OneToMany(mappedBy = "TicketCategory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> orderList;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Price")
    private BigDecimal Price;

    public TicketCategory(int ticketCategoryID, Event eventID, String description, BigDecimal price) {
        TicketCategoryID = ticketCategoryID;
        Event = eventID;
        Description = description;
        Price = price;
    }
    public TicketCategory(){

    }

    public int getTicketCategoryID() {
        return TicketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        TicketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return Event;
    }

    public void setEventID(Event eventID) {
        Event = eventID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }
}
