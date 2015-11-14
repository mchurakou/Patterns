package behavioral.template_method;

public class Coffee extends CaffeineBeverage{
	
	
	public void brew(){
		System.out.println("brew and grind");
	}
	
	
	
	public void addCondiments(){
		System.out.println("Adding sugar and milk");
	}
	
	
}
