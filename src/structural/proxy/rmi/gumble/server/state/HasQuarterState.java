package structural.proxy.rmi.gumble.server.state;

import structural.proxy.rmi.gumble.server.GumballMachine;

import java.util.Random;

/**
 * Created by mikalai on 04.11.2015.
 */
public class HasQuarterState implements State  {
        Random randomWinner = new Random(System.currentTimeMillis());


        transient GumballMachine gumballMachine;

        public HasQuarterState(GumballMachine gumballMachine){
            this.gumballMachine = gumballMachine;
        }


        public void insertQuarter() {
            System.out.println("You can't insert another quarter");

        }


        public void ejectQuarter() {
            System.out.println("Quarter returned");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }


        public void turnCrank() {
            System.out.println("You turned...");
            int winner = randomWinner.nextInt(10);

            System.out.println(winner);
            if (winner == 0 && gumballMachine.getCount() > 1){
                gumballMachine.setState(gumballMachine.getWinnerState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldState());
            }




        }


        public void dispense() {
            System.out.println("No gumball dispensed");

        }

}
