package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    // Storing all the locators
    // Storing User Roll locator for adding a user
    By userRollAdd = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    // Storing Employee name locator
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    // Storing username locator
    By username = By.xpath("//input[@placeholder='Type for hints...']");
    // Storing user status locator
    By userStatus = By.xpath("//div[contains(text(),'-- Select --')]");
    // Storing password locator
    By password = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    // Storing confirm password locator
    By confirmPassword = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    // Storing save button locator
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    // Storing cancel button locator
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    // Storing Add User Text locator
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");

    // Declaring all th methods
    public void selectingUserRoll(String userRoll) { // Method to select user roll
        selectByVisibleTextFromDropDown(userRollAdd, userRoll);
    }

    public void verifyingAddUserText() { // Method to verify Add User Text
        verifyTextDisplayed(addUserText, "Add User");
    }

    public void selectingUserStatus(String userStatusValue) { // Method to select user status
        selectByVisibleTextFromDropDown(userStatus, userStatusValue);
    }

    public void sendingEmployeeNameToEmployeeNameField(String empName) { // Method to send employee name
        sendTextToElement(employeeName, empName);
    }

    public void sendingUserNameToUserNameField(String userNameValue) { // Method to send username
        sendTextToElement(username, userNameValue);
    }

    public void sendingPasswordToPasswordField(String passwordValue) { // Method to send password
        sendTextToElement(password, passwordValue);
    }

    public void sendingPasswordToConfirmPasswordField(String confirmPasswordValue) { // Method to send confirmation password
        sendTextToElement(confirmPassword, confirmPasswordValue);
    }

    public void clickingOnTheSaveButton() { // Method to click on the save button
        clickOnTheElement(saveButton);
    }

    public void clickingOnTheCancelButton() { // Method to click on the cancel button
        clickOnTheElement(cancelButton);
    }
}
