
/**
 * Write a description of class TreePractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeNode<T> implements Comparable<T> 
{
    // References to the other nodes.
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode rightChild;
    // Holds the information.
    private T data;

    /**
     * Initializes previous and next as a reference to itself. Pass in the 
     * data to be stored.
     * @param data The data to be stored.
     */
    public TreeNode(T data)
    {
        this.data = data;
        parent = null;
        leftChild = null;
        rightChild = null;
    }
    
    private TreeNode getParentNode(){
        return parent;
    }
    
    private TreeNode getLeftChildNode(){
        return leftChild;
    }
    
    private TreeNode getRightChildNode(){
        return rightChild;
    }
    
    public Object getData(){
        return data;
    }
    
    public int compareTo(T other) {
        double result = 0;
        
        if (true)/// Left if statement for future use.
        {
            result = this.getData().compareTo(other); 
        }
         
        return (int) result;
    }
}    
