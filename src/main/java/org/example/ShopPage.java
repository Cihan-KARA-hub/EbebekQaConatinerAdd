package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopPage extends Base_Page{
    By ShopAddLocator = By.id("addToCartBtn");
    public ShopPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnShopPage() {
    return isDisplayed(ShopAddLocator);
    }

    public void Select(int i) {
        // sikintili
        Click((By) select().get(i));

    }


    private List<WebElement> select() {
        return findAll(ShopAddLocator);
    }
}
