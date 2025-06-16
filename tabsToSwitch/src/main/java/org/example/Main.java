package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl= "https://demo.guru99.com/popup.php";
        driver.get(baseUrl);

        WebElement element1 = driver.findElement(By.xpath("/html/body/p[1]/a"));
        element1.click();

        List<String> tabs= new java.util.ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.name("emailid")).sendKeys("sema@gmail.com");
        driver.findElement(By.name("btnLogin")).click();

        driver.findElement(By.cssSelector("body > p:nth-child(14) > a")).click();






    }
}