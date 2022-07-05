package testJCPenny;

import base.TestBase;
import org.testng.annotations.Test;

import static JCPennyHomePage.JCPennyHomePage.*;

public class TestJCPennyHomepage extends TestBase {

    @Test
    public void testSignInSignOutFunctionality() throws InterruptedException {
        signInFunctionalityWithValidCredential();
    }

    @Test
    public static void testSignInFunctionalityInvalidCredential() throws InterruptedException {
        signInFunctionalityInvalidCredential();
    }

    @Test
    public static void testHeaderWithJcpLogo() throws InterruptedException {
        headerWithJcpLogo();

    }

    @Test
    public static void testSearchBoxWithInvalidProduct() throws InterruptedException {
        searchBoxWithInvalidProduct();

    }

    @Test
    public static void testSearchBoxWithValidProduct() throws InterruptedException {
        searchBoxWithValidProduct();
    }

    @Test
    public static void testNavigateToAlfredDunnerClothing() throws InterruptedException {
        navigateToAlfredDunnerClothing();
    }

    @Test
    public static void testBabyKidsDropDownMenuFunctionality() throws InterruptedException {
        babyKidsDropDownMenuFunctionality();
    }
@Test
public static void testClearanceDropDownMenuFunctionality() throws InterruptedException{
        clearanceDropDownMenuFunctionality();
}
@Test
public static void testBabyFunctionality() throws InterruptedException{
        babyFunctionality();
}
@Test
public static void testJewelryDropDownMenuFunctionality() throws InterruptedException{
        jewelryDropDownMenuFunctionality();
}
@Test
public static void testMenDropDownMenuFunctionality() throws InterruptedException{
        menDropDownMenuFunctionality();
}
@Test
public static void testShoesAccesoriesDropDownMenuFunctionality() throws InterruptedException{

        shoesAccesoriesDropDownMenuFunctionality();
}



}
