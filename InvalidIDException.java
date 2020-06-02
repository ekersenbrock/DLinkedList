
/**
 * Notification for input of an invalid or inapropriate lenght
 *
 * @author Erik K
 * @version 5/30/2020
 */
public class InvalidIDException extends Exception
{
    // Error message
    private String key;
    
    /**
     * Store the details in error.
     * @param key The desired length for the input.
     */
    public InvalidIDException(String key)
    {
        this.key = key;
    }
    
    /**
     * @return The key in error.
     */
    public String getKey()
    {
        return key;
    }
    
    /**
     * @return A diagnostic string containing the key in error.
     */
    public String toString()
    {
        return "Invalid Length Exception: input must be " + key + 
            " character long and only contain numbers";
    }
}