package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.grafana.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    //GENERAL
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;

    //WEB
    protected static WebDriver driver;

    //MOBILE
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();



    //API
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject params = new JSONObject();
    public static JsonPath jp;

    //DATABASE
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;

    //PAGE OBJECT - WEB
    public static LoginPage Grafanalogin;
    public static MainPage Grafanamain;
    public static LeftMenuPage GrafanaLeftMenu;
    public static ServerAdminMenuPage GrafanaServerAdmin;
    public static ServerAdminMainPage GrafanaServerAdminMain;
    public static AddNewUserPage GrafanaAddNewUserPage;
    public static EditUserPage GrafanaEditUserPage;

    //PAGE OBJECTS - MOBILE
    protected static pageObjects.mortgage.MainPage mortgageMain;

    //PAGE OBJECT - ELECTRON
    protected static pageObjects.todo.MainPage todoMain;

    //PAGE OBJECT - DESKTOP
    protected static pageObjects.calculator.MainPage calcMain;
}
