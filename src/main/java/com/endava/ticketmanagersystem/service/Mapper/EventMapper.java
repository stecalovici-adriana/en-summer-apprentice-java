package com.endava.ticketmanagersystem.service.Mapper;

import com.endava.ticketmanagersystem.model.Event;
import com.endava.ticketmanagersystem.service.DTO.EventDTO;

public class EventMapper {
    public static EventDTO converter(Event event) {
        EventDTO eventDto = new EventDTO();
        eventDto.setEventDtoID(event.getEventID());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getEventName());
        eventDto.setEventStartDate(event.getStartDate());
        eventDto.setGetEventEndDate(event.getEndDate());
        eventDto.setVenue(event.getVenue());
        eventDto.setEventType(event.getEventType());
        return eventDto;
    }
}
