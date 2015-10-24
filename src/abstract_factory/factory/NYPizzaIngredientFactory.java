package abstract_factory.factory;

/**
 * Created by Администратор on 24.10.2015.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "ThinCrustDough";
    }

    @Override
    public String createSauce() {
        return "MarinaraSouce";
    }

    @Override
    public String createCheese() {
        return "REggianoChesse";
    }

    @Override
    public String[] createVeggies() {
        return new String[]{"Garlic", "Onion", "Mashroom", "RedPepper" };
    }


    @Override
    public String createPepperoni() {
        return "SlicedPepperonui";
    }

    @Override
    public String createClam() {
        return "FreshClams";
    }
}
