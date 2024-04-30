import java.sql.Date;

public class Event {
      
    private int id;
    private String title;
    private Date date;
    private boolean isFavorite;
    
    private AppUser appUser;

    public Event() {
    }

    public Event(int id, String title, Date date, boolean isFavorite) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.isFavorite = isFavorite;
        if(!setAppUser(aAppUser)){
            throw new RuntimeExeption("No app user to create an event");
        }
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
