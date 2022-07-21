package com.build.qa.build.selenium.pageobjects.homepage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class CategoryPage extends BasePage{
	
	By singlehandle= By.xpath("//a[contains(text(),'Single Handle')]");
	
	By proflo=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");
	
	By addcartbtn = By.xpath("//input[@class='btn__primary js-add-to-cart ']");
	By addPlusone=By.xpath("//button[@class='quantity__btn plus']");
	
	By cart = By.xpath("//li[@class='cart i-cart']");
	
	By addeditem=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");

	By addquantitytoCart=By.xpath("//div[@class='quantity__up quantity__button jq-qty-up']");
	
	By updateQuantitytocart=By.xpath("//input[@name='updateQuantity']");
	
	By brandName=By.xpath("//label[@class='fcheckbox']/..//div//p[text()='PROFLO®']");
	
	By finishName=By.xpath("//label[@class='fcheckbox']/..//div//p[text()='Chromes']");
	
	By BrandFilterName=By.xpath("//div[@class='rc-fg-option']//p[text()='PROFLO®']");
	
	By finishfiltername=By.xpath("//div[@class='rc-fg-option']//p[text()='Chromes']");
	
	By anyfiltercount=By.xpath("//div[@class='word total-record']//input[@id='totalNumRecs']"); //Delta+Chrome-233 chrome-2,495 ,Delta
	
	
	By removeFilterBrandname=By.xpath("//div[@class='rc-fg-option']//p[contains(text(),'Chromes')]/..//a");
	
	By removefilterFinish=By.xpath("//div[@class='rc-fg-option']//p[contains(text(),'PROFLO®')]/..//a");
	
	
	
	private By singleHandle1;
			
	public CategoryPage(WebDriver driver, Wait<WebDriver> wait) {
		
		super(driver, wait);
		singleHandle1 = By.xpath("//a[contains(text(),'Single Handle')]");

	}
	public boolean onCategoryPage() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(singleHandle1)) != null;
	}
	
	public boolean clickonAddtoCartButtonPlusOne() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(addPlusone)) != null;
	}
	
	
	public void geturl() throws InterruptedException 
	
	{
		driver.get("https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3");
		Thread.sleep(5000);
		
		
	}
	
	public void ClickOnSecondProduct() throws InterruptedException
	{
		/* explicit wait condition
	      WebDriverWait w = new WebDriverWait(driver,5);
	      // presenceOfElementLocated condition
	      w.until(ExpectedConditions.presenceOfElementLocated(singlehandle));*/

		driver.findElement(singlehandle).click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(proflo));
		driver.findElement(proflo).click();
		Thread.sleep(2000);
	
	}
	public void ClickOnAddToCartButton() throws InterruptedException
	
	{
		driver.findElement(addcartbtn).click();
		Thread.sleep(7000);
		driver.findElement(cart).click();
		Thread.sleep(2000);

		
		
		
	}
	public void verifyaddeditem()
	{
		String addeditems=driver.findElement(addeditem).getText();
		assertEquals(addeditems, "PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up");
		

	}
	public void ClickOnAddToCartButtonplusone() throws InterruptedException
	
	{
		driver.findElement(addPlusone).click();
	  Thread.sleep(20000);
		driver.findElement(addcartbtn).click();
		Thread.sleep(7000);
		driver.findElement(cart).click();
		Thread.sleep(2000);

		
		
		
	}

	
	public void verifyaddToquantityTwotoCart() throws InterruptedException
	{
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='quantityBtn']")).click();
		Thread.sleep(2000);
		String updatedQuantity=driver.findElement(By.xpath("//div[@class='quantityBtn']")).getText();
		System.out.println("updatedQuantity"+updatedQuantity);
		assertEquals(2,2);
		Thread.sleep(2000);


	}
	
	public void verifyaddToquantityThreetoCart() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(addPlusone).click();
	    Thread.sleep(20000);
		driver.findElement(addcartbtn).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		Thread.sleep(2000);
	    String updatedQuantity=driver.findElement(updateQuantitytocart).getText();
		assertEquals(3, 3);
		Thread.sleep(2000);


	}
	
   public void ScrollToView(By locator) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
		"arguments[0].scrollIntoView(true);" + "window.scrollBy(0,-175);", driver.findElement(locator));

		
}

		

		


		

	
	public void clickonbrandName() throws Throwable
	
	{
		
		/*
		 * WebElement element = driver.findElement(brandName);
		 * ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView(true);", element);
		 */
	   // ScrollToView(brandName);
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(brandName));
		Thread.sleep(500);
		driver.findElement(brandName).click();
		Thread.sleep(2000);
		
		
	}

	public void clickonfinishName() throws InterruptedException
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(BrandFilterName));
		driver.findElement(finishName).click();
		Thread.sleep(2000);
		
	}
	
	public void verifyisdisplayedbrandname() throws InterruptedException
	{
		driver.findElement(BrandFilterName).isDisplayed();
		Thread.sleep(2000);
		
	}
	public void verifyisdisplayedFinishname() throws InterruptedException
	{
		driver.findElement(finishfiltername).isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void verifybrandcount() throws InterruptedException
	{
		driver.findElement(removefilterFinish).click();
		Thread.sleep(2000);
		String expData=driver.findElement(anyfiltercount).getAttribute("value");
		String actData=driver.findElement(anyfiltercount).getAttribute("value");
		System.out.println("ExpectedData: " +expData + "actualData:"+actData);
		Thread.sleep(2000);
		assertEquals(expData, actData);
	
		
	}
	public void verifyFinishcount() throws InterruptedException
	{
		driver.findElement(removeFilterBrandname).click();
		Thread.sleep(2000);
		String expData=driver.findElement(anyfiltercount).getAttribute("value");
		String actData=driver.findElement(anyfiltercount).getAttribute("value");
		System.out.println("ExpectedData: "+expData + "actualData:"+actData);

		Thread.sleep(2000);
		assertEquals(expData, actData);
	
		
	}


}




