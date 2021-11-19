package pages.Currency_Multi;

import pages.BasePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
public class FlatRate_Bank_AMTverify extends BasePage
{
	public float dbamout,dbamout2,sum=0,dbamout3;
     public String strColValue;
     public String temp;

     public String Credit,f,Debit,g,fy;



	public FlatRate_Bank_AMTverify (WebDriver driver)
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

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_transactionno_click");

		TestModellerLogger.PassStep(m_Driver, "Click_transactionno_click");
	}

     
	/**
 	 * Click Credit_Amount1
	 * @throws IOException 
     * @name Click Credit_Amount1
     */
	public Float Click_Credit_Amount1() throws IOException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		//WebElement elem = getWebElement(Credit_Amount1Elem);

		/*if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Credit_Amount1", "Click_Credit_Amount1 failed. Unable to locate object: " + Credit_Amount1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Credit_Amount1", "Click_Credit_Amount1 failed. Unable to locate object: " + Credit_Amount1Elem.toString());

			Assert.fail("Unable to locate object: " + Credit_Amount1Elem.toString());
        }

		elem.click();
		
		String el1=elem.getText();
	     d1=el1.replaceAll("�","");
		
		c1=Integer.parseInt(d1);
		
		m_Driver.switchTo().defaultContent();
  		ExtentReportManager.passStep(m_Driver, "Click_Credit_Amount1");

		TestModellerLogger.PassStep(m_Driver, "Click_Credit_Amount1");*/
//		{
//			System.out.println("add amount c1");
//		return c1;
//	}
		
	
		Credit=m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div[1]/div/table/tbody[2]/tr[1]/td[3]")).getText().replaceFirst("£","");
		  fy=Credit.replace(",","");
		System.out.println("Credit Amount i+1 =" +fy);
		dbamout=Float.parseFloat(fy);
		
							
		System.out.println("Sum of both  =" +dbamout);
		

		return dbamout;	
						
	}
    
	/**
 	 * Click Debit_Amount
	 * @throws IOException 
     * @name Click Debit_Amount
     */
	public void Click_Debit_Amount() throws IOException
	{
        
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));


		dbamout3=dbamout;
		Debit=m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div[1]/div/table/tbody[2]/tr[2]/td[2]")).getText().replaceFirst("£","");
		g=Debit.replace(",","");
		dbamout2=Float.parseFloat(g);
		GetScreenShot.captureAsImage(m_Driver, Debit);
		System.out.println("Debit amount is ="+dbamout2);
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals(dbamout3,dbamout2);
		sa.assertAll();
	
       //m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
       
       
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
	
	
	
}
