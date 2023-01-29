package com.CRM_7.stepDefinitions;


import com.CRM_7.pages.LoginPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.ConfigurationReader;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

    public class Login_StepDefinitions {


        @Given("User logs in with valid credentials")
        public void user_logs_in_with_valid_credentials() {
            String url = ConfigurationReader.get("url");
            Driver.get().get(url);
            LoginPage loginPage = new LoginPage();
            loginPage.Username.sendKeys(ConfigurationReader.get("hr_username"));
            loginPage.Password.sendKeys(ConfigurationReader.get("hr_password"));
            loginPage.loginBtn.click();

            BrowserUtils.waitFor(2);

            String actualUrl = Driver.get().getCurrentUrl();
            System.out.println(actualUrl);
            String expectedUrl = "https://qa.azulcrm.com/stream/?login=yes";
            Assert.assertTrue(actualUrl.contains(expectedUrl));
        }


    }

