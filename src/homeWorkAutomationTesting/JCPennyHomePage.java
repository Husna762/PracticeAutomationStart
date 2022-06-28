package homeWorkAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JCPennyHomePage {

    static WebDriver driver;
    static String browserName = "chrome";
    static String url = "https://www.jcpenney.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {

        System.out.println("********** Automation Started **********");
    }

    @AfterTest
    public void tearDownAutomation() {

        System.out.println("********** Automation End **********");
    }


    @BeforeTest
    public static void setUpChromeBrowser() {
        String chromeDriverPath = "BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //navigate to jcpenny.com
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


    }

    @Test
    public static void testHeaderWithJcpLogo() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"jcp-logo\"]")).click();

        //Verify with valid product
        String actualText = driver.findElement(By.xpath("//*[@id=\"jcp-logo\"]")).getText();
        String expectedText = "jcp-logo";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");



        Thread.sleep(5000);
        driver.close();




    }





}
