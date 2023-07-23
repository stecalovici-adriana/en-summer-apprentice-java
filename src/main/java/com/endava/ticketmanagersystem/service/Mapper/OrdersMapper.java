package com.endava.ticketmanagersystem.service.Mapper;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;

public class OrdersMapper {
    public static OrdersDTO converter(Orders orders){
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setOrderID(orders.getOrderID());
        ordersDTO.setOrderedAt(orders.getOrderedAt());
        ordersDTO.setNumberOfTickets(orders.getNumberOfTickets());
        ordersDTO.setTotalPrice(orders.getTotalPrice());
//        orderDto.setCustomer(order.getCustomer());
//        orderDto.setTicketCategory(order.getTicketCategory());
//
        return ordersDTO;
    }
}