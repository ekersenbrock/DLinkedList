
/**
 * A doubly lined list is a collection in which every cell holds a reference 
 * to the adjacent cells. The first cell has a reference to the last and 
 * second cell. The last cell holds a reference to the the second to last cell
 * and the first cell. The starting node is the only node that is directly 
 * accessed.
 *
 * @author Erik K
 * @version 5/30/2020
 */
public class DLCList<T> implements IList<T>
{
    // First node in the list.
    private Node start;
    // Number of nodes in the list.
    private int size;

    /**
     * Constructs an empty doubly linked circular list.
     */
    public DLCList()
    {
        // Initially a void list.
        start = null;
        size = 0;
    }

    /**
     * Updates information at the given index while move all cells past the
     * the given index over one space.
     * @param index The index to be updated.
     * @param item The new data or object to be stored.
     * @return Is the method successful.
     */
    public void add(int index, T item) {  
        // Checks for valid index.
        if(size == 0 && index == 0){
            addFirst(item);
            size++;
        }
        else if(index >= size || index < 0){
            throw new IndexOutOfBoundsException(index);
        }
        else{
            // Get node at desired index.
            Node currentNode = getNode(index);
            // Create the new node.
            Node newNode = new Node(item, currentNode.getPrevious(), 
                    currentNode);
            // Updates the node at index - 1.
            currentNode.getPrevious().setNext(newNode);
            // Updates node that was at index.
            currentNode.setPrevious(newNode);
            size++;;
        }
    }

    private Node getNode(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = start;
        for(int i = 0; i <= index; i++){
            // Set up currentNode for next loop.
            currentNode = currentNode.getNext(); 
        }
        return currentNode;
    }

    /**
     * Add the first element to the list
     */
    public void addFirst(T item) {
        if(size > 0){
            // Create new node with previous and last nodes and new data.
            Node<T> newNode = new Node(item, start.getPrevious(), start);
            // Update last node in list.
            start.getPrevious().setNext(newNode);
            // Update old first node.
            start.setPrevious(newNode);
            start = newNode;
        }
        else{
            Node<T> newNode = new Node(item);
            start = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        if(size > 0){
            // Creates new node and sets index.
            Node<T> newNode = new Node(item, start.getPrevious(), start);
            // Updates current last node.
            start.getPrevious().setNext(newNode);
            // Updates start node.
            start.setPrevious(newNode);
        } 
        else{
            Node<T> newNode = new Node(item);
            start = newNode;
        }
        size++;
    }

    /**
     * Delete the node at the given index.
     * @param index The index to be deleted.
     * @throws NullPointerException If list is empty or inproper index is 
     * used.
     */
    public void delete(int index) {
        if(size == 1){
            clear();
        }
        else{
            Node toDelete = getNode(index);
            toDelete.getPrevious().setNext(toDelete.getNext());
            toDelete.getNext().setPrevious(toDelete.getPrevious());
            size--;
        }
    }

    /**
     * Deletes the first item in the list.
     * @throws NullPointerException If list is empty.
     */
    public void deleteFirst() {
        int index = 0;
        delete(index);
    }

    /**
     * @throws NullPointerException If list is empty.
     */
    public void deleteLast() {
        delete(size() - 1);
    }

    /**
     * Return the number of nodes in this list.
     * @return The number of nodes.
     */
    public int size() {
        return size;
    }

    /**
     * Start with a new null list.
     */
    public void clear() {
        start = null;
        size = 0;
    }

    /**
     * Returns a true if the list contains the objet parameter.
     * @param object An object for comparison.
     */
    public boolean contains(T object) {
        boolean contains = false;
        int index = 0;
        while(index < size && !contains){
            contains = get(index).equals(object);
            index++;
        }
        return contains;
    }

    /**
     * Returns data stored in the given index.
     * @param index The index to be returned.
     * @returns The stored data.//////////// fix getters after advise from
     * Pdog!!!!!!!!!!!!!!!!!!!
     */
    public Node<T> get(int index) {
        if(size == 0){
            return null;
        }
        else{
            return getNode(index);
        }
    }

    /**
     * Returns the contents of the first node of this list.
     * @return The data stored in the first node.
     * @throws NullPointerException If list is empty.
     */
    public Node<T> getFirst() {
        if(size == 0){
            return null;
        }
        else{
            return start;
        }
    }

    /**
     * Returns the contents of the last node in this list.
     * @return The data stored in the last node.
     * @throws IndexOutOfBoundsException
     */  
    public Node<T> getLast() {
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        return start.getPrevious();
    }

    /**
     * Replaces the contents of the given node with the given object.
     * @param index The index to be replaced.
     * @param object The new object to occupie this node.
     * @throws IndexOutOfBoundsException If index is larger than list.
     */
    public void set(int index, T object) {
        getNode(index).setData(object);
    }
}
