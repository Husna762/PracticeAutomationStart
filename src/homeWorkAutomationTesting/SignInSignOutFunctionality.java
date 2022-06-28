package homeWorkAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInSignOutFunctionality {

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

    //Valid credential
    @Test
    public static void testSignInfunctionality() throws InterruptedException {
        //click on My accountSignIn
        driver.findElement(By.xpath("//*[@id=\"accountBlock\"]/div/div/div/button/div/div/p[2]")).click();
        Thread.sleep(3000);


        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("amatullahhusna04@gmail.com");
        Thread.sleep(3000);

        // Enter password
          driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("48762@");

        Thread.sleep(3000);

        // Click keep me sign in Button
          driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[4]/div/div/div/label")).click();

        Thread.sleep(3000);
          driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[5]/button")).click();

        Thread.sleep(3000);
//         Verify successful login
        String actualText = driver.findElement(By.cssSelector("#accountBlock > div > div > div > span > div > div > div.px-3.py-2.bg-white.border-b-1.border-solid.border-gray-200 > div.font-open-sans-regular.text-gray-600.text-large.text-center")).getText();
        String expectedText = "Hi, Amatullah";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");

        Thread.sleep(3000);
        driver.close();

    }

//    invalid credential

    //Valid credential
    @Test
    public static void testSignInfunctionalityInvalidCredential() throws InterruptedException {
        //click on My accountSignIn
        driver.findElement(By.xpath("//*[@id=\"accountBlock\"]/div/div/div/button/div/div/p[2]")).click();
        Thread.sleep(3000);


        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("amatullahhusna@gmail.com");
        Thread.sleep(3000);

        // Enter password
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("48762");

        Thread.sleep(3000);

        // Click keep me sign in Button
        driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[4]/div/div/div/label")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[5]/button")).click();

        Thread.sleep(3000);
      // Verify
        String actualText = driver.findElement(By.cssSelector("#accountBlock > div > div > div > span > div > div > div.px-3.py-2.bg-white.border-b-1.border-solid.border-gray-200 > div.font-open-sans-regular.text-gray-600.text-large.text-center")).getText();
        String expectedText = "The username or password you entered was not found. Please try again.";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");

        Thread.sleep(3000);
        driver.close();

    }







}
