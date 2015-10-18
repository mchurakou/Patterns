package strategy;

import strategy.behaviour.fly.impl.FlyNoWay;
import strategy.behaviour.quack.impl.QuackLoudly;

public class RedHeadDuck extends Duck {
	
	RedHeadDuck(){
		fb = new FlyNoWay();
		qb = new QuackLoudly();
	}
	
	public void display() {
		System.out.println("Display: red head duck");
		
	}
	
}
