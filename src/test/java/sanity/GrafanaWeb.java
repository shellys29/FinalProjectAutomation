package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extnsions.UIActions;
import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01 - verify Header")
    @Description( "This Test verifies header")
    public void Test01_VerifyHeader() {
        WebFlows.login("admin", "admin");
        Verifications.verifyTextInElement(Grafanamain.head_Dashboard, "Welcome to Grafana");
    }

    @Test(description = "Test02 - verify default Users")
    @Description("This test verifies the default users")
    public void Test02_VerifyDefaultUsers() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        Verifications.numberOfElements(GrafanaServerAdminMain.rows, 1);
    }

    @Test(description = "Test03 - verify new user")
    @Description( "This test verifies new user addition")
    public void Test03_VerifyNewUser() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.createNewUser("shelly", "shelly@gmail.com", "shellys", "123456");
        Verifications.numberOfElements(GrafanaServerAdminMain.rows, 2);
    }

    @Test(description = "Test04 - verify user deletion")
    @Description("This test verifies deletion of user")
    public void Test04_VerifyUserDeletion() {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.deleteLastUser();
        Uninterruptibles.sleepUninterruptibly(5000, TimeUnit.MILLISECONDS);
        Verifications.numberOfElements(GrafanaServerAdminMain.rows, 1);
    }

    @Test(description = "Test05 - verify progress steps")
    @Description( "This test verifies the default progress steps are displayed - using soft assertion")
    public void Test05_verifyProgressSteps() {
        Verifications.visibilityOfElements(Grafanamain.list_ProgressSteps);
    }

    @Test(description = "Test06 - verify avatar con")
    @Description("This test verifies the avatar Image - using Sikuli ")
    public void Test06_verifyAvatarIcon() {
        Verifications.visualElement("GrafanaAvatar");
    }

    @Test(description = "Test07 - Search Users", dataProvider = "data-provider-users",
            dataProviderClass = utilities.ManageDDT.class)
    @Description( "This test search users in a table using DDT")
    public void Test07_searchUsers(String user,String shouldExist) {
        UIActions.mouseHover(GrafanaLeftMenu.btn_server, GrafanaServerAdmin.link_users);
        WebFlows.searchAndVerifyUser(user,shouldExist);
    }
}
