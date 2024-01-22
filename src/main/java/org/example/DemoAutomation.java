package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoAutomation {
    public static void main(String[] args) throws InterruptedException {
//        ChromeDriver driver=new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssb\\chromedriver_win32\\chromedriver");
//        driver.get("http://www.google.com");
//        EdgeDriver d3=new EdgeDriver();
////        InternetExplorerDriver d2=new InternetExplorerDriver();
//        System.setProperty("webdriver.edge.driver","C:\\Users\\ssb\\chromedriver_win32\\msedgedriver");
//        d3.get("http://www.google.com");
//        d3.quit();

//        WebDriver webDriver=new EdgeDriver();
//        webDriver.navigate().to("http://google.com/");
//        webDriver.findElement(By.id("APjFqb")).sendKeys("report portal");
//        webDriver.findElement(By.name("btnK")).submit();


//        webDriver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//        webDriver.quit();
//        webDriver.wait(2000);
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ZERO);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
//        element.click();

//        webDriver.findElement(By.name("btnK")).click();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssb\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver1=new ChromeDriver();
//        webDriver1.navigate().to("http://www.javatpoint.com/");
//        webDriver1.manage().window().maximize();
//        JavascriptExecutor js= (JavascriptExecutor) webDriver1;
//        js.executeScript("scrollBy(0,1000");
//        webDriver1.findElement(By.linkText("Java")).click();

        System.setProperty("webdriver.ie.driver","C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe");

        WebDriver webDriver2 = new EdgeDriver();

        webDriver2.navigate().to("http://www.google.com/");
        webDriver2.manage().window().maximize();

        webDriver2.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");
        webDriver2.findElement(By.name("btnK")).submit();
//        webDriver2.findElement(By.linkText("Javatpoint: Tutorials List")).click();
//        webDriver2.findElement(By.className("notranslate TbwUpd NJjxre iUh30 ojE3Fb")).click();
          webDriver2.findElement(By.className("byrV5b")).click();
    }
}
