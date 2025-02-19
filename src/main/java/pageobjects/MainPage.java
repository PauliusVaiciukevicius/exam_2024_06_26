package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {


    @FindBy(css = "a[href='/registruoti']")
    private WebElement registerButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void clickButtonRegister() {
        registerButton.click();
    }
}