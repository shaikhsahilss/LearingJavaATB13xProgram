package Listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ITestListeners implements ITestListener {

public  void TestFailure(ITestResult result){


    // getDriver instance from test class
    Object testClass = result.getInstance();

    WebDriver driver = ((LoginTest)testClass).driver;

    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    File dest = new File("path");
    try{
        FileUtils.copyFile(src ,dest);
        System.out.println("Screenshot saved at :" + dest.getAbsolutePath());
    } catch(IOException e){
        e.getMessage();
    }

}

}
