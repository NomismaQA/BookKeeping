package pages.banking.ashiv;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BankRule.BankRuleCr_ReducedRte_Both347;
import pages.BasePage;

public class Fill_Bank_tran extends BasePage
{

	public Fill_Bank_tran(WebDriver driver) {
		super(driver);

	}
public static String OutInv="";
public static String OutInvCr="";
public static String OutInvP="";
public static String OutInvPCr="";
public static String OutInvJou="";
public static String OutInvJouCr="";

	public void FillTrns() throws InterruptedException

	{
		int t=1;
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
				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				//	List<	WebElement> date = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
				//		List<	WebElement> date=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
				//date.get(i).sendKeys("14/09/2021");
				//		Thread.sleep(4000);
				date.sendKeys("14/09/2021");
				//		Thread.sleep(4000);
				//System.out.println(date);

				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
				//List<	WebElement> Received=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[7]")));
				//		Thread.sleep(4000);
				Received.sendKeys("400");
				//			Thread.sleep(4000);
				//System.out.println(Received);
				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));
				//List<	WebElement> spent=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[8]")));
				//		Thread.sleep(4000);
				spent.sendKeys("0");
				//		Thread.sleep(4000);
				//System.out.println(spent);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				//WebElement VatType=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptRecord$ctl0"+i+"$ddVATRate']"));
				//List<	WebElement> VatType=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[11]")));
				//		Thread.sleep(4000);
				Select dropdown = new Select(Vat);
				//		Thread.sleep(4000);
				dropdown.selectByVisibleText("Standard Rate");
				//		Thread.sleep(4000);
				//System.out.println(Vat);
				//List<WebElement>dis=m_Driver.findElements(By.xpath("//*[@id='tableID']/tbody/tr/td[5]"));
				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl00_txtDescription\"]")));
				//Thread.sleep(4000);
				dist.sendKeys(data2[t]);
				//	Thread.sleep(4000);
				//				List<WebElement> Allot=m_Driver.findElements(By.xpath("//*[@id=\"tableID\"]/tbody/tr/td[14]/select"));
				//
				//
				//				//	Thread.sleep(4000);
				//				Select dropdown1 = new Select(Allot.get(i));
				//				//	Thread.sleep(4000);
				//				dropdown1.selectByVisibleText(data1[t]);
				//				//		Thread.sleep(4000);

				t++;
				m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnSave\"]")).click();
				Thread.sleep(2000);


			}
		}








	}

	public void Fill_Recnl_Bank_STD_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Stdard_Both ob=new BankRuleCr_Stdard_Both(m_Driver);

		String out2=ob.out2_Std_Both();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);


				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Standard Rate");

				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}

	public void Fill_Recnl_Bank_NV_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_NoVat_Both ob=new BankRuleCr_NoVat_Both(m_Driver);

		String out2=ob.out2_NoVat_Both();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);

				t++;

				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);


				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("No VAT");
//
//				//Thread.sleep(2000);




				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);

				System.out.println(t);







			}
		}
	}


	public void Fill_Recnl_Bank_OutS_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Outofscope_Both ob=new BankRuleCr_Outofscope_Both(m_Driver);

		String out2=ob.out2_Outs_Both();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);


    if(t<=152)
    {
	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


	Received.sendKeys("400");
	Received.sendKeys(Keys.TAB);

    }
				
    if(t>=153)
    {
    	WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

		spent.sendKeys("400");
		spent.sendKeys(Keys.TAB);
    }

			
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Out of Scope");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}

	public void Fill_Recnl_Bank_Expt_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Expt_Both ob=new BankRuleCr_Expt_Both(m_Driver);

		String out2_Expt_Both=ob.out2_Expt_Both();

		String[]data2=out2_Expt_Both.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));

//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Exempt");
//
//
//				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}
	public void Fill_Recnl_Bank_RR_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_ReducedRte_Both ob=new BankRuleCr_ReducedRte_Both(m_Driver);

		String out2=ob.out2_RR_Both();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



			


				
					WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
					Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


					Received.sendKeys("400");
					Received.sendKeys(Keys.TAB);

					
				 
				 
				    //	WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

					//	spent.sendKeys("400");
					//	spent.sendKeys(Keys.TAB);
				   
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Reduced Rate");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}

	public void Fill_Recnl_Bank_ZR_Both() throws InterruptedException

	{
		int t=1;
		BankRuleCr_ZroRate_Both ob=new BankRuleCr_ZroRate_Both(m_Driver);

		String out2=ob.out2_ZR_Both();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Zero Rate");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);
			}
		}
	}
	
	public void Fill_Recnl_Bank_STD_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Stdard_Credit ob=new BankRuleCr_Stdard_Credit(m_Driver);

		String out2=ob.out2_Std_CR();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Standard Rate");
//
//				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}

	public void Fill_Recnl_Bank_RR_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Reducedrte_Credit ob=new BankRuleCr_Reducedrte_Credit(m_Driver);

		String out2=ob.OUT2_RR_CR();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Reduced Rate");

				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}
	public void Fill_Recnl_Bank_NoVat_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_NoVat_Crdit ob=new BankRuleCr_NoVat_Crdit(m_Driver);

		String out2=ob.out2_NoVat_Cr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("No VAT");

				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}
	public void Fill_Recnl_Bank_ZR_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_ZroRate_Credit ob=new BankRuleCr_ZroRate_Credit(m_Driver);

		String out2=ob.out2_Zr_Cr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Zero Rate");

				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}
	public void Fill_Recnl_Bank_Expt_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Expt_Crdit ob=new BankRuleCr_Expt_Crdit(m_Driver);

		String out2=ob.Out2_Expt_Cr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Exempt");
//
//				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}
	public void Fill_Recnl_Bank_OutS_CR() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Outofscope_Crdit ob=new BankRuleCr_Outofscope_Crdit(m_Driver);

		String out2=ob.out2_OutS_CR();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


			//	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


			//	Received.sendKeys("400");
			//	Received.sendKeys(Keys.TAB);


				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				spent.sendKeys("400");
				spent.sendKeys(Keys.TAB);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Out of Scope");
//
//				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}

	public void Fill_Recnl_Bank_STD_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Stdard_Debit ob=new BankRuleCr_Stdard_Debit(m_Driver);

		String out2=ob.out2_Stand_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);


				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);


				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
//				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Standard Rate");
//
//				//Thread.sleep(2000);



				t++;

				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();

				System.out.println(t);
				Thread.sleep(4000);
				



			}
		}
	}

	public void Fill_Recnl_Bank_ZR_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_ZroRate_Debit ob=new BankRuleCr_ZroRate_Debit(m_Driver);

		String out2=ob.out2_ZR_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


			for(int i=0;i<1;i++)
			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("14/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);

				t++;

				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);


				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Zero Rate");
//
//				//Thread.sleep(2000);




				WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);

				System.out.println(t);







			}
		}
	}


	public void Fill_Recnl_Bank_OutS_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Outofscope_Debit ob=new BankRuleCr_Outofscope_Debit(m_Driver);

		String out2=ob.out2_Outs_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);


  
    
	WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
	Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


	Received.sendKeys("400");
	Received.sendKeys(Keys.TAB);

    
				
   
    
    	//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

	//	spent.sendKeys("400");
		//spent.sendKeys(Keys.TAB);
    

			
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Out of Scope");
//
//
//				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}

	public void Fill_Recnl_Bank_Expt_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Expt_Debit ob=new BankRuleCr_Expt_Debit(m_Driver);

		String out2=ob.out2_Expt_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
				
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Exempt");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}
	public void Fill_Recnl_Bank_RR_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_Reducedrte_Debit ob=new BankRuleCr_Reducedrte_Debit(m_Driver);

		String out2=ob.out2_RR_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



			


				  
					WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
					Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


					Received.sendKeys("400");
					Received.sendKeys(Keys.TAB);

				    
								
				    
				    
				    //	WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

					//	spent.sendKeys("400");
					//	spent.sendKeys(Keys.TAB);
				    
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("Reduced Rate");
//
//
//				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);





			}
			}
		}
	

	public void Fill_Recnl_Bank_NOVat_Dr() throws InterruptedException

	{
		int t=1;
		BankRuleCr_NoVat_Debit ob=new BankRuleCr_NoVat_Debit(m_Driver);

		String out2=ob.out2_NV_Dr();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


				Received.sendKeys("400");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
//				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
//
//				//Thread.sleep(2000);
//				Select dropdown = new Select(Vat);
//
//				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);
			}
		}
	}
	

	public void Fill_Recnl_Bank_Recon() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));


				Received.sendKeys("3000");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
				
//				String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInv=Out2[0];
//			        
//					System.out.println(OutInv);
//				
				}
	public String OutInv ()
	{
		
		return OutInv;
		
	}
	public void Fill_Recnl_Bank_Recon1() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



//				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//
//
//				Received.sendKeys("1200");
//				Received.sendKeys(Keys.TAB);



				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));

				spent.sendKeys("500");
				Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
//				String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInvCr=Out2[0];
//			        
//					System.out.println(OutInvCr);
				
				}
	public String OutInvCr ()
	{
		
		return OutInvCr;
		
	}
		
	
	public void Fill_Recnl_Bank_ReconParAmount() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));


				Received.sendKeys("2000");
				Received.sendKeys(Keys.TAB);



				//WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

				//spent.sendKeys("0");
				//Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
//				String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInvP=Out2[0];
//			        
//					System.out.println(OutInvP);
				
				}
	public String OutInvP ()
	{
		
		return OutInvP;
		
	}
		
		
	
	public void Fill_Recnl_Bank_Recon_PCR_Amout() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



//				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//
//
//				Received.sendKeys("1200");
//				Received.sendKeys(Keys.TAB);



				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));

				spent.sendKeys("300");
				Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
//				String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInvPCr=Out2[0];
//			        
//					System.out.println(OutInvPCr);
				
				}
	public String OutInvPCr ()
	{
		
		return OutInvPCr;
		
	}
		
		
	
	public void Fill_Recnl_Bank_Recon_Jou() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));


				Received.sendKeys("2000");
				Received.sendKeys(Keys.TAB);



//				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));
//
//				spent.sendKeys("1000");
//				Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
//				String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInvJou=Out2[0];
//			        
//					System.out.println(OutInvJou);
				
				}
	public String OutInvJou ()
	{
		
		return OutInvJou;
		
	}
	public void Fill_Recnl_Bank_Recon_Jou1() throws InterruptedException

	{
	




		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


	

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));

				date.sendKeys("04/10/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));


				dist.sendKeys("Testing");
				dist.sendKeys(Keys.TAB);



//				WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//				Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
//
//
//				Received.sendKeys("1200");
//				Received.sendKeys(Keys.TAB);



				WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtAmount']")));

				spent.sendKeys("300");
				Thread.sleep(2000);
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("No VAT");


				//Thread.sleep(2000);



			

				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
				Thread.sleep(1000);
				Save.click();
				Thread.sleep(4000);


				System.out.println("BankTrnsDone");
				//String Out=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div")).getText();
//				 String out[]=Out.split("#");
//					String o=out[1];
//					String[] Out2=o.split(" ");
//					OutInvJouCr=Out2[0];
//			        
//					System.out.println(OutInvJouCr);
				
				}
	public String OutInvJouCr ()
	{
		
		return OutInvJouCr;
		
	}
	
	public void Fill_Recnl_Bank_RR_Both347() throws InterruptedException

	{
		int t=1;
		BankRuleCr_ReducedRte_Both347 ob=new BankRuleCr_ReducedRte_Both347(m_Driver);

		String out2=ob.out2_RR_Both2();

		String[]data2=out2.split("~");

		System.out.println(data2.length);





		WebElement Select_Bank_Name=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']"));
		Select dropdown3 = new Select(Select_Bank_Name);
		WebElement Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

		dropdown3.selectByVisibleText("AA@Ashiv");


		for(int p=0;p<data2.length-1;p++)
		{



			for(int i=0;i<1;i++)

			{

				WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
				date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));

				date.sendKeys("25/09/2021");
				date.sendKeys(Keys.TAB);
				Thread.sleep(4000);


				WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));
				dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription']")));


				dist.sendKeys(data2[t]);
				dist.sendKeys(Keys.TAB);



			


				
					WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
					Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));


					Received.sendKeys("400");
					Received.sendKeys(Keys.TAB);

					
				 
				 
				    //	WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));

					//	spent.sendKeys("400");
					//	spent.sendKeys(Keys.TAB);
				   
				WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
				Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));

				//Thread.sleep(2000);
				Select dropdown = new Select(Vat);

				dropdown.selectByVisibleText("Reduced Rate");


				//Thread.sleep(2000);



				t++;


				Save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));

				Save.click();
				Thread.sleep(4000);


				System.out.println(t);






			}
		}
	}

		
	

}