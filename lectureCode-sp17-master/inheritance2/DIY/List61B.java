/* TODO: Set up this interface so that it covers all common
 * methods to AList and SLList. Also add a default method
 * print that prints a list. */
public interface List61B<Item> {

    void addFirst(Item x);
    Item getFirst();
    void addLast(Item x);
    Item getLast();
    Item removeLast();
    int size();
    void insert(Item item, int position);
    void print();

} 