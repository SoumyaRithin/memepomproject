package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase05 extends Meme_Staking_Launch_Quit{
	
	@Test
	public void  Enabled_NEW_TO_STAKELAND_button () throws InterruptedException
	{

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement NEW_TO_STAKELAND = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/button/div[3]")));
	     NEW_TO_STAKELAND.click();
		
	
	WebElement LGFbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[3]/button"));

	Thread.sleep(2000);
	Assert.assertEquals(LGFbutton.isDisplayed(),true,"Disabled NEW_TO_STAKELAND");

	Thread.sleep(2000);
	
    WebElement scrollableContainer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[2]/div"));
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    // Check if the first element is present
    WebElement firstElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]"));
    Assert.assertTrue(firstElement.isDisplayed(), "The first element is not visible.");

    // Simulate scrolling down within the scrollable container
    Actions actions = new Actions(driver);
    actions.moveToElement(scrollableContainer).sendKeys(scrollableContainer, Keys.PAGE_DOWN).perform();

    // Check if the second element is present
    WebElement secondElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]"));
    Assert.assertTrue(secondElement.isDisplayed(), "The second element is not visible.");

    // Simulate scrolling down to the maximum within the scrollable container
    actions.moveToElement(scrollableContainer).sendKeys(scrollableContainer, Keys.PAGE_DOWN).perform();

    // Check if the third element is present
    WebElement thirdElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[2]/div/div[3]"));
    Assert.assertTrue(thirdElement.isDisplayed(), "The third element is not visible.");

    LGFbutton.click();
    Thread.sleep(2000);
    WebElement main_page_checking = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/span[1]/div/div/div/span/div/span"));
    
    Assert.assertTrue(main_page_checking.isDisplayed(), "Not redirect to MEME Staking Simulator page");
	
	}

}



