package command;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Light light = new Light();
		LightOnCommand loc = new LightOnCommand(light);
		LightOffCommand lof = new LightOffCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorCommand gd = new GarageDoorCommand(garageDoor);
		
		CeilingFan cf = new CeilingFan("home");
		CeilingFanHighCommand chc = new CeilingFanHighCommand(cf);
		
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(0, loc, lof);
		remote.setCommand(1, gd, new NoCommand());
		remote.setCommand(2, chc, new NoCommand());
		Command[] partyOn = {gd, chc};
		MacroCommand mc = new MacroCommand(partyOn);
		
		remote.setCommand(3, mc, new NoCommand());
		
		
		
		
		
		remote.onButtonPushed(0);
		remote.offButtonPushed(0);
		remote.undoButtonPushed();
		
		remote.onButtonPushed(1);
		remote.offButtonPushed(1);
		
		remote.onButtonPushed(2);
		System.out.println("macro");
		remote.onButtonPushed(3);
	}

}
