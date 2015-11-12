package structural.adapter;

import structural.adapter.duck.Duck;
import structural.adapter.duck.MallardDuck;
import structural.adapter.turkey.WildTurkey;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();

		System.out.println();

		duck = new TurkeyAdapter(new WildTurkey());
		duck.quack();
		duck.fly();

	}

}
