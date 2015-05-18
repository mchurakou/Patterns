package strategy;

public class RedHeadDuck extends Duck {
	
	RedHeadDuck(){
		fb = new FlyNoWay();
		qb = new QuackLoudly();
	}
	
	public void display() {
		System.out.println("Display: red head duck");
		
	}
	
}
