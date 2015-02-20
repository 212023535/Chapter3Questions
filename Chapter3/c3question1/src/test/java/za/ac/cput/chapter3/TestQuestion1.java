package za.ac.cput.chapter3;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by student on 2015/02/17.
 */
public class TestQuestion1 {

    Phones ph = new Phones();

    @Before
    public void beforeClass() {}

    @AfterClass
    public static void afterClass() {}

    @Test
    public void testArrayListAdd()
    {
        ph.addPhone("Sony");
        Assert.assertEquals("Sony",ph.phones.get(0));
    }

    @Test
    public void testArrayListRemove()
    {
        ph.phones.clear();
        ph.phones.add("LG");
        ph.phones.add("Sony");
        ph.phones.add("Samsung");
        ph.phones.add("Nokia");
        ph.phones.add("BlackBerry");
        ph.phones.add("HTC");

        ph.phones.remove("Nokia");

        Assert.assertEquals("Object has been removed","BlackBerry",ph.phones.get(3));
        System.out.println("Object has been removed");
    }

}