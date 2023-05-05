package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage(); // Creating an object of LoginPage
    DashboardPage dashboardPage = new DashboardPage(); // Creating an object of DashboardPage

    @Test
    // Test to verify login functionality along with displaying of Dashboard text
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.userLoginVerification();
        dashboardPage.verifyDashboardText();
    }

    @Test
    // Test to verify the OrangeHRM Logo presence
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        loginPage.verifyingTheOrangeHRMLogo();
    }

    @Test
    // Test to verify the Logout functionality and verification of back to Login page flow
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        loginPage.userLoginVerification();
        loginPage.loggingOut();
    }
}
