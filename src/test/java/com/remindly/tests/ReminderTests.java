package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        app.getMainScreen().confirm();

    }

    @Test
    public void addReminderTitilePositive(){
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderTitlePresent().contains("Holiday"));

    }


}
