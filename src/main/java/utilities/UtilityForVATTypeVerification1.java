package utilities;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class UtilityForVATTypeVerification1 extends BasePage
{
	//System.out.println("HIIIIIIII");
    
	public UtilityForVATTypeVerification1(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static void verification1(WebDriver driver) throws InterruptedException
	{
		int count;
		String out="";
	//WebElement elem = getWebElement(VerifyVATTypeElem);


		//String str = elem.getText();
		String str= driver.findElement(By.xpath("//DIV[@class='alert alert-success']")).getText();
		
		System.out.println("str");
		String str1[] = str.split(" ");
		//elem.click();
		String recno = str1[2];
		java.util.List<WebElement> list = new ArrayList<WebElement>();
		list = driver.findElements(By .xpath("//*[@id=\"ctl00_cPH_filtrec\"]/div/div/table"));
		for(WebElement dd:list)
		{
			count = list.size();
			out = dd.getText();
			System.out.print("dddd"+out);
		
		
		for(int i=1; i<count-1; i++)
		{
			
			if(out==recno)
			{
				driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_filtrec\"]/div/div/table/tbody/tr[i]/td[2]")).click();
				Thread.sleep(2000);
			}
		}
		}
		System.out.println("HIggdfIIIIIII");
		
		
	}

}
