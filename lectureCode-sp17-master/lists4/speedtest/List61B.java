public interface List61B <Blah>{

    /** Adds x to the front of the list. */
    public void addFirst(Blah x);
    /** Adds x to the end of the list. */
    public void addLast(Blah x);
    /** Returns the first item in the list. */
    public Blah getFirst();
    /** Returns the last item in the list. */
    public Blah getLast();
    /** Remove the last item in the list. */
//    public Blah removeLast();
    /** Returns the size of the list. */
    public int size();
//    public void insert(Blah x, int position);
    /**
     * Returns the ith item of the list
     */
    public Blah get(int i);

    /**
     * Use default keyword to specify a method that subclasses should inherit from an interface
     */
    default public void print(){
        for(int i = 0; i < size(); i += 1){
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
