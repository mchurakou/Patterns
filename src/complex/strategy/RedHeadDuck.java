package complex.strategy;

import complex.observer.Observable;
import complex.observer.Observer;

public class RedHeadDuck implements Quackable {

	
	Observable observable;
	
	public RedHeadDuck(){
		observable = new Observable (this);
	}
	
	public void quack() {
		System.out.println("Quack");
		notifyObservers();

	}

	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		
	}	

}
