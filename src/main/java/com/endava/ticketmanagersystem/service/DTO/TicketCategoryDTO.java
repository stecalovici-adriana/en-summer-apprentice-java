package com.endava.ticketmanagersystem.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketCategoryDTO {
    private Long ticketCategoryId;
    private String ticketType;
    private BigDecimal price;
}