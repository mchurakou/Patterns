package structural.proxy.rmi.gumble.server;

import java.rmi.Naming;

public class GumballMachineTestDrive {
	public static void main(String[] args)  {
		try {
			GumballMachineRemote gm = new GumballMachine(10, "Dobrush");
			Naming.rebind("Gumball", gm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
