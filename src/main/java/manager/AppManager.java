package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegistrationPage;

import java.time.Duration;

public class AppManager {

    WebDriver wd;
    RegistrationPage registrationPage;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        registrationPage = new RegistrationPage(wd);
    }

    public void stop() {
        wd.quit();
    }

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }
}