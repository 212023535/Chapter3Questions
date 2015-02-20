package za.ac.cput.c3question2.configQuestion3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.c3question2.BicycleClass;
import za.ac.cput.c3question2.BicycleInterface;

/**
 * Created by student on 2015/02/19.
 */
@Configuration

public class AppConfig
{
    @Bean(name = "bike")
    public BicycleInterface getBike(){return new BicycleClass();}

}
