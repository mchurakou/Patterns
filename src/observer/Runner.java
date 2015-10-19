package observer;

import observer.observable.WeatherData;
import observer.observers.CurrentCondition;
import observer.observers.Forecast;
import observer.observers.StatisticDisplay;

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
