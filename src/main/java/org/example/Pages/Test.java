package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Users\\ssb\\chromedriver-win64\\msedgedriver.exe");

        WebDriver webDriver =new EdgeDriver();

        webDriver.get("https://www.facebook.com/");

        Dashboard dash = new Dashboard(webDriver);

        SignUpPage signUpPage = new SignUpPage(webDriver);

        dash.createAcc();

        signUpPage.setFirstName("Shila");
        signUpPage.setLastName("Balma");
        signUpPage.setReg_email("afsgjd30@gmail.com");
        signUpPage.setConfirm_email("afsgjd30@gmail.com");
        signUpPage.setPassword("3548@dGdhbvc");
        signUpPage.drop_Bday("5");
        signUpPage.drop_Bmonth("Nov");
        signUpPage.drop_Byear("2000");
        signUpPage.setMaleGender();
    }
}
