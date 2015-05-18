package template_method;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.prepareReceipe();
		System.out.println();
		Tea t = new Tea();
		t.prepareReceipe();
	}

}
