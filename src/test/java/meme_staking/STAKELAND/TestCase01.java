package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestCase01 extends Meme_Staking_Launch_Quit {
	
    
	@Test
	
	public void sliderFunctionsSync() throws InterruptedException 
	
	{
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[role=\"slider\"]")));
		Thread.sleep(2000);
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PixelatedInput_hide-number-spinners___XwV5")));
		
		WebElement stakesElement = driver.findElement(By.xpath("(//span[@class='text-foreground __className_aad1d3 card-foreground z-10 text-2xl font-bold whitespace-nowrap'])[2]"));
		String initialStakesValue = stakesElement.getText().replaceAll(",", "");
		String defaultInputValue = "69696.69";
		
		String initialInputValue = inputField.getAttribute("value").replaceAll(",", "");
		
		//test default input value
		
		org.testng.Assert.assertEquals(Double.parseDouble(initialInputValue), Double.parseDouble(defaultInputValue));
		
		//test initial input value and Stakes Value
		org.testng.Assert.assertEquals(Double.parseDouble(initialInputValue), Double.parseDouble(initialStakesValue));
		

		// Move the slider to the extreme right
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(slider, 200, 0).perform();
		Thread.sleep(2000);
		String updatedInputValue = inputField.getAttribute("value").replaceAll(",", "");
		String updatedSpanValue = stakesElement.getText().replaceAll(",", "");
	
		Thread.sleep(2000);
		
		org.testng.Assert.assertEquals(Double.parseDouble(updatedInputValue), Double.parseDouble(updatedSpanValue));
		
		Thread.sleep(2000);

		actions.dragAndDropBy(slider, -200, 0).perform();
		
		updatedInputValue = inputField.getAttribute("value").replaceAll(",", "");
		updatedSpanValue = stakesElement.getText().replaceAll(",", "");
		
		Thread.sleep(2000);
		
		org.testng.Assert.assertEquals(Double.parseDouble(updatedInputValue), Double.parseDouble(updatedSpanValue));
	     

}
	

	}
