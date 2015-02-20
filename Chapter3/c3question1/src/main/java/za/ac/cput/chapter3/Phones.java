package za.ac.cput.chapter3;

/**
 * Created by student on 2015/02/18.
 */

import java.util.ArrayList;
import java.util.List;

public class Phones
{
    public List phones;

    public Phones(){phones = new ArrayList();}
    public void addPhone( String phoneType)
    {
        phones.add(phoneType);
    }
    public void removePhone( String phoneType)
    {
        phones.remove(phoneType);
    }
}
