package behavioral.command.commands;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no behavioral.command");

	}

	@Override
	public void undo() {
		System.out.println("no behavioral.command for undo");
		
	}

}
