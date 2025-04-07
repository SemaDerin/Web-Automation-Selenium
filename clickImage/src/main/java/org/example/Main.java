package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://www.hepsiburada.com/skin-sensual-bb-krem-light-50-spf-uva-uvb-pa-p-HBCV0000604A9N?magaza=%C4%B0K%C4%B0ZLER%20SHOP";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);

        WebElement button = driver.findElement(By.xpath("//a[@title='Hepsiburada']"));
        button.click();

         /*Sayfa kaynağını görüntülerken seçtiğimiz elementten ne kadar var ise görmek istersek;
       //a[@title='HepsiBurada']
       a tagı içinde title i hepsiburada değerine eşit olan kaç element var?*/


        driver.quit();






    }
}