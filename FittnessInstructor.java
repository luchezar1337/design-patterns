
public class FittnessInstructor {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void makeCommand() {
		this.command.execute();
	}
}
