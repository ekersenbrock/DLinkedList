
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        DLCList<Person> theList = new DLCList<>();
        Person p = new Person("John", "Doe", "123456789");
        theList.addFirst(p);
    }
}
