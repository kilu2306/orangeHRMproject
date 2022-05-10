package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagmentField;

    public void mouseHoverUserManagment() {
        mouseHoverToElement(userManagmentField);
    }

    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobField;

    public void mouseHoverOnJobField() {
        mouseHoverToElement(jobField);
    }

    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organaization;

    public void mouseHoverOnOrganization() {
        mouseHoverToElement(organaization);
    }

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }



}
