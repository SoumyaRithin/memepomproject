package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCase03 extends Meme_Staking_Launch_Quit{
	@Test
public void slider_functions_balance_stake_element() throws InterruptedException 
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[role=\"slider\"]")));
		Thread.sleep(2000);
		
		WebElement maxButton = driver.findElement(By.cssSelector("span.__className_aad1d3.text-sm.text-primary.font-medium"));

        // Click the "MAX" button
        maxButton.click();
        Thread.sleep(2000);
		
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PixelatedInput_hide-number-spinners___XwV5")));
		String maxStakesValue = inputField.getAttribute("value").replaceAll(",", "");
        
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, -500, 0).perform();
		Thread.sleep(2000);
		WebElement wastedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='self-center text-sm font-medium text-foreground']")));
		String currentWastedValue = wastedValue.getText().replaceAll(",", "");
		
		inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PixelatedInput_hide-number-spinners___XwV5")));
		String updatedInputValue = inputField.getAttribute("value").replaceAll(",", "");

		double wastedValueDouble = Double.parseDouble(maxStakesValue) - Double.parseDouble(updatedInputValue);
		String checkWastedValue = Double.toString(wastedValueDouble);
		Assert.assertEquals(Double.parseDouble(currentWastedValue), Double.parseDouble(checkWastedValue));
		
		
	     

}}
