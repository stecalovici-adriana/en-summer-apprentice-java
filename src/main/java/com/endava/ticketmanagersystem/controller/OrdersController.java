package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.service.DTO.NewOrderDTO;
import com.endava.ticketmanagersystem.service.DTO.OrderResponseDTO;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;
import com.endava.ticketmanagersystem.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {
    private OrdersService ordersService;
    @Autowired
    OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping("/findOrders/{numberOfTickets}")
    public OrdersDTO findByNumberOfTickets(@PathVariable int numberOfTickets){
        return ordersService.findByNumberOfTickets(numberOfTickets);
    }

    @GetMapping("/orders")
    public List<OrdersDTO> findAll(){
        return ordersService.findAll();
    }

    @PostMapping("/createOrder")
    public ResponseEntity<OrdersDTO> create(@RequestBody NewOrderDTO newOrderDTO){
        OrdersDTO savedOrderDto = ordersService.create(newOrderDTO);
        return ResponseEntity.ok(savedOrderDto);
    }

}