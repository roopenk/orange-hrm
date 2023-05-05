package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    // Storing Dashboard text locator
    By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");

    public void verifyDashboardText() { // Method to Verify the "Dashboard" text
        verifyTextDisplayed(dashboardText, "Dashboard");
    }
}
