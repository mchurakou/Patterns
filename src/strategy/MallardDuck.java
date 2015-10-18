package strategy;

import strategy.behaviour.fly.impl.FlyWithWings;
import strategy.behaviour.quack.impl.QuackLoudly;

public class MallardDuck extends Duck{
	
	MallardDuck(){
		fb = new FlyWithWings();
		qb = new QuackLoudly();
	}
	
	
	public void display() {
		System.out.println("Display: mallard duck");
		
	}
	
}
