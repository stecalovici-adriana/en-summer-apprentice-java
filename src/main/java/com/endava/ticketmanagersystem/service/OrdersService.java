package com.endava.ticketmanagersystem.service;


import com.endava.ticketmanagersystem.service.DTO.NewOrderDTO;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrdersService {
    public OrdersDTO findByNumberOfTickets(int numberOfTickets);
    public List<OrdersDTO> findAll();
    public  OrdersDTO create(NewOrderDTO ordersDto);
}