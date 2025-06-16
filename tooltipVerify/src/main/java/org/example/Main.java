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

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "https://demo.guru99.com/test/social-icon";
        driver.get(baseUrl);

        WebElement mail = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[1]"));
        WebElement google = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[2]"));
        WebElement youtube = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[3]"));
        WebElement github = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[4]"));
        WebElement facebook = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[5]"));
        WebElement rss = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[6]"));

        String dataForMail =mail.getAttribute("title");
        String expectedDataForMail = "Mail";

        if(expectedDataForMail.equals(dataForMail)){
            System.out.print("True");
        }else{
            System.out.println("False");
        }







    }
}