package behavioral.observer.observers;

import behavioral.observer.observable.Subject;

public class StatisticDisplay implements Observer {
	
	private Subject subject;
	public StatisticDisplay(Subject s){
		subject = s;
		subject.registerObserver(this);
	}
	
	public void	update(int t, int h, int p ){
		System.out.println("Statistic:t=" + t + " h=" + h + " p=" + p);
	}
}
