package tour.entity;

import java.util.ArrayList;

public class User {

    private String name;

    private Double money;

    private Double time;
    
    private ArrayList<Attractions> UserAtttractions = new ArrayList();
    
    private ArrayList<Promotions> UserPromotions = new ArrayList();

    public User() {
    }

    public User(String name, Double budget, Double availability) {
        this.name = name;
        this.money = budget;
        this.time = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return money;
    }

    public void setBudget(Double budget) {
        this.money = budget;
    }

    public Double getAvailability() {
        return time;
    }

    public void setAvailability(Double availability) {
        this.time = availability;
    }

    public ArrayList<Attractions> getUserAtttractions() {
        return UserAtttractions;
    }

    public void setUserAtttractions(ArrayList<Attractions> UserAtttractions) {
        this.UserAtttractions = UserAtttractions;
    }

    public ArrayList<Promotions> getUserPromotions() {
        return UserPromotions;
    }

    public void setUserPromotions(ArrayList<Promotions> UserPromotions) {
        this.UserPromotions = UserPromotions;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", budget=" + money + ", availability=" + time + ", UserAtttractions=" + UserAtttractions + ", UserPromotions=" + UserPromotions + '}';
    }

	public boolean hasProduct(Product p) {
		// TODO Auto-generated method stub
		return this.UserAtttractions.contains(p);
	}

	public boolean hasMoney(Product p) {
		return this.money>=p.getCost();
	}

	public boolean hasTime(Product p) {
		return this.time>=p.getTime();
	}

    
    
    
    
    
    
}
