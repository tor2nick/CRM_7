package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickingMessageButtonStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("User clicks Message button on the top dashboard")
    public void user_clicks_Message_button_on_the_top_dashboard() {


        activityStreamPage.Message.click();
        BrowserUtils.waitFor(2);


    }

}
