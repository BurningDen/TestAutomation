package by.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultPage {


    private WebDriver driver;


    public ResultPage(WebDriver driver) {
        this.driver = driver;

    }

    public String getFirstLink() {
        String link = driver.findElement(By.xpath("(//*[@id=\"___gcse_0\"]//a)[1]")).getText();
        return link;
    }
}
