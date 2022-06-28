package homeWorkAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClearanceFunctionality {

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
    public static void testClearanceDropDownMenuFunctionality() throws InterruptedException {

        //Dropdown menu popup for clearance Department

        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div")).click();

        //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div")).getText();
        String expectedText = "Clearance";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");

        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public static void testBabyFunctionality() throws InterruptedException {

        //Dropdown menu popup for clearance Department

        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#subMenuLevel3\\:1 > a")).click();

        Thread.sleep(3000);
        //Verify
        String actualText = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedText = "Carter's Toddler Girls 2-pc. Legging Set";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");

        Thread.sleep(3000);
        driver.close();

    }

}
