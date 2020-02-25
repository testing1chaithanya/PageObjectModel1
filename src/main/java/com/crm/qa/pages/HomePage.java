package com.crm.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//span[@class='user-display']")
	// @CacheLookup
	// powerful approach, speed catching, stored in cache memory
	// dont use when Page refresh is present
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[@id='main-nav']//a[3]")
	WebElement contactsLink;
	
	@FindBy(xpath="//div[@id='main-nav']//a[5]")
	WebElement dealsLink;
	
	@FindBy(xpath="//div[@id='main-nav']//a[5]")
	WebElement tasksLink;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newContactLink;
	
	//Initializing the page objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink()
	{
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink()
	{
		contactsLink.click();
		newContactLink.click();
	}
	
}
