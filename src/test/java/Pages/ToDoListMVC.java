package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToDoListMVC {
    public WebDriver driver  ;

    public ToDoListMVC(WebDriver driver) {
        this.driver = driver;
    }

    By Source = By.xpath("/html/body/aside/header/span/a");
    By JavaScript = By.xpath("/html/body/aside/blockquote/footer/a");
    By LetusKnow = By.xpath("/html/body/aside/footer/em/a");
    By ToDoInputBox =By.xpath("/html/body/section/header/input");


    public void clickSource(WebDriver driver) {
        driver.findElement(Source).click();
    }
    public void clickJavaScript(WebDriver driver) {
        driver.findElement(JavaScript).click();
    }
    public void clickLetusKnow(WebDriver driver) {
        driver.findElement(LetusKnow).click();
    }
    public void inputTextToDoList(WebDriver driver)
    {
        driver.findElement(ToDoInputBox).sendKeys("ReadingData");
        driver.findElement(ToDoInputBox).sendKeys("CreateReport");
        driver.findElement(ToDoInputBox).sendKeys("Logging");
        driver.findElement(ToDoInputBox).sendKeys("UINavigation");
    }
}
