package com.swagLabs.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.utilities.ConfigurationReader;


public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(css = "#password")
    public WebElement userPassword;

    @FindBy(css = "#login-button")
    public WebElement loginBtn;


    public void login(String username, String password) {
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStandardUser() {
        String user = ConfigurationReader.get("standardUser");
        String pass = ConfigurationReader.get("userPassword");
        login(user, pass);
    }

}
