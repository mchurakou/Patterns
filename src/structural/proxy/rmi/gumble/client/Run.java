package structural.proxy.rmi.gumble.client;

import structural.proxy.rmi.gumble.server.GumballMachineRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class Run {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		GumballMachineRemote machine;
		try {
			machine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/Gumball");
			GumballMonitor monitor = new GumballMonitor(machine);
			monitor.report();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
