 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList<Blah> implements List61B<Blah>{
	private class StuffNode {
		public Blah item;
		public StuffNode next;

		public StuffNode(Blah i, StuffNode n) {
			item = i;
			next = n;
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private StuffNode sentinel;
	private int size;

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new StuffNode(null, null);
		size = 0;
	}

	public SLList(Blah x) {
		sentinel = new StuffNode(null, null);
		sentinel.next = new StuffNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
	@Override
	 public void addFirst(Blah x) {
 		sentinel.next = new StuffNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
	@Override
	 public Blah getFirst() {
 		return sentinel.next.item;
 	}
	 /** Returns the first item in the list. */
	 @Override
	 public Blah getLast() {
		 StuffNode p = sentinel;
		 /* Advance p to the end of the list. */
		 while (p.next != null) {
			 p = p.next;
		 }
		 return p.item;
	 }
 	/** Adds x to the end of the list. */
	@Override
	 public void addLast(Blah x) {
 		size = size + 1;
 		StuffNode p = sentinel;
 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}
 		p.next = new StuffNode(x, null);
 	}
 	
 	/** Returns the size of the list. */
	@Override
	 public int size() {
 		return size;
 	}

	 /**
	  * Returns the ith item of the list
	  */
	 @Override
	 public Blah get(int i){
		 StuffNode p = sentinel.next;
		 int j = 0;
		 while(j != i){
			 p= p.next;
			 j++;
		 }
		 return p.item;
	 }
	 @Override
	 public void print(){
		 for(StuffNode p = sentinel.next ; p != null ;  p = p.next){
			 System.out.print(p.item + " ");
		 }
		 System.out.println();
	 }

	 public static void main(String[] args) {
 		SLList<Integer> L = new SLList<>();
		 L.addFirst(10);
		 L.addFirst(15);
		 L.addLast(20);
		 System.out.println(L.getLast());
 	
 	}
}