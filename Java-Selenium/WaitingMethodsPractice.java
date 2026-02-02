package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMethodsPractice {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get("https://training-support.net/webelements/login-form/");
        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        user.sendKeys("admin");
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        pass.sendKeys("password");
        WebElement sub = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
        sub.click();

        driver.quit();

    }

}
