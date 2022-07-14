package sanity;


import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.MobileFlows;

@Listeners(utilities.Listeners.class)

public class MortgageMobile extends CommonOps {

    @Test(description = " test01 - Verify Mortgage")
    @Description("This test fill in mortgage form and calculate repayment")
    public void test01_verifyMortgage(){
        MobileFlows.calculateMortgage("1000","3","4");
        Verifications.verifyTextInElement(mortgageMain.txt_repayment, "£30.03");
    }



}