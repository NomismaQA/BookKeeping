package pages.banking.ashiv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class Find_Match extends BasePage
{

	public Find_Match(WebDriver driver) {
		super(driver);
		
	}

	public void Select_All0(String Alloc) throws InterruptedException
	{
		Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrDisplayRecords_ctl00_txtreconcileto-container']")).click();
		   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Alloc);
		   Thread.sleep(1000);
    	   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
    	   
    	   Thread.sleep(2000);
	
	
	
}
	public void Select_All02(String Alloc2) throws InterruptedException
	{
		Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrDisplayRecords_ctl00_txtreconcileto-container']")).click();
		   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Alloc2);
		   Thread.sleep(1000);
    	   m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
    	   
    	   Thread.sleep(2000);
	
	
	
}
}

