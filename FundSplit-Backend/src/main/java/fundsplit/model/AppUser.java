package fundsplit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class AppUser{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String phoneNb;
    private String password;

    
    public AppUser() {
    }

    public AppUser(String name){
        this.name = name;
    }

    public AppUser(String name, String phoneNb, String password) {
        this.name = name;
        this.phoneNb = phoneNb;
        this.password = password;
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

    public String getPhoneNb() {
        return this.phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}