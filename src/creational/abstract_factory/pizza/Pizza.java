package creational.abstract_factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> veggiest = new ArrayList<String>();
	protected String cheese;
	protected String pepperoni;
	protected String clam;
	public abstract  void prepare();
	public void bake(){
		System.out.println("bake");
	}
	public void cut(){
		System.out.println("cut");;
	}
	public void box(){
		System.out.println("box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"name='" + name + '\'' +
				", dough='" + dough + '\'' +
				", sauce='" + sauce + '\'' +
				", veggiest=" + veggiest +
				", cheese='" + cheese + '\'' +
				", pepperoni='" + pepperoni + '\'' +
				", clam='" + clam + '\'' +
				'}';
	}
}
