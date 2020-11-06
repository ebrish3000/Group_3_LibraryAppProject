package com.group_3.libraryApp.step_definitions;

import com.group_3.libraryApp.pages.AddUserPage;
import com.group_3.libraryApp.pages.LoginPage;
import com.group_3.libraryApp.utilities.BrowserUtils;
import com.group_3.libraryApp.utilities.ConfigurationReader;
import com.group_3.libraryApp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddUserSteps {
    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage = new AddUserPage();

    @Given("I am on the Users page")
    public void i_am_on_the_users_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("librarian");
    }

    @When("I click to add user")
    public void i_click_to_add_user() {
        addUserPage.user.click();
        BrowserUtils.wait(2);
        addUserPage.addUser.click();
        BrowserUtils.wait(2);
    }
    @Then("I should be abel to fill out the table to add new user")
    public void i_should_be_abel_to_fill_out_the_table_to_add_new_user() {
        addUserPage.fullName.sendKeys("Ebrahim");
        BrowserUtils.wait(1);
        addUserPage.email.sendKeys("ebrish@gmail.com");
        BrowserUtils.wait(1);
        addUserPage.password.sendKeys("98910");
        BrowserUtils.wait(1);
        addUserPage.address.sendKeys("Seattle, WA");
        BrowserUtils.wait(1);
        addUserPage.saveChange.click();
        BrowserUtils.wait(1);
    }
    @Then("Verify the user I added is in the list")
    public void verify_the_user_i_added_is_in_the_list() {
        BrowserUtils.wait(2);
       Assert.assertTrue(addUserPage.nameOnTable.isDisplayed());
    }
}

