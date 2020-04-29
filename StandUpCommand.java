
public class StandUpCommand implements Command {

	private Receiver receivers;
	
	public StandUpCommand(Receiver receivers) {
		this.receivers = receivers;
	}

	@Override
	public void execute() {
		this.receivers.standUp();
	}

}
