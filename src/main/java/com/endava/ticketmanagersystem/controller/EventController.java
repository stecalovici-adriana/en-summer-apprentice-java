package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.service.DTO.EventDTO;
import com.endava.ticketmanagersystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/find_event/{eventName}")
    public EventDTO findByEventName(@PathVariable String eventName) {
        return eventService.findByEventName(eventName);
    }

    @GetMapping("/find_events")
    public List<EventDTO> findAll() {
        return eventService.findAll();
    }

    @GetMapping("/events")
    public ResponseEntity<List<EventDTO>> getEventsByVenueIdAndEventTypeName(
            @RequestParam("venueId") int venueId,
            @RequestParam("eventType") String eventType) {

        List<EventDTO> events = eventService.findByVenueNameAndEventType(venueId, eventType);

        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(events);
        }
    }
}
