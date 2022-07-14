package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num1Button']")
    public WebElement btn_one;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num8Button']")
    public WebElement btn_eight;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='plusButton']")
    public WebElement btn_plus;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='equalButton']")
    public WebElement btn_equals;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='clearEntryButton']")
    public WebElement btn_clearEntry;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;
}
