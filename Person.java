
/**
 * Contains a persons information.
 *
 * @author Erik K
 * @version 5/30/2020
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String ID;
    private String first;
    private String last;
    private final Integer ID_LENGTH = 8;
    
    /**
     * Holds information about this person including first and last name and 
     * ID number that can only contain eight numbers.
     * @param first The first name of this person.
     * @param last The last name of this person.
     * @param ID The eight digit identification number.
     */
    public Person(String first, String last, String ID)
    throws InvalidIDException
    {
        if(ID.length() != ID_LENGTH){
            throw new InvalidIDException(ID_LENGTH.toString()); 
        }
        this.ID = ID;
        this.first = first;
        this.last = last;
    }
    
    public String toString() {
        return first + " " + last + " ID: " + ID;
    }
}
