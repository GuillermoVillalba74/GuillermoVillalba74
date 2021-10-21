/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tour.entity;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author sistemas
 */
public abstract class Product implements Comparator<Product>{
    private String name;
    private Double cost;

    public Product() {
    }

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    public abstract void occupy();
    public abstract boolean hasQuota();
    public abstract double getTime();
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", cost=" + cost + '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(cost, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(name, other.name);
	}

	public abstract boolean avaiableFor(User user);
    
    
}
