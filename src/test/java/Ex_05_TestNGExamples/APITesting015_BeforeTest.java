package Ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_BeforeTest {
    // PUT request
    //Get token
    //Get Booking ID
    //Test Put  which will use the above two methods

    @BeforeTest
    public  void getToken(){
        System.out.println("Before get token" );
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("Before get booking ");
    }
    @Test
    public void test_put(){
        //Token and booking ID
        System.out.println("PUT request ");
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("Close ");
    }


}
