package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public class Alarm extends Colleague   {
	public Alarm(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void notify(String message) {
		System.out.println("Alarm ring:" + message);
	}
}
