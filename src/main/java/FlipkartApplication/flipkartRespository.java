package FlipkartApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class flipkartRespository {
	

WebDriver driver;
	
	@FindBy(xpath="//div[@aria-label='Fashion']")
	@CacheLookup
	WebElement fashion;
	
	@FindBy(xpath = "//div[@class='_16rZTH']//a[contains(@href,'/clothing-and-accessories/')]")
	@CacheLookup
	WebElement mensTopWear;
	
	@FindBy(xpath  = "//div[@class='_31z7R_']//a[contains(@href,'/mens-tshirts/')]")
	@CacheLookup
	WebElement MensTshirt;
	
	@FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH']//div[contains(text(),'Brand')]")
	@CacheLookup
	WebElement brandDropdown;
	
	@FindBy(xpath  = "//span[@class='_30XB9F']")
	@CacheLookup
	WebElement popupWindow;
	
	@FindBy(xpath  = "//div[@class='_3FPh42']//div[@class='_2d0we9']//div[@class='_24_Dny']")
	@CacheLookup
	WebElement brandCheckbox;
	
	@FindBy(xpath  = "//div[@class='_1AtVbE col-12-12'][1]/div/div/div")
	@CacheLookup
	WebElement firstTshirt;
	
	@FindBy(xpath = "//div[@class='_1YAKP4']//select[@class='_2YxCDZ']")
	@CacheLookup
	WebElement minDropdown;
	
	@FindBy(xpath = "//div[@class='_3uDYxP']//select[@class='_2YxCDZ']")
	@CacheLookup
	WebElement maxDropdown;
	
	
	public flipkartRespository(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver,this);
	}
	public void mouseHover(WebDriver driver)
	{
				
		Actions obj = new Actions(driver);	
		obj.moveToElement(fashion).build().perform();
	}

	public void mouseHoverOnMensTopwr(WebDriver driver)
	{
		Actions obj = new Actions(driver);		
		obj.moveToElement(mensTopWear).build().perform();
	}
	public void clickOnMensTshirt(WebDriver driver)
	{
		MensTshirt.click();
	}
	public void clickOnBrandDropdown(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		brandDropdown.click();
		Thread.sleep(3000);
		brandCheckbox.click();
	}
	public void closePopupWindow(WebDriver driver)
	{
			popupWindow.click();
	}
	public void clickFirstTshirt(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		firstTshirt.click();
		
	}
	public void clickaddToCartButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(9000);
		System.out.println("Title of the Page " + driver.getTitle());
		
	}
	
	public void selectPriceRange(WebDriver driver, String min, String max) throws InterruptedException
	{
		Thread.sleep(9000);
		Select minDropDownoption = new Select(minDropdown);
		minDropDownoption.selectByValue(min);
		Thread.sleep(3000);
		Select dropDownoption = new Select(maxDropdown);
		dropDownoption.selectByValue(max);
		
	}

}


