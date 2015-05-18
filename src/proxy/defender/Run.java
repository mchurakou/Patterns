package proxy.defender;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PersonBean o = Factory.getOwnerProxy(new PersonBeanImpl());
		
		
		PersonBean n = Factory.getNonOwnerProxy(new PersonBeanImpl());
		
		o.setRating(2);
		n.setInterests("2");
	}

}
