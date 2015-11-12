package structural.bridge.abstraction;

import structural.bridge.implementation.TV;

public class ConcreteRemote extends RemoteControl {

	
	public ConcreteRemote(TV tv){
		this.implementor = tv;
	}
	
	public void on() {
		implementor.on();

	}

	
	public void off() {
		implementor.off();

	}

	
	public void setChannel() {
		implementor.tuneChannel();

	}

}
