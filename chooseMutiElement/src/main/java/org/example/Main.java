package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/link.html");

        //burada bulduğu ilk uyan elementi getirir.


        //WebElement baglanti = driver.findElement(By.linkText("click here"));
        //baglanti.click();

        //FindElements bir liste döner. Tüm aynıları bulur.

        List<WebElement> baglanti2 = driver.findElements(By.linkText("click here"));
        baglanti2.get(1).click();

        //baglanti2.get(0).click();

        //driver.quit();






    }
}