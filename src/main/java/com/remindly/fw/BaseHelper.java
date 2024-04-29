package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class BaseHelper{

    AppiumDriver driver;

    public BaseHelper(AppiumDriver driver) {
        this.driver = driver;
    }
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        if (text != null) {

            tap(locator);
            driver.findElement(locator).clear(); // очистить форму
            driver.findElement(locator).sendKeys(text);// ввести символы в форму

        }
        driver.navigate().back(); //убираем клавиатуру
    }

    public void tap(By locator) {
        driver.findElement(locator).click();
        //driver.findElement(By.cssSelector("[href='/login']")).click();
    }
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
