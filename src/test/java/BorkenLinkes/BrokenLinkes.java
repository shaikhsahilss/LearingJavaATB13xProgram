package BorkenLinkes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class BrokenLinkes {
    protected static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links){
            String href = link.getAttribute("href");

            try{
                URL url = new URL(href);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("HEAD");
                int responseCode = conn.getResponseCode();

                if(responseCode >= 400){
                    System.out.println("broken :" + href);
                }
            } catch (Exception e){
                System.out.println("broken :" + href);
            }
        }

    }

}
