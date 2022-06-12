import config.ConfigFactory;
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
    @BeforeTest(enabled = false)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin (){
        System.out.println(ConfigFactory.getConfig().browser());
//        driver.get("https://www.google.co.in/");
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        String title = driver.getTitle();
//        System.out.println("Page Title is "+title);
        }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
