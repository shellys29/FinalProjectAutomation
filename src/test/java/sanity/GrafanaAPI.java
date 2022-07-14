package sanity;


import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ApiFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaAPI extends CommonOps {

    @Test(description = "Test01 - get team from Grafana")
    @Description("This Test Verify Team Property")
    public void test01_verifyTeam() {
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "shellys");
    }

    @Test(description = "Test02 - add team and verify")
    @Description("This Test Adds Team to Grafana and Verify it")
    public void test02_addTeamAndVerify() {
        ApiFlows.postTeam("STeam", "SSS@gmail.com");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "STeam");
    }

    @Test(description = "Test03 - update team and verify")
    @Description("This Test Updates Team in Grafana and Verify it")
    public void test03_updateTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[0].id");
        ApiFlows.updateTeam("STeam", "STeam@gmail.com", id);
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].email"), "STeam@gmail.com");
    }

    @Test(description = "Test - delete team and verify")
    @Description("This Test Deletes a Team in Grafana and Verify it")
    public void test04_deleteTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[0].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamProperty("totalCount"), "1");
    }
}
