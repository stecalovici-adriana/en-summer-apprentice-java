package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Customer;
import com.endava.ticketmanagersystem.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();
}
