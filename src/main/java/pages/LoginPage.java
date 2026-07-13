package pages;

import manager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HelperBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginWithEmail() {
        click(By.xpath("//span[contains(text(),'Log in with Email')]"));
        pause(5000);
        return this;
    }

    public LoginPage fillEmail(String email) {
        type(By.id("input_input_emailInput_SM_ROOT_COMP943"), email);
        pause(5000);
        return this;
    }

    public LoginPage fillPassword(String password) {
        type(By.id("input_input_passwordInput_SM_ROOT_COMP943"), password);
        pause(5000);
        return this;
    }

    public LoginPage clickLoginButton() {
        click(By.xpath("//button[@aria-label='Log In']"));
        pause(5000);
        return this;
    }


}
