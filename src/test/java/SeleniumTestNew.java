import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.baseTest;
import pages.LoginPage;


public class SeleniumTestNew extends baseTest {

    @Test
    void testSteps(){

    LoginPage loginPage = new LoginPage(driver);
    //String Email = "admin@yourstore.com";
    //String Password = "admin";
        driver.findElement(By.id("Email")).sendKeys("lalala");
        //added this commentgssss
    //loginPage.enterEmailInfo("admin@yourstore.com");
    //loginPage.enterPasswordInfo("admin");
    //loginPage.clickLoginButton();

    }


}
