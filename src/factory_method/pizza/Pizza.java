package factory_method.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class  Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();
	public void prepare(){
		System.out.println("prepare " + name);
		for (String top : toppings){
			System.out.println(top);
		}
	}
	public void bake(){
		System.out.println("bake");
	}
	public void cut(){
		System.out.println("cut");;
	}
	public void box(){
		System.out.println("box");
	}
}
