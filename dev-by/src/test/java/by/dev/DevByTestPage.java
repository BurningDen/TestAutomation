package by.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DevByTestPage extends BasicTestClass {

    MainPage main;
    ResultPage result;
    LoginPage login;
    CompaniesPage companiesPage;





    @Test(priority = 2)

    public void testSearch() {
        main = new MainPage(driver);
        result = main.search("Test");
        Assert.assertTrue(result.getFirstLink().contains("Test"));
    }


    @Test(priority = 3)

    public void testLowerCaseSearch() {
        main = new MainPage(driver);
        result = main.search("test");
        Assert.assertFalse(result.getFirstLink().contains("test"));
    }

    @Test(priority = 4)

    public void signForm() {
        main = new MainPage(driver);
        login = main.signIn();
        login.loginUserName("test2019@gmail.com");
        login.loginPassword("test2019");
        login.authorization();
        login.checkSignUpSuccess();



    }


    @Test(priority = 5)
    public void verifyCompanySearch(){

        main = new MainPage(driver);
        companiesPage = main.goToCompanies();
        companiesPage.enterCompName("test");
        companiesPage.checkSearchSuccess(5);


    }
}


