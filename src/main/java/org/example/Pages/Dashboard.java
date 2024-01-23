package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
    WebDriver webDriver;
    @FindBy(partialLinkText = "Create new account")
    private WebElement createAccountBtn;

    @FindBy(partialLinkText = "Log in")
    private WebElement loginBtn;

    @FindBy(name = "email")
    private WebElement userNameTextBox;

    @FindBy(name = "pass")
    private WebElement passwordTextBox;

    public Dashboard(WebDriver webDriver){
        this.webDriver=webDriver;
    }

//    By createBtn=By.partialLinkText("Create new account");
//    By loginBtn = By.partialLinkText("Log in");
//    By username = By.name("email");
//    By pass = By.name("pass");

    public void createAcc(){
        createAccountBtn.click();
    }

    public void userData(String payload){
        userNameTextBox.sendKeys(payload);
    }

    public void passData(String payload){
        passwordTextBox.sendKeys(payload);
    }

    public void login(){
        loginBtn.click();
    }

}
