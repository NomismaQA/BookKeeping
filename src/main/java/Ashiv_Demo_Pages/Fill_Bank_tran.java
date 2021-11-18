package Ashiv_Demo_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pages.BasePage;

public class Fill_Bank_tran extends BasePage
{

	public Fill_Bank_tran(WebDriver driver) {
		super(driver);

	}
	int t=1;
	public void FillTrns() throws InterruptedException

	{
		GetData ob=new GetData(m_Driver);
		//HashMap<String, String>hm1=new HashMap<String, String>();
		String out=ob.out();
		String out2=ob.out2();
		String[]data1=out.split("~");
		String[]data2=out2.split("~");
		System.out.println(data1.length);
		System.out.println(data2.length);
	
		//hm1=ob.GetTData();
		//for(Map.Entry<String, String>kk:hm1.entrySet())
		{
			// out=out+"#"+kk.getKey();
			//System.out.println(kk.getKey());
		}
		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data1.length-1;p++)
		{
		
		
			for(int i=0;i<1;i++)
			{
				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
						//	List<	WebElement> date = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
						//		List<	WebElement> date=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
						//date.get(i).sendKeys("14/09/2021");
						//		Thread.sleep(4000);
				date.sendKeys("14/09/2021");
						//		Thread.sleep(4000);
						//System.out.println(date);

				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
						//List<	WebElement> Received=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[7]")));
						//		Thread.sleep(4000);
				Received.sendKeys("400");
						//			Thread.sleep(4000);
						//System.out.println(Received);
				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));
						//List<	WebElement> spent=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[8]")));
						//		Thread.sleep(4000);
				spent.sendKeys("1");
						//		Thread.sleep(4000);
						//System.out.println(spent);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
						//WebElement VatType=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptRecord$ctl0"+i+"$ddVATRate']"));
						//List<	WebElement> VatType=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[11]")));
						//		Thread.sleep(4000);
				Select dropdown = new Select(Vat);
						//		Thread.sleep(4000);
				dropdown.selectByVisibleText("Standard Rate");
						//		Thread.sleep(4000);
						//System.out.println(Vat);
						//List<WebElement>dis=m_Driver.findElements(By.xpath("//*[@id='tableID']/tbody/tr/td[5]"));
				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription\"]")));
						//Thread.sleep(4000);
				dist.sendKeys(data2[t]);
						//	Thread.sleep(4000);
				List<WebElement> Allot=m_Driver.findElements(By.xpath("//*[@id=\"tableID\"]/tbody/tr/td[14]/select"));


						//	Thread.sleep(4000);
				Select dropdown1 = new Select(Allot.get(i));
						//	Thread.sleep(4000);
				dropdown1.selectByVisibleText(data1[t]);
						//		Thread.sleep(4000);

				t++;
				m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnSave\"]")).click();
				Thread.sleep(2000);


			}
		}







	}
}
