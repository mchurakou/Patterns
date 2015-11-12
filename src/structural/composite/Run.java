package structural.composite;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuComponent menu = new Menu("menu1","desc");
		menu.add(new MenuItem("menu1","desc", true, 100));
		menu.add(new MenuItem("menu2","desc2", true, 100));

		MenuComponent subMenu = new Menu("submenu","desc");
		subMenu.add(new MenuItem("desert","desc", true, 100));

		menu.add(subMenu);


		menu.print();

	}

}
