package structural.proxy.rmi.gumble.server.state;

import java.io.Serializable;

public interface State extends Serializable{
	void insertQuarter();
	
	void ejectQuarter();
	void turnCrank();
	
	 void dispense();


}
