package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionssMouseClick {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        driver.get("https://training-support.net/webelements/mouse-events/");
        // WebElement ele = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        // WebElement elecargo = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        // builder
        //         .click(ele)
        //         .moveToElement(elecargo)
        //         .click(elecargo)
        //         .build()
        //         .perform();

        WebElement sr = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement tar = driver.findElement(By.xpath("//h1[text()='target']"));

        builder
                .doubleClick(sr)
                .pause(java.time.Duration.ofSeconds(1))
                .contextClick(tar)
                .build()
                .perform();

// NOW the menu exists → locate 'open'
        WebElement op = driver.findElement(By.xpath("//span[text()='open']"));
        // builder.click(op).perform();
        op.click();
    }

}
