package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    public void inIt(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement passWord;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;


    public String getAddUserText() {
        return getTextFromElement(addUserText);
    }
    public void selectUserRoleDropDown(String role){
        selectByVisibleTextFromDropDown(userRoleDropDown,role);
    }
    public void enterEmployeesNmae(String ename){
        sendTextToElement(employeeName,ename);
    }
    public void enterUserName(String name){
        sendTextToElement(userName,name);
    }
    public void selectFromStatus(String status){
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }
    public void enterPassWord(String password){
        sendTextToElement(passWord, password);
    } public void enterConfirmPassWord(String cpassword){
        sendTextToElement(confirmPassword, cpassword);
    }
    public void clickOnSave(){
        clickOnElement(saveButton);
    }


}
