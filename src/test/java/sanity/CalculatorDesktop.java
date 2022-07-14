package sanity;

import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 -  Verify Addition Command")
    @Description("This test verifies the addition command ")
    public void Test01_verifyAdditionCommand() {
        DesktopFlows.calculateAddition();
        Verifications.verifyTextInElement(calcMain.field_result, "התצוגה היא 9");
    }

}
