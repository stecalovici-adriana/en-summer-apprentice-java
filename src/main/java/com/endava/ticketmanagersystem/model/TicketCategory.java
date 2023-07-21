package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
@Entity
@Table(name = "TicketCategory", schema = "dbo")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event Event;

    @OneToMany(mappedBy = "ticketCategory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> orderList;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public com.endava.ticketmanagersystem.model.Event getEvent() {
        return Event;
    }

    public void setEvent(com.endava.ticketmanagersystem.model.Event event) {
        Event = event;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TicketCategory(){

    }

    public TicketCategory(int ticketCategoryID, com.endava.ticketmanagersystem.model.Event event, List<Orders> orderList, String description, BigDecimal price) {
        this.ticketCategoryID = ticketCategoryID;
        Event = event;
        this.orderList = orderList;
        this.description = description;
        this.price = price;
    }
}
