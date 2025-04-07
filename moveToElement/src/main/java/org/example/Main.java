package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=12044851428890031180&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9209316&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");

        /*WebElement girisElementi = driver.findElement(By.cssSelector("a[data-nav-role='signin']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(girisElementi).perform();

        WebElement girisYap = driver.findElement(By.className("nav-action-inner"));
        girisYap.click();
        */

        WebElement tabBarAccount = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(tabBarAccount).perform();

        WebElement login = driver.findElement(By.className("nav-action-inner"));
        login.click();

        driver.quit();




    }
}