package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        var emailPage = forgotPasswordPage.retrievePassword("vitorluizrovaresco@gmail.com");
        assertEquals(emailPage.getMessageContent(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
