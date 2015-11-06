package complex.abstract_factory;

import complex.strategy.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createRubberDuck();
}
