package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "FAIL, caption was not displayed");
        assertEquals(caption.getTitle(), "name: user1", "FAIL, caption title is wrong");
        assertEquals(caption.getLinkText(), "View profile", "FAIL, caption link text is wrong");
        assertTrue(caption.getLink().endsWith("/users/1"), "FAIL, link is incorrect");
    }
}
