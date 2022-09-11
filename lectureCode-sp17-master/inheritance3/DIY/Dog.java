import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    /**
     * return negative if this size is less than object size.
     */
    public int compareTo(Dog o) {
        return this.size - o.size;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNamComparator() {
        return new NameComparator();
    }
}