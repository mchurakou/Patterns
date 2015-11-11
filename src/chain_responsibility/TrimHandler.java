package chain_responsibility;

public class TrimHandler extends Handler {

	public void handle(String str) {
		super.handle(str.trim());
	}

}
