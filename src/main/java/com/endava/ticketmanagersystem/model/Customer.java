package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Entity
@Table(name = "Customer", schema = "dbo")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;

    @Column(name = "CustomerName")
    private String CustomerName;

    @Column(name = "Email")
    private String Email;

    // Getters and Setters

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Constructors

    public Customer() {
    }

    public Customer(int customerID, String customerName, String email) {
        CustomerID = customerID;
        CustomerName = customerName;
        Email = email;
    }


}
