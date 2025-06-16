package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        String baseUrl = "https://www.facebook.com/";
        driver.get(baseUrl);
        TakesScreenshot srcShot = ((TakesScreenshot)driver);
        File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\derin\\OneDrive\\Masaüstü\\SS\\file.png");
        try {
            FileUtils.copyFile(SrcFile,destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}