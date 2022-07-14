package sanity;

import extnsions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaWebDB extends CommonOps {

    @Test( description = "Test01 - verify login to Grafana with DB credentials")
    @Description(" This test login to Grafana with DB credentials and verifies the main header")
    public void Test01_VerifyHeader() {
        WebFlows.loginDB();
        Verifications.verifyTextInElement(Grafanamain.head_Dashboard, "Welcome to Grafana");


    }
}
