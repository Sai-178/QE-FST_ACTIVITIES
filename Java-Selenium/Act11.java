package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act11 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/webelements/dynamic-controls");
        WebElement check = driver.findElement(By.xpath("//input[@id='checkbox']"));
        WebElement but = driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']"));
        builder
                .click(but)
                .build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));
        builder
                .click(but).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));

        driver.quit();

    }

}
