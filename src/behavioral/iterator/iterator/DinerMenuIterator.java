package behavioral.iterator.iterator;

import behavioral.iterator.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items){
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null){
			return false;
		} else {
			return true;
		}
	}

	
	public Object next() {
		MenuItem menuItem = items[position++];
		return menuItem;
	}

}
