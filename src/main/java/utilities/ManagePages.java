package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.grafana.AddNewUserPage;
import pageObjects.grafana.EditUserPage;
import pageObjects.grafana.ServerAdminMainPage;
import pageObjects.grafana.ServerAdminMenuPage;


public class ManagePages extends Base {
    public  static void intGrafana(){
        Grafanalogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        Grafanamain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        GrafanaLeftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenuPage.class);
        GrafanaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        GrafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        GrafanaAddNewUserPage = PageFactory.initElements(driver, AddNewUserPage.class);
        GrafanaEditUserPage = PageFactory.initElements(driver, EditUserPage.class);
    }

    public static void initMortgage(){
        mortgageMain =  new pageObjects.mortgage.MainPage(mobileDriver);
    }

    public static void initToDo() {
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }

    public static void initCalculator() {
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}
