
public class LieDownCommand implements Command {

	private Receiver receivers;
	
	public LieDownCommand(Receiver receivers) {
		this.receivers = receivers;
	}

	@Override
	public void execute() {
		this.receivers.lieDown();
	}

}
