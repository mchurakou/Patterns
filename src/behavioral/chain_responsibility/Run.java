package behavioral.chain_responsibility;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler trim = new TrimHandler();
		Handler upper = new UpperHandler();
		SoutHandler sout = new SoutHandler();

		trim.setNextHandler(upper).setNextHandler(sout);

		trim.handle("  Spam is   ");

	}

}
