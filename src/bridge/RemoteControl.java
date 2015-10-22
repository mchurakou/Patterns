package bridge;

public abstract class RemoteControl {
	public TV implementor;
	
	public abstract void on();
	public abstract void off();
	
	public abstract void setChannel();
}