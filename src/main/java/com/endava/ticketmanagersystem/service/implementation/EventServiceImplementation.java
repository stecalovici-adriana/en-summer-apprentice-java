package com.endava.ticketmanagersystem.service.implementation;

import com.endava.ticketmanagersystem.model.Event;
import com.endava.ticketmanagersystem.repository.EventRepository;
import com.endava.ticketmanagersystem.service.DTO.EventDTO;
import com.endava.ticketmanagersystem.service.DTO.VenueEventTypeDTO;
import com.endava.ticketmanagersystem.service.EventService;
import com.endava.ticketmanagersystem.service.Mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EventServiceImplementation implements EventService{

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImplementation(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public EventDTO findByEventName(String eventName) {
        return EventMapper.converter(eventRepository.findByEventName(eventName));
    }

    @Override
    public List<EventDTO> findAll() {
        return eventRepository.findAll().stream().map(EventMapper::converter).collect(Collectors.toList());
    }

    @Override
    public List<Event> getAllEvent() {
        return null;
    }

    @Override
    public Event getEventById(Long eventId) {
        return null;
    }

    @Override
    public List<VenueEventTypeDTO> getAllEventByTypeAndVenue(Long venueId, String eventTypeName) {
        return null;
    }

    public List<EventDTO> findByVenueNameAndEventType(int venueId, String eventType) {
        return eventRepository.findByVenueNameAndEventType(venueId, eventType).stream().map(EventMapper::converter).collect(Collectors.toList());
    }
}
