package com.group_3.libraryApp.pages;

import com.group_3.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BooksPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_count")
    public WebElement userCount;

}
