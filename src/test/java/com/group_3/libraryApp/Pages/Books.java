package com.group_3.libraryApp.Pages;

import com.group_3.libraryApp.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Books extends DashBoardPage {

    @FindBy(tagName = "h3")
    private WebElement pageSubtitle;

    @FindBy(xpath = "//a[@href='tpl/add-book.html']")
    private WebElement addBookBtn;

    @FindBy(xpath = "//tr[1]//td[1]")
    private  WebElement firstEditButton;



    public void clickOnFirstEditButton(){
        BrowserUtils.clickOnElement(addBookBtn);
    }

    public void clickOnAddBook(){
        BrowserUtils.clickOnElement(addBookBtn);
    }


    public String getPageSubtitle(){
        return pageSubtitle.getText();
    }

}
