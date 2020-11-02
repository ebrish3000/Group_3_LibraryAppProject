package com.group_3.libraryApp.Pages;

import com.group_3.libraryApp.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{

    @FindBy(xpath = "//span[.='Dashboard']")
    private WebElement dashboard;

    @FindBy(xpath = "//a[@href='#users']")
    private WebElement usersLink;

    @FindBy(xpath = "//a[@href='#books']")
    private WebElement booksLink;

    public void clickOnDashBoard(){
        BrowserUtils.clickOnElement(dashboard);
    }
    public void clickOnUsersLink(){
        BrowserUtils.clickOnElement(usersLink);
    }
    public void clickOnBooksLink(){
        BrowserUtils.clickOnElement(booksLink);
    }


}
