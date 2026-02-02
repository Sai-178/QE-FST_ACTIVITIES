package demos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConform {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement conf = driver.findElement(By.xpath("//button[@id='confirmation']"));
        conf.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        conf.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        WebElement ele = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(ele.getText());

        driver.quit();

    }

}
