package tests;

import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import pageobjects.MainPage;
import pageobjects.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {
    MainPage mainPage;
    LoginPage loginPage;

    @Test
    void userCanLogin() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.typeUserName("saulius");
        loginPage.typePassword("saulius");
        loginPage.clickSubmit();
    }

    @Test
    void userCantLoginWithInvalidCredentials() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        String expectedMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        loginPage.typeUserName("saulius");
        loginPage.typePassword("saulius5");
        loginPage.clickSubmit();
        String actualWarning = loginPage.getWarningText();
        assertEquals(expectedMessage, actualWarning);
    }
}