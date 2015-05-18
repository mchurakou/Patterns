package chain_responsibility;

public abstract class Handler {
	
	protected Handler nextHandler;
	public abstract void handle(String str);
}
