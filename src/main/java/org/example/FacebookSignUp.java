package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
    public static void main(String[] args) throws InterruptedException {
        String baseUri = "https://www.facebook.com/";
        String driveLoc ="C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe";

        WebDriver driver =new EdgeDriver();
        System.setProperty("webdriver.ie.driver",driveLoc);

        driver.get(baseUri);

        driver.findElement(By.name("email")).sendKeys("rythibchd09@");
        driver.findElement(By.name("pass")).sendKeys("3521@Sdgth");
        driver.findElement(By.partialLinkText("Create new account")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Prem");
        driver.findElement(By.name("lastname")).sendKeys("Diwala");
        driver.findElement(By.name("reg_email__")).sendKeys("poiuy23@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("poiuy23@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("3542Sfdcvxt&");

        Select drp = new Select(driver.findElement(By.id("day")));
        drp.selectByValue("5");

        Select drp2 = new Select(driver.findElement(By.id("month")));
        drp2.selectByVisibleText("Jun");

        Select drp3 = new Select(driver.findElement(By.id("year")));
        drp3.selectByValue("2003");

        int value=-1;
        if(value==-1) {
            driver.findElement(By.xpath("//input[@value='-1']")).click();
            Select drip = new Select(driver.findElement(By.name("preferred_pronoun")));
            drip.selectByValue("2");
            driver.findElement(By.name("websubmit"));
        }
        else if(value==1){
            driver.findElement(By.xpath("//input[@value='1']")).click();
        }
        else{
            driver.findElement(By.xpath("//input[@value='2']")).click();
        }

    }
}
