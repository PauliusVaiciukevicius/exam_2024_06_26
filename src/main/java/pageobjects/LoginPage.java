package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "input[placeholder='Prisijungimo vardas']")
    private WebElement inputUserName;
    @FindBy(css = "input[placeholder='Slaptažodis']")
    private WebElement inputPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement buttonLogin;
    @FindBy(css = "body > div:nth-child(5) > form:nth-child(1) > div:nth-child(2) > span:nth-child(4)")
    private WebElement warningMessage;

    public LoginPage(WebDriver driver) {
        super(driver);}
    public void typeUserName(String txt){
        inputUserName.sendKeys(txt);
    }
    public void typePassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickSubmit(){
        buttonLogin.click();
    }
    public String getWarningText(){return warningMessage.getText();}


}

