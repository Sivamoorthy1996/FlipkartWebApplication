package org.flipkart.genericUtility;

import org.flipkart.pom.AddToCartPage;
import org.flipkart.pom.LoginPage;
import org.flipkart.pom.ProductPage;
import org.flipkart.pom.SecondwidowProductPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends instanceClass

{
	@BeforeClass
	public void classSetup() 
	{
		//creating object for the class
		fileutility=new FileUtility();
		webdriver=new WebDriverUtility();
		javautility=new JavaUtility();
		excelutility=new ExcelUtility();


		ThreadSafeClass.setWebdriverutility(webdriver);
		ThreadSafeClass.setJavautility(javautility);

		//intialize data from property file
		fileutility.IntiallizePropertyFile(IPathContants.FLIPKARTPROPERTYFILEPATH);

		//get the control for the particular sheet in excel
		excelutility.intiallizeExcelFile(IPathContants.FLIPKARTEXCELFILEPATH);

		//Fatching the data from property
		url = fileutility.getDataFromProperty("url");
		username = fileutility.getDataFromProperty("username");
		password = fileutility.getDataFromProperty("password");
		browser = fileutility.getDataFromProperty("browser");
		String timeout = fileutility.getDataFromProperty("timeout");
		String timeout1 = fileutility.getDataFromProperty("timeout1");
		sheetName = fileutility.getDataFromProperty("sheetname");

		//Fatching Data from the excelFile
		EnterData = excelutility.getDataFromExcel(2, 1, sheetName);

		//converting string to long
		longTimeout = javautility.convertStringToLong(timeout);
		longTimeout1 = javautility.convertStringToLong(timeout1);


		//launching the browser based on browser key
		driver = webdriver.setupDriver(browser);
		//call the setter method from driver class in order to set driver instance
		ThreadSafeClass.setDriver(driver);


		//pre-setting for the browser
		webdriver.maximizeBrowser();
		webdriver.implicitWait(longTimeout);
		
		
	
		//Creating object for the common pom repo classes
		commonpage = new LoginPage();
		productpage = new ProductPage();
		secondpage = new SecondwidowProductPage();
		addtocartpage = new AddToCartPage();

		//navigating to the application
		webdriver.openApplication(url);
	}
	


	@AfterClass
	public void classTearDown() {

		//workbook close for saving the data in the excel
		excelutility.workbookClose();

		//closing the browser
	//	webdriver.closeBrowser();

	}


}
