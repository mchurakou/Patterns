package behavioral.strategy;

import behavioral.strategy.behaviour.fly.impl.FlyNoWay;
import behavioral.strategy.behaviour.quack.impl.QuackLoudly;

public class RedHeadDuck extends Duck {
	
	RedHeadDuck(){
		fb = new FlyNoWay();
		qb = new QuackLoudly();
	}
	
	public void display() {
		System.out.println("Display: red head duck");
		
	}
	
}
