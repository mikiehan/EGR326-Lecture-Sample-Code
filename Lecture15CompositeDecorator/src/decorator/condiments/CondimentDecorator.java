package decorator.condiments;

import decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public abstract String getDescription();
}
