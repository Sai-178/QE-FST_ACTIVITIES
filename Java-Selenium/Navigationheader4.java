package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationheader4 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
        WebElement ele = driver.findElement(By.xpath("//h3[@class='text-3xl font-bold text-orange-600']"));
        System.out.println(ele.getText());
        WebElement ele1 = driver.findElement(By.xpath("//h5[@class='text-3xl font-bold text-purple-600']"));
        System.out.println(ele1.getCssValue("color"));
        WebElement ele2 = driver.findElement(By.xpath("//button[@class='rounded-xl bg-purple-200 p-2 text-3xl font-bold text-purple-900 svelte-2hb4ib']"));

        System.out.println(ele2.getAttribute("class"));
        WebElement ele3 = driver.findElement(By.xpath("//button[@class='rounded-xl bg-slate-200 p-2 text-3xl font-bold text-slate-900 svelte-2hb4ib']"));
        System.out.println(ele3.getText());
        driver.quit();
    }

}
