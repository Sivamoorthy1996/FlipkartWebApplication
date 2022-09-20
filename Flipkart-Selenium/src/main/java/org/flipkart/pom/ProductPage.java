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
	
	@FindBy(xpath = "//img[@class='_396cs4 _3exPp9']/ancestor::a[@class='_2rpwqI']/following-sibling::a[@class='s1Q9rs']")
	private WebElement product;
	
	@FindBy(xpath = "//span[@class='B_NuCI']")
	private WebElement productName;
	

	
	/*
	 * This method is used to get the data
	 */
	public  String GettingData(WebDriverUtility webdriver) 
	{  
	    webdriver.threadSleep();
		product.click();
		return product.getAttribute("title").trim();
		  
	}
	

	
}
