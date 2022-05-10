package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement logoFiled;
    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement adminFiled;
    @FindBy(xpath = "//b[normalize-space()='PIM']")
    WebElement pIMFiled;
    @FindBy(xpath = "//b[normalize-space()='Leave']")
    WebElement leaveField;
    @FindBy(xpath = "//b[normalize-space()='Dashboard']")
    WebElement dashBoardField;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welComeTextField;
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement logo;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userProfileLogo;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;


    public void clickOnAdmin() {
        clickOnElement(adminFiled);
    }

    public void clickOnPim() {
        clickOnElement(pIMFiled);
    }

    public void clickOnDashBoard() {
        clickOnElement(dashBoardField);
    }

    public String getWelcomeText() {
        return getTextFromElement(welComeTextField);
    }

    public boolean logoisDisplayed() {
        return logo.isDisplayed();
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
    }

    public void mounsehoverOnLogout() {
        mouseHoverToElement(logoutButton);
    }

    public void clickOnLogout() {
        clickOnElement(logoutButton);
    }


}
