package structural.proxy.defender;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PersonBean o = Factory.getOwnerProxy(new PersonBeanImpl());
		
		
		PersonBean n = Factory.getNonOwnerProxy(new PersonBeanImpl());
		
		n.setRating(2);
		o.setInterests("2");

	}

}
