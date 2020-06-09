
/**
 * Learn recursion by converting integer values to binary strings.
 *
 * @author Erik K
 * @version 6/5/2020
 */
public class Recursion
{
    /**
     * Constructor for objects of class Recursion
     */
    public Recursion()
    {
    }

    public static String convertToBinString(int number){
        String result = "";
        int rem = number % 2;
        int quot = number / 2;
        
        if(quot == 0){
            result = "" + rem;
        }
        else{
            result = "" + convertToBinString(quot) + rem;
        }
        return result;
    }
}
