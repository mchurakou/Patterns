package decorator;

public class Mocha extends CondimentDecorator {


	public Mocha(Beverage b) {
		super(b);
	}

	double cost() {
		return 1.1 + b.cost();
	}

	@Override
	public String getDescription() {
		return b.getDescription() + ", mocha";
	}

}
