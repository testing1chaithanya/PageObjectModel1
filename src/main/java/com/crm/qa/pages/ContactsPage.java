package com.crm.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//td[contains(text(),'Sparrow')]")
	WebElement selectContactsByName;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	
	
	//Initializing the Page Objects
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
	}
	
/*	public boolean selectContactsByName()
	{
		return selectContactsByName.isDisplayed();
	}*/
	
	
	
	public void createNewContact(String ftName, String ltName)
	{
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveBtn.click();
	}
	
}
