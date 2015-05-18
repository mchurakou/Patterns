package strategy;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		RedHeadDuck rh = new RedHeadDuck();
		RubberDuck rb = new RubberDuck();
		DecoyDuck dd = new DecoyDuck();
		
		md.display();
		md.doFly();
		md.doQuack();
		
		rh.display();
		rh.doFly();
		rh.doQuack();
		
		rb.display();
		
		
		dd.display();
		
	}

}
