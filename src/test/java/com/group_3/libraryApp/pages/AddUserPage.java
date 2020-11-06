package com.group_3.libraryApp.pages;


import com.group_3.libraryApp.utilities.BrowserUtils;
import com.group_3.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage{
    public AddUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title'])[2]")
    private WebElement users;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    private WebElement addUser;


    @FindBy(name = "full_name")
    private WebElement fullNameInputBox;
    @FindBy(name = "password")
    private WebElement passwordInputBox;
    @FindBy(name = "email")
    private WebElement emailInputBox;
    @FindBy(id = "address")
    private WebElement addressInputBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveChangeButton;
    @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[3]")
    private WebElement emailOnTable1;


    public void click_users_tab(){
        users.click();
        BrowserUtils.wait(2);
    }public void click_addUser_button(){
        addUser.click();
        BrowserUtils.wait(2);
    }
    public void  new_user_information(){
        fullNameInputBox.sendKeys("Ebrahim Emam");
        BrowserUtils.wait(2);
        passwordInputBox.sendKeys("9910061933");
        BrowserUtils.wait(2);
        emailInputBox.sendKeys("ebrish@gmail.com");
        BrowserUtils.wait(2);
        addressInputBox.sendKeys("Seattle, WA");
        BrowserUtils.wait(2);
    }
    public void click_on_saveChange() {
        saveChangeButton.click();
    }


}
