package by.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasicTestClass {


    WebDriver driver;

    @BeforeSuite
    public void preCondition() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://dev.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("ИТ в Беларуси | dev.by"));

    }


//    @BeforeTest
//    public void backToMain(){
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/header/div[1]/div[1]/a/svg/path")).click();
//    }



    @AfterSuite
    public void finish(){
         driver.quit();
    }


}
