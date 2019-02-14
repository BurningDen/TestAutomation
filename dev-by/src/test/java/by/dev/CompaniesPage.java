package by.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompaniesPage {

    private final WebDriver driver;

    private By searchCompanies = By.xpath("//*[@id=\"tablesort_filter\"]/label/input");
    private By top = By.cssSelector("#tablesort");
    private By tr = By.cssSelector("#tablesort > tr");


    public CompaniesPage(WebDriver driver) {
        this.driver = driver;

        String titleComp = driver.getTitle();
        if(!titleComp.equals("dev.by – IT-компании в Беларуси, вакансии, отзывы о белорусских IT-компаниях")){
            throw new IllegalStateException("This is not the Companies Page");
        }

    }

    public CompaniesPage enterCompName(String company){
        driver.findElement(searchCompanies).sendKeys(company);
        return this;
    }

    public CompaniesPage checkSearchSuccess(int numOfResults){
        Assert.assertTrue(driver.findElement(top).findElements(tr).size()<numOfResults);
        return this;
    }


}
