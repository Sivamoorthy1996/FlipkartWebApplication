package org.flipkart.pom;

import org.flipkart.genericUtility.ThreadSafeClass;
import org.flipkart.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondwidowProductPage 
{
	public SecondwidowProductPage()
	{
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	/*
	 * This method is used to click on the add to cart
	 */
	public AddToCartPage ClickOnAddToCart(WebDriverUtility webdriver)
	{   webdriver.SwitchWindow();
		addToCart.click();
	    return new AddToCartPage();
		
	}
}
