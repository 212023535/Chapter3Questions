package za.ac.cput.c3question2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import za.ac.cput.c3question2.configQuestion3.AppConfig;

/**
 * Created by student on 2015/02/19.
 */
public class TestBicycle
{
    private ApplicationContext ctx;
    BicycleInterface bike;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bike = (BicycleInterface)ctx.getBean("bike");
    }

    @Test
    public void testBicycleSet()
    {
        Assert.assertTrue(bike.bicycleSet().contains("Haro"));
    }
}
