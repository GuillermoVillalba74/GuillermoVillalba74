package tour.entity;

import java.util.Objects;

public class Attractions extends Product{

    private String name;

    private Double expensive;

    private Double time;

    private Short quota;
    
    

    public Attractions() {
    }

    public Attractions(String name, Double expensive, Double time,Short quota) {
        this.name = name;
        this.expensive = expensive;
        this.time = time;
        this.quota = quota;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getExpensive() {
        return expensive;
    }

    public void setExpensive(Double expensive) {
        this.expensive = expensive;
    }

    public double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Short getQuota() {
        return quota;
    }

    public void setQuota(Short quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Attractions{" + "name=" + name + ", expensive=" + expensive + ", time=" + time + ", quota=" + quota + '}';
    }

	@Override
	public void occupy() {
		quota--;
	}

	@Override
	public boolean hasQuota() {
		
		return quota>0;
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
	public boolean avaiableFor(User user) {
		
		return user.hasTime(this) && user.hasMoney(this) && !user.hasProduct(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(expensive, name, quota, time);
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
		Attractions other = (Attractions) obj;
		return Objects.equals(expensive, other.expensive) && Objects.equals(name, other.name)
				&& Objects.equals(quota, other.quota) && Objects.equals(time, other.time);
	}
    
    
}
