package complex;

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
