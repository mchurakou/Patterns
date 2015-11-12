package flyweight.tree;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x =  {1,2,3};
		int[] y =  {3,4,5};
		TreeManager tm = new TreeManager(x, y);
		tm.show();
	}

}
