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


    @Test
    public void addReminderWithDatePositiveTest(){
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future", 1, "MAY");
        app.getReminder().selectDate(0);
        app.getReminder().tapOnYear();
        app.getReminder().swipeToYear("future", "2025");
        app.getReminder().tapOnOk();

        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderDatePresent().contains("1/5/2025"));


    }

    @Test
    public void addReminderWithTimePositiveTest(){
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am",270, 940, 535, 1200);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderDatePresent().contains("9:30"));


    }


    
    @Test
    public void addReminderWithRepeatPositiveTest(){
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnSwitch();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderRepeatPresent().contains("off"));
    }

    @Test
    public void addReminderWithRepetitionIntervalPositiveTest(){
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapRepetitionIntervalField();
        app.getReminder().selectInterval("2");
        app.getReminder().tapOnOkRepetition();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderRepetitionIntervalPresent().contains("2"));
    }

    @Test
    public void addReminderWithTypeRepetitionPositiveTest(){
        String interval = "Month";
        app.getMainScreen().tapOmAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().selectRepetitionField();
        app.getReminder().selectTypeOfRepetitions(interval);
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isNoReminderRepetitionsPresent().contains(interval));
    }
    




}
