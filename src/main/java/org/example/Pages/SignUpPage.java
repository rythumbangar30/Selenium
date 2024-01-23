package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver webDriver;

    public SignUpPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    @FindBy(name = "firstname")
    private WebElement firstNameTextBox;

    @FindBy(name = "lastname")
    private WebElement lastNameTextBox;

    @FindBy(name = "reg_email__")
    private WebElement regEmailTextBox;

    @FindBy(name = "reg_email_confirmation")
    private WebElement regEmailConfirmTextBox;

    @FindBy(name = "reg_passwd__")
    private WebElement passwordTextBox;

    @FindBy(id = "day")
    private WebElement dayDropDown;

    @FindBy(id = "month")
    private WebElement monthDropDown;

    @FindBy(id = "year")
    private WebElement yearDropDown;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement femaleGender;

    @FindBy(xpath = "//input[@value='2']")
    private WebElement maleGender;

    @FindBy(xpath = "//input[@value='-1']")
    private WebElement customGender;

    @FindBy(name = "preferred_pronoun")
    private WebElement pronounDropdown;

    @FindBy(partialLinkText = "Sign Up")
    private WebElement signUp;



//    By firstName = By.name("firstname");
//    By lastName = By.name("lastname");
//    By reg_email = By.name("reg_email__");
//    By confirm_email = By.name("reg_email_confirmation");
//    By password = By.name("reg_passwd__");
//    By drop_BdayId = By.id("day");
//    By drop_BmonthId = By.id("month");
//    By drop_ByearId = By .id("year");


    public void setFirstName(String payload){
        firstNameTextBox.sendKeys(payload);
    }

    public void setLastName(String payload){
        lastNameTextBox.sendKeys(payload);
    }

    public void setReg_email(String payload){
        regEmailTextBox.sendKeys(payload);
    }

    public void setConfirm_email(String payload){
        regEmailConfirmTextBox.sendKeys(payload);
    }

    public void setPassword(String payload){
        passwordTextBox.sendKeys(payload);
    }

    public void drop_Bday(String payload){

        Select drop = new Select(dayDropDown);
        drop.selectByValue(payload);
    }

    public void drop_Bmonth(String payload){

        Select drop = new Select(monthDropDown);
        drop.selectByVisibleText(payload);
    }

    public void drop_Byear(String payload){

        Select drop = new Select(yearDropDown);
        drop.selectByValue(payload);
    }

    public void setFemaleGender(){
        femaleGender.click();
    }

    public void setMaleGender(){
        maleGender.click();
    }

    public void setCustomGender(String payload){
        customGender.click();
        Select drop = new Select(pronounDropdown);
        drop.selectByValue(payload);
    }

    public void submit(){
        signUp.submit();
    }

}
