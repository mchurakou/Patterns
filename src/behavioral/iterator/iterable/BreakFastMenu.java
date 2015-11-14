package behavioral.iterator.iterable;

import behavioral.iterator.MenuItem;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Администратор on 31.10.2015.
 */
public class BreakFastMenu implements Iterable<MenuItem> {

    private List<MenuItem> items;

    public BreakFastMenu() {
        items = Arrays.asList(new MenuItem("BF product1", "desc1", true, 1),
                new MenuItem("BF product2", "desc2", true, 2));
    }





    @Override
    public Iterator<MenuItem> iterator() {
        return items.iterator();
    }
}
