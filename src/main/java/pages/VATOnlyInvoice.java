package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/43f05f94-6851-4e22-b1a4-f22ad0886765
@TestModellerModule(guid = "43f05f94-6851-4e22-b1a4-f22ad0886765")
public class VATOnlyInvoice extends BasePage
{
	
	String inno1=null;
	static String  crno1=null;
	public VATOnlyInvoice (WebDriver driver)
	{
		super(driver);
	}


	
	private By SalesTABElem = By.xpath("//LI[@id='ctl00_SideMenu1_incomeMenu']/A");

	private By NewTABElem = By.xpath("//DIV[@class='dropdown dashOpt-e search_filter_each open']/A[@class='text-white']");

	private By VATOnlyInvoiceElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAddVATInvoice']");

	
	private By CustomerNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlCustomer']");

	private By InvoiceNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceNo']");

	private By InvoiceDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtInvoiceDate']");

	private By SubTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$txtSubTotal']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtVatRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$txtVAT']");

	private By GrossTotalElem = By.xpath("//INPUT[@name='ctl00$cPH$txtNetTotal']");

	private By ConvertedAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$ltNetTotal']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceVATOnlyEditor.aspx?FYCode=52455&CompanyCode=13259&id=0&action=Add");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceVATOnlyEditor.aspx?FYCode=52455&CompanyCode=13259&id=0&action=Add");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceVATOnlyEditor.aspx?FYCode=52455&CompanyCode=13259&id=0&action=Add");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceVATOnlyEditor.aspx?FYCode=52455&CompanyCode=13259&id=0&action=Add";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceVATOnlyEditor.aspx?FYCode=52455&CompanyCode=13259&id=0&action=Add")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SalesTAB
     * @name Click SalesTAB
     */
	public void Click_SalesTAB()
	{
        
		WebElement elem = getWebElement(SalesTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SalesTAB", "Click_SalesTAB failed. Unable to locate object: " + SalesTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SalesTAB", "Click_SalesTAB failed. Unable to locate object: " + SalesTABElem.toString());

			Assert.fail("Unable to locate object: " + SalesTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SalesTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_SalesTAB");
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
 	 * Click VATOnlyInvoice
     * @name Click VATOnlyInvoice
     */
	public void Click_VATOnlyInvoice()
	{
        
		WebElement elem = getWebElement(VATOnlyInvoiceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATOnlyInvoice", "Click_VATOnlyInvoice failed. Unable to locate object: " + VATOnlyInvoiceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATOnlyInvoice", "Click_VATOnlyInvoice failed. Unable to locate object: " + VATOnlyInvoiceElem.toString());

			Assert.fail("Unable to locate object: " + VATOnlyInvoiceElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATOnlyInvoice");

		TestModellerLogger.PassStep(m_Driver, "Click_VATOnlyInvoice");
	}

    
	/**
 	 * Select CustomerName
     * @name Select CustomerName
     */
    public void Select_CustomerName(String CustomerName)
 	{
 	    
 		WebElement elem = getWebElement(CustomerNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

 			Assert.fail("Unable to locate object: " + CustomerNameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(CustomerName);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_CustomerName " + CustomerName);

 		TestModellerLogger.PassStep(m_Driver, "Select_CustomerName " + CustomerName);
 	}

      
	/**
 	 * Enter InvoiceNo
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo)
 	{
 	    inno1=InvoiceNo;
 		WebElement elem = getWebElement(InvoiceNoElem);

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
 	 * Enter VATRate
     * @name Enter VATRate
     */
 	public void Enter_VATRate(String VATRate)
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		elem.sendKeys(VATRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate " + VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate " + VATRate);
 	}

      
	/**
 	 * Enter VATAmount
     * @name Enter VATAmount
     */
 	public void Enter_VATAmount(String VATAmount)
 	{
 	    
 		WebElement elem = getWebElement(VATAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

 			Assert.fail("Unable to locate object: " + VATAmountElem.toString());
         }

 		elem.sendKeys(VATAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
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
 	 * Enter ConvertedAmount
     * @name Enter ConvertedAmount
     */
 	public void Enter_ConvertedAmount(String ConvertedAmount)
 	{
 	    
 		WebElement elem = getWebElement(ConvertedAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ConvertedAmount", "Enter_ConvertedAmount failed. Unable to locate object: " + ConvertedAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ConvertedAmount", "Enter_ConvertedAmount failed. Unable to locate object: " + ConvertedAmountElem.toString());

 			Assert.fail("Unable to locate object: " + ConvertedAmountElem.toString());
         }

 		elem.sendKeys(ConvertedAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ConvertedAmount " + ConvertedAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ConvertedAmount " + ConvertedAmount);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws AWTException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws InterruptedException, IOException, HeadlessException, AWTException
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
		//jsExec.executeScript("argume0nts[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnSave']")));
		//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnSave']")));
		
		Thread.sleep(3000);
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno1+".png"));
	GetSuccessText();
//          	
		
		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	
	
	public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		//WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		
		//*[@id="ctl00_divSubContent"]/div[1]/div
		
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr")).size();
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		int j=i-1;
		System.out.println("Hi loop"+i);
		
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		System.out.println("ÏnvoiceNO"+str);
		System.out.println("Ïnn"+inno1);
		System.out.println("2i"+i);
		if(inno1.equalsIgnoreCase(str))
		{
			
			System.out.println("HI IF");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1500);
					System.out.println("222"+st);
					//m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
					//Screenshotcapture.captureAsImage(m_Driver, inno1);
					
					crno1=m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).getText();
					System.out.println("Rerun"+crno1);
					
//					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//					 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
					
			break;
		}
		
	}
	
}public String message() 
{
	System.out.println("Confirmation "+crno1);	
	return crno1;
	
}

public void NewCreateCustomer(String CustName) throws InterruptedException
{
	WebElement PlusBtn=m_Driver.findElement(By.xpath("//*[@id='modal']/p"));
	PlusBtn.click();
	Thread.sleep(2000);
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddCustomerModalFrame']")));
	
	WebElement EntCustName=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtCustomerName']"));
	EntCustName.sendKeys(CustName);
	utilities.Screenshotcapture.Getscreenshot("Add customer Option for create a new customer", "New VAT Only Invoice.");
	WebElement SaveBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
	SaveBtn.click();
	m_Driver.switchTo().defaultContent();
}

public void allcustomer()
{
	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlCustomer']")).click();
	utilities.Screenshotcapture.Getscreenshot("Customer  All existing customer should be in it", "New VAT Only Invoice.");
}

public void SelectCustomer()
{
	//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlCustomer']")).click();
	utilities.Screenshotcapture.Getscreenshot("Invoice should be book in selected customer", "New VAT Only Invoice.");
}

public void serialno1()
{
	//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlCustomer']")).click();
	utilities.Screenshotcapture.Getscreenshot("Invoice serial no1", "New VAT Only Invoice.");
}

public void serialno2()
{
	//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlCustomer']")).click();
	utilities.Screenshotcapture.Getscreenshot("Invoice serial no2", "New VAT Only Invoice.");
}

public void serialno3()
{
	//m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlCustomer']")).click();
	utilities.Screenshotcapture.Getscreenshot("Invoice serial no3", "New VAT Only Invoice.");
}


















}