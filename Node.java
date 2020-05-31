
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<T>
{
    // instance variables - replace the example below with your own
    private Node previous;
    private Node next;
    private T data;

    /**
     * Constructor for objects of class Node
     */
    public Node(T data)
    {
        this.data = data;
        previous = this;
        next = this;
    }
    
    public T getData() {
        return data;
    }
}
