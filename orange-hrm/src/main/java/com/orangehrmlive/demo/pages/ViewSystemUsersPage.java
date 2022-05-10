package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement systemUsereText;

    public String getSystemUserText() {
        return systemUsereText.getAttribute("innerHTML");
    }

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userNmaeField;

    public void enterUsername(String username) {
        sendTextToElement(userNmaeField, username);
    }

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoleDropDownField;

    public void selectFromUserDropDownField(String text) {
        selectByVisibleTextFromDropDown(userRoleDropDownField, text);
    }

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement firstName;

    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDownField;

    public void selectStatus(String text) {
        selectByVisibleTextFromDropDown(statusDropDownField, text);
    }

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;

    public void clickOnsearchButton() {
        clickOnElement(searchButton);
    }

    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;

    public void clickOnResetButton() {
        clickOnElement(resetButton);
    }

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeName;

    public void enterEmployeeName(String eNAme) {
        sendTextToElement(employeeName, eNAme);
    }

    @FindBy(xpath = "//div[@class='message success fadable']")
    WebElement savedSuccessText;

    public String getSuccessFullySavedText() {
        return getTextFromElement(savedSuccessText);
    }

    @FindBy(xpath = "//td/child::a")
    List<WebElement> userList;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletButton;
    @FindBy(xpath = "//td[normalize-space()='Ananya Dash']")
    WebElement employeeNameList;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkbox;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popUpOkButton;
    @FindBy(id = "successBodyEdit")
    WebElement toastSavedMessage;
    @FindBy(xpath = "//div[@id=\"successBodyDelete\"]")
    WebElement toastSuccessDeletMessage;
    @FindBy(xpath = "//table[@id=\"resultTable\"]/descendant::td")
    WebElement noRecordField;

    public List<String> getTextFromUserList() {
        String userlists = " ";
        for (WebElement list : userList) {
            userlists = list.getText();
        }
        return Collections.singletonList(userlists);
    }

    public String getTextFromemployeeList() {

        return getTextFromElement(employeeNameList);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkbox);
    }

    public void clickOnDelet() {
        clickOnElement(deletButton);
    }

    public void clickOnOkPopUpButton() {
        clickOnElement(popUpOkButton);
    }

    public String getTextFromToastSuccessDealeatedMessage() {
        return toastSuccessDeletMessage.getAttribute("innerHTML");
    }

    public String getTextFromToastSuccessSaveddMessage() {
        return toastSavedMessage.getAttribute("innerHTML");
    }

    public String getTextNoRecord() {
        return getTextFromElement(noRecordField);
    }
}

