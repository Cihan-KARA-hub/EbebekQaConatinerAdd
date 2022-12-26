package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Subscribe extends Base_Page{
    By SubLocator = By.id("btnSubmitLogin");
    public Subscribe(WebDriver driver) {
        super(driver);
    }

    public boolean isOnSubs() {
        return isDisplayed(SubLocator);
    }
}
