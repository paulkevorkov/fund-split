package model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String title;
    private Date date;
    private boolean isFavorite;
    
    @ManyToOne
    private AppUser appUser;

    public Event() {
    }

    public Event(String title, Date date){
        this.title = title;
        this.date = date;
    }

    public Event(String title, Date date, boolean isFavorite) {
        this.title = title;
        this.date = date;
        this.isFavorite = isFavorite;
        /*if(!setAppUser(AppUser aAppUser)){
            throw new RuntimeExeption("No app user to create an event");
        }*/
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsFavorite() {
        return this.isFavorite;
    }

    public boolean getIsFavorite() {
        return this.isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public boolean setAppUser(AppUser newAppUser){
        boolean wasSet = false;
        if (newAppUser != null){
            appUser = newAppUser;
            wasSet = true;
        }
        return wasSet;
    }

    public AppUser getAppUser(){
        return appUser;
    }
}
