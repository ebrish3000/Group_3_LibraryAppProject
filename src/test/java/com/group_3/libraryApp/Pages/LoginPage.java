package com.group_3.libraryApp.Pages;

import com.group_3.libraryApp.utilities.BrowserUtils;
import com.group_3.libraryApp.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement singInBtn;

    public void enterEmail(){
        BrowserUtils.enterText(emailInput, ConfigurationReader.getProperty("email"));
    }

    public void enterPassword(){
        BrowserUtils.enterText(passwordInput, ConfigurationReader.getProperty("password"));
    }

    public void login(){
        enterEmail();
        enterPassword();
        singInBtn.click();

    }


}
