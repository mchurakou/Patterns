package adapter;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TurkeyAdapter ta = new TurkeyAdapter(new WildTurkey());
		ta.quack();
		ta.fly();

	}

}
