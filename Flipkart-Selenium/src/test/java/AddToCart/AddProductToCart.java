package AddToCart;

import org.flipkart.genericUtility.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCart extends BaseClass
{
    @Test
	public void addToCart() 
	{
	    commonpage.EnterData(EnterData,username,password);
	    String ActualProductName = productpage.GettingData(webdriver);
	    String ExpectedProductName =secondpage.ClickOnAddToCart(webdriver).ExpectedProduct();
	    Assert.assertEquals(ExpectedProductName, ActualProductName);
	    
	    
	}
}
