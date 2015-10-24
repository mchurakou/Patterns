package abstract_factory.store;

import abstract_factory.factory.ChicagoPizzaIngredientFactory;
import abstract_factory.factory.PizzaIngredientFactory;
import abstract_factory.pizza.CheesePizza;
import abstract_factory.pizza.ClamPizza;
import abstract_factory.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("chesse")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago chesse pizza");

		} else if (type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago clam pizza");
		}
		return pizza;
	}

}
