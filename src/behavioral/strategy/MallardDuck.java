package behavioral.strategy;

import behavioral.strategy.behaviour.fly.impl.FlyWithWings;
import behavioral.strategy.behaviour.quack.impl.QuackLoudly;

public class MallardDuck extends Duck{
	
	MallardDuck(){
		fb = new FlyWithWings();
		qb = new QuackLoudly();
	}
	
	
	public void display() {
		System.out.println("Display: mallard duck");
		
	}
	
}
