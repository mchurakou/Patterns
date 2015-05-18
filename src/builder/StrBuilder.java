package builder;

public class StrBuilder extends AbstractBuilder {

	String res;
	public void step1() {
		res = "step1";

	}

	@Override
	public void step2() {
		res += " step2";

	}

	@Override
	public void step3() {
		res += " step3";

	}
	
	public String getResult(){
		return res;
	}

}
