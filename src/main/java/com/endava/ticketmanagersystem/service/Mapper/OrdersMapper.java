package com.endava.ticketmanagersystem.service.Mapper;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;

public class OrdersMapper {
    public static OrdersDTO converter(Orders orders){
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setEventID(orders.getTicketCategory().getEvent().getEventID());
        ordersDTO.setOrderedAt(orders.getOrderedAt());
        ordersDTO.setNumberOfTickets(orders.getNumberOfTickets());
        ordersDTO.setTotalPrice(orders.getTotalPrice());
        ordersDTO.setCustomerName(orders.getCustomer().getCustomerName());
        ordersDTO.setTicketCategoryID(orders.getTicketCategory().getTicketCategoryID());

        return ordersDTO;
    }
}