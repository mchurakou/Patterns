package iterator;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuItem[] items = {new MenuItem("product1", "desc1", true, 1),
							new MenuItem("product2", "desc2", true, 2)};
		DinerMenuIterator dmi = new DinerMenuIterator(items);
		while (dmi.hasNext()){
			MenuItem item = (MenuItem)dmi.next();
			System.out.println(item.getName());
			System.out.println(item.getDescription());
			System.out.println(item.isVegeterian());
			System.out.println(item.getPrice());
			System.out.println();
		}

	}

}
