package bridge;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteRemote c =  new ConcreteRemote(new Samsung());
		c.on();
		c.setChannel();
	}
	

}
