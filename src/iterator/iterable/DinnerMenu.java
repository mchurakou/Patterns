package iterator.iterable;

import iterator.iterator.DinerMenuIterator;
import iterator.MenuItem;

import java.util.Iterator;

/**
 * Created by Администратор on 31.10.2015.
 */
public class DinnerMenu implements Iterable<MenuItem> {
    public DinnerMenu() {
        items = new MenuItem[]{new MenuItem("product1", "desc1", true, 1),
                new MenuItem("product2", "desc2", true, 2)};
    }

    private MenuItem[] items;
    @Override
    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator(items);
    }
}
