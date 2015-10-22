package factory_method.store;

import factory_method.pizza.CHCheesePizza;
import factory_method.pizza.CHPepperoniPizza;
import factory_method.pizza.Pizza;

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
