package command;

public class SimpleRemoteControl {
	Command command;
	
	
	public Command getSlot() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}


	public void buttonWasPressed(){
		command.execute();
	}
}
