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
	         
	            WebElement ele = driver.findElement(By.xpath("//*[@id='11394c15-ac28-4325-a3b7-d45ca1f10148']"));
	         
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
