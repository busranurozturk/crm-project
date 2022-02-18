package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityStreamPage extends BasePage {
    //@FindBy(id = "feed-add-post-form-tab-message")
    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement messagebutton;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMore;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement employeesDepartmentsButton;

    @FindBy(xpath = "(//div[contains(text(),'Accounting')])[2]")
    public WebElement accountingDepartment;

    @FindBy(xpath = "//div[contains(text(),'Accounting')]")
    public WebElement accountingDepartmentMention;


    //@FindBy(xpath = "(//div[@class='bx-finder-company-department-children bx-finder-company-department-children-opened'])[2]/a")
    @FindBy(xpath = "(//a[@href='#DR150'])[3]")
    public WebElement selectAllAccountingDep;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement addEmployee;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[1]")
    public WebElement addEmployeeMention;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public List<WebElement> addedDepAndEmpList;

    List<String> addedDepAndEmpListStr=BrowserUtils.getElementsText(addedDepAndEmpList);

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement link;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement linkSaveButton;

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement video;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoLink;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement commaIcon;

    @FindBy(xpath = "//*[@class='feed-add-post-form-but feed-add-mention']")
    public WebElement addMention;

    @FindBy(id="bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesAndImagesIcon;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement uploadFilesImages;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement uploadedFile;

    @FindBy(tagName = "iframe")
    public WebElement messageBoxIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement activityStreamBlog;

    public void sendFile(String filePath){
        BrowserUtils.waitFor(3);
        uploadFilesImages.sendKeys(filePath);
    }

    public void verifyUploadedFile(String fileName){
        BrowserUtils.waitFor(3);
        String actualUploadedFile = uploadedFile.getText();
        Assert.assertEquals(actualUploadedFile,fileName);
    }

    public void verifySelectedDepartment(){
        String actual = accountingDepartment.getText();
        Assert.assertTrue(addedDepAndEmpListStr.contains(actual));

    }

    public void verifySelectedEmployee(){
        String actual = addEmployee.getText();
        Assert.assertTrue(addedDepAndEmpListStr.contains(actual));

    }
    public  void addMessageBoxIframe(String string){
        Driver.get().switchTo().frame(messageBoxIframe);
        BrowserUtils.waitFor(3);
        messageBox.sendKeys(string);
    }


    public String messageBoxIframeText(){
        Driver.get().switchTo().frame(messageBoxIframe);
        BrowserUtils.waitFor(3);
       String messageBoxText= Driver.get().findElement(By.xpath("//body[@style='min-height: 184px;']/a")).getText();
       return messageBoxText;
    }

    public void addQouteIframe(String comment){
        Driver.get().switchTo().frame(messageBoxIframe);
        BrowserUtils.waitFor(3);
        WebElement quoteBox=Driver.get().findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
        quoteBox.sendKeys(comment);
    }

    public String getAddedQouteIframeText(){
       // Driver.get().switchTo().frame(messageBoxIframe);
        BrowserUtils.waitFor(3);
        WebElement quoteBox=Driver.get().findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
        return quoteBox.getText();
    }

    public void verifyMessageSent(String string){
        BrowserUtils.waitFor(3);
        String actualMessage = activityStreamBlog.getText();
        Assert.assertEquals(actualMessage,string);
    }

    public void verifyAddedEmployeeMention(){
        Driver.get().switchTo().frame(messageBoxIframe);
        BrowserUtils.waitFor(3);
        String mentionedEmployee= Driver.get().findElement(By.xpath("//span[@class='bxhtmled-metion']")).getText();
        System.out.println(mentionedEmployee);
        System.out.println(addedDepAndEmpListStr);
        Assert.assertTrue(addedDepAndEmpListStr.contains(mentionedEmployee));
    }





}
