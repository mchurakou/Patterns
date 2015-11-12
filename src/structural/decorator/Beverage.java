package structural.decorator;

public abstract class Beverage {
	String description = "Unknown description";
	
	public String getDescription() {
		return description;
	}

	abstract double cost();
}
