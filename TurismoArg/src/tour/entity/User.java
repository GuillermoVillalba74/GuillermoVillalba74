package tour.entity;

import java.util.ArrayList;

public class User {

    private String name;

    private Double budget;

    private Double availability;
    
    private ArrayList<Attractions> UserAtttractions = new ArrayList();
    
    private ArrayList<Promotions> UserPromotions = new ArrayList();

    public User() {
    }

    public User(String name, Double budget, Double availability) {
        this.name = name;
        this.budget = budget;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getAvailability() {
        return availability;
    }

    public void setAvailability(Double availability) {
        this.availability = availability;
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
        return "User{" + "name=" + name + ", budget=" + budget + ", availability=" + availability + ", UserAtttractions=" + UserAtttractions + ", UserPromotions=" + UserPromotions + '}';
    }

    
    
    
    
    
    
}
