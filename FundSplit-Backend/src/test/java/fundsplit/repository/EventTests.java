package fundsplit.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fundsplit.dao.EventRepository;
import fundsplit.model.Event;

@SpringBootTest
public class EventTests {
    
    @Autowired 
    private EventRepository eventRepository;

    @BeforeEach
    @AfterEach
    public void clearDatabase(){
        eventRepository.deleteAll();
    }

    @Test
    public void testPersistAndLoadEvent(){
        // create event
        String title = "Party";
        LocalDateTime dateTime = LocalDateTime.now();
        Boolean isFavorite = false;
        Event event = new Event(title, dateTime, isFavorite);

        // save in DB
        eventRepository.save(event);

        // read from DB
        Event eventFromDB = eventRepository.findEventByTitle(title);

        // assertions
        assertNotNull(eventFromDB);

        assertEquals(event.getTitle(), eventFromDB.getTitle());
        assertEquals(event.getDate(), eventFromDB.getDate());
        assertEquals(event.getIsFavorite(), eventFromDB.getIsFavorite());

    }
}
