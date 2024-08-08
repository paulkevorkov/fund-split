package fundsplit.dao;

import org.springframework.data.repository.CrudRepository;

import fundsplit.model.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, String>{

    Event findEventByTitle(String title);

    List<Event> findAll();

    Event findEventByLocalDateTime(LocalDateTime localDateTime);

    Event findEventByIsFavorite(Boolean isFavorite);

    void deleteEventById(int id);
} 