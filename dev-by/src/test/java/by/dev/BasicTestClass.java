package by.dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BasicTestClass  {



    public WebDriver driver;


    @BeforeSuite
    public void preCondition() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod()
    public void backToMain(){
        driver.get("https://dev.by/");
    }




    @AfterSuite
    public void finish(){
//         driver.close();
    }


}
