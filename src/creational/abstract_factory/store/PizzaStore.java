package creational.abstract_factory.store;


import creational.abstract_factory.pizza.Pizza;

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
