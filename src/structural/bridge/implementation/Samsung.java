package structural.bridge.implementation;

public class Samsung extends TV {

	@Override
	public void on() {
		System.out.println("samsung on");
	}

	@Override
	public void off() {
		System.out.println("samsung off");

	}

	@Override
	public void tuneChannel() {
		System.out.println("samsung channel");

	}

}
