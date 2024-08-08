package fundsplit.dao;

import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fundsplit.model.AppUser;
import fundsplit.model.Event;

import java.sql.Date;

@Repository
public class FundSplitRepository {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public AppUser createAppUser(String name){
        AppUser a = new AppUser();
        a.setName(name);
        entityManager.persist(a);
        return a;
    }

    @Transactional
    public AppUser getAppUser(String name){
        AppUser a = entityManager.find(AppUser.class, name);
        return a;
    }

    @Transactional
    public Event createEvent(String title, Date date){
        Event e = new Event();
        e.setTitle(title);
        e.setDate(date);
        entityManager.persist(e);
        return e;
    }

    @Transactional
    public Event getEvent(String title){
        Event e = entityManager.find(Event.class, title);
        return e;
    }
}