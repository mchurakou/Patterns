package decorator;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage b = new DarkRoast();
		b = new Mocha(b);
		b = new Whip(b);
		System.out.println(b.getDescription() + ":" + b.cost());

	}

}
