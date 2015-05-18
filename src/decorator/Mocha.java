package decorator;

public class Mocha extends CondimentDecorator {

	private Beverage b;
	
	public Mocha(Beverage b){
		this.b = b;
	}
	
	double cost() {
		return 1.1 * b.cost();
	}

	@Override
	public String getDescription() {
		return b.getDescription() + ", mocha";
	}

}
