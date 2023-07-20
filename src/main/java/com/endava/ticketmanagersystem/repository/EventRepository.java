package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    public Event findByEventName(String EventName);

}
/*
public interface EventRepository extends JpaRepository<Event, Long> {
    // Găsește toate evenimentele din tabel
    List<Event> findAll();

    Event findByEventId(Long EventId);

    List<Event> findByVenueId(Long VenueId);

    List<Event> findByEventTypeId(Long EventTypeId);

    void deleteByEventId(Long EventId);

    List<Event> findByStartDateBetween(Date StartDate, Date EndDate);
}*/