package sanity;

import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class TodoListElectron extends CommonOps {

    @Test(description = "Test01 - add and verify -  new task")
    @Description("This test adds a new task and verifies it")
    public void Test01_AddAndVerifyNewTask() {
        ElectronFlows.addNewTask("Learn JAVA");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTask(), 1);
    }

    @Test(description = "Test02 - add and verify - number of tasks")
    @Description("This test adds a new tasks and verifies it ")
    public void Test02_AddAndVerifyNewTask() {
        ElectronFlows.addNewTask("Learn Java");
        ElectronFlows.addNewTask("Learn C#");
        ElectronFlows.addNewTask("Learn Python");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTask(), 3);
    }
}
