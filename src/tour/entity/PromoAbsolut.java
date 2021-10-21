package tour.entity;

import java.util.Objects;

public class PromoAbsolut extends Promotions {
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(amount);
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
		PromoAbsolut other = (PromoAbsolut) obj;
		return Objects.equals(amount, other.amount);
	}

	private Double amount;
    
    @Override
    public Double getCost() {
    	// TODO Auto-generated method stub
    	return amount;
    }
    
}
