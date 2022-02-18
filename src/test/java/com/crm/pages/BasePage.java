package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
   /* @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }*/

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "pagetitle")
    public WebElement activityStreamPageTitle;

    public void verifyPageTitle(String expectedTitle){
        BrowserUtils.waitFor(5);
        String actualTitle=activityStreamPageTitle.getText();
        System.out.println(expectedTitle+"expected");
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
