package proxy.defender;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonBean personBean;
	
	public NonOwnerInvocationHandler(PersonBean personBean){
		this.personBean = personBean;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")){
				return method.invoke(personBean,args);
			} else if (method.getName().equals("setRating")){
				return method.invoke(personBean,args);
				
			} else if (method.getName().startsWith("set")){
				throw new IllegalAccessException();
			}
		
		
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
