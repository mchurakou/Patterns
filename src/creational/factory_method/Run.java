package creational.factory_method;

import creational.factory_method.store.ChicagoStylePizzaStore;
import creational.factory_method.store.NYStylePizzaStore;
import creational.factory_method.store.PizzaStore;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore pz = new NYStylePizzaStore();
		pz.orderPizza("chesse");

		System.out.println();

		pz = new ChicagoStylePizzaStore();
		pz.orderPizza("pepperoni");

	}

}
