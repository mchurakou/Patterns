package chain_responsibility;

public class UpperHandler extends Handler {


	@Override
	public void handle(String str) {
		super.handle(str.toUpperCase());
	}
}
