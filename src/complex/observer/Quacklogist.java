package complex.observer;

public class Quacklogist implements Observer {

	
	public void update(QuackObservable duck) {
		System.out.println("Log: " + duck + "just quacked");

	}

}
