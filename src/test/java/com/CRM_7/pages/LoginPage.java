package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

    public class LoginPage {


        @FindBy(name = "USER_LOGIN")
        public WebElement Username;

        @FindBy(name = "USER_PASSWORD")
        public WebElement Password;

        @FindBy(css = ".login-btn")
        public WebElement loginBtn;

        public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }


        public void login(String username, String password) {
            Username.sendKeys("username");
            Password.sendKeys("password");
            loginBtn.click();

        }

    }


