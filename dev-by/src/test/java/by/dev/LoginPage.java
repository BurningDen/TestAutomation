package by.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.Function;

import java.util.concurrent.TimeUnit;

public class LoginPage {


    private final WebDriver driver;
    private WebDriverWait wait;

    private By username = By.name("email");
    private By password = By.name("password");
    private By loginButton = By.xpath("//*[@id=\"root\"]//button");
    private By auth = By.className("header__auth");


    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);

    }

    public LoginPage loginUserName(String user){
        driver.findElement(username).sendKeys(user);
        return this;
    }

    public LoginPage loginPassword(String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }

    public MainPage authorization(){
        driver.findElement(loginButton).submit();
        return new MainPage(driver);

    }

    public void checkSignUpSuccess(){

        wait.until(ExpectedConditions.presenceOfElementLocated(auth));
    }




    public MainPage failureTestLogin(){
        driver.findElement(loginButton).submit();
        return  new MainPage(driver);
    }





}
