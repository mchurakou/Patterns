package chain_responsibility;

public class SecondHandler extends Handler {

	
	public void handle(String str) {
		System.out.println("FINISH!");

	}

}
