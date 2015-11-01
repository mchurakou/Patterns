package composite;

import composite.iterator.NullIterator;

import java.util.Iterator;



public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price){
		this.name = name;
		this.description = description;
		this.vegeterian = vegeterian;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public boolean isVegeterian(){
		return vegeterian;
	}
	
	public void print(){
		System.out.println("Menu item:" + name);
	}

	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
}
