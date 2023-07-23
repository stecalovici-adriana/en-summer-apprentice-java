package com.endava.ticketmanagersystem.service.DTO;


import com.endava.ticketmanagersystem.model.Customer;
import com.endava.ticketmanagersystem.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonSerialize
public class OrdersDTO {
    public OrdersDTO(){};
    private int orderID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;

    public OrdersDTO(int orderID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice, Customer customer, TicketCategory ticketCategory) {
        this.orderID = orderID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.ticketCategory = ticketCategory;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    private Customer customer;
    private TicketCategory ticketCategory;
}
