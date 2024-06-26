package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(css = "input[placeholder='Prisijungimo vardas']")
    private WebElement inputUserName;
    @FindBy(css = "input[placeholder='Slaptažodis']")
    private WebElement inputPassword;
    @FindBy(css = "#passwordConfirm" )
    private WebElement inputPasswwordConfirm;
    @FindBy(css = "button[type='submit']")
    private WebElement clickSukurti;
    @FindBy(id = "passwordConfirm.errors")
    private WebElement warningMessage;

public RegisterPage(WebDriver driver) {super(driver);}

    public void typeUserName(String txt) {
    inputUserName.sendKeys(txt);
}
    public void typePassword(String password) {
    inputPassword.sendKeys(password);
}
    public void typePasswordConfirm(String password){
    inputPasswwordConfirm.sendKeys(password);
}
    public void submitButton(){
    clickSukurti.click();
}
public String getWarningMessageText(){return warningMessage.getText();}

}
