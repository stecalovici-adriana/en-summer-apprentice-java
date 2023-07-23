package com.endava.ticketmanagersystem.service.DTO;

public class NewOrderDTO {
    private int eventId;
    private int ticketCategoryId;
    private int numberOfTickets;

    public NewOrderDTO() {
    }

    public NewOrderDTO(String eventId, String ticketCategoryId, int numberOfTickets) {
        this.eventId = Integer.parseInt(eventId);
        this.ticketCategoryId = Integer.parseInt(ticketCategoryId);
        this.numberOfTickets = numberOfTickets;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}

