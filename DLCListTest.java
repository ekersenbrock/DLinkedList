
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DLCListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DLCListTest
{
    /**
     * Default constructor for test class DLCListTest
     */
    public DLCListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        testAdd();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAdd()
    {
        DLCList<Person> dLCList1 = new DLCList<Person>();
        Person person3 = null;
        Person person4 = null;
        Person person5 = null;
        Person person6 = null;
        try{
            person3 = new Person("Erik", "Kersenbrock", "20270810");
            person4 = new Person("Peter", "Casey", "00000001");
            person5 = new Person("Carl", "Carlton", "12345678");
            person6 = new Person("Rodney", "King", "91110409");
        }
        catch(InvalidIDException e){
            System.out.println(e);
        }
        dLCList1.addFirst(person3);
        dLCList1.addFirst(person4);
        dLCList1.addLast(person5);
        dLCList1.add(1, person6);
    }

    @Test
    public void testClear()
    {
    }
}


