//sqllite

public class Contribution {
  
    private int id;
    private String title;
    private double amount;
    private String description; 

    private Sponsor sponsor;

    public Contribution(int id, String title, double amount, String description, Sponsor sponsor) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.description = description;
        this.sponsor = sponsor;
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

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sponsor getSponsor() {
        return this.sponsor;
    }

    public boolean setSponsor(Sponsor sponsor) {
        boolean wasSet = false;
        if(sponsor != null){
            this.sponsor = sponsor;
            wasSet = true;
        }
        return wasSet;
    }
}
