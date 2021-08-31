package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.Configurations;

import java.util.concurrent.TimeUnit;

public class EbaySearchAppleTest {

    @Test
    public void test_1(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.driver.chromedriver","C:\\Users\\elgun\\IdeaProjects\\Maven_Practice\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String url = Configurations.getProperty("ebay");
        driver.get(url);
        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        search.sendKeys("Apple", Keys.ENTER);
        driver.close();
    }
}
