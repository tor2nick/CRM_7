package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddingNewUsersStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User clicks Add more")
    public void user_clicks_Add_more() {

        activityStreamPage.addMORE.click();
        BrowserUtils.waitFor(2);

    }

    @When("User clicks an email from the pop-up window")
    public void user_clicks_an_email_from_the_pop_up_window() {

        activityStreamPage.Useremail.click();
        BrowserUtils.waitFor(2);
    }


    @Then("Email is displayed in the To: box")
    public void email_is_displayed_in_the_To_box() {

        String expectedEmail = "helpdesk99@cybertekschool.com";
        String actualEmail = activityStreamPage.Users.getText();

        Assert.assertEquals(expectedEmail,actualEmail);

    }
}


