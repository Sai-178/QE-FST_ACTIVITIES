package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Act17 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects/");
        WebElement well = driver.findElement(By.xpath("//select[@class='h-80 w-64 rounded-lg border-2 border-black bg-purple-200 p-3 shadow-md transition hover:shadow-lg focus:border-2 focus:border-black focus:ring-0']"));

        Select sel = new Select(well);
        sel.selectByIndex(1);
        sel.selectByValue("html");
        sel.selectByVisibleText("CSS");
        sel.selectByIndex(5);
        List<WebElement> li = sel.getAllSelectedOptions();
        for (WebElement ele : li) {
            System.out.println(ele.getText());

        }
        sel.deselectByIndex(1);
        driver.quit();

    }

}
