package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class  Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	 void prepare(){
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
