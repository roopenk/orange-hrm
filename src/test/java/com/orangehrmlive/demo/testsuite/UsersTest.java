package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginPage = new LoginPage(); // Object creation of LoginPage
    HomePage homePage = new HomePage(); // Object creation of HomePage
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage(); // Object creation of ViewSystemUsersPage
    AddUserPage addUserPage = new AddUserPage(); // Object creation of AddUserPage
    Alert alert = driver.switchTo().alert(); // Creating alert object reference and switch to alert

    @Test
    public void adminShouldAddUserSuccessFully() {
        loginPage.userLoginVerification(); // Logging In
        homePage.clickOnAdmin(); // Clicking on Admin
        viewSystemUsersPage.systemUsersText(); // Verifying System Users text
        viewSystemUsersPage.clickingOnAddButton(); // Clicking on add button
        addUserPage.verifyingAddUserText(); // Verifying Users Text
        addUserPage.selectingUserRoll("Admin"); // Selecting user Roll from drop down menu
        addUserPage.sendingEmployeeNameToEmployeeNameField("Ananya Dash"); // Entering employee name
        addUserPage.sendingUserNameToUserNameField("ananyadash"); // Entering username
        addUserPage.selectingUserStatus("Disabled"); // Selecting user status
        addUserPage.sendingPasswordToPasswordField("Admin123@"); // Entering password
        addUserPage.sendingPasswordToConfirmPasswordField("Admin123@"); // Confirming password
        addUserPage.clickingOnTheSaveButton(); // Clicking on save button
        // Handling Alert
        String actualSaveText = alert.getText();
        Assert.assertEquals(actualSaveText, "Successfully Saved", "User Add Failed...!!!");
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        loginPage.userLoginVerification(); // Logging In
        homePage.clickOnAdmin(); // Clicking on Admin
        viewSystemUsersPage.systemUsersText(); // Verifying System users text
        viewSystemUsersPage.sendingUserNameToUserNameTextBox("Admin"); // Entering username
        viewSystemUsersPage.selectingRollFromUserRollDropDown("Admin"); // Selecting user roll
        viewSystemUsersPage.selectingUserStatus("Enabled"); // Selecting user status
        viewSystemUsersPage.clickingOnSearchButton(); // Clicking on search button
        viewSystemUsersPage.verifySearchedUserIsPresent(); // Verifying that user record is present
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginPage.userLoginVerification(); // Logging In
        homePage.clickOnAdmin(); // Clicking on Admin
        viewSystemUsersPage.systemUsersText(); // Verifying Users text
        viewSystemUsersPage.sendingUserNameToUserNameTextBox("Admin"); // Entering username
        viewSystemUsersPage.selectingRollFromUserRollDropDown("Admin"); // Selecting user roll
        viewSystemUsersPage.selectingUserStatus("Enabled"); // Selecting user status
        viewSystemUsersPage.clickingOnSearchButton(); // Clicking on search button
        viewSystemUsersPage.verifySearchedUserIsPresent(); // Verifying that user record is present
        viewSystemUsersPage.clickingOnUserCheckBox(); // Clicking on the user record check box
        viewSystemUsersPage.verifySearchedUserIsPresent(); // Verifying user record is present
        viewSystemUsersPage.clickingOnDeleteButton(); // Clicking on the delete button
        // Handling Alert
        String actualDeleteText = alert.getText();
        Assert.assertEquals(actualDeleteText, "Successfully Deleted", "User Delete Failed...!!!");
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        loginPage.userLoginVerification(); // Logging In
        homePage.clickOnAdmin(); // Clicking on Admin
        viewSystemUsersPage.systemUsersText(); // Verifying Users text
        viewSystemUsersPage.sendingUserNameToUserNameTextBox("Admin007"); // Entering username
        viewSystemUsersPage.selectingRollFromUserRollDropDown("Admin"); // Selecting user roll
        viewSystemUsersPage.selectingUserStatus("Enabled"); // Selecting user status
        viewSystemUsersPage.clickingOnSearchButton(); // Clicking on search button
        // Handling Alert
        String actualNoRecordText = alert.getText();
        Assert.assertEquals(actualNoRecordText, "No Records Found", "Invalid Message...!!!");
    }
}
