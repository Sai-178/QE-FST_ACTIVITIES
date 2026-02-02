package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAct9 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions buidler = new Actions(driver);
        driver.get("https://training-support.net/webelements/keyboard-events/");
        WebElement ele = driver.findElement(By.xpath("//h1[@class='mt-3 text-center text-4xl font-semibold text-black']"));
        buidler
                .click(ele)
                .keyDown(Keys.SHIFT)
                .sendKeys("S")
                .keyUp(Keys.SHIFT)
                .sendKeys("elenium")
                .build()
                .perform();
        System.out.println(driver.getTitle());
        System.out.println(ele.getText());

        driver.quit();
    }

}
