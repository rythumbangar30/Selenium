package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.ie.driver","C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe");
        driver.navigate().to("https://www.facebook.com/");
//        driver.findElement(By.id("u_0_0_Dm")).click();
//        driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
//        driver.findElement(By.xpath("//a[@role='button']")).click();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        Select drop= new Select(driver.findElement(By.id("day")));

//        Select drop= new Select(driver.findElement(By.cssSelector("select[title='Day']")));
        drop.selectByValue("2");
//        drop.selectByVisibleText("3");
//        driver.close();
    }
}
