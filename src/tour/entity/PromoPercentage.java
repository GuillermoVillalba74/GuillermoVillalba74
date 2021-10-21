package tour.entity;

import java.util.Objects;

public class PromoPercentage extends Promotions {

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(percentage);
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
		PromoPercentage other = (PromoPercentage) obj;
		return Objects.equals(percentage, other.percentage);
	}

	private Double percentage;

	public PromoPercentage(String name, Double cost,Double percentage) {
		super(name, cost);
		this.percentage = percentage;
	}

	@Override
	public Double getCost() {
		return super.getCost()*(1+this.percentage);
	}
}
