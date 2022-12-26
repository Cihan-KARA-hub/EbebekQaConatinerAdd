package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class Base_Page {
    WebDriver driver;
  public  Base_Page(WebDriver driver){

    this.driver=driver;
    }


    public WebElement find(By locator){
      return  driver.findElement(locator);
    }


    public List<WebElement> findAll(By locator){

    return  driver.findElements(locator);
    }


    public void Click(By locator){

    find(locator).click();
    }
    public void Enter(By locator){
    find(locator).sendKeys(Keys.ENTER);
    }

    public void Type(By locator ,String search){
    Click(locator);
    find(locator).sendKeys(search);
    find(locator).sendKeys(Keys.ENTER);

    }
    public boolean isDisplayed(By locator){
      return  find(locator).isDisplayed();

    }


}
