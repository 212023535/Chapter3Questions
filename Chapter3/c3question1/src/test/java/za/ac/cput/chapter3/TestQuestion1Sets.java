package za.ac.cput.chapter3;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class TestQuestion1Sets
{
    @Test
    public void testMapData()
    {
        CollectionsInterface phones = new CollectionsClass();
        Assert.assertEquals("Checking Models","3310",phones.phonesMap().get("Nokia"));
    }

    @Test
    public void testMapSize()
    {
        CollectionsInterface phones2 = new CollectionsClass();
        Assert.assertEquals(4,phones2.phonesMap().size());
    }

    @Test
    public void testList()
    {
        CollectionsInterface bikeList = new CollectionsClass();
        Assert.assertTrue(bikeList.bikesList().contains("Ducati"));
    }

    @Test
    public void testSet()
    {
        CollectionsInterface cars = new CollectionsClass();
        Assert.assertTrue(cars.carsSet().contains("Ferrari"));
    }
}
