package utilities;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ClosePopup extends BasePage
{
	public ClosePopup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static boolean ValidateAndPopUp(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	         
	            WebElement ele = driver.findElement(By.xpath("//*[@id='511c883c-9080-9093-3c51-1bbcba61b65a']/div"));
	         
	          //*[@id='861c5dc3-bdbe-477f-97b2-c5b619f59cc2']
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            
	            ele.click();
	            System.out.println(true);
	            return true;
	            
	            
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
}
