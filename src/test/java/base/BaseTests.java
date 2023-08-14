package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.diver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().setSize(new Dimension(1024, 812));

        WebElement shifting_Content = driver.findElement(By.linkText("Shifting Content"));
        shifting_Content.click();

        System.out.println(driver.getTitle());
//        driver.quit();
    }

    public void clickOnShiftContent(){
        WebElement menu_Element = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu_Element.click();
    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();
        tests.clickOnShiftContent();
    }
}
