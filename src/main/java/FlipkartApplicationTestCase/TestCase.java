package FlipkartApplicationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;
import FlipkartApplication.flipkartRespository;


public class TestCase {
	
	WebDriver driver;
	
	flipkartRespository obj;

@BeforeMethod                         
	public void launchApplication() throws InterruptedException
	{
	    Thread.sleep(3000);
	    
		System.setProperty("webdriver.chrome.driver","G:\\chromdriver\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//Window maximize
		driver.manage().window().maximize();
		//Loading application URL
		driver.get("https://www.flipkart.com/");
		//Creating object for the flipkartRespository class
		obj = new flipkartRespository(driver);
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		//close browser
		driver.close();
	}
	
	@Test
	public void verifyCartPage() throws InterruptedException
	{
		Thread.sleep(5000);
		// Verifying the page title as per requirement
	    String originalTitle = driver.getTitle();
	    Assert.assertTrue(originalTitle.contains("Online Shopping Site"));
	    
	    //Close Login Popup window
	    obj.closePopupWindow(driver);
	    
		obj.mouseHover(driver);
		obj.mouseHoverOnMensTopwr(driver);
		obj.clickOnMensTshirt(driver);
		obj.clickOnBrandDropdown(driver);
		obj.clickFirstTshirt(driver);
		
	}
	
	@Test
	public void displayProductonPriceRange() throws InterruptedException
	{
		Thread.sleep(5000);
		//Close Login Popup window
		obj.closePopupWindow(driver);
		obj.mouseHover(driver);
		obj.mouseHoverOnMensTopwr(driver);
		obj.clickOnMensTshirt(driver);
		obj.selectPriceRange(driver,"300","1000");		
	}
}

