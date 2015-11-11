package chain_responsibility;

public abstract class Handler {



	public  Handler nextHandler;


	public void handle(String str){
		if (nextHandler != null){
			nextHandler.handle(str);
		}
	};


	public Handler setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
		return nextHandler;
	}
}
