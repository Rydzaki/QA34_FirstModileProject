package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase{

    //confirm OK
    // verify text is displayed
    
    @BeforeMethod
    public void precondition(){
        app.getMainScreen().confirm();
    }
    
    @Test
    public void appLaunchTest(){
        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }
    
    @Test
    public void verifyLicenses(){
        app.getMainScreen().tapOnKebabMenu();
        app.getMainScreen().tapOnLicensesBtn();

        Assert.assertTrue(app.getLicenses().isLicensesDisplayed().contains("NOTICES FOR LIBRARIES"));
    }
    
    
    
}
