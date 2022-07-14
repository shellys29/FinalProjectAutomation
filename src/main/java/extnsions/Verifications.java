package extnsions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import utilities.CommonOps;

import java.util.List;

import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertEquals;

public class Verifications extends CommonOps {
    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expected);
    }

    @Step("Verify Number Of Element")
    public static void numberOfElements(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        Assert.assertEquals(elems.size(), expected);
    }

    @Step("Verify Visibility Of Elements")
    public static void visibilityOfElements(List<WebElement> elems) {
        for (WebElement elem : elems)
        {
            softAssert.assertTrue(elem.isDisplayed(), "sorry " + elem.getText() + "not displayed");
        }
        softAssert.assertAll("Some elements were not displayed");
    }

    @Step("Verify Element Visual")
    public static void visualElement(String expectedImageName) {
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        }
        catch (FindFailed findFailed)
        {
            System.out.println("Error Comparing Image File: " + findFailed);
        }
    }

    @Step("Verify Element Displayed")
    public static void existenceOfElement(List<WebElement> elements) {
        assertTrue(elements.size() > 0);
    }

    @Step("Verify Element Not Displayed")
    public static void nonExistenceOfElement(List<WebElement> elements) {
        assertFalse(elements.size() > 0);
    }

    @Step("Verify Text with Text")
    public static void verifyText(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int expected, int actual) {
        Assert.assertEquals(expected, actual);
    }
}
