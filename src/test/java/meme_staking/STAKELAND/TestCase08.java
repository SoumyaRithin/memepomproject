package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase08 extends Meme_Staking_Launch_Quit  {
	@Test
	public void CONNECT_YOUR_WALLET_button () throws InterruptedException
	{
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
	   WebElement WALLET_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/button/div[3]")));
	   
		
	   
	   WALLET_button.click();
	   Thread.sleep(2000);
	 
	   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement connectwallet_close_button = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='Close']")));
	   connectwallet_close_button.click();
	   
	  
	   WebElement main_page_checking = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/span[1]/div/div/div/span/div/span"));
	    
	    Assert.assertTrue(main_page_checking.isDisplayed(), "Not redirect to MEME Staking Simulator page");
	    
	   
	    
	    
	    
	    
	    
	}}

