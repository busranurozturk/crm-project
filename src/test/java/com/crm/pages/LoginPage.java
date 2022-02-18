package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    //@FindBy(xpath = "(//input[@class='login-inp'])[1]")
    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;

   // @FindBy(xpath="//input[@name='USER_PASSWORD']")
    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='menu-item-link-text']")
    public WebElement activityStream;

    public void login(){
        BrowserUtils.waitFor(3);
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        //BrowserUtils.waitFor(5);
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();



    }

}
