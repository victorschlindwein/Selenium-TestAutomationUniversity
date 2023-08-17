package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = "/html/body/div[2]/div/div/a[1]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingPageExampe1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingPageExampe1Page(driver);
    }
}
