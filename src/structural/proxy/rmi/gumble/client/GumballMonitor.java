package structural.proxy.rmi.gumble.client;

import structural.proxy.rmi.gumble.server.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine){
		this.machine = machine;
	}
	
	public void report(){
		try {
			System.out.println("Location:" + machine.getLocation());
			System.out.println("Count:" + machine.getCount());
			System.out.println("State:" + machine.getState());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
	}
}
