package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AmazonHomePage {

    static WebDriver driver;
    static String browserName;


    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {
        System.out.println("***************** Automation End *******************");
    }



    public static void setup(String browserName,String url) {

//        setUpChromeBrowser();
//        setUpFirefoxBrowser();

        if (browserName == "chrome") {
            setUpChromeBrowser();
        } else if (browserName == "fireFox") {
            setUpFireFoxBrowser();
        }

        //negative to amazon.com
        driver.get(url);
        driver.manage().window().maximize();


    }

    public static void setUpChromeBrowser() {

        //driverLocation
        String chromeDriverPath = "BrowserDriver/Windows/chromedriver.exe";
        //need to set up some properties.create an instance which help us to get the driver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }
    public static void setUpFireFoxBrowser() {

        //driverLocation
        String firefoxDriverPath = "BrowserDriver/Windows/geckodriver.exe";

        //if you want to go more specific way "../StartAutomationClass/BrowserDriver/Windows/chromedriver.exe"
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        driver = new FirefoxDriver();
    }

    @Test
    public static void testSearchBoxOnChrome() throws InterruptedException {
setup("chrome","https://www.amazon.com/");

//        setup("https://www.amazon.com/");
        // enter keyword in search box field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

        //click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

//        Verify search product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "\"iPhone 14\"";

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");

        } else {
            System.out.println("Test fail");
        }


        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }


        Thread.sleep(5000);
        driver.close();


    }

    @Test(enabled = false)
    public static void testSearchBoxOnFireFox() throws InterruptedException {
        setup("firefox","https://www.amazon.com/");

//        setup("https://www.amazon.com/");
        // enter keyword in search box field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

        //click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

//        Verify search product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "\"iPhone 14\"";

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");

        } else {
            System.out.println("Test fail");
        }


        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }


        Thread.sleep(5000);
        driver.close();


    }

}
