package com.group_3.libraryApp.step_definitions;

import com.group_3.libraryApp.pages.BooksPage;
import com.group_3.libraryApp.pages.LoginPage;
import com.group_3.libraryApp.utilities.BrowserUtils;
import com.group_3.libraryApp.utilities.ConfigurationReader;
import com.group_3.libraryApp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchBookStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();
    @Given("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("librarian");
    }
    @And("user clicks {string} tab")
    public void user_clicks_tab(String string) {
        BrowserUtils.wait(2);
        booksPage.click_books_tab();
    }
    @And("user enters book name")
    public void user_enters_book_name() {
        booksPage.search_book_by("atsewoch");
    }
    @Then("selection of the books related to that name appears")
    public void selection_of_the_books_related_to_that_name_appears() {
    }
    @And("user enters book author")
    public void user_enters_book_author() {
        booksPage.search_book_by("Ahmedin");
    }
    @Then("selection of the books related to that author appears")
    public void selection_of_the_books_related_to_that_author_appears() {
        BrowserUtils.wait(2);
        String expectedCategory= "Action and Adventure";
        String actualCategory = Driver.getDriver().findElement(By.xpath("//td[.='Action and Adventure']")).getText();
        Assert.assertTrue("Expected and Actual Category Verification FAILED!",expectedCategory.equalsIgnoreCase(actualCategory));
    }
    @When("user clicks and selects the Book Categories dropdown")
    public void user_clicks_and_selects_the_book_categories_dropdown() {
        BrowserUtils.wait(3);
        booksPage.click_books_tab();
        booksPage.clickAndSelectBookCategories();
        BrowserUtils.wait(2);
    }
    @Then("user should be able to see all Romance books")
    public void user_should_be_able_to_see_all_romance_books() {
        String expectedCategory= "Romance";
        String actualCategory = Driver.getDriver().findElement(By.xpath("(//tbody/tr/td[5])[1]")).getText();
        Assert.assertTrue("Expected and Actual Category Verification FAILED!",expectedCategory.equalsIgnoreCase(actualCategory));
    }
}
