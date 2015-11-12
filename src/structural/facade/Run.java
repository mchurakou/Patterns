package structural.facade;

import structural.facade.components.Display;
import structural.facade.components.Sound;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HomeTheaterFacade htf = new HomeTheaterFacade(new Display(), new Sound());
		htf.on();
		htf.off();

	}

}
