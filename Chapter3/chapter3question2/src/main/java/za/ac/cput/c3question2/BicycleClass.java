package za.ac.cput.c3question2;
import java.util.*;

/**
 * Created by student on 2015/02/19.
 */
public class BicycleClass implements BicycleInterface
{
    @Override
    public Set<String> bicycleSet()
    {
        Set bikeSet = new HashSet();
        bikeSet.add("Giant");
        bikeSet.add("Haro");
        bikeSet.add("Cannondale");
        return bikeSet;
    }
}
