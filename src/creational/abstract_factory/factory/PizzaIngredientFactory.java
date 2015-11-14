package creational.abstract_factory.factory;

/**
 * Created by Администратор on 24.10.2015.
 */
public interface PizzaIngredientFactory {
    String createDough();
    String createSauce();
    String createCheese();
    String[] createVeggies();
    String createPepperoni();
    String createClam();
}
