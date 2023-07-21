package com.endava.ticketmanagersystem.service.Mapper;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderResponseDTOMapper {
    public static OrdersDTO apply(Orders order) {
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setOrderID(order.getOrderID());
        // Set other properties from the 'order' object to the 'ordersDTO' object
        return ordersDTO;
    }
}
