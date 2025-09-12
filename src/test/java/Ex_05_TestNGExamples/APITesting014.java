package Ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting014 {

    public void test_post_request(){
        //This is a normal function it will not execute
    }
    @Test
    public void test_post_request2(){
        //This method will execute because
        // we mentioned this method under the test annotation
    }
}
