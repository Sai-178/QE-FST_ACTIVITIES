package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation2 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("https://training-support.net/webelements/login-form/");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        System.out.println(driver.getTitle());
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("admin");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("password");
        WebElement sub = driver.findElement(By.xpath("//button[@class='svelte-1pdjkmx']"));
        sub.click();

        driver.quit();
    }

}
