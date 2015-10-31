package iterator;

import iterator.iterable.BreakFastMenu;
import iterator.iterable.DinnerMenu;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Iterable dm = new DinnerMenu();
		dm.forEach(System.out::println);

		System.out.println();

		Iterable bf = new BreakFastMenu();
		bf.forEach(System.out::println);

	}

}
