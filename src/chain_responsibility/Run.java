package chain_responsibility;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler h = new FirstHandler(new SecondHandler());
		h.handle("Spadm is");

	}

}
