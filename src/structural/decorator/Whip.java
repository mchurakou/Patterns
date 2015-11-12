package structural.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage b) {
		super(b);
	}

	double cost() {
		return 1.2 + b.cost();
	}
	
	public String getDescription() {
		return b.getDescription() + ", whip";
	}

}
