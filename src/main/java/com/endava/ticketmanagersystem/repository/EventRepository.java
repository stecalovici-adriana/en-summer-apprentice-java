package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    public Event findByEventName(String eventName);

    @Query("SELECT e FROM Event e LEFT JOIN e.eventType t WHERE e.venue = ?1 AND t.eventTypeName = ?2")
    List<Event> findAllByVenueAndEventType(String venue, String eventTypeName);

    List<Event> findAll();

    @Query("SELECT e FROM Event e WHERE e.venue.id = :venueId AND e.eventType.eventTypeName = :eventType")
    List<Event> findByVenueNameAndEventType(@Param("venueId") int venueId, @Param("eventType") String eventType);
}


