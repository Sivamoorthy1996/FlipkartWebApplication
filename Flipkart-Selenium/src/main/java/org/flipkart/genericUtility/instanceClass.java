package org.flipkart.genericUtility;

import org.flipkart.pom.AddToCartPage;
import org.flipkart.pom.LoginPage;
import org.flipkart.pom.ProductPage;
import org.flipkart.pom.SecondwidowProductPage;
import org.openqa.selenium.WebDriver;

public class instanceClass {
	public FileUtility fileutility;
	public WebDriverUtility webdriver;
	public JavaUtility javautility;
	public ExcelUtility excelutility;
	protected String url;
	protected String username;
	protected String password ;
	public String browser;
	protected long longTimeout;
	protected long longTimeout1;
	public int randomNumber;
	public LoginPage commonpage;
	public ProductPage productpage ;
	public SecondwidowProductPage secondpage;
	public AddToCartPage addtocartpage;
	public  WebDriver driver;
	public String EnterData;
	public String sheetName;

}
