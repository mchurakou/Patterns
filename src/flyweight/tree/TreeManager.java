package flyweight.tree;

public class TreeManager {
	int[] x;
	int[] y;
	
	public TreeManager(int[]x, int[] y){
		this.x = x;
		this.y = y;
	}
	
	public void show(){
		for (int i = 0; i < x.length; i++)
			Tree.display(x[i], y[i]);
	}
}
