package structural.decorator;

public abstract class CondimentDecorator extends Beverage {
	public CondimentDecorator(Beverage b) {
		this.b = b;
	}

	protected Beverage b;
	
	public abstract String getDescription();

}
