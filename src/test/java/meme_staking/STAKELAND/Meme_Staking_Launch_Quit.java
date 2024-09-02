package meme_staking.STAKELAND;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Meme_Staking_Launch_Quit {
WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void launch(String allbrowser) throws InterruptedException
	{
		
		if(allbrowser.equals("chrome"))
		{
			 driver =new ChromeDriver();	
		}
		if(allbrowser.equals("firefox"))
		{
			 driver =new FirefoxDriver();	
		}
		if(allbrowser.equals("edge"))
		{
			 driver =new EdgeDriver();	
		}
		
		//driver= new ChromeDriver();
		driver.get("https://www.stakeland.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement popupCloseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/button/div")));
	     popupCloseButton.click();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(4500);
		driver.quit();
	}
		
}

