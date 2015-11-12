package structural.proxy.rmi.gumble.server;

import structural.proxy.rmi.gumble.server.state.State;

import java.rmi.Remote;
import java.rmi.*;

public interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
