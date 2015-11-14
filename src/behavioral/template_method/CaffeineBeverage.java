package behavioral.template_method;

public abstract class CaffeineBeverage {
	public void boilWater(){
		System.out.println("boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring in cup");
	}
	
	
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	
	public final void prepareReceipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		
	}
}
