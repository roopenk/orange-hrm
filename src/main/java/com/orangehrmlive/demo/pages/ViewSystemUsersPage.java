package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    // Storing all the locators
    // Storing System Users text locator
    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    // Storing username locator
    By userName = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    // Storing user Roll drop down locator
    By userRoll = By.xpath("//div[contains(text(),'Admin')]");
    // Storing Employee Name locator
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    // Storing status locator
    By userStatusDisabled = By.xpath("//div[contains(text(),'Disabled')]");
    By userStatus = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    // Storing Search button locator
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    // Storing Reset button locator
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    // Storing Add button locator
    By addButton = By.xpath("//button[normalize-space()='Add']");
    // Storing the user check box locator
    By userCheckBox = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    // Storing Delete button locator
    By deleteButton = By.xpath("//button[normalize-space()='Delete Selected']");
    // Storing searched user presence locator
    By searchedUserPresence = By.xpath("//div[@class='oxd-table-card']//div[2]//div[1]");

    // Declaring all the Methods
    public void verifySearchedUserIsPresent(){
        verifyTextDisplayed(searchedUserPresence, "Admin");
    }
    public void systemUsersText() { // Method to verify System Users text
        verifyTextDisplayed(systemUsersText, "System Users");
    }

    public void sendingUserNameToUserNameTextBox(String userNameValue) { // Method to send username to username field
        sendTextToElement(userName, userNameValue);
    }

    public void selectingRollFromUserRollDropDown(String userRollValue) { // Method to select User Roll
        clickOnTheElement(userRoll);
        selectByVisibleTextFromDropDown(userRoll, userRollValue);
    }

    public void enterEmployeeNameInToEmployeeNameTextBox(String empName) { // Method to send employee name
        sendTextToElement(employeeName, empName);
    }

    public void selectingUserStatus(String userStatusValue) { // Method to select user status
        selectByVisibleTextFromDropDown(userStatus, userStatusValue);
    }

    public void clickingOnSearchButton() { // Method to click on search button
        clickOnTheElement(searchButton);
    }

    public void clickingOnResetButton() { // Method to click on reset button
        clickOnTheElement(resetButton);
    }

    public void clickingOnAddButton() { // Method to click on add button
        clickOnTheElement(addButton);
    }

    public void clickingOnUserCheckBox() { // Method to select user record
        clickOnTheElement(userCheckBox);
    }

    public void clickingOnDeleteButton() { // Method to click on delete button
        clickOnTheElement(deleteButton);
    }
}
