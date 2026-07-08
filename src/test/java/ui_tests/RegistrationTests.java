package ui_tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationPositiveTest() {
        app.getRegistrationPage()
                .openRegistrationPage()
                .clickSignUp()
                .clickSignUpWithEmail()
                .fillEmail("aitwebsitecohort82m@gmail.com")
                .fillPassword("AitWebsiteCohort82!!")
                .clickSignUpButton();
    }
}