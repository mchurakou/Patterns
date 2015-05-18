package observer;

import java.util.ArrayList;
import java.util.List;



public class WeatherData implements Subject{
	
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
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
		
	}

	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++){
			Observer o = observers.get(i);
			o.update(temperature,  humidity, pressure);
		}
		
	}
}
