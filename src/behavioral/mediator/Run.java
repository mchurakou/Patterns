package behavioral.mediator;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TV tv = new TV();
		Alarm alarm = new Alarm();
		Mediator m = new Mediator (tv, alarm);
		
		alarm.call(m);

	}

}
