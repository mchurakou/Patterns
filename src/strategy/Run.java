package strategy;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		RedHeadDuck rh = new RedHeadDuck();

		md.display();
		md.doFly();
		md.doQuack();
		
		rh.display();
		rh.doFly();
		rh.doQuack();
		

		

	}

}
