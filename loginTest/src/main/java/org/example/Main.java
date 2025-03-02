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

        String baseUrl= "https://demo.guru99.com/test/login.html";

        /* Aşağıdaki satır Selenium kütüphanesi ile ChromeDriver'ı otomatik olarak yönetmek ve
        kurmak için WebDriverManager kütüphanesini kullanır. */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("semaderin@icloud.com");
        password.sendKeys("Şifremisöylemeyeceğimtabiiki");

        WebElement button = driver.findElement(By.id("SubmitLogin"));
        button.click();

        String currentUrl= driver.getCurrentUrl();
        String actualUrl = "https://demo.guru99.com/test/success.html";

        if(currentUrl.equals(actualUrl)) {

            System.out.println("Success.Tested");
        }
        else {
            System.out.println("Failed.Not Tested");

        }

        driver.quit();














    }
    }
