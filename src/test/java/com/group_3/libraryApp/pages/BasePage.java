package com.group_3.libraryApp.pages;

import com.group_3.libraryApp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    @FindBy (xpath = "//span[@class='title']")
    protected WebElement pageSubTitle;
    @FindBy (xpath = "/a[@class='navbar-brand']")
    protected WebElement homePageTitleURL;
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public String getPageSubTitleText(){
        return pageSubTitle.getText().trim();
    }
    public String getHomePageTitleURL(){
        return homePageTitleURL.getText().trim();
    }

}
