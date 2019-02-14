package by.dev;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage  {


    private final WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;

        String titleComp = driver.getTitle();
        if(!titleComp.equals("ИТ в Беларуси | dev.by")){
            throw new IllegalStateException("This is not the Main Page");
        }

    }

    public ResultPage search(String request) {
        WebElement searchButton = driver.findElement(By.className("header__controls-button_search"));
        searchButton.click();
        WebElement searchEnter = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/header/div[2]/div/form/div/input"));
        searchEnter.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        searchEnter.sendKeys(request);
        searchEnter.sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }


    public LoginPage signIn() {
        WebElement auth = driver.findElement(By.className("header__auth"));
        auth.click();
        return new LoginPage(driver);
    }

    public CompaniesPage goToCompanies() {

        WebElement comp = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/header/div[1]/div[1]/nav/div[5]/a"));
        comp.click();
        return new CompaniesPage(driver);
    }
}
