
/**
 * Write a description of class DLCList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DLCList<T> implements IList<T>
{
    private Node start;
    /**
     * Constructor for objects of class DLCList
     */
    public DLCList()
    {
        //instance variables
        start = null;
        
    }
    
    public boolean add(int index, T type) { return true;}
    public boolean addFirst(T type) {
        Node<T> node = new Node(type);
        return true;
    }
    public boolean addLast(T type) { return true;}
    
    public void delete(int index) {}
    public void deleteFirst() {}
    public void deleteLast() {}
    
    public int size() {return 0;}
    public void clear() {}
    public boolean contains(T object) {return true;}
    
    public T get(int index) {return (T)new Object();}
    public T getFirst() {return (T)new Object();}
    public T getLast() {return (T)new Object();}
    
    public void set(int index, T object) {}
}
