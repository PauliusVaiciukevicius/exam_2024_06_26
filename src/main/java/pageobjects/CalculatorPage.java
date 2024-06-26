package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage extends BasePage {
    @FindBy(css = "#sk1")
    private WebElement firstNumber;
    @FindBy(css = "#sk2")
    private WebElement secondNumber;
    @FindBy(css = "select[name='zenklas']")
    private WebElement operation;
    @FindBy(css = "input[value='skaičiuoti']")
    private WebElement calculateButton;
    @FindBy(css = "body h4")
    private WebElement showResult;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstNumber(String number) {
        firstNumber.clear();
        firstNumber.sendKeys(number);
    }
    public void clickSecondNumber(String number) {
        secondNumber.clear();
       secondNumber.sendKeys(number);
    }
    public void selectOperation(String txt) {
        Select itemValue = new Select(operation);
        itemValue.selectByVisibleText(txt);
    }

    public void clickCalculateButton() {
        calculateButton.click();
    }


}