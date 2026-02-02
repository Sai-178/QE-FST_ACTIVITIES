package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Act16 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        WebElement ele = driver.findElement(By.xpath("//select[@class='h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg']"));
        Select se = new Select(ele);
        //List<WebElement> li = se.getOptions();
        se.selectByIndex(1);
        se.selectByVisibleText("Five");
        se.selectByValue("four");
        List<WebElement> ll = se.getOptions();
        for (WebElement web : ll) {
            System.out.println(web.getText());
        }
        driver.quit();
    }

}
