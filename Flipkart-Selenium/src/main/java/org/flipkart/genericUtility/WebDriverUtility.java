package org.flipkart.genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class contains all the webdriver actions
 * @author Sivasubramaniam.M
 *
 */
public final class WebDriverUtility {
	private WebDriver driver;


	/**
	 * This method is used to setup the driver instance
	 * @param browser
	 */
	public WebDriver setupDriver(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		default:
			System.out.println("The browser is not working");
			break;
		}
		return driver;
	}



	/**
	 * This method is used to maximize the browser
	 */
	public void maximizeBrowser() {

		driver.manage().window().maximize();
	}
	public void threadSleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to wait by using implicitwait
	 * @param longTimeout
	 */
	public void implicitWait(long longTimeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}
	
	
	
	/**
	 * This method is used to navigate the application
	 * @param url
	 */
	public void openApplication(String url) {
		driver.get(url);
	}
	

	/**
	 * This method is used to switch the window by using url or title
	 * @param partialText
	 * @param strategy
	 */
	public void SwitchWindow() {
		Set<String> windIds = driver.getWindowHandles();
		for(String id:windIds) {
			driver.switchTo().window(id);
		}
	}

	/**
	 * This method is used to close the browser
	 */
	public void closeBrowser() {
		driver.quit();
	}

	/**
	 * This method is used to close the tab
	 */
	public void closeTab() {
		driver.close();
	}
}
