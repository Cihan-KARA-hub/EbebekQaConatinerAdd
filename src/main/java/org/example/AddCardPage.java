package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCardPage extends Base_Page{
    By ContainerLocator = By.id("btnShowCart");
    public AddCardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnAddCard() {
 return  isDisplayed(ContainerLocator);
    }
}
