package za.ac.cput.chapter3;

import java.util.*;

/**
 * Created by student on 2015/02/18.
 */
public class CollectionsClass implements CollectionsInterface
{
    @Override
    public Set<String> carsSet()
    {
        Set carSet = new HashSet();
        carSet.add("Porsche");
        carSet.add("Ferrari");
        carSet.add("BMW");
        return carSet;
    }

    @Override
    public List<String> bikesList()
    {
        List bikesList = new ArrayList();
        bikesList.add("Honda");
        bikesList.add("Suzuki");
        bikesList.add("Ducati");
        return bikesList;
    }

    @Override
    public Map<String,String> phonesMap()
    {
        Map phones = new HashMap();
        phones.put("Nokia","3310");
        phones.put("Sony","Xperia Z");
        phones.put("LG","G3");
        phones.put("Samsung","Galaxy");
        return phones;
    }
}
