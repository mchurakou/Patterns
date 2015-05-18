package chain_responsibility;

public class FirstHandler extends Handler {
	Handler  handler;
	public FirstHandler(Handler handler){
		this.handler = handler;
	}
	public void handle(String str) {
		if (str.startsWith("Spam")){
			System.out.println("SPAM!");
		} else {
			handler.handle(str);
		}
		

	}

}
