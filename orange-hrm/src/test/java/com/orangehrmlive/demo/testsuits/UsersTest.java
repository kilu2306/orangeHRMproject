package com.orangehrmlive.demo.testsuits;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class UsersTest extends TestBase {
    HomePage homePage;
    LogInPage logInPage;
    AdminPage adminPage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        logInPage = new LogInPage();
        adminPage = new AdminPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        addUserPage = new AddUserPage();
    }


    @Test(groups = {"smoke","regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        logInPage.logInApp("Admin", "admin123");
        homePage.clickOnAdmin();
        String actualText = viewSystemUsersPage.getSystemUserText();
        String expactedtext = "System Users";
        softAssert.assertEquals(actualText, expactedtext, "displayed text is wrong");
        adminPage.clickOnAddButton();
        String actualText1 = addUserPage.getAddUserText();
        String expactedText1 = "Add User";
        softAssert.assertEquals(actualText1, expactedText1, "displayed text is wrong ");
        addUserPage.selectUserRoleDropDown("Admin");
        addUserPage.enterEmployeesNmae("Ananya Dash");
        addUserPage.enterUserName("anu35");
        addUserPage.selectFromStatus("Disabled");
        addUserPage.enterPassWord("prime1234");
        addUserPage.enterConfirmPassWord("prime1234");
        Thread.sleep(3000);
        addUserPage.clickOnSave();
        softAssert.assertTrue(viewSystemUsersPage.getTextFromToastSuccessSaveddMessage().contains("Successfully Saved"));
        Thread.sleep(2000);
        softAssert.assertAll();

    }

    @Test(groups = {"sanity","regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        SoftAssert softAssert = new SoftAssert();
        logInPage.logInApp("Admin", "admin123");
        homePage.clickOnAdmin();
        String actualText = viewSystemUsersPage.getSystemUserText();
        String expactedtext = "System Users";
        softAssert.assertEquals(actualText, expactedtext, "displayed mtext is wrong");
        viewSystemUsersPage.enterUsername("anu35");
        viewSystemUsersPage.selectFromUserDropDownField("Admin");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.clickOnsearchButton();
        softAssert.assertTrue(actualList.contains("anu35"));
        softAssert.assertAll();


    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        logInPage.logInApp("Admin", "admin123");
        homePage.clickOnAdmin();
        String actualText = viewSystemUsersPage.getSystemUserText();
        String expactedtext = "System Users";
        softAssert.assertEquals(actualText, expactedtext, "displayed mtext is wrong");
        viewSystemUsersPage.enterEmployeeName("Ananya Dash");
        viewSystemUsersPage.selectFromUserDropDownField("Admin");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.clickOnsearchButton();
        String actualList = viewSystemUsersPage.getTextFromemployeeList();
        softAssert.assertTrue(actualList.contains("Ananya Dash"));
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDelet();
        viewSystemUsersPage.clickOnOkPopUpButton();
        softAssert.assertTrue(viewSystemUsersPage.getTextFromToastSuccessDealeatedMessage().contains("Successfully Deleted"));
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        SoftAssert softAssert = new SoftAssert();
        logInPage.logInApp("Admin", "admin123");
        homePage.clickOnAdmin();
        String actualText = viewSystemUsersPage.getSystemUserText();
        String expactedtext = "System Users";
        softAssert.assertEquals(actualText, expactedtext, "displayed mtext is wrong");
        viewSystemUsersPage.enterUsername("priya");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.selectFromUserDropDownField("Admin");
        viewSystemUsersPage.clickOnsearchButton();
        viewSystemUsersPage.getTextNoRecord();
        softAssert.assertTrue(viewSystemUsersPage.getTextNoRecord().contains("No Records Found"));
        softAssert.assertAll();
    }



}
