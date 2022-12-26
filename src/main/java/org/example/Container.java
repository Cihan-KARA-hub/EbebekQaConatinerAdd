package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Container extends Base_Page{
    By Locator = By.id("btnGoToShippingAddress");
    public Container(WebDriver driver) {
        super(driver);
    }

    public boolean isOnConatiner() {
        return isDisplayed(Locator);
    }
}
