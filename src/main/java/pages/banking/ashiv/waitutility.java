package pages.banking.ashiv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class waitutility extends BasePage
{

	public waitutility(WebDriver driver) {
		super(driver);
		
	}


static WebDriverWait wait1;

public static void VisibiltyElement(long time,WebElement ele)
{
	try 
	{
	wait1=new 	WebDriverWait(m_Driver, time);
	wait1.until(ExpectedConditions.visibilityOf(ele));
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
