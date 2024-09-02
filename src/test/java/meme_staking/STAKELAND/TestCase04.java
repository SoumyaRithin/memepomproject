package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCase04 extends Meme_Staking_Launch_Quit {
	
	@Test
	public void  Enabled_button_Base_button () throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement base = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/span[1]/div/div/div/span/div/span")));
	     base.click();
		
		
		
		
		
	WebElement closebutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[3]/button/div[3]"));

	Thread.sleep(2000);
	Assert.assertEquals(closebutton.isDisplayed(),true,"Disabled button Base_button");
	
	//should be redirect to MEME Staking Simulator page
	Thread.sleep(2000);
	closebutton.click();
	Thread.sleep(2000);
	Assert.assertEquals(base.isDisplayed(),true,"Disabled button Base_button");
		
			
		
	}

}
