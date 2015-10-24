package abstract_factory;

import abstract_factory.store.ChicagoStylePizzaStore;
import abstract_factory.store.NYStylePizzaStore;
import abstract_factory.store.PizzaStore;

/**
 * Created by ������������� on 24.10.2015.
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
