package com.orangehrmlive.demo.testsuits;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LogInPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LogInPage logInPage;
    HomePage homePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        logInPage= new LogInPage();
        homePage= new HomePage();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldLoginSuccessFully(){
        logInPage.enterUserNameField("Admin");
        logInPage.enterPasswordField("admin123");
        logInPage.clickOnLOgInButton();
        String actualText=homePage.getWelcomeText().substring(0,8);
        Assert.assertEquals(actualText,"WelCome","displayed message is wrong");
    }
@Test(groups = {"sanity","regression"})
    public void verifyThatTheLogoDisplayOnHomePage(){
    logInPage.enterUserNameField("Admin");
    logInPage.enterPasswordField("admin123");
    logInPage.clickOnLOgInButton();
    Assert.assertTrue(homePage.logoisDisplayed());

}
@Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully(){
    logInPage.enterUserNameField("Admin");
    logInPage.enterPasswordField("admin123");
    logInPage.clickOnLOgInButton();
    homePage.clickOnUserProfileLogo();
    homePage.mounsehoverOnLogout();
    homePage.clickOnLogout();
    Assert.assertTrue(logInPage.logInPanelDisplayed());
}


}
