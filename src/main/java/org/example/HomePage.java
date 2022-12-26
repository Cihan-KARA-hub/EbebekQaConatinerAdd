package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base_Page{
    By SearchLocator= By.id("txtSearchBox");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String s) {
        Type(SearchLocator,s);
    }
}
