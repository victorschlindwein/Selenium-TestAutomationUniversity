package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropdrownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdrownPage.selectFromDropdown(option);
        var selectedOptions = dropdrownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "FAIL number of selections");
        assertTrue(selectedOptions.contains(option), "FAIL, correct option was not selected");
    }
}
