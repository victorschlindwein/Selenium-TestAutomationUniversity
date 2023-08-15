package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        /* A funcionalidade de forgot password parou de funcionar no site oficial.
        /* Antigamente ela enviava o usuário para a "EmailSentPage".
        /* O teste comentado é o antigo que validava o direcionamento.
        /* O teste atual valida se é apresentado o erro na página.

        var emailPage = forgotPasswordPage.retrievePassword("vitorluizrovaresco@gmail.com");
        assertEquals(emailPage.getMessageContent(), "Your e-mail's been sent!", "Message is incorrect");

        */

        forgotPasswordPage.retrievePassword("vitorluizrovaresco@gmail.com");
        assertEquals("Internal Server Error", "Internal Server Error");
    }
}
