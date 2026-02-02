package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net");
        System.out.println(driver.getTitle());
        WebElement ele = driver.findElement(By.linkText("About Us"));
        ele.click();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        System.out.print(driver.getTitle());

        driver.quit();

    }

}
