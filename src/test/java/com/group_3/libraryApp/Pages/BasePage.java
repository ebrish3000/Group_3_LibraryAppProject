package com.group_3.libraryApp.Pages;

import com.group_3.libraryApp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public String getPageTitle(){
        return Driver.getDriver().getTitle();
    }

}
