package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act13 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        List<WebElement> el = driver.findElements(By.xpath("//table/tbody//tr"));
        System.out.println(el.size());
        List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr//th"));
        System.out.println(col.size());
        WebElement sec = driver.findElement(By.xpath("//table/tbody/tr[3]"));
        System.out.print(sec.getText());
        WebElement col2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println(col2);

        driver.quit();
    }

}
