package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Utility {
    public LogInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//input[@id='txtUsername']")
    WebElement userNameFiled;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passWordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginFiled;
    @FindBy (xpath = "//form[@id='frmLogin']")
    WebElement logInPanalFiled;


    public void enterUserNameField(String username){
        sendTextToElement(userNameFiled,username);
    }
    public void enterPasswordField(String pasword){
        sendTextToElement(passWordField,pasword);
    }
    public void clickOnLOgInButton(){
        clickOnElement(loginFiled);
    }
    public void getTextFromLogInPanel(){
        getTextFromElement(logInPanalFiled);
    }
    public void logInApp(String username , String password ){
        enterUserNameField(username);
        enterPasswordField(password);
        clickOnLOgInButton();

    }
    public  boolean logInPanelDisplayed(){
       return logInPanalFiled.isDisplayed();
    }
}
