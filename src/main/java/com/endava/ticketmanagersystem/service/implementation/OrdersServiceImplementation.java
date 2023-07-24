package com.endava.ticketmanagersystem.service.implementation;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.model.TicketCategory;
import com.endava.ticketmanagersystem.repository.CustomerRepository;
import com.endava.ticketmanagersystem.repository.OrdersRepository;
import com.endava.ticketmanagersystem.repository.TicketCategoryRepository;
import com.endava.ticketmanagersystem.service.DTO.NewOrderDTO;
import com.endava.ticketmanagersystem.service.DTO.OrdersDTO;
import com.endava.ticketmanagersystem.service.Mapper.OrdersMapper;
import com.endava.ticketmanagersystem.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersServiceImplementation implements OrdersService {
    @Autowired
    private OrdersRepository orderRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    private CustomerRepository customerRepository;
  /*  @Override
    public OrdersDTO findByNumberOfTickets(int numberOfTickets) {
        return OrdersMapper.converter(orderRepository.findByNumberOfTickets(numberOfTickets));
    }*/

    @Override
    public OrdersDTO findByNumberOfTickets(int numberOfTickets) {
        List<Orders> orders = orderRepository.findByNumberOfTickets(numberOfTickets);
        if (orders.isEmpty()) {
            return null;
        }
        return OrdersMapper.converter(orders.get(0));
    }

    @Override
    public List<OrdersDTO> findAll() {
        return orderRepository.findAll().stream().map(OrdersMapper::converter).collect(Collectors.toList());
    }


    @Override
    public OrdersDTO create(NewOrderDTO newOrderDTO) {
        TicketCategory ticketCategory = ticketCategoryRepository.findById(newOrderDTO.getTicketCategoryId()).get();

        if (ticketCategory == null || newOrderDTO.getEventId() != ticketCategory.getEvent().getEventID()) {
            throw new IllegalArgumentException("Categorie de bilet invalidă sau ID eveniment invalid");
        }
        int nextId = 1;
        for (Orders order : this.orderRepository.findAll()){
            if (nextId < order.getOrderID()){
                nextId = order.getOrderID() + 1;
            }
        }
        Orders order = new Orders().builder()
                .orderID(nextId)
                .customer(customerRepository.findById(1).get())
                .orderedAt(LocalDateTime.now())
                .ticketCategory(ticketCategory)
                .totalPrice(ticketCategory.getPrice().multiply(BigDecimal.valueOf(newOrderDTO.getNumberOfTickets())))
                .numberOfTickets(newOrderDTO.getNumberOfTickets())
                .build();

        orderRepository.save(order);
        return OrdersMapper.converter(order);
    }
}
