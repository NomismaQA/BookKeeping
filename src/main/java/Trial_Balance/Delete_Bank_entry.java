package Trial_Balance;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementDisplayed;
import org.testng.Assert;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8f9d46b9-3632-494c-a82c-7edf342525d2
@TestModellerModule(guid = "8f9d46b9-3632-494c-a82c-7edf342525d2")
public class Delete_Bank_entry extends BasePage
{
	public Delete_Bank_entry(WebDriver driver)
	{
		super(driver);
		
	}


	
	
	
	


	public void delete_BankEntry() throws InterruptedException
	{
		WebElement Bank1=m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPHFilter_ddlAccount']"));
		Select sl=new Select(Bank1);
		sl.selectByVisibleText("Default Bank");
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']")).click();
		
		List<WebElement>list =m_Driver.findElements(By.xpath("//*[@id='myTable']/tbody/tr/td[12]/div/a"));
		
		int size=list.size();
		System.out.println("Bank Entry Size"+size);
		for(int i=0;i<size;i++)
		{
	     
			m_Driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[12]/div/a/i")).click();
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkDelete']")).click();
			Thread.sleep(2000);
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='DeleteModalFrame']")));
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnDelete']")).click();
			m_Driver.switchTo().defaultContent();
			Thread.sleep(4000);
		}
		
		
		
		System.out.println("allready clean");
		
		
	}
	public void Supplier() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//span[contains(text(), 'Expenditure')]")).click();
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr/td[13]/a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			//List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr/td[13]/a"));
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']/i")).click();
			//	Thread.sleep(2000);
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnDelete']")).click();
			//	Thread.sleep(2000);
		}
		
	}
	
	
	
	
	
	
}