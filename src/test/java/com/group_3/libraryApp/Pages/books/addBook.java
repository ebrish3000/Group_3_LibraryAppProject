package com.group_3.libraryApp.Pages.books;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addBook {
    @FindBy(xpath = "//*[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    private WebElement addBookBtn;
    @FindBy(xpath = "//*[@name='name']")
    private WebElement bookName;
    @FindBy(xpath = "//*[@name='isbn']")
    private WebElement ISBN;
    @FindBy(xpath = "//*[@name='year']")
    private WebElement year;
    @FindBy(xpath = "//input[@name='author']")
    private WebElement Author;
    @FindBy(xpath = "//select[@id='book_group_id']")
    private WebElement BookCategory;
    @FindBy(xpath = "//select[@id='book_group_id']/option[1]")
    private WebElement ActionAndAdventure;
    @FindBy(xpath = "//select[@id='book_group_id']/option[2]")
    private WebElement Anthology;
    @FindBy(xpath = "//select[@id='book_group_id']/option[3]")
    private WebElement Classic;
    @FindBy(xpath = "//select[@id='book_group_id']/option[4]")
    private WebElement ComicAndGraphicNovel;
    @FindBy(xpath = "//select[@id='book_group_id']/option[5]")
    private WebElement CrimeAndDetective;
    @FindBy(xpath = "//select[@id='book_group_id']/option[6]")
    private WebElement Drama;
    @FindBy(xpath = "//select[@id='book_group_id']/option[7]")
    private WebElement Fable;
    @FindBy(xpath = "//select[@id='book_group_id']/option[8]")
    private WebElement FairyTale;
    @FindBy(xpath = "//select[@id='book_group_id']/option[9]")
    private WebElement Fan_Fiction;
    @FindBy(xpath = "//select[@id='book_group_id']/option[10]")
    private WebElement Fantasy;

    @FindBy(xpath = "//*[@id='description']")
    private WebElement Description;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private WebElement SaveChanges;
    @FindBy(xpath = "//*[@class='btn default']")
    private WebElement Close;



}
