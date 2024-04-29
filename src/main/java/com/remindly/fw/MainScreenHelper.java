package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainScreenHelper extends BaseHelper{


    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOmAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isNoReminderTitlePresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }

    public void tapOnKebabMenu() {
        tap(By.className("android.widget.ImageView"));
    }

    public void tapOnLicensesBtn() {
        tap(By.id("title"));
    }
}
