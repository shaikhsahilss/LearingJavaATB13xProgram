package Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017_TestNGGroup {

    //reg --> all the 3 testCase
    // sanity -> sanity run = 1
    // somke --> smoke run = 1

    @Test(groups = {"reg","sanity"})
    public void test_sanityRun(){
        System.out.println("sanity");
        System.out.println("QA");
        Assert.assertTrue(true);

    }
    @Test(groups = {"reg"})
    public  void test_regRun(){
        System.out.println("reg");
        Assert.assertTrue(false);

    }
    @Test(groups = {"reg", "smoke"})
    public void test_somkeRun(){
        System.out.println("smoke");
        Assert.assertTrue(true);
    }
}
