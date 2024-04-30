

public class AppUser{

    private int id;
    private String name;
    private String phoneNb;
    private String password;

    
    public AppUser() {
    }

    public AppUser(int id, String name, String phoneNb, String password) {
        this.id = id;
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