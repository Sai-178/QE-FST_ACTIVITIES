package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act14 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions act = new Actions(driver);
        driver.get("https://training-support.net/webelements/tables");
        List<WebElement> wel = driver.findElements(By.xpath("//table/thead/tr//th"));
        System.out.println(wel.size());
        List<WebElement> wel2 = driver.findElements(By.xpath("//table/tbody//tr"));
        System.out.println(wel2.size());
        WebElement ele = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println(ele.getText());
        WebElement ele2 = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        act.click(ele2).build().perform();

        WebElement fin = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println(fin.getText());

        driver.quit();

    }

}
