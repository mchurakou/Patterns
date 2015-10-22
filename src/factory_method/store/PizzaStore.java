package factory_method.store;

import factory_method.pizza.Pizza;

public abstract class PizzaStore {
	
	
	public final Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
