package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameTextBox = By.id("Email");

    private By passwordTextBox = By.id("Password");

    private By loginButton = By.className("button-1 login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void enterEmailInfo(String Email){
        driver.findElement(usernameTextBox).clear();
        driver.findElement(usernameTextBox).sendKeys(Email);

    }

    public void enterPasswordInfo(String Password){
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(Password);

    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }



}
