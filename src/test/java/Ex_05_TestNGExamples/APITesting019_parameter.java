package Ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_parameter {


    @Parameters("browser")
    @Test
    public void demo1(String value)
    {
        System.out.println("Hi i am demo");
        System.out.println("You are runing this param");

        if(value.equalsIgnoreCase("chrome"))
        {
            System.out.println("Start the chrome");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("start the firefox ");
        }
    }
}
