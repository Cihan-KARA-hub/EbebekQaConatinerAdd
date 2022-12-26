package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContainerSee extends Base_Page{
    By ContinLocator = By.id("btnShowCart");
    public ContainerSee(WebDriver driver) {
        super(driver);
    }

    public void Selecet() {
        Click(ContinLocator);
    }
}
