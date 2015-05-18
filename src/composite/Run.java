package composite;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuComponent menu = new Menu("menu1","desc");
		MenuComponent menuItem = new MenuItem("menu1","desc", true, 100);
		menu.add(menuItem);
		menu.print();

	}

}
