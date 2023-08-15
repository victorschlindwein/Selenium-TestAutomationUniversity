package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
            horizontalSliderPage.sliderBarMoveUntil(value);
            assertEquals(horizontalSliderPage.getSliderValue(), value);
    }
}
