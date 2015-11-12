package structural.bridge;

import structural.bridge.abstraction.ConcreteRemote;
import structural.bridge.implementation.Samsung;

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
