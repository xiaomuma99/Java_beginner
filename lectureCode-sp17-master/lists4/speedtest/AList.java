/** Array based list.
 *  @author Josh Hug
 */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList<Blah> implements List61B <Blah> {
    private Blah[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Blah[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize(int capacity) {
        Blah[] a = (Blah[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    @Override
    public void addLast(Blah x) {
        if (size == items.length) {
            resize(size*2);
        }

        items[size] = x;
        size = size + 1;
    }
    /** Inserts X into the head of the list. */
    @Override
    public void addFirst(Blah x){
        Blah[] a = (Blah[]) new Object[size + 1];
        a[0] = x;
        System.arraycopy(items, 0, a, 1, size);
        items = a;
        size += 1;
    }
    /** Returns the item from the back of the list. */
    @Override
    public Blah getLast() {
        return items[size - 1];
    }
    /** Returns the first item of the list. */
    @Override
    public Blah getFirst() {
        return items[0];
    }
    /** Gets the ith item in the list (0 is the front). */
    @Override
    public Blah get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    @Override
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Blah removeLast() {
        Blah x = getLast();
        size = size - 1;
        return x;
    }
    public static void main(String[] args) {
        AList<Integer> L = new AList<>();
        L.addFirst(10);
        L.addFirst(15);
        L.addLast(20);
        System.out.println(L.getLast());
        System.out.println(L.getFirst());

    }
} 