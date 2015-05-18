package proxy;

import java.rmi.Naming;

public class MyRemoteClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
