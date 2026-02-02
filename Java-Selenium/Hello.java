package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }

}
