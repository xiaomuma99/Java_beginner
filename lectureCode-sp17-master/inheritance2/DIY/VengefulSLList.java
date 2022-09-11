/** SList with additional operation printLostItems() which prints all items
  * that have ever been deleted. */
public class VengefulSLList<Item> extends SLList<Item> {

	SLList<Item> deletedItems;
	public VengefulSLList() {
		super();
		deletedItems = new SLList<>();
	}
	public VengefulSLList(Item x) {
		super(x);
		deletedItems = new SLList<>();
	}
	@Override
	public Item removeLast() {
		Item x = super.removeLast();
		deletedItems.addLast(x);
		return x;
	}
	public void printLostItems() {
		deletedItems.print();
	}

	public static void main(String[] args) {

		VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>(0);
		SLList<Integer> s1 = new VengefulSLList<>();
//		VengefulSLList<Integer> s2 = new SLList<>();
		vs1.addLast(1);
		vs1.addLast(5);
		vs1.addLast(10);
		vs1.addLast(13);
		s1.addLast(2);
		s1.removeLast();
		s1.printLostItems();
		// vs1 is now: [1, 5, 10, 13]

		vs1.removeLast();
		vs1.removeLast();
		// After deletion, vs1 is: [1, 5]

		// Should print out the numbers of the fallen, namely 10 and 13.
		System.out.print("The fallen are: ");
		vs1.printLostItems();
	}
} 