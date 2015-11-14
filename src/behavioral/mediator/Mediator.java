package behavioral.mediator;

public class Mediator {
	
	TV tv;
	Alarm alarm;
	
	public  Mediator(TV tv, Alarm alarm){
		this.tv = tv;
		this.alarm = alarm;
	}
	
	public void message(String str){
		if (str != null){
			tv.on();
		}
			
	}
}
