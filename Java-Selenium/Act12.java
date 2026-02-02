package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act12 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-content");
        WebElement but = driver.findElement(By.id("genButton"));
        builder.click(but).build().perform();
        WebElement ele = driver.findElement(By.xpath("//h2[@id='word']"));
        wait.until(ExpectedConditions.textToBePresentInElement(ele, "porch"));
        //wait.until(ExpectedConditions.textToBePresentInElement((By.xpath("//h2[@id='word']")), "release"));
        System.out.println(ele.getText());

        driver.quit();

    }

}
