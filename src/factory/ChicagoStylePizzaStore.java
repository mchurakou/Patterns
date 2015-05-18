package factory;

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
