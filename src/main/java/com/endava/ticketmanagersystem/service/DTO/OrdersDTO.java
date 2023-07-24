package com.endava.ticketmanagersystem.service.DTO;


import com.endava.ticketmanagersystem.model.Customer;
import com.endava.ticketmanagersystem.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrdersDTO {
    public OrdersDTO(){};
    private int eventID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;
    private String customerName;
    private int ticketCategoryID;

    public OrdersDTO(int eventID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice, String customerName, int ticketCategoryID) {
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }
}
