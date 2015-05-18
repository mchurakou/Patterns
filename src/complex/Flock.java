package complex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	List<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.quack();
		}

	}
	
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
