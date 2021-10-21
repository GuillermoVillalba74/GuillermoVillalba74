package tour.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Promotions extends Product{

      
    private ArrayList<Attractions> packAttractions;
    private double totalTime=0;
    public Promotions() {
    	packAttractions = new ArrayList();
    }

    public Promotions(String name, Double cost) {
        super(name, cost);
        packAttractions = new ArrayList();
    }

    public ArrayList<Attractions> getPackAttractions() {
        return packAttractions;
    }

    public void setPackAttractions(ArrayList<Attractions> PackAttractions) {
        this.packAttractions = PackAttractions;
		for(Attractions a:this.packAttractions){
			totalTime+=a.getTime();
		}
    }
    @Override
    public void occupy() {
    	this.packAttractions.forEach(attraction->attraction.occupy());
    }
    @Override
    public String toString() {
        return "Promotions{" + "name=" + this.getName() + ", PackAttractions=" + packAttractions + '}';
    }

	@Override
	public boolean hasQuota() {
    	int i=0;
    	boolean hasQuota=true;
    	while(hasQuota=this.packAttractions.get(i).hasQuota()){
    		i++;
    	}
		return hasQuota;
	}

	@Override
	public int compare(Product arg0, Product arg1) {
		if(arg0.getCost()!=arg1.getCost())
			return Double.compare(arg0.getCost(), arg1.getCost());
		if(arg0.getTime()!=arg1.getTime())
			return Double.compare(arg0.getTime(), arg1.getTime());
		return 0;
	}

	@Override
	public double getTime() {
		return this.totalTime;
	}

	@Override
	public boolean avaiableFor(User user) {
		
		return user.hasMoney(this) && user.hasTime(this) && !user.hasProduct(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(packAttractions, totalTime);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Promotions other = (Promotions) obj;
		return Objects.equals(packAttractions, other.packAttractions)
				&& Double.doubleToLongBits(totalTime) == Double.doubleToLongBits(other.totalTime);
	}


}
