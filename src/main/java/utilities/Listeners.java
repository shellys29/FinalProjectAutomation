package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {

    // START
    public void onStart(ITestContext Result) {
        System.out.println("---- Starting Execution ----");
    }

    // END
    public void onFinish(ITestContext Result) {
        System.out.println("---- Ending Execution ----");
    }


    // When Test case get Failed, this method is called.
    public void onTestFailure(ITestResult test) {
        System.out.println("---- The name of the testcase failed is :" + test.getName() + " ----");
        if (!platform.equalsIgnoreCase("api")) {
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            saveScreenShot();
        }
    }


    // When Test case get Skipped, this method is called.
    public void onTestSkipped(ITestResult test) {
        System.out.println("---- The name of the testcase skipped is :" + test.getName() + " ----");
    }


    // When Test case get Started, this method is called.
    public void onTestStart(ITestResult test) {
        System.out.println(test.getName()+" test case started");
    }


    // When Test case Pass, this method is called.
    public void onTestSuccess(ITestResult test) {
        System.out.println("The name of the testcase passed is :"+test.getName());
        if (!platform.equalsIgnoreCase("api")) {
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }

            File file = new File("./test-recordings/" + test.getName() + ".avi");
            if (file.delete())
                System.out.println("File Deleted Successfully");
            else
                System.out.println(" Failed to Delete File");
        }
    }

    //SCREENSHOT
    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenShot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
