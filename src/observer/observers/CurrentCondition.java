package observer.observers;

import observer.observable.Subject;

public class CurrentCondition implements Observer {
	private Subject subject;
	public CurrentCondition(Subject s){
		subject = s;
		subject.registerObserver(this);
	}
	
	public void	update(int t, int h, int p ){
		System.out.println("Current:t=" + t + " h=" + h + " p=" + p);
	}
}
