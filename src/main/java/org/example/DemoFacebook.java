package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFacebook {
    public static void main(String[] args) throws InterruptedException {
        String driveLoc="C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe";
        String baseUri="https://www.facebook.com/";

        WebDriver driver = new EdgeDriver();

        System.setProperty("webdriver.ie.driver",driveLoc);
        driver.get(baseUri);

//        driver.findElement(By.xpath("//a[@role='button']")).click();

        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);

        
        Select drop= new Select(driver.findElement(By.id("day")));
//        Way to select through css selector
//        Select drop= new Select(driver.findElement(By.cssSelector("select[title='Day']")));

        drop.selectByValue("2");
//        driver.close();
    }
}
