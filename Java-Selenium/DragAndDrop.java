package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//img[@id='ball']"));
        WebElement d1 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
        WebElement d2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
        act
                .clickAndHold(ele)
                .moveToElement(d1)
                .build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"dropzone1\"]/span")));
        WebElement eleme = driver.findElement(By.xpath("//div[@id=\"dropzone1\"]/span"));
        System.out.println(eleme.getText());

        driver.quit();
    }

}
