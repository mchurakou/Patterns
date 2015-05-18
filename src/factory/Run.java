package factory;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore pz = new NYStylePizzaStore();
		pz.orderPizza("chesse");

	}

}
