package tour.entity;

import java.util.ArrayList;

public class Promotions extends Product{

      
    private ArrayList<Attractions> PackAttractions = new ArrayList();

    public Promotions() {
    }

    public Promotions(String name, Double cost) {
        super(name, cost);
    }

    public ArrayList<Attractions> getPackAttractions() {
        return PackAttractions;
    }

    public void setPackAttractions(ArrayList<Attractions> PackAttractions) {
        this.PackAttractions = PackAttractions;
    }

    @Override
    public String toString() {
        return "Promotions{" + "name=" + name + ", PackAttractions=" + PackAttractions + '}';
    }
    
    
    
    
}
