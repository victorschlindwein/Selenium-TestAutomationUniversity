package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void acceptAlert(){
        var alerts = homePage.clickJavaScriptAlerts();
        alerts.triggerAlert();
        alerts.alert_clickToAcept();
        assertEquals(alerts.getResult(), "You successfully clicked an alert", "FAIL, something went wrong");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "FAIL, the text in alert was wrong");
    }

    @Test
    public void testPromptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptButton();
        String text = "Jakiro de Madness";
        alertsPage.alert_typeText(text);
        alertsPage.alert_clickToAcept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "FAIL, something went wrong");
    }
}
