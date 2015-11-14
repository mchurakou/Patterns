package behavioral.mediator;

public class Alarm   {
	public void call(Mediator mediator){
		mediator.message("call");
	}
}
