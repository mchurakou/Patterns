package decorator;

public class Whip extends CondimentDecorator {

	private Beverage b;
	
	public Whip(Beverage b){
		this.b = b;
	}
	
	double cost() {
		return 1.2 * b.cost();
	}
	
	public String getDescription() {
		return b.getDescription() + ", whip";
	}

}
