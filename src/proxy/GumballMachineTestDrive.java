package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

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
