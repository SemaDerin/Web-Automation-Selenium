package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);

        WebElement textBox = driver.findElement(By.name("cusid"));
        textBox.sendKeys("12345");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        //Pop up mesajına tıklatabilmek için Allert paketi kullılacaktır.
        //Alet ile driver'i bağlıyoruz.

        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.printf(alertMessage);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        Alert alert2 = driver.switchTo().alert();
        String alertMessage2 = driver.switchTo().alert().getText();
        System.out.println(alertMessage2);

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert2.accept();


    }
}