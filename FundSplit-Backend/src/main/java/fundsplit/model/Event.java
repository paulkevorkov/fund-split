package fundsplit.model;

import java.time.LocalDateTime;
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
    private LocalDateTime localDateTime;
    private boolean isFavorite;
    
    @ManyToOne
    private AppUser appUser;

    public Event() {
    }

    public Event(String title, LocalDateTime localDateTime){
        this.title = title;
        this.localDateTime = localDateTime;
    }

    public Event(String title, LocalDateTime localDateTime, boolean isFavorite) {
        this.title = title;
        this.localDateTime = localDateTime;
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

    public LocalDateTime getDate() {
        return this.localDateTime;
    }

    public void setDate(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
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
