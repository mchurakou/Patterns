package strategy;

public class MallardDuck extends Duck{
	
	MallardDuck(){
		fb = new FlyWithWings();
		qb = new QuackLoudly();
	}
	
	
	public void display() {
		System.out.println("Display: mallard duck");
		
	}
	
}
