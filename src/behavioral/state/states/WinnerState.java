package behavioral.state.states;

import behavioral.state.GumballMachine;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState (GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");

	}

	
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned a quarter");

	}

	
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");

	}

	
	public void dispense() {
		System.out.println("You are winner!");
		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() == 0){
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			
			if (gumballMachine.getCount() > 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
				
			} else {
				System.out.println("oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
