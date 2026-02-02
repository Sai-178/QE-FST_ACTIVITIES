package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nav5 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls/");
        WebElement ele = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.print(ele.isDisplayed());
        WebElement ch = driver.findElement(By.xpath("//input[@type='checkbox']"));
        ch.click();
        System.out.println(ch.isSelected());
        ch.click();
        System.out.println(ch.isSelected());
        WebElement ele3 = driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']"));
        ele3.click();

        WebElement ele2 = driver.findElement(By.xpath("//input[@id='checkbox']"));

        System.out.println(ele2.isDisplayed());

        // System.out.println(ele.isSelected());
        // ele.click();
        // System.out.println(ele.isSelected());
        WebElement ele4 = driver.findElement(By.xpath("//input[@id='textInput']"));
        System.out.println(ele4.isEnabled());
        WebElement ele5 = driver.findElement(By.xpath("//button[@id='textInputButton']"));
        ele5.click();
        System.out.println(ele4.isEnabled());

        driver.quit();
    }

}
