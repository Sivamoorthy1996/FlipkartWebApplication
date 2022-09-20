package org.flipkart.pom;

import org.flipkart.genericUtility.ThreadSafeClass;
import org.flipkart.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{

	public ProductPage()
	{
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini...']")
	private WebElement product;
	

	
	/*
	 * This method is used to get the data
	 */
	public  String GettingData(WebDriverUtility webdriver) 
	{  
	   webdriver.threadSleep();
		return product.getAttribute("title");
		  
	}
	
	/*
	 * This method is used to click on the product
	 */
	public void ClickOnProduct()
	{
		product.click();	
	}
	
}
