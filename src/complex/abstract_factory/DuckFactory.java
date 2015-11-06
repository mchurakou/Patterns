package complex.abstract_factory;

import complex.decorator.QuackCounter;
import complex.strategy.MallardDuck;
import complex.strategy.Quackable;
import complex.strategy.RedHeadDuck;
import complex.strategy.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
