package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAnd extends Base_Page{
    By Locator = By.id("btnGoToShippingAddress");
    public ShopAnd(WebDriver driver) {
        super(driver);
    }

    public void end() {
        Click(Locator);
    }
}
