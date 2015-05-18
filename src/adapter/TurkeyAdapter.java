package adapter;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
		
	}
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();

	}

}
