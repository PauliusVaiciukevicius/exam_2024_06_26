package tests;

import org.junit.jupiter.api.Test;
import pageobjects.BasePage;
import pageobjects.CalculatorPage;
import pageobjects.LoginPage;
import pageobjects.MainPage;

public class CalculateTest extends BaseTest {
    LoginPage loginPage;
    CalculatorPage calculatorPage;

    @Test

    public void userCanCalculateNumbers() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);
        loginPage.clickSubmit();
        loginPage.typeUserName("saulius");
        loginPage.typePassword("saulius");
        loginPage.clickSubmit();
        calculatorPage.clickFirstNumber("1");
        calculatorPage.clickSecondNumber("2");
        calculatorPage.selectOperation("Sudėtis");
        calculatorPage.clickCalculateButton();
        calculatorPage.calculatingResult();

    }

    @Test

    public void userCantCalculateNegativeNumbers() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);
        loginPage.clickSubmit();
        loginPage.typeUserName("saulius");
        loginPage.typePassword("saulius");
        loginPage.clickSubmit();
        calculatorPage.clickFirstNumber("999");
        calculatorPage.clickSecondNumber("-2");
        calculatorPage.selectOperation("Sudėtis");
        calculatorPage.clickCalculateButton();


    }
}
