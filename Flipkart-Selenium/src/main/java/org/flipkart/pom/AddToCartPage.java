package org.flipkart.pom;

import org.flipkart.genericUtility.ThreadSafeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 
{
	public AddToCartPage()
	{
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}


	@FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
	private WebElement Expectedproduct;
	
	/*
	 * This method is used to get the expected product name
	 */
	public String ExpectedProduct()
	{
		return Expectedproduct.getText();
		
	}
}
