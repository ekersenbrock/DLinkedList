
/**
 * The node contains information and a reference to both the previous and 
 * and next node.
 *
 * @author Erik K
 * @version 5/30/2020
 */
public class Node<T>
{
    // References to the other nodes.
    private Node previous;
    private Node next;
    // Holds the information.
    private T data;

    /**
     * Initializes previous and next as a reference to itself. Pass in the 
     * data to be stored.
     * @param data The data to be stored.
     */
    public Node(T data)
    {
        this.data = data;
        previous = this;
        next = this;
    }
    
    /**
     * Construct a node that initializes the previous and next node 
     * references.
     * @param data The data to be stored.
     * @param previous The previous node.
     * @param next The next node.
     */
    public Node(T data, Node previous, Node next){
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    
    /**
     * Return the object stored in this node.
     * @return The stored data.
     */
    public T getData() {
        return data;
    }
    
    /**
     * Set the next node.
     * @param next The new next node.
    */
    public void setNext(Node next){
        this.next = next;
    }
    
    /**
     * Set the reference to the next node.
     * @param previous The new prious node.
     */
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    
    /**
     * Return the next node.
     * @return The next node.
     */
    public Node getNext(){
        return next;
    }
    
    /**
     * Return the previous node.
     * @return The previous node.
     */
    public Node getPrevious(){
        return previous;
    }
    
    /**
     * Replaces the data.
     * @param data The new data to be stored.
     */
    public void setData(T data){
        this.data = data;
    }
}
