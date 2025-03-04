import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    void testSteps(){


        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Hola");
        /*driver.findElement(By.name("btnK")).click();
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[5]/div/div/div[1]/div/div/span"));
        //System.out.println(webElement);
        String actualText = webElement.getText();
        String expectedText = "About ¡Hola!";
        Assert.assertEquals(actualText, expectedText, "assertion terminatres");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close(); */
    }



}
