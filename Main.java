
public class Main {

	public static void main(String[] args) {

		FittnessInstructor fitnessInstructor = new FittnessInstructor();
		Receiver receivers = new Receiver();
		
		Command standUpCommand = new StandUpCommand(receivers);
		Command lieDownCommand = new LieDownCommand(receivers);
		
		
		
		
		Observer obs1 = new OnlineViewers("Viewer 1");
		Observer obs2 = new OnlineViewers("Viewer 2");
		Observer obs3 = new OnlineViewers("Viewer 3");
		
		receivers.subscribe(obs1);
		receivers.subscribe(obs2);
		receivers.subscribe(obs3);
		
		//topic.setName("New topic");
		//topic.setName("Another topic");
		
		fitnessInstructor.setCommand(standUpCommand);
		fitnessInstructor.makeCommand();
		
	
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.makeCommand();
		

	}

}
