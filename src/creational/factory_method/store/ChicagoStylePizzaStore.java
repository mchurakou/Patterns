package creational.factory_method.store;

import creational.factory_method.pizza.CHCheesePizza;
import creational.factory_method.pizza.CHPepperoniPizza;
import creational.factory_method.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("chesse")){
			pizza = new CHCheesePizza();
		} else if (type.equals("pepperoni")){
			pizza = new CHPepperoniPizza();
		}
		return pizza;
	}

}
