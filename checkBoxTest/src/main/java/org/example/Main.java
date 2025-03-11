package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://demo.guru99.com/test/radio.html";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);


        WebElement r1 = driver.findElement(By.id("vfb-6-0"));
        WebElement r2 = driver.findElement(By.id("vfb-6-1"));
        WebElement r3 = driver.findElement(By.id("vfb-6-2"));

        r1.click();
        r3.click();

        if(r1.isSelected() & r3.isSelected()){

            System.out.println("Tested");
        }
        else{
            System.out.println("Failed");
        }






        driver.quit();








    }
}