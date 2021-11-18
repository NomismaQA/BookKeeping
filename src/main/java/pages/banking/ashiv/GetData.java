package pages.banking.ashiv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class GetData extends BasePage
{
	

	public GetData(WebDriver driver) {
		super(driver);
	}
	

	HashMap<String, String>hm=new HashMap<String,String>();
	public static String out="";
	public static String out2="";
	
	public void GetTData() throws InterruptedException
	{
      
		List <WebElement> Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
		int size3=Pages.size();
		for(int l=1;l<size3-1;l++)
		{
			Pages=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
			m_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//WebElement pg =m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div[3]/div/ul/li"));
			jsExec.executeScript("arguments[0].scrollIntoView();",Pages.get(l));
			Thread.sleep(1000);
			Pages.get(l).click();


			System.out.println(l);
			List <WebElement>  dataa=m_Driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));
		int Size1=dataa.size();
			for(int t=0;t<Size1;t++)

			{

				String [] p=dataa.get(t).getText().split("'");
				HashMap<String, String>hm=new HashMap<String,String>();
				hm.put(p[1], p[3]);
				System.out.println(hm);
				for(Map.Entry<String , String>dd:hm.entrySet())
				{
				out=out+"~"+dd.getKey();
				out2=out2+"~"+dd.getValue();
				
				}
				
				
			}
System.out.println("Done ");


		}
	


	}
	public String out()
	{
		return out;
		
	}
	public String out2()
	{
		return out2;
		
	}
	
	
}
