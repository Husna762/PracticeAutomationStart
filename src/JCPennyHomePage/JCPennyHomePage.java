package JCPennyHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.TestBase.driver;

public class JCPennyHomePage {

    /**
     * Test 01
     * This method will verify unsuccessful signIn using Invalid credential and verify Error message
     *
     * @throws InterruptedException
     */
    public static void signInFunctionalityWithValidCredential() throws InterruptedException {
        //click on My accountSignIn
        driver.findElement(By.xpath("//*[@id=\"accountBlock\"]/div/div/div/button/div/div/p[2]")).click();
        Thread.sleep(3000);
        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("amatullahhusna04@gmail.com");
        Thread.sleep(3000);
        // Enter password
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("bemyLove48762@");
        Thread.sleep(3000);
        // Click keep me sign in Button
        driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[4]/div/div/div/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[5]/button")).click();
        //Verify successful login
        String actualText = driver.findElement(By.cssSelector("#accountBlock > div > div > div > span > div > div > div.px-3.py-2.bg-white.border-b-1.border-solid.border-gray-200 > div.font-open-sans-regular.text-gray-600.text-large.text-center")).getText();
        String expectedText = "Hi, Amatullah";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test 02
     * This method will verify unsuccessful signIn using Invalid credential and verify Error message
     *
     * @throws InterruptedException
     */
    public static void signInFunctionalityInvalidCredential() throws InterruptedException {
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
        // Verify user is able to not sign in with in valid credential
        String actualText = driver.findElement(By.cssSelector("#accountBlock > div > div > div > span > div > div > div.px-3.py-2.bg-white.border-b-1.border-solid.border-gray-200 > div.font-open-sans-regular.text-gray-600.text-large.text-center")).getText();
        String expectedText = "The username or password you entered was not found. Please try again.";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);


    }
    /**
     * This method should Navigate to Homepage
     * Test 03
     * @throws InterruptedException
     * Author: Husna
     */
    public static void headerWithJcpLogo() throws InterruptedException {
        //click on Mayarland Plaza
        driver.findElement(By.xpath("//*[@id=\"findStore\"]/div/a/div[2]/a/div")).click();
        Thread.sleep(2000);
       //click on JCPenny Logo to navigate HomePage
        driver.findElement(By.xpath("//*[@id=\"jcp-logo\"]")).click();
        //Verify with valid product
        String actualText = driver.findElement(By.xpath("//*[@id=\"jcp-logo\"]")).getText();
        String expectedText = "JCPenney Home";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
        driver.close();
    }
    /**
     * Test o4
     * This method should babyKidsDropDownMenu Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void babyKidsDropDownMenuFunctionality() throws InterruptedException {
        //Dropdown menu popup for Baby&Kids Department
        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(6) > div")).click();
        //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(6) > div")).getText();
        String expectedText = "Baby & Kids";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
        driver.close();
    }
    /**
     * Test o5
     * This method should clearanceDropDownMenu Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void clearanceDropDownMenuFunctionality() throws InterruptedException {
        //Dropdown menu popup for clearance Department
        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div")).click();
        //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div")).getText();
        String expectedText = "Clearance";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
    }
    /**
     * Test o6
     * This method should baby&Kids Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void babyFunctionality() throws InterruptedException {
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

    }
    /**
     * Test o7
     * This method should jewelryDropDownMenu Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void jewelryDropDownMenuFunctionality() throws InterruptedException {
        //Dropdown menu popup for Jewellery Department
        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(8) > div")).click();
        //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(8) > div")).getText();
        String expectedText = "Jewelry";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);

    }
    /**
     * Test o8
     * This method should menDropDownMenu Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void menDropDownMenuFunctionality() throws InterruptedException {
        //Dropdown menu popup for men Department
        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(5) > div")).click();
        //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(5) > div")).getText();
        String expectedText = "Juniors";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);

    }
    /**
     * Test o9
     * This method should searchBoxWithValidProduct Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void searchBoxWithValidProduct() throws InterruptedException {
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).sendKeys("t-shirts");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button")).click();
        //Verify with valid product
        String actualProductName = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedProductName = "St. John's Bay Womens Crew Neck Short Sleeve T-Shirt";
        System.out.println("Actual : " + actualProductName);
        System.out.println("Expected " + expectedProductName);
        Assert.assertEquals(actualProductName, expectedProductName, "Verify Search product");
        Thread.sleep(3000);
    }
    /**
     * Test 10
     * This method should searchBoxWithValidProduct Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void searchBoxWithInvalidProduct() throws InterruptedException {
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).sendKeys("medicine");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button")).click();
        //  Verify
        String actualText = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedProductName = "Elama Medici Pearl 16-pc. Stoneware Dinnerware Set";
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text " + expectedProductName);
        Assert.assertEquals(actualText, expectedProductName, "Verify Search product");
        Thread.sleep(3000);
        driver.close();
    }
    /**
     * Test 11
     * This method should ShoesAccessoriesDropDownMenu Functionality
     *
     * @throws InterruptedException
     * Author: Husna
     */
    public static void shoesAccesoriesDropDownMenuFunctionality() throws InterruptedException {
        //Dropdown menu popup for Shoes&Accessories Department
        driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(7) > div")).click();
        Thread.sleep(3000);
          //Verify with valid product
        String actualText = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(7) > div")).getText();
        String expectedText = "Shoes & Accessories";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
        driver.close();

    }
    /**
     * Test 12
     * This method should Navigate to AlfredDunnerClothing Brand
     * @throws InterruptedException
     * Author: Husna
     */
    public static void navigateToAlfredDunnerClothing() throws InterruptedException {
        //MouseHoover on Women Button
        driver.findElement(By.xpath("//*[@id=\"subMenuLevel1\"]/li[4]/div")).click();
        //Click on Champion Brand
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"subMenuLevel3:3\"]/a")).click();
        //Verify navigate to All fredDunner Clothing
        String actualText = driver.findElement(By.cssSelector("#gallery-product-list > div:nth-child(2) > div > ul > li:nth-child(1) > div > div > div > div > div.SViR2.newPriceDetailsWrapper > div > a.font-open-sans-semibold.overflow-hidden.text-gray-600.text-small.SuQAn")).getText();
        String expectedText = "Alfred Dunner Classics Plus Capris";
        System.out.println("Actual : "+actualText);
        System.out.println("Expected "+expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);



    }





}
