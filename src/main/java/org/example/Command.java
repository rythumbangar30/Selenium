package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Command {
    public static void main(String[] args) throws InterruptedException {
        String driveLoc= "C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe";
        String baseUri = "https://www.google.com";

        WebDriver driver = new EdgeDriver();

        System.setProperty("webdriver.ie.driver",driveLoc);
        driver.get(baseUri);

        String title = driver.getTitle();
        int titleLength = driver.getTitle().length();

        System.out.println("This is title :"+title);
        System.out.println("This is length :"+titleLength);

        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(baseUri)){
            System.out.println("Url is Correct");
        }
        else{
            System.out.println("Url is Incorrect");
        }

        String pageSource = driver.getPageSource();
        int lengthOfPage = driver.getPageSource().length();

        System.out.println("Total Length of Page Source :"+lengthOfPage);

        Thread.sleep(5000);
        driver.close();
    }
}
