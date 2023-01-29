package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//*[@title='Tasks']")
    public WebElement Tasks;

    @FindBy (xpath = "//*[@title='Chat and Calls']")
    public WebElement Chat_and_Calls;

    @FindBy (xpath = "//*[@title='Workgroups']")
    public WebElement WorkGroups;

    @FindBy (xpath = "//*[@title='Drive']")
    public WebElement Drive;

    @FindBy (xpath = "//*[@title='Calendar']")
    public WebElement Calendar;

    @FindBy (xpath = "//*[@title='Mail']")
    public WebElement Mail;

    @FindBy (xpath = "//*[@title='Contact Center']")
    public WebElement ContactCenter;

    @FindBy (xpath = "//*[@title='Time and Reports']")
    public WebElement TimeandReports;

    @FindBy (xpath = "//*[@title='Employees']")
    public WebElement Employees;

    @FindBy (xpath = "//*[@title='Services']")
    public WebElement Services;

    @FindBy (xpath = "//*[@title='Company']")
    public WebElement Company;

    @FindBy (id = "left-menu-more-btn")
    public WebElement More_LeftMenu;

    @FindBy (xpath = "//*[@title='Applications']")
    public WebElement Applications;

    @FindBy (xpath = "//*[@title='Workflows']")
    public WebElement Workflows;

    @FindBy (xpath = "//*[.='Message']")
    public WebElement Message;

    @FindBy (id = "feed-add-post-form-tab-tasks")
    public WebElement Task;

    @FindBy (id = "feed-add-post-form-tab-calendar")
    public WebElement Event;

    @FindBy (id = "feed-add-post-form-tab-vote")
    public WebElement Poll;

    @FindBy(id= "feed-add-post-form-link-text")
    public WebElement More2;














}
