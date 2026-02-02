package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsperform {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        driver.get("");
        WebElement ele = driver.findElement(By.name("q"));
        builder
                .click(ele)
                .sendKeys("hello ")
                .keyDown(Keys.SHIFT)
                .sendKeys("hey")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
        driver.quit();

    }

}
