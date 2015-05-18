package command;

public class LightOnCommand implements Command {
	private Light light;
	public LightOnCommand(Light l){
		this.light = l;
	}
	public void execute() {
		light.on();
	}
	@Override
	public void undo() {
		light.off();
		
	}

}
