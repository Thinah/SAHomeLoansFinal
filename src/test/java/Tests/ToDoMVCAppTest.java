package Tests;

import Pages.ToDoListMVC;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ToDoMVCAppTest {
    WebDriver driver;
    String browserName=null;
    ToDoListMVC ToDoPage = new ToDoListMVC(driver);

    @BeforeTest
    public void setUpTest() {
        String dir = System.getProperty("user.dir");
        System.setProperty("WebDriver.chrome.driver", dir + "src/main/resources/BrowserDrivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void ToDoMVC() {
        driver.get("https://todomvc.com/examples/vanillajs/");
        ToDoPage.clickSource(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ToDoPage.clickJavaScript(driver);
        ToDoPage.clickLetusKnow(driver);
        ToDoPage.inputTextToDoList(driver);
    }
    @AfterTest
    public void tearDown() {
        driver.close();
    }
}

