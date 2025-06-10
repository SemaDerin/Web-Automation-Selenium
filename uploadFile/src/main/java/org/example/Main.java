package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.build.AbstractOrigin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.guru99.com/test/upload/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(baseUrl);

        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\derin\\IdeaProjects\\uploadFile\\src\\images\\indir.png");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();
        driver.quit();




    }




    }
}

