package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    // Storing all the locators
    // Storing the UserManagement locator
    By userManagement = By.xpath("//span[normalize-space()='User Management']");
    // Storing the users locator
    By usersElement = By.xpath("//ul[@class='oxd-dropdown-menu']//li");
    // Storing the Organizations locator
    By organizationsElement = By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-navigation']/header[@class='oxd-topbar']/div[@class='oxd-topbar-body']/nav[@aria-label='Topbar Menu']/ul/li[1]");

    // Declaring all the methods
    public void selectUsersFromUserManagement() { // Method to select Users from UserManagement
        clickOnTheElement(userManagement);
        clickOnTheElement(usersElement);
    }

    public void clickOnOrganizations() { // Method to click on Organizations
        clickOnTheElement(organizationsElement);
    }
}
