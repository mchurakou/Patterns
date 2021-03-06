package structural.composite.iterator;

import structural.composite.Menu;
import structural.composite.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()){
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}	else {
				return true;
			}
				
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator<MenuComponent> iterator = (Iterator) stack.peek();
			MenuComponent component = iterator.next();
			if  (component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	

}
