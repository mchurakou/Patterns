package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public class TV extends Colleague  {

	public TV(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void notify(String message) {
		System.out.println("TV show:" + message);
	}
}
