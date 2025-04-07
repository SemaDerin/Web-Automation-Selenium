package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;
import java.time.temporal.ChronoField;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement country = driver.findElement(By.name("country"));
        Select dropCountry = new Select(country);
        dropCountry.selectByVisibleText("TURKEY");*/

        driver.get("https://output.jsbin.com/osebed/2");
        WebElement fruit = driver.findElement(By.id("fruits"));
        Select dropFruits = new Select(fruit);
        dropFruits.selectByVisibleText("Grape");




    }
}