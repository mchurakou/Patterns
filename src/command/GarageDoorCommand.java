package command;

public class GarageDoorCommand implements Command {

	private GarageDoor door;
	public GarageDoorCommand(GarageDoor d){
		this.door = d;
	}
	@Override
	public void execute() {
		door.up();

	}
	@Override
	public void undo() {
		door.down();
		
	}

}
