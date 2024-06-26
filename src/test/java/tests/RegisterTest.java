package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.MainPage;
import pageobjects.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest extends BaseTest {
    MainPage mainpage;
    RegisterPage registerPage;

    @Test
    public void userCanFillRegisteringFields() {
        mainpage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        mainpage.clickButtonRegister();
        registerPage.typeUserName("Saulius");
        registerPage.typePassword("Saulius");
        registerPage.typePasswordConfirm("Saulius");
        registerPage.submitButton();
    }

    @Test
    public void userCanFillRegisteringFieldsWithIncorrectPassword() {
        mainpage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        String expectedMessage = "Įvesti slaptažodžiai nesutampa";
        mainpage.clickButtonRegister();
        registerPage.typeUserName("saulius5");
        registerPage.typePassword("saulius1");
        registerPage.typePasswordConfirm("saulius2");
        registerPage.submitButton();
        String actualWarning = registerPage.getWarningMessageText();
        assertEquals(expectedMessage, actualWarning);
    }
}