package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Alarm;
import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.colleague.TV;

public class ConcreteMediator extends Mediator {

	private TV tv;
	private Alarm alarm;


	public void send(String message, Colleague colleague) {
		if (colleague.equals(tv)) {
			alarm.notify(message);
		} else {
			tv.notify(message);
		}
	}


	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public Alarm getAlarm() {
		return alarm;
	}

	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}
}
