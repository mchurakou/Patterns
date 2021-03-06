package structural.proxy.rmi.gumble.server.state;

import structural.proxy.rmi.gumble.server.GumballMachine;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		System.out.println("You inserted a qyarter");

	}

	
	public void ejectQuarter() {
		System.out.println("You haven't inserted quarter");

	}

	
	public void turnCrank() {
		System.out.println("You turned but there's no quarter");

	}

	
	public void dispense() {
		System.out.println("You need to pay first");

	}

}
