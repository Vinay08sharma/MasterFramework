import config.ConfigFactory;
import driver.manager.web.local.ChromeManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {

    WebDriver driver;
    @BeforeTest(enabled = true)
    public void setUp(){
      driver = ChromeManager.getDriver();
    }

    @Test
    public void testLogin (){


        driver.get("https://www.google.co.in/");
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        String title = driver.getTitle();
//        System.out.println("Page Title is "+title);
        }

    @AfterTest(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
