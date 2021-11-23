package pages.SuplierBill;


import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1750da4c-d480-4bfa-b6ce-ff17ead44b08
@TestModellerModule(guid = "1750da4c-d480-4bfa-b6ce-ff17ead44b08")
public class VATOnlyBillSToFRS extends BasePage
{
	
	String BNO;
	public VATOnlyBillSToFRS (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52552&CompanyCode=13326']");

	private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	
	private By NewTABElem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/a");

	private By VATOnlyBillElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddVATSupplier']");

	private By SupplierNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSupplier']");

	private By InvoiceNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceNo']");

	private By InvoiceDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceDate']");

	private By SubTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$txtSubTotal']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATRate']");

	private By VatRateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtVatRate']");

	private By VATElem = By.xpath("//INPUT[@name='ctl00$cPH$txtVAT']");

	private By GrossTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$txtNetTotal']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");

	//private By SaveButtonElem = By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/div");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierVATOnlyEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierVATOnlyEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierVATOnlyEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierVATOnlyEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierVATOnlyEditor.aspx?FYCode=52552&CompanyCode=13326&id=0&action=Add")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditureTAB
     * @name Click ExpenditureTAB
     */
	public void Click_ExpenditureTAB()
	{
        
		WebElement elem = getWebElement(ExpenditureTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click NewTAB
     * @name Click NewTAB
     */
	public void Click_NewTAB()
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click VATOnlyBill
     * @name Click VATOnlyBill
     */
	public void Click_VATOnlyBill()
	{
        
		WebElement elem = getWebElement(VATOnlyBillElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATOnlyBill", "Click_VATOnlyBill failed. Unable to locate object: " + VATOnlyBillElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATOnlyBill", "Click_VATOnlyBill failed. Unable to locate object: " + VATOnlyBillElem.toString());

			Assert.fail("Unable to locate object: " + VATOnlyBillElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATOnlyBill");

		TestModellerLogger.PassStep(m_Driver, "Click_VATOnlyBill");
	}

    
	/**
 	 * Select SupplierName
	 * @throws InterruptedException 
     * @name Select SupplierName
     */
    public void Select_SupplierName(String SupplierName) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SupplierNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierNameElem.toString());
         }
    elem.sendKeys(Keys.ENTER);
	String sup=SupplierName;
	
	System.out.println(" " +sup);
	m_Driver.findElement(By.xpath("//*[contains(text(),'"+sup+"')]")).click();
	
	
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
 	}

      
	/**
 	 * Enter InvoiceNo
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo)
 	{
 	    
 		WebElement elem = getWebElement(InvoiceNoElem);

 		BNO = InvoiceNo;
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }
 		
 		elem.clear();
 		elem.sendKeys(InvoiceNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}

      
	/**
 	 * Enter InvoiceDate
     * @name Enter InvoiceDate
     */
 	public void Enter_InvoiceDate(String InvoiceDate)
 	{
 	    
 		WebElement elem = getWebElement(InvoiceDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceDateElem.toString());
         }

 		elem.sendKeys(InvoiceDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);
 	}

      
	/**
 	 * Enter SubTotal
     * @name Enter SubTotal
     */
 	public void Enter_SubTotal(String SubTotal)
 	{
 	    
 		WebElement elem = getWebElement(SubTotalElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SubTotal", "Enter_SubTotal failed. Unable to locate object: " + SubTotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SubTotal", "Enter_SubTotal failed. Unable to locate object: " + SubTotalElem.toString());

 			Assert.fail("Unable to locate object: " + SubTotalElem.toString());
         }

 		elem.sendKeys(SubTotal);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SubTotal " + SubTotal);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SubTotal " + SubTotal);
 	}

    
	/**
 	 * Select VATRateType
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType)
 	{
 	    
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRateType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATRateType " + VATRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRateType " + VATRateType);
 	}

      
	/**
 	 * Enter VatRate
     * @name Enter VatRate
     */
 	public void Enter_VatRate(String VatRate)
 	{
 	    
 		WebElement elem = getWebElement(VatRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VatRate", "Enter_VatRate failed. Unable to locate object: " + VatRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VatRate", "Enter_VatRate failed. Unable to locate object: " + VatRateElem.toString());

 			Assert.fail("Unable to locate object: " + VatRateElem.toString());
         }

 		elem.sendKeys(VatRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VatRate " + VatRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VatRate " + VatRate);
 	}

      
	/**
 	 * Enter VAT
     * @name Enter VAT
     */
 	public void Enter_VAT(String VAT)
 	{
 	    
 		WebElement elem = getWebElement(VATElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VAT", "Enter_VAT failed. Unable to locate object: " + VATElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VAT", "Enter_VAT failed. Unable to locate object: " + VATElem.toString());

 			Assert.fail("Unable to locate object: " + VATElem.toString());
         }

 		elem.sendKeys(VAT);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VAT " + VAT);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VAT " + VAT);
 	}

      
	/**
 	 * Enter GrossTotal
     * @name Enter GrossTotal
     */
 	public void Enter_GrossTotal(String GrossTotal)
 	{
 	    
 		WebElement elem = getWebElement(GrossTotalElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_GrossTotal", "Enter_GrossTotal failed. Unable to locate object: " + GrossTotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_GrossTotal", "Enter_GrossTotal failed. Unable to locate object: " + GrossTotalElem.toString());

 			Assert.fail("Unable to locate object: " + GrossTotalElem.toString());
         }

 		elem.sendKeys(GrossTotal);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_GrossTotal " + GrossTotal);

  		TestModellerLogger.PassStep(m_Driver, "Enter_GrossTotal " + GrossTotal);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		//elem.clear();
		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(4000);
   // GetSuccessText();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	
	public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		//WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		
		//*[@id="ctl00_divSubContent"]/div[1]/div
		
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr")).size();
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		System.out.println("Hi loop"+i);
		
		
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		
		if(BNO.equalsIgnoreCase(str))
		{
			
			System.out.print("Hi Enter in if Loop");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(2000);
					System.out.println("sdfsfdsfdsfdsfds"+st);
					m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
					GetScreenShot.captureAsImage(m_Driver, BNO);
					
			break;
		}
		
	}
	
	}
}