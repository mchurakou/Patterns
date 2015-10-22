package factory_method.store;

import factory_method.pizza.NYCheesePizza;
import factory_method.pizza.NYPepperoniPizza;
import factory_method.pizza.Pizza;

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
