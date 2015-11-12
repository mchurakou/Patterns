package structural.proxy.defender.handler;

import structural.proxy.defender.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean personBean;
	
	public OwnerInvocationHandler(PersonBean personBean){
		this.personBean = personBean;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")){
				return method.invoke(personBean,args);
			} else if (method.getName().equals("setRating")){
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")){
				return method.invoke(personBean,args);
			}
		
		
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
