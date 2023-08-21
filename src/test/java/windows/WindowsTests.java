package windows;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowsTests extends BaseTests {
    @Test
    public void testWindowsTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "FAIL, button was not displayed. Something went wrong");
    }
}
