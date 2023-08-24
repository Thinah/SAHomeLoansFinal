package Tests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExtentReportMVC {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    @BeforeTest
    public void setup() {//new instance
        htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    @Test
    public void test1() throws IOException {
        ExtentTest test = extent.createTest("ToDoMVC Test");
        test.log(Status.INFO,"Shows status");
        test.info("This step shows usage of info details");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromBase64String("screenshot.png").build());
        test.addScreencastFromPath("screenshot.png");
    }
    @AfterTest
    public void tearDown() {
        extent.flush();
    }

}
