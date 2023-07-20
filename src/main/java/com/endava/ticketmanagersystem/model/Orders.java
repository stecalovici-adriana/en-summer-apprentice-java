package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Orders", schema = "dbo")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    private Customer Customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TicketCategoryID",referencedColumnName = "TicketCategoryID")
    private TicketCategory TicketCategory;

    @Column(name = "OrderedAt")
    private LocalDateTime OrderedAt;

    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public Orders(int orderID, Customer customerID, TicketCategory ticketCategoryID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice) {
        OrderID = orderID;
        this.Customer = Customer;
        this.TicketCategory = TicketCategory;
        OrderedAt = orderedAt;
        NumberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Orders(){

    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public Customer getCustomerID() {
        return Customer;
    }

    public void setCustomerID(Customer customerID) {
        this.Customer = customerID;
    }

    public TicketCategory getTicketCategoryID() {
        return TicketCategory;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.TicketCategory = ticketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return OrderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        OrderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
