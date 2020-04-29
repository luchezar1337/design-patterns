
public class OnlineViewers implements Observer {

	private String name;
	private Observable move;
	
	public OnlineViewers(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(move == null) {
			System.out.println("No move");
			return;
		}
		
		String moveName = move.getUpdate();
		System.out.println(this.getName() + " is now: " +  moveName);
		
	}
	@Override
	public void setMove(Observable move) {
		this.move = move;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
