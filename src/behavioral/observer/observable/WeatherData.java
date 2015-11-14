package behavioral.observer.observable;

import behavioral.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;



public class WeatherData implements Subject {
	
	private int humidity;
	private int pressure;
	private int temperature;
	
	private List<Observer> observers;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	
	
	public void measurementsChanged(int t, int h, int p){
		temperature = t;
		humidity = h;
		pressure = p;
		notifyObservers();
	}

	
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	
	public void notifyObservers() {
		observers.forEach(x -> x.update(temperature,  humidity, pressure));

		
	}
}
