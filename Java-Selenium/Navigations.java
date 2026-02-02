package demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://training-support.net/webelements/drag-drop/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
