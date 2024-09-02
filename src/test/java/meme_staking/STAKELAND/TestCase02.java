package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestCase02 extends Meme_Staking_Launch_Quit {
	@Test
	
public void slider_functions_move_change_value() throws InterruptedException 
	
	{
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[role=\"slider\"]")));
		Thread.sleep(2000);
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("PixelatedInput_hide-number-spinners___XwV5")));
		
		

		
		String initialInputValue = inputField.getAttribute("value").replaceAll(",", "");

		// Move the slider to the extreme right
		Actions actions = new Actions(driver);

		actions.dragAndDropBy(slider, 300, 0).perform();
		Thread.sleep(2000);
		String finalInputValue1 = inputField.getAttribute("value").replaceAll(",", "");


		org.testng.Assert.assertTrue(Double.parseDouble(finalInputValue1) > Double.parseDouble(initialInputValue));
		Thread.sleep(2000);

		actions.dragAndDropBy(slider, -200, 0).perform();
		
		String finalInputValue2 = inputField.getAttribute("value").replaceAll(",", "");
		
		Thread.sleep(2000);

		
		org.testng.Assert.assertTrue(Double.parseDouble(finalInputValue1) > Double.parseDouble(finalInputValue2));
	     

}

	}



