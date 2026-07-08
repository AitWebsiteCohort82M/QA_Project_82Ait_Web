import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.my-ait.com/account/my-account");
        Thread.sleep(2000);

        WebElement loginWithEmailButton = driver.findElement(By.cssSelector("[data-testid='switchToEmailLink'] button"));
        loginWithEmailButton.click();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.cssSelector("input[id^='input_input_emailInput']"));
        username.sendKeys("aitwebsitecohort82m@gmail.com");
        Thread.sleep(2000);


        WebElement password = driver.findElement(By.cssSelector("input[id^='input_input_passwordInput']"));
        password.sendKeys("AitWebsiteCohort82!!");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.cssSelector("button[data-testid='buttonElement']"));
        loginButton.click();
        Thread.sleep(4000);

        WebElement weRespectYourPrivacyButton = driver.findElement(By.cssSelector("button.cst-cookies-btn.cst-all-btn"));
        weRespectYourPrivacyButton.click();

    }
}

// Test