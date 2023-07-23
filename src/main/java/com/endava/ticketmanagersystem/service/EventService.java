package com.endava.ticketmanagersystem.service;

import com.endava.ticketmanagersystem.model.Event;

import com.endava.ticketmanagersystem.repository.EventRepository;
import com.endava.ticketmanagersystem.service.DTO.EventDTO;
import com.endava.ticketmanagersystem.service.DTO.VenueEventTypeDTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Component
public interface EventService{
    public EventDTO findByEventName(String name);
    public List<EventDTO> findAll();
    List<Event> getAllEvent();
    Event getEventById(Long eventId);
    List<VenueEventTypeDTO> getAllEventByTypeAndVenue(Long venueId, String eventTypeName);
    List<EventDTO> findByVenueNameAndEventType(int venueId, String eventType);

}