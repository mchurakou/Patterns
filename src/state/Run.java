package state;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine(10);
		gm.insertQuarter();
		gm.turnCrank();
		
		gm.insertQuarter();
		gm.turnCrank();
		
		gm.insertQuarter();
		gm.turnCrank();
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.turnCrank();
		

	}

}
