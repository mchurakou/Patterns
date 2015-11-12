package structural.bridge.abstraction;

import structural.bridge.implementation.TV;

public abstract class RemoteControl {
	public TV implementor;
	
	public abstract void on();
	public abstract void off();
	
	public abstract void setChannel();
}
