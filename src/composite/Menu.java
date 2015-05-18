package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	List menuComponents = new ArrayList();
	String name;
	String description;
	Iterator iterator = null;
	
	public  Menu(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	
	public MenuComponent getChild(int i){
		return (MenuComponent) menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	
	public void print(){
		System.out.println("Menu:" + name);
		System.out.println("---");
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent m = (MenuComponent) iterator.next();
			m.print();
		}
	}


	
	public Iterator createIterator() {
		if (iterator == null){
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
}
