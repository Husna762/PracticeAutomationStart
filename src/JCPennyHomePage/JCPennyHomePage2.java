package JCPennyHomePage;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JCPennyHomePage2 extends TestBase {

    /**
     * Test Case 13
     * This method should verify "Fila Memory Skyshift 6 Womens Training Shoes" link is working
     *
     * @throws InterruptedException Author: Husna
     */
    public static void filaMemorySkyShiftWomenTrainingShoes() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Shoes & Accessories link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[text()='Shoes & Accessories']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Fila brand link (Inside Shoes & Accessories link)
        Thread.sleep(3000);
        WebElement filaBrandMouseHover = driver.findElement(By.xpath("//a[@href='/g/shoes/athletic-shoes?brand=fila&id=cat100260221']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(filaBrandMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        // user should be able to click on Womens )
        driver.findElement(By.xpath("//*[text()='Womens']")).click();
        Thread.sleep(3000);
        // user should be able to click on "Fila Memory Panorama 9 Womens Running Shoes" )
        driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[4]/div/div/div/div/div[3]/div/a[1]")).click();
        Thread.sleep(3000);
        //Verify user can find this product
        String actualText = driver.findElement(By.xpath("//*[text()='Fila Memory Skyshift 6 Womens Training Shoes']")).getText();
        String expectedText = "Fila Memory Skyshift 6 Womens Training Shoes";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
    }

    /**
     * Test Case 14
     * This method should Verify "Fila brand link functionality checking
     *
     * @throws InterruptedException Author: Husna
     */
    public static void filaBrandLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Shoes & Accessories link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[text()='Shoes & Accessories']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Fila brand link (Inside Shoes & Accessories link)
        Thread.sleep(3000);
        WebElement filaBrandMouseHover = driver.findElement(By.xpath("//a[@href='/g/shoes/athletic-shoes?brand=fila&id=cat100260221']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(filaBrandMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify fila brand link working
        String actualText = driver.findElement(By.xpath("//*[text()='Fila Shoes For Women, Men & Kids']")).getText();
        String expectedText = "Fila Shoes For Women, Men & Kids";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
    }
    /**
     * Test Case 15
     * This method should verify Continue Shopping button functionality
     *
     * @throws InterruptedException Author: Husna
     */

    public static void continueShoppingFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Home & lifestyle link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[3]/div"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on DinnerSet link (Inside Home&lifestyle link)
        Thread.sleep(3000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//a[text()='Dinnerware']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //user is able to click on Pattern link
        Thread.sleep(2000);
        //user is able to click on "Home Expressions Caroline 30-pc. Stoneware Dinnerware Set" DinnerSet link inside Home&Lifestyle link
        driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).click();
        Thread.sleep(2000);
        //user is able to Add to cart this product
        driver.findElement(By.cssSelector("#GlobalOptions-AddToCart")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#atPanelContent > div._8GflZ > div > section > section > section.yEI3F > div:nth-child(2) > div > button.-yTL-.wZzH3.Rp1O0.RnVYy")).click();
        Thread.sleep(3000);
        //Verify user successfully back on previous page
        String actualText = driver.findElement(By.cssSelector("#productTitle-false")).getText();
        String expectedText = "Home Expressions Caroline 30-pc. Stoneware Dinnerware Set";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }



    /**
     * Test Case 16
     * This method should Verify JCPenny meyerland Plaza View Store Ad link is working
     *
     * @throws InterruptedException Author: Husna
     */

    public static void meyerlandPlazaViewStoreAd() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can click link on r8 side of MayarLandPlaza(Location) header part of  JCPenny Home page
        driver.findElement(By.cssSelector("#findStore")).click();
        Thread.sleep(3000);
        //user should be able to type or enter their ZipCode or cityName
        driver.findElement(By.xpath("//*[@class='search-input']")).sendKeys("77054");
        Thread.sleep(3000);
        //  click on search button
        driver.findElement(By.xpath("//*[@class='search-button']")).click();
        Thread.sleep(5000);
        //User should be able to click on Meyerland Palaza link
        driver.findElement(By.xpath("//*[@id='js-location-grid-item-1']/div/div[1]/div[1]/a")).click();
        Thread.sleep(5000);
        //User Should be able to see Store AD
        driver.findElement(By.xpath("//a[@class='call-store-button']")).click();
        Thread.sleep(5000);

        //Verify User is able to see Store ad from MayereLand Plaza link store
        String actualText = driver.findElement(By.cssSelector("#comp_breadcrumbs_0")).getText();
        String expectedText = "Weekly Ad";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
    }

    /**
     * Test Case 17
     * This method should verify AllBackTSchool link functionality
     *
     * @throws InterruptedException Author: Husna
     */

    public static void allBackToSchool() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Back to school link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[1]/div"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
//        //user is able to click on All back to school link
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='All Back to School']")).click();
        Thread.sleep(2000);
        //user is able to click on a product link inside uniforms link
        driver.findElement(By.xpath("//*[@id='comp_gridcomponent_3']/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/h3/a/span/font")).click();
        Thread.sleep(2000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedText = "IZOD Little & Big Boys Short Sleeve Wrinkle Resistant Moisture Wicking Polo Shirt";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test Case 18
     * This method should verify Home Expressions Caroline 30-pc. Stoneware Dinnerware Set product is avilable
     *
     * @throws InterruptedException Author: Husna
     */

    public static void homeExpressionsCaroline30pcStonewareDinnerwareSet() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Home & lifestyle link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[3]/div"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on DinnerSet link (Inside Home&lifestyle link)
        Thread.sleep(3000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//a[text()='Dinnerware']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //user is able to click on Pattern link
        Thread.sleep(2000);
        //user is able to click on "Home Expressions Caroline 30-pc. Stoneware Dinnerware Set" DinnerSet link inside Home&Lifestyle link
        driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).click();
        Thread.sleep(2000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.cssSelector("#productTitle-false")).getText();
        String expectedText = "Home Expressions Caroline 30-pc. Stoneware Dinnerware Set";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }



    /**
     * Test Case 19
     * This method should verify contactUs link inside Customer Service on JCPenny Footer section
     *
     * @throws InterruptedException Author: Husna
     */

    public static void contactUs() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //user is able to all the way Scroll Down to JCPenny Footer
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        //User should able to click on Contact Us link
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/div/article/section/div[2]/div/div/ul/li[1]/a")).click();
        Thread.sleep(2000);
        //User should able to check return policy inside Contact Us link
        driver.findElement(By.xpath("//*[@id='customer-services']/div/div[1]/div/div[2]/div[2]/div[3]/a")).click();
        Thread.sleep(2000);
        //User should be able to return back Customer Service by click customerservice link  inside Contact Us link
        driver.findElement(By.xpath("//*[@id='comp_breadcrumbs_0']/div/div[2]/ul/li[1]/a/span")).click();
        Thread.sleep(2000);
        //Verify user successfully back on previous page
        String actualText = driver.findElement(By.xpath("//*[@id='comp_hero_1']/div/div/div[2]/div/div[1]/h3/a/span")).getText();
        String expectedText = "Customer Service";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test Case 20
     * This method should verify contactUs link inside Customer Service on JCPenny Footer section
     *
     * @throws InterruptedException Author: Husna
     */
    public static void curbSidePickupSephoraKidsZoneFromJCPennyFooterFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //user is able to all the way Scroll Down to JCPenny Footer
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        //User should able to click on sephora link inside Stores & Service
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/div/article/section/div[3]/div/div/ul/li[6]/a")).click();
        Thread.sleep(2000);
        //User shoulb be able to go back previous page
        driver.navigate().back();
        Thread.sleep(3000);
        //User should able to click on kids Zone link inside Stores & Service
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/div/article/section/div[3]/div/div/ul/li[9]/a")).click();
        Thread.sleep(2000);
        //User should be able to go back previous page
        driver.navigate().back();
        Thread.sleep(5000);
        //User should be able to click on curb Side PickUp inside Stores & Service
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/div/article/section/div[3]/div/div/ul/li[2]/a")).click();
        Thread.sleep(2000);
        //Verify link is working successfully
        String actualText = driver.findElement(By.xpath("//*[@id='template-fullfillment']/center/div/h1")).getText();
        String expectedText = "Same Day and Curbside Pickup";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 21
     * This method should verify Top button functionality from JCPenny Footer section
     *
     * @throws InterruptedException Author: Husna
     */
    public static void topButtonFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //user is able to all the way Scroll Down to JCPenny Footer
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        //User should be able to click on Top button
        driver.findElement(By.xpath("//div[@class='d2-61']")).click();
        Thread.sleep(2000);
        //Verify link is working successfully
        String actualText = driver.findElement(By.cssSelector("#jcp-logo")).getText();
        String expectedText = "jcp-logo";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test Case 22
     * This method should verify Continue Shopping button functionality
     *
     * @throws InterruptedException Author: Husna
     */
    public static void chatBoxFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        //User should be able to click messageButton
        driver.findElement(By.xpath("//*[@id='vngage_banner_F46C2238-2A3A-40CB-814B-82EF09B84B22']/div[1]")).click();
        Thread.sleep(2000);
        // enter FirstName in searchBox field
        driver.findElement(By.xpath("//input[@class='vngage-input vngage-firstName vngage-pristine js-bound vngage-inputValidation']")).sendKeys("Amatullah");
        Thread.sleep(2000);
        //enter LastName in searchBox field
        driver.findElement(By.xpath("//input[@Class='vngage-input vngage-pristine js-bound vngage-inputValidation']")).sendKeys("Husna");
        Thread.sleep(2000);
        // enter Email in searchBox field
        driver.findElement(By.xpath("//*[@id='vngage_banner_content_F46C2238-2A3A-40CB-814B-82EF09B84B22']/div/div[2]/form/input[4]")).sendKeys("amatullahhusna04@gmail.com");
        Thread.sleep(2000);
        // enter PhoneNumber in searchBox field
        driver.findElement(By.xpath("//*[@id='vngage_banner_content_F46C2238-2A3A-40CB-814B-82EF09B84B22']/div/div[2]/form/input[5]")).sendKeys("8065139104");
        Thread.sleep(2000);
        // enter Something in searchBox field
        driver.findElement(By.xpath("#textArea2")).sendKeys("Address change");
        Thread.sleep(2000);
    }

    /**
     * Test Case 23
     * This method should verify Hand Bags Link  functionality
     *
     * @throws InterruptedException Author: Husna
     */
    public static void handbagsLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Trending Now link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[2]/div"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on HandBags link (Inside Home&lifestyle link)
        Thread.sleep(3000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='flyoutMenuBlock']/div/div/div/div[2]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.xpath("//a[text()='Liz Claiborne Stella 4 Poster Shoulder Bag']")).getText();
        String expectedText = "Liz Claiborne Stella 4 Poster Shoulder Bag";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 24
     * This method should verify Hats Link  functionality inside Trending Now
     *
     * @throws InterruptedException Author: Husna
     */
    public static void hatsLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Trending Now link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[2]/div"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Hats link (Inside TrendingNow link)
        Thread.sleep(2000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='subMenuLevel3:3']/a"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedText = "Dockers Mens Panama Hat";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 25
     * This method should verify Plus Pant Link  functionality inside Women Now
     *
     * @throws InterruptedException Author: Husna
     */
    public static void plusPantLinkInsideWomenLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Women link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subMenuLevel1']/li[4]/div"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Plus Pant link (Inside Women link)
        Thread.sleep(2000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='flyoutMenuBlock']/div/div/div/div[2]"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[2]/div/ul/li[4]/div/div/div/div/div[3]/div/a[1]")).getText();
        String expectedText = "New! Worthington-Plus Womens Mid Rise Straight Fit Ankle Pant";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 26
     * This method should verify ShopAll Link  functionality inside men link
     *
     * @throws InterruptedException Author: Husna
     */
    public static void shopAllLinkInsideMenLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Men link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(5) > div"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Plus Pant link (Inside Women link)
        Thread.sleep(2000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='submenuElement']/div[1]/span[1]/a"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify user successfully click on e product link inside all back to school link
        String actualText = driver.findElement(By.xpath("//*[@id='comp_breadcrumbs_0']/div/div/h1")).getText();
        String expectedText = "Men's Clothing, Shoes & Accessories";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 27
     * This method should verify Men Watches Link  functionality inside men link
     *
     * @throws InterruptedException Author: Husna
     */
    public static void menWatchesFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Men link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(5) > div"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Plus Pant link (Inside Women link)
        Thread.sleep(2000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='submenuElement']/div[1]/span[1]/a"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //user is able to all the way Scroll Down to JCPenny Footer
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);
        //User should be able to watches on Top button
        driver.findElement(By.xpath("//*[@id='comp_linkfarm_3']/div/ul/li[7]/a")).click();
        Thread.sleep(2000);
        //Verify user successfully navigate to mens watches page
        String actualText = driver.findElement(By.xpath("//*[@id='gallery-title']/h1")).getText();
        String expectedText = "Men's Watches";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);

    }

    /**
     * Test Case 28
     * This method should verify Sephora Sale  Link  functionality inside Beauty Saloon link
     *
     * @throws InterruptedException Author: Husna
     */
    public static void sephoraSaleLinkInsideBeautySaloonLinkFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Beauty & Supply link on JCPenny Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#subMenuLevel1 > li:nth-child(10) > div"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Sephora Sale link (Inside Women link)
        Thread.sleep(2000);
        WebElement dinnerSetMouseHover = driver.findElement(By.xpath("//*[@id='submenuElement']/div[1]/span[3]/a"));
        Thread.sleep(2000);
        //for mouse Hover method
        actions.moveToElement(dinnerSetMouseHover);
        actions.click().build().perform();
        Thread.sleep(3000);
        //Verify user successfully navigate to SephoraSale page
        String actualText = driver.findElement(By.xpath("//*[@id='gallery-title']/h1")).getText();
        String expectedText = "Sale at SEPHORA";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test Case 29
     * This method should verify View Cart Checkout Functionality
     *
     * @throws InterruptedException Author: Husna
     */
    public static void viewCartCheckoutFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id='searchInputId']")).sendKeys("Natasha Denona Chroma Crystal Top Coat");
        //  click on search button
        driver.findElement(By.xpath("//*[@id='typeaheadInputContainer']/div/button")).click();
        Thread.sleep(2000);
        //user is able to Add to cart this product
        driver.findElement(By.cssSelector("#GlobalOptions-AddToCart")).click();
        Thread.sleep(2000);
        //user should be able to click on viewcart checkout button
        driver.findElement(By.xpath("//*[@id='atPanelContent']/div[1]/div/section/section/section[1]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        //Verify user successfully navigate to SephoraSale page
        String actualText = driver.findElement(By.cssSelector("#36 64d2160-fc8a-11ec-9763-f1ec148c7e64 > div > div.sm12.md12.lg12.xl12.p-0._7cfch > div.aMT2o.hiddenSm.py-0.px-2 > div > div > div.productInfoWrap > div.text-medium.text-gray-600.font-open-sans-semibold > a > span")).getText();
        String expectedText = "Natasha Denona Chroma Crystal Top Coat - Holiday";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(3000);
    }

    /**
     * Test Case 30
     * This method should Verify  find store Functionality working
     *
     * @throws InterruptedException Author: Husna
     */
    public static void searchForStoreSearchBoxFunctionality() throws InterruptedException {
        //Given user on JCPenny Home page
        Thread.sleep(2000);
        // user can click link on r8 side of MayarLandPlaza(Location) header part of  JCPenny Home page
        driver.findElement(By.cssSelector("#findStore")).click();
        Thread.sleep(3000);
        //user should be able to type or enter their ZipCode or cityName
        driver.findElement(By.xpath("//*[@class='search-input']")).sendKeys("77054");
        Thread.sleep(3000);
        //  click on search button
        driver.findElement(By.xpath("//*[@class='search-button']")).click();
        Thread.sleep(5000);
        //Verify fila brand link working
        String actualText = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/nav/ol/li[2]/span")).getText();
        String expectedText = "Find a Location";
        System.out.println("Actual : " + actualText);
        System.out.println("Expected " + expectedText);
        Assert.assertEquals(actualText, expectedText, "Test Fail");
        Thread.sleep(5000);
    }


}


