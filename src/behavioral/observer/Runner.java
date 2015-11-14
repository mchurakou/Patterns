package behavioral.observer;

import behavioral.observer.observable.WeatherData;
import behavioral.observer.observers.CurrentCondition;
import behavioral.observer.observers.Forecast;
import behavioral.observer.observers.StatisticDisplay;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentCondition cc = new CurrentCondition(wd);
		StatisticDisplay sd = new StatisticDisplay(wd);
		Forecast f = new Forecast(wd);
		
		wd.measurementsChanged(1, 2, 3);
	}

}
