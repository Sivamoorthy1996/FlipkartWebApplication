package org.flipkart.pom;

import org.flipkart.genericUtility.ThreadSafeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(){
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}


	@FindBy(xpath = "//button[text()='✕']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;
	
	@FindBy(name = "q")
	private WebElement searchbutton;
	
	

	/*
	 * This method is used to Enter the data
	 */
	public void EnterData(String EnterData,String username,String password) {
		//cancelButton.click();
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		searchbutton.sendKeys(EnterData+Keys.ENTER);	
	}

}
