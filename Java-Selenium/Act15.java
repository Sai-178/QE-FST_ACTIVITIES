package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act15 {

    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://training-support.net/webelements/dynamic-attributes/");
        System.out.println(driver.getTitle());
        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement name1 = driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));

        //name.sendKeys("sai");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

        // email.sendKeys("sai@gmail.com");
        WebElement dateee = driver.findElement(By.xpath("//input[@type='date']"));
        //dateee.sendKeys("2026-02-19");

        WebElement descri = driver.findElement(By.xpath("//textarea[@class='focus:ring-0 svelte-7bqce9']"));
        //descri.sendKeys("hey");
        WebElement sub = driver.findElement(By.xpath("//button[@class='font-bold svelte-7bqce9']"));
        builder
                .click(name)
                .sendKeys("sainarendra")
                .moveToElement(email)
                .click(email)
                .sendKeys("sai@gmail.com")
                .moveToElement(dateee)
                .click(dateee)
                .sendKeys("2026-02-02")
                .moveToElement(descri)
                .click(descri)
                .sendKeys("hey ra")
                .moveToElement(sub)
                .click(sub)
                .build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        WebElement finall = driver.findElement(By.id("action-confirmation"));
        System.out.println(finall.getText());

        driver.quit();
    }

}
