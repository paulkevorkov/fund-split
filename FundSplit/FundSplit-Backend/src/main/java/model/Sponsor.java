package model;

import jakarta.persistence.Entity;


@Entity
public class Sponsor {

    private int id;
    private String name;

    private Event event;

    public Sponsor(){
    }

    public Sponsor(int id, String name, Event event) {
        this.id = id;
        this.name = name;
        this.event = event;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event getEvent() {
        return this.event;
    }

    public boolean setEvent(Event event) {
        boolean wasSet = false;
        if (event != null){
            this.event = event;
            wasSet = true;
        }
        return wasSet;
    }
}
