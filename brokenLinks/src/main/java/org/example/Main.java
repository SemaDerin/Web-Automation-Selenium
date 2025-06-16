package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String baseUrl = "https://www.facebook.com/";
        driver.get(baseUrl);


        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;


        List<WebElement> links = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){
            url = it.next().getDomAttribute("href");
            if(url== null || url.isEmpty()){
                System.out.println("This is blank link");
                continue;
            }
            if (!url.startsWith(baseUrl)){
                System.out.println("not check");
                continue;
            }
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if(respCode>= 400){
                    System.out.println(url+ "is broken link.");
                }else{
                    System.out.println(url+ "is ok.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }



    }
}