package homeWorkAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBoxFunctionality {

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

 public static void testSearchBoxWithValidProduct() throws InterruptedException {

    //   enter keyword in searchBox field
    driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).sendKeys("t-shirts");

    //  click on search button
    driver.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button")).click();

    //Verify with valid product
    String actualProductName = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
    String expectedProductName = "St. John's Bay Womens Crew Neck Short Sleeve T-Shirt";
    System.out.println("Actual : "+actualProductName);
    System.out.println("Expected "+expectedProductName);
    Assert.assertEquals(actualProductName, expectedProductName, "Verify Search product");


    Thread.sleep(3000);
    driver.close();

}


    @Test

    public static void testSearchBoxWithInvalidProduct() throws InterruptedException {

        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).sendKeys( "medicine");

        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button")).click();


        String actualText = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedProductName = "Elama Medici Pearl 16-pc. Stoneware Dinnerware Set";
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text "+expectedProductName);
        Assert.assertEquals(actualText, expectedProductName, "Verify Search product");


        Thread.sleep(3000);
        driver.close();



    }


}
