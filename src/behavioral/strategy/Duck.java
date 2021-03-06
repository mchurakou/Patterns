package behavioral.strategy;

import behavioral.strategy.behaviour.fly.FlyBehaviour;
import behavioral.strategy.behaviour.quack.QuackBehaviour;

public abstract class Duck {
	
	FlyBehaviour fb;
	QuackBehaviour qb;
	
	public void doFly(){
		fb.fly();
	}
	
	public void doQuack(){
		qb.quack();
	}
	
	public void swim(){
		System.out.println("swim");
	}
	
	
	
	
	public abstract void display();
}
