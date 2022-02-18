package com.crm.step_definitions;

import com.crm.pages.ActivityStreamPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;


public class MessageStepDefs {

    @Given("the user click on Message")
    public void the_user_click_on_Message() {
         System.out.println(Driver.get().getCurrentUrl());
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().messagebutton.click();

    }

    @When("the user click on upload files icon")
    public void the_user_click_on_upload_files_icon() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().uploadFilesAndImagesIcon.click();
    }

    @Then("the user choose files or images from local disk")
    public void the_user_choose_files_or_images_from_local_disk() {
        BrowserUtils.waitFor(3);
        String filePath="C:/image.png";
        //Dynamic way
        //String path = System.getProperty("user.dir");
        //String fullpath= path+ "src/test/resources/Unit_1_Questions_Divided(1).docx";
        new ActivityStreamPage().sendFile(filePath);

    }

    @Then("User should be able to see selected files or images under Attached files and images")
    public void user_should_be_able_to_see_selected_files_or_images_under_Attached_files_and_images() {
        String uploadedFile ="image.png";
        new ActivityStreamPage().verifyUploadedFile(uploadedFile);

    }

    @When("the user click on Add more button")
    public void the_user_click_on_Add_more_button() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().addMore.click();
    }

    @Then("the user click on Employees and departments button")
    public void the_user_click_on_Employees_and_departments_button() {
        BrowserUtils.waitFor(10);
        new ActivityStreamPage().employeesDepartmentsButton.click();
    }

    @Then("the user click on {string} department")
    public void the_user_click_on_department(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().accountingDepartment.click();

    }

    @Then("the user click on All department and department employees to add all department add")
    public void the_user_click_on_All_department_and_department_employees_to_add_all_department_add() {

        BrowserUtils.waitFor(3);
        new ActivityStreamPage().selectAllAccountingDep.click();
    }

    @Then("the user click on {string} to add employee")
    public void the_user_click_on_to_add_employee(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().addEmployee.click();
    }

    @Then("the user should be able to see selected department and employee, in To input box")
    public void the_user_should_be_able_to_see_selected_department_and_employee_in_To_input_box() {
        BrowserUtils.waitFor(3);
    ActivityStreamPage activityStreamPage= new ActivityStreamPage();
    activityStreamPage.verifySelectedDepartment();
    BrowserUtils.waitFor(3);
    activityStreamPage.verifySelectedEmployee();
    }

    @When("the user click on the Link icon")
    public void the_user_click_on_the_Link_icon() {
    BrowserUtils.waitFor(3);
    new ActivityStreamPage().link.click();
    }

    @Then("the user write link text {string} in Text input box")
    public void the_user_write_link_text_in_Text_input_box(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().linkText.sendKeys(string);
    }

    @Then("the user write Link URL {string} in Link input box")
    public void the_user_write_Link_URL_in_Link_input_box(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().linkUrl.sendKeys(string);
    }

    @Then("the user click on save button")
    public void the_user_click_on_save_button() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().linkSaveButton.click();

    }
    @Then("the user should be able to see written link text {string} on message box")
    public void the_user_should_be_able_to_see_written_link_text_on_message_box(String string) {
        BrowserUtils.waitFor(3);
        String actual = new ActivityStreamPage().messageBoxIframeText();
        System.out.println(actual);
        Assert.assertTrue(actual.equals(string));//iframe
    }

    @When("the user click on the Insert video icon")
    public void the_user_click_on_the_Insert_video_icon() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().video.click();

    }

    @Then("enter the video URL {string} in Video source input box")
    public void enter_the_video_URL_in_Video_source_input_box(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().videoLink.sendKeys(string);
    }
    @Then("the user should be able to see attached video URL {string} on message box")
    public void the_user_should_be_able_to_see_attached_video_URL_on_message_box(String string) {
        BrowserUtils.waitFor(3);
        String actual = new ActivityStreamPage().messageBoxIframeText();
        System.out.println(actual);
        Assert.assertTrue(actual.equals(string));
    }


    @When("the user click on the Comma icon")
    public void the_user_click_on_the_Comma_icon() {
        BrowserUtils.waitFor(5);
        new ActivityStreamPage().commaIcon.click();
    }

    @Then("the user write quote {string}")
    public void the_user_write_quote(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().addQouteIframe(string);

    }
    @Then("the user should be able to see written quote {string} on message box")
    public void the_user_should_be_able_to_see_written_quote_on_message_box(String string) {
        BrowserUtils.waitFor(3);
        String actual = new ActivityStreamPage().getAddedQouteIframeText();
        Assert.assertEquals(string,actual);
    }

    @When("the user click on the Add mention icon")
    public void the_user_click_on_the_Add_mention_icon() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().addMention.click();
    }

    @Then("the user add mention from Recent or Employees and departments")
    public void the_user_add_mention_from_Recent_or_Employees_and_departments() {
        BrowserUtils.waitFor(3);
        ActivityStreamPage activityStreamPage= new ActivityStreamPage();
        activityStreamPage.employeesDepartmentsButton.click();
        BrowserUtils.waitFor(2);
        activityStreamPage.accountingDepartmentMention.click();
        BrowserUtils.waitFor(2);
        activityStreamPage.addEmployeeMention.click();
    }

    @Then("the user should be able to see added mention in To input box")
    public void the_user_should_be_able_to_see_added_mention_in_To_input_box() {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().verifyAddedEmployeeMention();
    }

    @When("the user write message {string} in text box")
    public void the_user_write_message_in_text_box(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().addMessageBoxIframe(string);
    }

    @Then("the user is click on the send button")
    public void the_user_is_click_on_the_send_button() {
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();
        new ActivityStreamPage().sendButton.click();

    }

    @Then("the user should be able to see that written {string} message on Activity Stream page")
    public void the_user_should_be_able_to_see_that_written_message_on_Activity_Stream_page(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().verifyMessageSent(string);
    }


}
