package complex;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	Observable observable;
	
	public GooseAdapter(){
		observable = new Observable (this);
	}
	
	public GooseAdapter(Goose goose){
		this.goose = goose;
	}

	

	public void quack() {
		goose.honk();
		notifyObservers();

	}

	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}

	
	public void notifyObservers() {
		observable.notifyObservers();
		
	}	
	


	
}
