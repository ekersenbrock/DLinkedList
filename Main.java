
/**
 * Write a description of class Main here.
 *
 * @author Erik K
 * @version 5/31/2020
 */
public class Main
{
    public static void main(String[] args) {
        DLCList<Person> theList = new DLCList<>();
        try{
            Person p = new Person("John", "Doe", "123456789");
            theList.addFirst(p);
        }
        catch(InvalidIDException e){
            System.out.println(e);
        }
    }
}
