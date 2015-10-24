package abstract_factory.store;

import abstract_factory.factory.NYPizzaIngredientFactory;
import abstract_factory.factory.PizzaIngredientFactory;
import abstract_factory.pizza.CheesePizza;
import abstract_factory.pizza.ClamPizza;
import abstract_factory.pizza.Pizza;


public class NYStylePizzaStore extends PizzaStore {


	PizzaIngredientFactory ingredientFactory =new  NYPizzaIngredientFactory();

	public Pizza  createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("chesse")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NY chesse pizza");

		} else if (type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("NY clam pizza");
		}
		return pizza;
	}

}
