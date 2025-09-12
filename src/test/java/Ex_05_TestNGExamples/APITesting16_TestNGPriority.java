package Ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting16_TestNGPriority {
    @Test(priority = 1)//if we mentioned the priority equal to zero it means it will execute 1st as compared to the other test cases
    public void test_t1(){
        System.out.println("1");

    }
    @Test//By default it executed first If you don’t mention any priority, TestNG gives it a default priority of 0.
    public void test_t2(){
        System.out.println("3");
    }
    @Test(priority = -2)
    public void test_t3(){
        System.out.println("2");
    }
    @Test(priority = 4)
    public void test_t4(){
        System.out.println("4");
    }
}
