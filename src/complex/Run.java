package complex;

import complex.abstract_factory.AbstractDuckFactory;
import complex.abstract_factory.DuckFactory;
import complex.decorator.QuackCounter;
import complex.composite.Flock;
import complex.observer.Quacklogist;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDuckFactory factory = new DuckFactory();
		
		
		Flock flock = new Flock();
		flock.add(factory.createMallardDuck());
		flock.add(factory.createRedHeadDuck());
		flock.add(factory.createRubberDuck());
		//flock.add(new GooseAdapter(new Goose()));
		
		Quacklogist log = new Quacklogist();
		flock.registerObserver(log);
		flock.quack();
		
		
		
		System.out.println("Total:" + QuackCounter.getQuacks());

	}

}
