package abstract_factory.factory;

/**
 * Created by Администратор on 24.10.2015.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "ThickCrustDough";
    }

    @Override
    public String createSauce() {
        return "PlumTomatoSouce";
    }

    @Override
    public String createCheese() {
        return "Mozarella";
    }

    @Override
    public String[] createVeggies() {
        return new String[]{"EggPlant","Spinach","BlackOlives"};
    }

    @Override
    public String createPepperoni() {
        return "SlicedPepperoni";
    }

    @Override
    public String createClam() {
        return "FrozenClams";
    }
}
