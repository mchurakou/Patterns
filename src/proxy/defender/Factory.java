package proxy.defender;

import proxy.defender.handler.NonOwnerInvocationHandler;
import proxy.defender.handler.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

public class Factory {
	static PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader()
				, person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
	
	static PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader()
				, person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
}
