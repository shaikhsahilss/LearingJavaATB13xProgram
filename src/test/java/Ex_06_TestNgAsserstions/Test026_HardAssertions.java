package Ex_06_TestNgAsserstions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test026_HardAssertions {

    // Stop the test execution immediately if the assertion fails
@Test
    public void test_hard_assertions(){
    System.out.println("Start the programm");

    Assert.assertEquals("Shaikh","Shaikh");
    System.out.println("End of the program");
}
//Continue test execution if assertion fail, report all the failure at the end
    @Test
    public void test_soft_assertions(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("sahil","sahil");
        System.out.println("End of the program");
        softAssert.assertAll();
    }
}
