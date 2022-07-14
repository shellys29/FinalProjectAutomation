package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {

    @FindBy(how = How.CLASS_NAME, using = "css-16buu1m")
    public WebElement btn_server;
}
