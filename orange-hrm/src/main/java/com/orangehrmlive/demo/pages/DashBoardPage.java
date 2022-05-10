package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {
    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    WebElement dashboardTextField;
   public String getDahBoardText(){
       return  getTextFromElement(dashboardTextField);
   }
}
