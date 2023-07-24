package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer>{
    List<Orders> findByNumberOfTickets(int numberOfTickets);

    List<Orders> findAll();
}
