package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAct10 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/drag-drop/");
        WebElement ele = driver.findElement(By.xpath("//img[@id='ball']"));
        WebElement dr1 = driver.findElement(
                By.xpath("//div[@id=\"dropzone1\"]/span")
        );

        WebElement dr2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
        builder
                .clickAndHold(ele)
                .dragAndDrop(ele, dr1)
                .build()
                .perform();

        System.out.println(dr1.getText());
        builder
                .clickAndHold(ele)
                .dragAndDrop(ele, dr2)
                .build()
                .perform();
        System.out.println(dr2.getText());

        driver.quit();
    }

}
