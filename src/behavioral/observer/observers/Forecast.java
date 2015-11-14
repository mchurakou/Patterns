package behavioral.observer.observers;

import behavioral.observer.observable.Subject;

public class Forecast implements Observer {
	
	private Subject subject;
	public Forecast(Subject s){
		subject = s;
		subject.registerObserver(this);
	}
	
	public void	update(int t, int h, int p ){
		System.out.println("Forecast:t=" + t + " h=" + h + " p=" + p);
	}
	
}
