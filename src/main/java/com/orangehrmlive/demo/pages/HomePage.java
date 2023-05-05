package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // Storing all the locators
    // Storing the "search" bar locator
    By searchTextBox = By.xpath("//input[@placeholder='Search']");
    // Storing the Admin locator
    By adminElement = By.xpath("//span[normalize-space()='Admin']");
    // Storing the PIM locator
    By pIMElement = By.xpath("//span[normalize-space()='Admin']");
    // Storing the Leave locator
    By leaveElement = By.xpath("//span[normalize-space()='Admin']");
    // Storing the dashboard element
    By dashboardElement = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']");

    // Declaring all the methods
    public void clickOnAdmin() { // Method to click on Admin
        clickOnTheElement(adminElement);
    }

    public void clickOnSearchBar() { // Method to click on Search bar
        clickOnTheElement(searchTextBox);
    }

    public void clickOnPIM() { // Method to click on PIM
        clickOnTheElement(pIMElement);
    }

    public void clickOnLeave() { // Method to click on Leave
        clickOnTheElement(leaveElement);
    }

    public void clickOnDashboard() {
        clickOnTheElement(dashboardElement);
    }
}
