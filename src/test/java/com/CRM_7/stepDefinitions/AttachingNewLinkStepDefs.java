package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AttachingNewLinkStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User clicks link icon")
    public void user_clicks_link_icon() {

          activityStreamPage.linkIcon.click();
           BrowserUtils.waitFor(2);

    }

    @When("User inserts Link Text and Link URL")
    public void user_inserts_Link_Text_and_Link_URL() {

//        String expectedText = "Link text";
//        String actualText = activityStreamPage.linkText.getText();
//
//        Assert.assertEquals(expectedText,actualText);
        activityStreamPage.linkText.sendKeys("Link_Name");
        activityStreamPage.linkURL.sendKeys("https://qa.azulcrm.com/stream/");
        BrowserUtils.waitFor(2);

    }

  //  @Then("user should be able to Save")
  //  public void user_should_be_able_to_Save() {
        @When("And  user should be able to Save")
        public void and_user_should_be_able_to_Save() {
        activityStreamPage.saveLink.click();

        BrowserUtils.waitFor(3);

        Driver.get().switchTo().frame(activityStreamPage.messageBox);
        WebElement visibleLinktxt = Driver.get().findElement(By.xpath("//body[@contenteditable = 'true']"));

        String expectedText ="Link_Name";
        String actualText = visibleLinktxt.getText();

            Assert.assertEquals("not equal", actualText,expectedText);
            Driver.get().switchTo().defaultContent();

    }

    @Then("Link is displayed in the message box")
    public void link_is_displayed_in_the_message_box() {

        String expectedURL = "Link_Name";

       String actualURL = activityStreamPage.messageBox.getText();
        Assert.assertEquals(expectedURL,actualURL);

//        String actualText = visibleLinktxt.getText();
//
//        Assert.assertEquals("not equal", actualText,expectedText);
//        Driver.get().switchTo().defaultContent();
    }
}
