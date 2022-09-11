/** Array based list.
 *  @author Josh Hug
 */
/** Invariants
 * addlast: The position of the next item to be inserted (using addLast) is always size
 * getLast: The position of the last item in the list is always size - 1.
 * size: The number of items in the AList is always size.
 * Modify the Alist to Generic Alist
 */
public class AList<Item> {
    /** Creates an empty list. */
    private Item[] item ;
    private int size;
    public AList() {
//         item = new Item[100];
         item = (Item[]) new Object[100];
         size = 0;
    }

    /**
     * Create a helper method to resize Array
     * @param capacity
     */
    private void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(item, 0, a, 0, size);
        item = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size == item.length){
//            resize(size+1);  this is super slow when running program;
            resize(size*2);
        }
        item[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return item[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
//        item[size] = 0; // Do not need to destroy it, just hide it. unnecessary;
        Item x = getLast();
        size -= 1;
        return x;
    }
} 