package workFlows;

import extnsions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {

    @Step("Calculate Addition 1+8")
    public static void calculateAddition(){
        UIActions.click(calcMain.btn_clearEntry);
        UIActions.click(calcMain.btn_one);
        UIActions.click(calcMain.btn_plus);
        UIActions.click(calcMain.btn_eight);
        UIActions.click(calcMain.btn_equals);


    }

}