package creational.factory_method.store;

import creational.factory_method.pizza.NYCheesePizza;
import creational.factory_method.pizza.NYPepperoniPizza;
import creational.factory_method.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

	
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("chesse")){
			pizza = new NYCheesePizza();
		} else if (type.equals("pepperoni")){
			pizza = new NYPepperoniPizza();
		}
		return pizza;
	}

}
