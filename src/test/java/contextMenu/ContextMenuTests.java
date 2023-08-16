package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String getMessage = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(getMessage, "You selected a context menu", "FAIL something went wrong");
    }
}
