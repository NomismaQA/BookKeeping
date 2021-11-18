package pages.banking.ashiv;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

import javax.imageio.ImageIO;

//import org.junit.internal.runners.statements.InvokeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import freemarker.ext.jsp._FreeMarkerPageContext1;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.Screenshotcapture;
import utilities.VATVerification;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;



// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ac366805-bd68-464a-a499-36c6930ef129
@TestModellerModule(guid = "ac366805-bd68-464a-a499-36c6930ef129")
public class SaleInvoice extends BasePage
{
	public SaleInvoice (WebDriver driver)
	{
		super(driver);
	}
	String InvDate1=null;
	String actPrice=null;
	String actQuan=null;
	String actVatTy =null;
	String inno=null;
	static String st= null;
		
	private By SalesTabElem = By.xpath("//LI[@id='ctl00_SideMenu1_incomeMenu']/A/SPAN[@class='side_nav_text']");

	private By NewButtonElem = By.xpath("//A[@class='text-white']/I[@class='fa fa-plus']");

	private By NewInvoiceElem = By.id("ctl00_cpHeaderRight_btnAdd");

	
	private By CustomerNameElem = By.id("ctl00_cPH_ddlCustomer");

	private By InvoiceNoElem = By.id("ctl00_cPH_txtInvoiceNo");
	

	private By InvoiceDateElem = By.id("ctl00_cPH_txtInvoiceDate");
	

	private By IncomeTypeElem = By.id("ctl00_cPH_rptrProduct_ctl00_ddProduct");
	
	
	
	//*[@id="ctl00_cPH_rptrProduct_ctl00_txtDescription"]

	private By DescriptionElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtDescription");

	private By UnitPriceElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtUnitPrice");

	private By QuantityElem = By.id("ctl00_cPH_rptrProduct_ctl00_txtQuantity");

	private By VATRateElem = By.id("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']");

	private By TickformorelineitemsElem = By.xpath("//DIV[@class='col-sm-12 col-md-12']/SPAN/LABEL");

	private By NoteElem = By.id("ctl00_cPH_txtNote");

	private By SaveButtonElem = By.id("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&it=I&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SalesTab
     * @name Click SalesTab
     */
	public void Click_SalesTab()
	{
        
		WebElement elem = getWebElement(SalesTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SalesTab", "Click_SalesTab failed. Unable to locate object: " + SalesTabElem.toString());

			Assert.fail("Unable to locate object: " + SalesTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SalesTab");

		TestModellerLogger.PassStep(m_Driver, "Click_SalesTab");
	}

     
	/**
 	 * Click NewButton
     * @name Click NewButton
     */
	public void Click_NewButton()
	{
        
		WebElement elem = getWebElement(NewButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewButton", "Click_NewButton failed. Unable to locate object: " + NewButtonElem.toString());

			Assert.fail("Unable to locate object: " + NewButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewButton");

		TestModellerLogger.PassStep(m_Driver, "Click_NewButton");
	}

     
	/**
 	 * Click NewInvoice
     * @name Click NewInvoice
     */
	public void Click_NewInvoice()
	{
        
		WebElement elem = getWebElement(NewInvoiceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice failed. Unable to locate object: " + NewInvoiceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice failed. Unable to locate object: " + NewInvoiceElem.toString());

			Assert.fail("Unable to locate object: " + NewInvoiceElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewInvoice");

		TestModellerLogger.PassStep(m_Driver, "Click_NewInvoice");
	}

    
	/**
 	 * Select CustomerName
	 * @throws InterruptedException 
     * @name Select CustomerName
     */
    public void Select_CustomerName(String CustomerName) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(CustomerNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CustomerName", "Select_CustomerName failed. Unable to locate object: " + CustomerNameElem.toString());

 			Assert.fail("Unable to locate object: " + CustomerNameElem.toString());
         }

 		String Customer=elem.getText();
 		System.out.println("Customer List ="+Customer);
 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(CustomerName);
 		Thread.sleep(1000);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_CustomerName " + CustomerName);

 		TestModellerLogger.PassStep(m_Driver, "Select_CustomerName " + CustomerName);
 	}

      
	/**
 	 * Enter InvoiceNo
	 * @throws InterruptedException 
     * @name Enter InvoiceNo
     */
 	public void Enter_InvoiceNo(String InvoiceNo) throws InterruptedException
 	{
 		inno=InvoiceNo;
 		WebElement elem = getWebElement(InvoiceNoElem);
 	

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }
 		elem.clear();
 		
 		WebElement elem1= getWebElement(InvoiceNoElem);
 		elem1.sendKeys(InvoiceNo);
 		Thread.sleep(1000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}
 	public void Enter_InvoiceNo1(String InvoiceNo) throws InterruptedException
 	{
 		inno=InvoiceNo;
 		WebElement elem = getWebElement(InvoiceNoElem);
 	

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceNo", "Enter_InvoiceNo failed. Unable to locate object: " + InvoiceNoElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNoElem.toString());
         }
 		//elem.clear();
 		
 		WebElement elem1= getWebElement(InvoiceNoElem);
 		elem1.sendKeys(InvoiceNo);
 		Thread.sleep(1000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceNo " + InvoiceNo);
 	}
      
	/**
 	 * Enter InvoiceDate
	 * @throws InterruptedException 
     * @name Enter InvoiceDate
     */
 	public void Enter_InvoiceDate(String InvoiceDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(InvoiceDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate failed. Unable to locate object: " + InvoiceDateElem.toString());

 			Assert.fail("Unable to locate object: " + InvoiceDateElem.toString());
         }
// 		InvDate1=InvoiceDate;
// 		System.out.println(InvDate1);
// 		//elem.clear();
//		for(int i=0;i<=9;i++)
// 		{
//			m_Driver.findElement(By.id("ctl00_cPH_txtInvoiceDate")).sendKeys(Keys.BACK_SPACE);
// 		}
 		elem.sendKeys(InvoiceDate);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
 		
	//m_Driver.findElement(By.id("ctl00_cPH_txtInvoiceDate")).sendKeys(Keys.ENTER);
 		 	
 			//Thread.sleep(1000);
 
 	 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceDate " + InvoiceDate);
 	}

    
	/**
 	 * Select IncomeType
     * @name Select IncomeType
     */
    public void Select_IncomeType(String IncomeType)
 	{
 	    
 		WebElement elem = getWebElement(IncomeTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_IncomeType", "Select_IncomeType failed. Unable to locate object: " + IncomeTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_IncomeType", "Select_IncomeType failed. Unable to locate object: " + IncomeTypeElem.toString());

 			Assert.fail("Unable to locate object: " + IncomeTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(IncomeType);
 		elem.sendKeys(Keys.TAB);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_IncomeType " + IncomeType);

 		TestModellerLogger.PassStep(m_Driver, "Select_IncomeType " + IncomeType);
 	}

      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		elem.sendKeys(Keys.TAB);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter UnitPrice
     * @name Enter UnitPrice
     */
 	public void Enter_UnitPrice(String UnitPrice)
 	{
 	    
 		WebElement elem = getWebElement(UnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + UnitPriceElem.toString());
         }

 		elem.sendKeys(UnitPrice);
 		actPrice = (String) jsExec.executeScript("return document.getElementById('ctl00_cPH_rptrProduct_ctl00_txtUnitPrice').value");  
 		
 		System.out.println(actPrice);
 		elem.sendKeys(Keys.TAB);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

      
	/**
 	 * Enter Quantity
     * @name Enter Quantity
     */
 	public void Enter_Quantity(String Quantity)
 	{
 	    
 		WebElement elem = getWebElement(QuantityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Quantity", "Enter_Quantity failed. Unable to locate object: " + QuantityElem.toString());

 			Assert.fail("Unable to locate object: " + QuantityElem.toString());
         }

 		elem.sendKeys(Quantity);
 		elem.sendKeys(Keys.TAB);
 		
 		actQuan = (String) jsExec.executeScript("return document.getElementById('ctl00_cPH_rptrProduct_ctl00_txtQuantity').value");  

 		System.out.println("Quant"+actQuan);
  		ExtentReportManager.passStep(m_Driver, "Enter_Quantity " + Quantity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Quantity " + Quantity);
 	}

 	public void Discount(String Dis)
 	{
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtDiscountRate']")).sendKeys(Dis);
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_txtDiscountRate']")).sendKeys(Keys.TAB);
 	}
    
	/**
 	 * Select VATRate
	 * @throws InterruptedException 
     * @name Select VATRate
     */
    public void Select_VATRate(String VATRate) throws InterruptedException
 	{
    	Thread.sleep(2000);
 		WebElement ele=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']"));
 		
 		String Vat=ele.getText();
 		System.out.println("Vat Type List ="+Vat);
 		Select dropdown = new Select(ele);
 		
 		dropdown.selectByVisibleText("No VAT");
 		
 		System.out.println("No VAT");
 		
 		Thread.sleep(2000);
 		
 		
		/*
		 * WebElement tt=m_Driver.findElement(By.xpath(
		 * "//*[@id='ctl00_cPH_rptrProduct_ctl00_ltAmount']")); String ttotal =
		 * tt.getText(); System.out.println("444"+ttotal); //Select dropdown = new
		 * Select(elem);
		 * 
		 * dropdown.selectByVisibleText(VATRate);
		 * 
		 * 
		 * VATVerification verify = new VATVerification(m_Driver); int TRate = (int)
		 * verify.VatVerify(VATRate, actPrice, actQuan);
		 * 
		 * 
		 * System.out.println(TRate); String str= String.valueOf(TRate);
		 * 
		 * SoftAssert ass = new SoftAssert(); ass.assertEquals(str, ttotal);
		 */

 		ExtentReportManager.passStep(m_Driver, "Select_VATRate " + VATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRate " + VATRate);
 		
 	}

     
	

	/**
 	 * Click Tickformorelineitems
     * @name Click Tickformorelineitems
     */
	public void Click_Tickformorelineitems()
	{
        
		WebElement elem = getWebElement(TickformorelineitemsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

			Assert.fail("Unable to locate object: " + TickformorelineitemsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tickformorelineitems");

		TestModellerLogger.PassStep(m_Driver, "Click_Tickformorelineitems");
	}

	
      
	/**
 	 * Enter Note
     * @name Enter Note
     */
 	public void Enter_Note(String Note)
 	{
 	    
 		WebElement elem = getWebElement(NoteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Note", "Enter_Note failed. Unable to locate object: " + NoteElem.toString());

 			Assert.fail("Unable to locate object: " + NoteElem.toString());
         }

 		elem.sendKeys(Note);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Note " + Note);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Note " + Note);
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
        
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")).click();
		
		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
		Thread.sleep(2000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")).click();
		// m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
		//elem.click();
//		jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
//		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
		//GetSuccessText();
		
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
//	
          

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	
	
	
	public void NewCreateIncomeType(String IncomeTypeName) throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divtype']/i")).click();
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id=\"AddinvoicemodalplusIFrame\"]")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtIncomeHeadName']")).sendKeys(IncomeTypeName);
		Thread.sleep(2000);
		utilities.Screenshotcapture.Getscreenshot("When clicking + button open it up in a new page rather than the pop out", "Simple Invoice Template");
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
		m_Driver.switchTo().defaultContent();
	}
	
	
	public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		
		System.out.println("HI");
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
		
		System.out.println("Invoice no is "+str);
		System.out.println("Ïnno value "+inno);
		System.out.println("2i"+i);
		if(inno.equalsIgnoreCase(str))
		{
			
					st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_filtrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1500);
					System.out.println("Linkaaaaaaaaaaaaaaa   "+st);
					m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
					Screenshotcapture.captureAsImage(m_Driver, inno);
					utilities.Screenshotcapture.Getscreenshot("invoice no", "Sales Dashboard");
					//m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']"));
					//m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
					
//					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//					 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
					
			break;
		}
		
	}
	
	}
	public String message()
	{
				return st;
		
	}
	
	
	public void RecallBtn() throws InterruptedException
	{
		WebElement RecallBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnRecall']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);",RecallBtn);
		RecallBtn.click();
		Thread.sleep(2000);
	}
	
	
	public void VerifyData()
	{
		
		WebElement msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		String data=msg.getText();
		String []a=data.split(" ");
		boolean b=data.contains("Success! Invoice Number "+a[3]+" saved successfully");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Credit Note Page");
		utilities.Screenshotcapture.Getscreenshot("Success! Invoice Number "+a[3]+" saved successfully", "Simple Invoice Template");
		
		
		
	}
	
	public void VerifyDataRecall()
	{
		
		WebElement msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		String data=msg.getText();
		String []a=data.split(" ");
		boolean b=data.contains("Success! Invoice Number "+a[3]+" saved successfully");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Credit Note Page");
		utilities.Screenshotcapture.Getscreenshot("Recall Last Success! Invoice Number "+a[3]+" saved successfully", "Simple Invoice Template");
		
		
		
	}
	
	public void SelectTempPlate(String TempName)
	{
		
		WebElement PlusBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_pnlbody']/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/a/p/i"));
		PlusBtn.click();
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddinvoicemodalplusIFrame']")));
		
	WebElement SelectTemp=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddInvoiceTemplate']"));
		
		Select dropdown=new Select (SelectTemp);
		dropdown.selectByVisibleText(TempName);
		
		
		WebElement SaveBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']"));
		SaveBtn.click();
		
		m_Driver.switchTo().defaultContent();
		
		
		
	}
	public void SelectTemp(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement SelectTemp2=m_Driver.findElement(By.xpath("//select[@id='ctl00_cPH_ddInvoiceTemplate']"));
				Select Dropdown =new Select (SelectTemp2);
		Dropdown.selectByVisibleText(temp);
		
		
		
		
	}
	public void VerifyData2()
	{
		
		WebElement msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
		String data=msg.getText();
		String []a=data.split(" ");
		boolean b=data.contains("Success! Invoice Number "+a[3]+" saved successfully");
		Assert.assertTrue(b);
		//Screenshotcapture.captureAsImage(m_Driver, "Credit Note Page");
		utilities.Screenshotcapture.Getscreenshot("Success! Invoice Number "+a[3]+" saved successfully", "Other Invoice Template");
		
		
		
	}
	public void ScreenshotINC()
	{
		utilities.Screenshotcapture.Getscreenshot("started with Alpha no.'INV' & numeric like - INV-11", "Simple Invoice Template");
	}
	public void Click_SaveButtonCIS() throws InterruptedException, IOException, HeadlessException, AWTException
	{
        
		
		//m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")).click();
		
		jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
		Thread.sleep(4000);
		utilities.Screenshotcapture.Getscreenshot("Discount With CIS", "Simple Invoice Template");
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cphError_btnSaveinvoice']")).click();
		// m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
		//elem.click();
//		jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
//		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_btnPreviewOnsave']")));
		
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
		//GetSuccessText();
		
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		 ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\"+inno+".png"));
//	
          

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
	
}