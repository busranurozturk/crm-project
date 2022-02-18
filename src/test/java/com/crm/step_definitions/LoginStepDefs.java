package com.crm.step_definitions;

import com.crm.pages.ActivityStreamPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefs {
    @Given("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        new LoginPage().login();
    }

    @Then("the user is on the {string} page")
    public void the_user_is_on_the_page(String string) {
        BrowserUtils.waitFor(3);
        new ActivityStreamPage().verifyPageTitle(string);
    }
}
