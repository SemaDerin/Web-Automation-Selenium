package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Stockholm = driver.findElement(By.id("box2"));
        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));


        WebElement Norway = driver.findElement(By.id("box101"));
        WebElement Sweden = driver.findElement(By.id("box102"));
        WebElement USA = driver.findElement(By.id("box103"));
        WebElement Denmark = driver.findElement(By.id("box104"));
        WebElement SouthKorea = driver.findElement(By.id("box105"));
        WebElement Italy = driver.findElement(By.id("box106"));
        WebElement Spain = driver.findElement(By.id("box107"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(Oslo,Norway).build().perform();
        actions.dragAndDrop(Stockholm,Sweden).build().perform();
        actions.dragAndDrop(Washington,USA).build().perform();
        actions.dragAndDrop(Copenhagen,Denmark).build().perform();
        actions.dragAndDrop(Seoul,SouthKorea).build().perform();
        actions.dragAndDrop(Rome,Italy).build().perform();
        actions.dragAndDrop(Madrid,Spain).build().perform();





    }
}