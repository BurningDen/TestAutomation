package by.dev;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AppTest extends BasicTestClass{




    @Test(priority = 2)
    public void test1(){

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/a")).click();

        WebElement header = driver.findElement(By.className("header"));

        header.findElement(By.cssSelector("[href=\"//id.dev.by/@/hello\"]")).click();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("auth_nav")));

//        WebElement regForm = driver.findElement(By.cssSelector("[href=\"//id.dev.by/@/welcome\"]"));
//        regForm.findElement(By.cssSelector("[href=\"//id.dev.by/@/welcome\"]")).click();


    }

    @Test(priority = 3)
    public void formEnter(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[1]")).sendKeys("test@gmail.com");
        System.out.println("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[2]")).sendKeys("test123");
    }


    @Test(priority = 1)
    public void verifyCompanySearch(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/header/div[1]/div[1]/nav/div[5]/a")).click();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tablesort_filter\"]/label/input")));

        driver.findElement(By.xpath("//*[@id=\"tablesort_filter\"]/label/input")).sendKeys("test");
    }
}
