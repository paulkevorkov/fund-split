package model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    private Event event;

    public Sponsor(){
    }

    public Sponsor(String name, Event event) {
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
