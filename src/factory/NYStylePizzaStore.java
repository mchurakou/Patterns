package factory;

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
