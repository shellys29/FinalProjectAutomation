package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//h1[contains(text(), \"Welcome to Grafana\")]")
    public WebElement head_Dashboard;
    @FindBy(how = How.XPATH, using = "//a[@class='css-k5db0k']")
    public List<WebElement> list_ProgressSteps;

}
