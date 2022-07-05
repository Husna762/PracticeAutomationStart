package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
    public static String browserName = "chrome";
    public static String url = "https://www.jcpenney.com/";

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("********** Automation Started **********");
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAutomation() {
        driver.close();
        System.out.println("********** Automation End **********");
    }


    @BeforeTest
    public static void setUpChromeBrowser() {
        String chromeDriverPath = "BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        //navigate to jcpenny.com
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();

    }


}
