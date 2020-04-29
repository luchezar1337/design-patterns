import java.util.ArrayList;
import java.util.List;

public class Receiver implements Observable {
	private Boolean standsUp;
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
 
	public void lieDown() {
		this.name = "Lying Down";
		System.out.println(name);
		this.standsUp = false;
		this.notifyObservers();
	}
	
	public void standUp() {
		this.name = "Staying up";
		System.out.println(name);
		this.standsUp = true;
		this.notifyObservers();
	}
	
	

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setMove(this);		
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;

	}
}
