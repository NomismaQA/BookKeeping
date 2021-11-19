package pages.Currency_Multi;

import pages.BasePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f300f504-ed0d-472f-ad55-cce8dc4ac4cc
@TestModellerModule(guid = "f300f504-ed0d-472f-ad55-cce8dc4ac4cc")
public class Rec_Bank_Spent_AMTverify extends BasePage
{
	
	public float dbamout,dbamout2,sum=0,dbamout3,RT,t;
    public String strColValue;
    public String temp;
    public float dramoutn,dramoutn2;
    int i;
    public String Credit,f,Debit,cramount,g,ft;
    String amt,cramoun;


	public Rec_Bank_Spent_AMTverify (WebDriver driver)
	{
		super(driver);
	}


	
	private By transactionno_clickElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl01_LnkTranDetail']");

	private By Credit_Amount1Elem = By.xpath("/html/body/form/div[3]/div[1]/div/table/tbody[2]/tr[1]/td[3]");

	private By Credit_Amount2Elem = By.xpath("/html/body/form/div[3]/div[1]/div/table/tbody[2]/tr[2]/td[3]");

	private By Debit_AmountElem = By.xpath("/html/body/form/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[2]");

	private By crossElem=By.xpath("//*[@id='EditPopUpClose']/span");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&menuid=0&mo=-1&st=&dd=TranNo&ac=3421070&filter=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&menuid=0&mo=-1&st=&dd=TranNo&ac=3421070&filter=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&menuid=0&mo=-1&st=&dd=TranNo&ac=3421070&filter=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&menuid=0&mo=-1&st=&dd=TranNo&ac=3421070&filter=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/BankTran.aspx?FYCode=117199&CompanyCode=16862&menuid=0&mo=-1&st=&dd=TranNo&ac=3421070&filter=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click transactionno_click
     * @name Click transactionno_click
     */
	public void Click_transactionno_click()
	{
        
		WebElement elem = getWebElement(transactionno_clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_transactionno_click", "Click_transactionno_click failed. Unable to locate object: " + transactionno_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_transactionno_click", "Click_transactionno_click failed. Unable to locate object: " + transactionno_clickElem.toString());

			Assert.fail("Unable to locate object: " + transactionno_clickElem.toString());
        }

		
		jsExec.executeScript("arguments[0].click()",elem);
		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_transactionno_click");

		TestModellerLogger.PassStep(m_Driver, "Click_transactionno_click");
	}


    
	/**
 	 * Click Debit_Amount
	 * @throws IOException 
     * @name Click Debit_Amount
     */
	public float Click_Debit_Amount() throws IOException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));
		   int dramount=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr/td[2]")).size();
			System.out.println("size:" +dramount);
			for(i=0;i<dramount-1;i++)
			{
		
			amt=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr["+(i+1)+"]/td[2]")).getText().replaceFirst("£","");
			g=amt.replace(",","");
			System.out.println("Dr Amount i+1 =" +g);
			  dramoutn=Float.parseFloat(g);
			  
				sum=sum+dramoutn;
				sum=(float) (Math.round(sum *100)/100.0);
				//m_Driver.switchTo().defaultContent();
				utilities.PassScreenshot.Getscreenshot11(g, "Multicurrency1");
			}

				
		System.out.println("sum =" +sum);
		return sum;
						
	}
	

		
		
		
	
    
	/**
	 * Click Credit_Amount1
	 * @throws IOException 
    * @name Click Credit_Amount1
    */
	public void Click_Credit_Amount1() throws IOException
	{
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));
				//WebDriverWait jsWait;
				//jsWait= new WebDriverWait(this.m_Driver, 10);   
				RT=sum;	
				//WebElement amt = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[3]")));
				WebElement amt=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[3]"));
					
				    cramount=amt.getText().replaceFirst("£","");
				    ft=cramount.replace(",","");
					dramoutn2=Float.parseFloat(ft);
					System.out.println("CR amoutn is  :" +dramoutn2);
					
					  SoftAssert sa=new SoftAssert();
					  sa.assertEquals(RT, dramoutn2,"eaual");
					  sa.assertAll();
				m_Driver.switchTo().defaultContent();
				
				utilities.PassScreenshot.Getscreenshot11(ft, "Multicurrency1");
	}
	public void Click_Credit_Amount4() throws IOException
	{
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));
				//WebDriverWait jsWait;
				//jsWait= new WebDriverWait(this.m_Driver, 10);   
				RT=sum;	
				//WebElement amt = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[3]")));
				WebElement amt=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[2]/td[3]"));
					
				    cramount=amt.getText().replaceFirst("£","");
				    ft=cramount.replace(",","");
					dramoutn2=Float.parseFloat(ft);
					System.out.println("CR amoutn is  :" +dramoutn2);
					
					  SoftAssert sa=new SoftAssert();
					  sa.assertEquals(RT, dramoutn2,"eaual");
					  sa.assertAll();
				m_Driver.switchTo().defaultContent();
				
				utilities.PassScreenshot.Getscreenshot11(ft, "Multicurrency1");
	}
	public void Click_cross()
	{
		WebElement elem = getWebElement(crossElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "crossElem", "Click_transactionno_click failed. Unable to locate object: " + crossElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "crossElem", "Click_transactionno_click failed. Unable to locate object: " + crossElem.toString());

			Assert.fail("Unable to locate object: " + crossElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_transactionno_click");

		TestModellerLogger.PassStep(m_Driver, "Click_transactionno_click");
	


	}
	
	
/*	public float verifyamount()
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));
	   int dramount=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr/td[2]")).size();
		System.out.println("size:" +dramount);
		for(i=0;i<dramount-1;i++)
		{
	
		amt=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr["+(i+1)+"]/td[2]")).getText().replaceFirst("�","");
		g=amt.replace(",","");
		System.out.println("Dr Amount i+1 =" +g);
		  dramoutn=Float.parseFloat(g);
			sum=sum+dramoutn;
			
		}

			
	System.out.println("sum =" +sum);
	return sum;
	}
	

public void verifyamount2()
{
		RT=sum;	
	   cramount=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[3]")).getText().replaceFirst("�","");
	   ft=cramount.replace(",","");
		dramoutn2=Float.parseFloat(ft);
		System.out.println("CR amoutn is  :" +dramoutn2);
		  SoftAssert sa=new SoftAssert();
		   sa.assertEquals(RT,dbamout2);
			sa.assertAll();
	
	}*/


}




	
			
	
	

	
	
	
	
	

			
	
				
		
		
