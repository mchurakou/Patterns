package creational.abstract_factory;

import creational.abstract_factory.store.ChicagoStylePizzaStore;
import creational.abstract_factory.store.NYStylePizzaStore;
import creational.abstract_factory.store.PizzaStore;

/**
 * Created by Администратор on 24.10.2015.
 */
public class Run {
    /**
     * @param args
     */
    public static void main(String[] args) {
        PizzaStore pz = new NYStylePizzaStore();
        pz.orderPizza("chesse");

        System.out.println();

        pz = new ChicagoStylePizzaStore();
        pz.orderPizza("clam");

    }
}
