package com.endava.ticketmanagersystem.service.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderResponseDTO(
        int eventID,
        LocalDateTime orderedAt,
        int ticketCategoryID,
        int numberOfTickets,
        BigDecimal totalPrice
) {

}