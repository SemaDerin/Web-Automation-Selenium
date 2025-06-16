package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String baseUrl = "https://demoqa.com/upload-download";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(baseUrl);
        WebElement dowloadButton = driver.findElement(By.id("downloadButton"));
        dowloadButton.click();

        String directory= "C:\\Users\\derin\\Downloads";
        String fileName = "sampleFile.jpeg";

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(isFileDowload(fileName,directory));








    }


    public static boolean isFileDowload(String fileName,String directory){

        File file = new File(directory);
        File[] files = file.listFiles();

        for(int i=0; i<files.length;i++){
            if(files[i].getName().equals(fileName)){
                return true;
            }
        }
        return false;



    }
}