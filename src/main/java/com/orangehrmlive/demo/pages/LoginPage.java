package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    // Storing all the locators
    // Storing username locator
    By userName = By.xpath("//input[@placeholder='Username']");
    // Storing password locator
    By password = By.xpath("//input[@placeholder='Password']");
    // Storing Login button locator
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    // Storing Logout locators
    By logoutButton = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutLink = By.xpath("//a[normalize-space()='Logout']");
    // Storing Login Panel locator
    By loginPanelText = By.xpath("//h5[normalize-space()='Login']");

    // Declaring all the methods
    // Method to verify Login Functionality
    public void userLoginVerification() {
        sendTextToElement(userName, "Admin"); // Sending Username to username field
        sendTextToElement(password, "admin123"); // Sending password to password filed
        clickOnTheElement(loginButton); // Clicking on the Login button
    }

    public boolean verifyingTheOrangeHRMLogo() { // Method to verify the Logo
        boolean isLogoPresent = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        return isLogoPresent;
    }

    public void loggingOut() throws InterruptedException { // Method to Logout
        clickOnTheElement(logoutButton);
        mouseHoverOnElement(logoutLink);
        clickOnTheElement(logoutLink);
        verifyTextDisplayed(loginPanelText, "Login");
    }
}
