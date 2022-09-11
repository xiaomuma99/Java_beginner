import java.util.ArrayList;
import java.util.Iterator;

public class ArraySet<T> implements  Iterable<T> {

    private T[] items;
    private int size;
    public ArraySet() {

        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
            if ( items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
    Ignore if x equals to null.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x == null) {
            return;
        }

        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }



    /**
     * Add an iterator() method to ArraySet that returns an Iterator<T>
     * return an iterator (a.k.a seer) into ME
     */
    public Iterator<T> iterator() {
        return new ArraysetIterator();
    }

    /**
     * The Iterator<T> that we return should have a useful hasNext() and next() method.
     */
    private class ArraysetIterator implements Iterator<T> {
        private int wizPos;
        public ArraysetIterator() {
            wizPos = 0;
        }
        public boolean hasNext() {
            return wizPos < size;
        }
        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    /**
     * we need to provide our own toString() method if
     * we want to be able to see the objects printed in a readable format.
     */
    @Override
    public String toString() {
        String returnString = "{";
        for (int i = 0; i < size; i++) {
            returnString += items[i];
            returnString += "-->";
        }
        returnString += "}";
        return returnString;
    }

    /**
     * Exercise 6.4.2: Rewrite the toString() method using StringBuilder.
     */
//    public String toString() {
//        StringBuilder returnSB = new StringBuilder("{");
//        for (int i = 0; i < size; i++) {
//            returnSB .append(items[i]);
//            returnSB .append("-->");
//        }
//        returnSB .append("}");
//        return returnSB .toString();
//    }

    /**
     * Exercise 6.4.3: Let's write an equals method for the ArraySet class.
     * Remember, a set is an unordered collection of unique elements.
     * So, for two sets to be considered equal,
     * you just need to check if they have the same elements.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if (o.size != this.size) {
            return false;
        }
        for (T item: this) {
            if (!o.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArraySet<Integer> aset = new ArraySet<>();
        ArraySet<Integer> aset2 = new ArraySet<>();
        ArraySet<Integer> aset3 = aset;
        aset.add(null);
        aset.add(12);
        aset.add(13);
        aset.add(14);
        aset.add(15);
        aset2.add(12);
        aset2.add(13);
        aset2.add(14);
        aset2.add(15);
        System.out.println(aset.contains(12));
        System.out.println(aset.size());
        System.out.println(aset.equals(aset2));
        System.out.println(aset.equals(aset3));


        /**
         * solution: Ugly itration
          */
//        Iterator<String> aseer = aset.iterator();
//
//        while (aseer.hasNext()) {
//            System.out.println(aseer.next());
//        }
        /**
         * In order to make below short code work, we must claim implements Iterable <T> in the beginning
         */
//        for (Integer i : aset) {
//            System.out.println(i);
//        }
//
//        System.out.println(aset);
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
