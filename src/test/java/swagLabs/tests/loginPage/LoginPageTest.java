package swagLabs.tests.loginPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import swagLabs.Pages.LoginPage;
import swagLabs.tests.TestBase;
import utilities.ConfigurationReader;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginStandardUser() {

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginAsStandardUser();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }
}

