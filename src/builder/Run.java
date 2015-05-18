package builder;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractBuilder ab = new StrBuilder();
		ab.step1();
		ab.step2();
		ab.step3();
		
		System.out.println(ab.getResult());

	}

}
