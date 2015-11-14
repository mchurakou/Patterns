package creational.abstract_factory.pizza;

import creational.abstract_factory.factory.PizzaIngredientFactory;

/**
 * Created by Администратор on 24.10.2015.
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare: " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println(this);
    }
}
