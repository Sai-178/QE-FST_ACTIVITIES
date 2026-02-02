package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUp {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/webelements/popups/");
        WebElement but = driver.findElement(By.xpath("//button[@id='launcher']"));

        but.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys("admin");
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("password");
        WebElement sub = driver.findElement(By.xpath("//button[text()='Submit']"));
        sub.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']")));
        WebElement logged = driver.findElement(By.xpath("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']"));
        System.out.println(logged.getText());

        driver.quit();
    }

}
