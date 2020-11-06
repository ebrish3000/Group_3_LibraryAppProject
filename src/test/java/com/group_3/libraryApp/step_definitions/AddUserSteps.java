package com.group_3.libraryApp.step_definitions;


import com.group_3.libraryApp.pages.AddUserPage;
import com.group_3.libraryApp.pages.LoginPage;
import com.group_3.libraryApp.utilities.ConfigurationReader;
import com.group_3.libraryApp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        addUserPage.click_users_tab();
        addUserPage.click_addUser_button();
    }
    @Then("I should be abel to fill out the table to add new user")
    public void i_should_be_abel_to_fill_out_the_table_to_add_new_user() {
        addUserPage.new_user_information();
        addUserPage.click_on_saveChange();
    }
    @Then("Verify the user I added is in the list")
    public void verify_the_user_i_added_is_in_the_list() {
        String expectedCategory= "Ebrahim Emam";
        String actualCategory = Driver.getDriver().findElement(By.xpath("//*[@id=\"tbl_users\"]/tbody/tr[1]/td[3]")).getText();
        Assert.assertTrue("Expected and Actual Category Verification FAILED!",expectedCategory.equalsIgnoreCase(actualCategory));

    }
}

