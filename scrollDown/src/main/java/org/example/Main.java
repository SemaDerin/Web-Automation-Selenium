package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "https://demo.guru99.com/test/guru99home/";
        driver.get(baseUrl);

        //Scroll icin JavaScriptExecutor sınıfını çağırıyoruz.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Index vererek kaydırma
        //js.executeScript("window.scrollBy(0,500)");
        WebElement linux = driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[5]/div/div/div/div/div[1]/div/div/h4/a"));
        //Elemente kadar kaydırma
        //js.executeScript("arguments[0].scrollIntoView();",linux);

        //SAyfanın başından sayfanın bittiği yere kadar kaydırma yapmak için
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}