package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendingMessageStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User writes sample text in the message box")
    public void user_writes_sample_text_in_the_message_box() {
        BrowserUtils.waitFor(2);
       Driver.get().switchTo().frame(activityStreamPage.messageBox);

        activityStreamPage.textField.sendKeys("sample text");
        Driver.get().switchTo().defaultContent();

    }

    @When("Clicks Send Button")
    public void clicks_Send_Button() {
        BrowserUtils.waitFor(2);
       activityStreamPage.sendBtn.click();

    }


    @Then("Message is sent")
    public void messageIsSent() {
        String expected =  "sample text";
        String actual = activityStreamPage.activityHistory.getText();

        Assert.assertEquals("no match",expected,actual);

    }
}



