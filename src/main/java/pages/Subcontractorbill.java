package pages;

import pages.BasePage;

import java.awt.Robot;

import javax.crypto.KeyAgreement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/df62ef84-2f81-41d0-8397-4253697fe423
@TestModellerModule(guid = "df62ef84-2f81-41d0-8397-4253697fe423")
public class Subcontractorbill extends BasePage
{
	public static String vatrate;
	public Subcontractorbill (WebDriver driver)
	{
		super(driver);
	}
	
	
	
	private By Expenditure_Menu1Elem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span");
	//private By Expenditure_Menu1Elem =By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddExpenseHead']");
	private By New_menu2Elem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/a");

	private By New_Subcontractor_Bill3Elem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnAddSubContractorBill']");
	//private By Expense_type1 = By.xpath("//*[@id='myTable']/tbody[2]/tr[1]/td[1]");
	//private By Expense_type8Elem = By.xpath("//*[@id='myTable']/tbody[2]/tr[1]/td[1]");
	private By Expense_type8Elem=By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddExpenseHead']");


	private By Description9Elem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By NetTotal10Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtNetTotal']");

	private By VATRate11Elem = By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddVATRate']");

	private By Notes15Elem = By.xpath("//*[@id='ctl00_cPH_txtNote']");

	//private By Save16Elem = By.xpath("//A[@id='ctl00_cPH_btnSave']");
	//private By Save16Elem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[3]/div/a[1])");
	private By Save16Elem=By.xpath("//*[@id='ctl00_cPH_btnSave']");

	
	private By BillNo4Elem = By.xpath("//*[@id='ctl00_cPH_txtBillNo']");

	private By Supplier5Elem = By.xpath("//*[@id='ctl00_cPH_ddlSupplier']");

	private By tDate6Elem = By.xpath("//*[@id='ctl00_cPH_txtDate']");

	private By DueDate7Elem = By.id("@id='ctl00_cPH_txtDueDate");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillCISEditorNew.aspx?FYCode=53252&CompanyCode=13807&id=0&action=Add&bt=B");
   
		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=53252&CompanyCode=13807&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=53252&CompanyCode=13807&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillCISEditorNew.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&bt=B";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/SupplierBillCISEditorNew.aspx?FYCode=52444&CompanyCode=13236&id=0&action=Add&bt=B")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Expenditure_Menu1
     * @name Click Expenditure_Menu1
     */
	public void Click_Expenditure_Menu1()
	{
        
		WebElement elem = getWebElement(Expenditure_Menu1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure_Menu1", "Click_Expenditure_Menu1 failed. Unable to locate object: " + Expenditure_Menu1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure_Menu1", "Click_Expenditure_Menu1 failed. Unable to locate object: " + Expenditure_Menu1Elem.toString());

			Assert.fail("Unable to locate object: " + Expenditure_Menu1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure_Menu1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure_Menu1");
	}

     
	/**
 	 * Click New_menu2
     * @name Click New_menu2
     */
	public void Click_New_menu2()
	{
        
		WebElement elem = getWebElement(New_menu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_menu2", "Click_New_menu2 failed. Unable to locate object: " + New_menu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_menu2", "Click_New_menu2 failed. Unable to locate object: " + New_menu2Elem.toString());

			Assert.fail("Unable to locate object: " + New_menu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_menu2");

		TestModellerLogger.PassStep(m_Driver, "Click_New_menu2");
	}

     
	/**
 	 * Click New_Subcontractor_Bill3
     * @name Click New_Subcontractor_Bill3
     */
	public void Click_New_Subcontractor_Bill3()
	{
        
		WebElement elem = getWebElement(New_Subcontractor_Bill3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Subcontractor_Bill3", "Click_New_Subcontractor_Bill3 failed. Unable to locate object: " + New_Subcontractor_Bill3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Subcontractor_Bill3", "Click_New_Subcontractor_Bill3 failed. Unable to locate object: " + New_Subcontractor_Bill3Elem.toString());

			Assert.fail("Unable to locate object: " + New_Subcontractor_Bill3Elem.toString());
        }

		elem.click();
	
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Subcontractor_Bill3");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Subcontractor_Bill3");
    	m_Driver.navigate().refresh();
	
		
	}
	public void Enter_BillNo4(String BillNo4)
 	{
 	    
 		WebElement elem = getWebElement(BillNo4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo4", "Enter_BillNo4 failed. Unable to locate object: " + BillNo4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo4", "Enter_BillNo4 failed. Unable to locate object: " + BillNo4Elem.toString());

 			Assert.fail("Unable to locate object: " + BillNo4Elem.toString());
         }
 		
  	 		//elem.sendKeys(Keys.ENTER);
 		//elem.click();
 		elem.sendKeys(BillNo4);
 	
 		ExtentReportManager.passStep(m_Driver, "Enter_BillNo4 " + BillNo4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo4 " + BillNo4);
 	}

    
	/**
 	 * Select Supplier5
	 * @throws InterruptedException 
     * @name Select Supplier5
     */
    public void Select_Supplier5(String Supplier5) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Supplier5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Supplier5", "Select_Supplier5 failed. Unable to locate object: " + Supplier5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Supplier5", "Select_Supplier5 failed. Unable to locate object: " + Supplier5Elem.toString());

 			Assert.fail("Unable to locate object: " + Supplier5Elem.toString());
         }

 		Select dropdown = new Select(elem);
 

 		dropdown.selectByVisibleText(Supplier5);
 		
 		Thread.sleep(3000);

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Supplier5 " + Supplier5);

 		TestModellerLogger.PassStep(m_Driver, "Select_Supplier5 " + Supplier5);
 	}

      
	/**
 	 * Enter tDate6
	 * @throws InterruptedException 
     * @name Enter tDate6
     */
 	public void Enter_tDate6(String tDate6) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(tDate6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_tDate6", "Enter_tDate6 failed. Unable to locate object: " + tDate6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_tDate6", "Enter_tDate6 failed. Unable to locate object: " + tDate6Elem.toString());

 			Assert.fail("Unable to locate object: " + tDate6Elem.toString());
         }
 		
 		elem.clear();
		//elem1.sendKeys(Keys.ENTER);
		elem.sendKeys(tDate6);
		elem.sendKeys(Keys.TAB);

  		ExtentReportManager.passStep(m_Driver, "Enter_tDate6 " + tDate6);
  		TestModellerLogger.PassStep(m_Driver, "Enter_tDate6 " + tDate6);
  		
  		
 	}

      
	/**
 	 * Enter DueDate7
	 * @throws InterruptedException 
     * @name Enter DueDate7
    */
	public void Enter_DueDate7(String DueDate7) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(DueDate7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DueDate7", "Enter_DueDate7 failed. Unable to locate object: " + DueDate7Elem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DueDate7", "Enter_DueDate7 failed. Unable to locate object: " + DueDate7Elem.toString());

 			Assert.fail("Unable to locate object: " + DueDate7Elem.toString());
         }
 		elem.sendKeys("05/07/2021");
 		elem.sendKeys(Keys.TAB);
		
		ExtentReportManager.passStep(m_Driver, "Enter_DueDate7 " + DueDate7);
  		TestModellerLogger.PassStep(m_Driver, "Enter_DueDate7 " + DueDate7);
  		
  		Thread.sleep(11000);
	}
	
 	
 	/**
 	 * Select Expense_type8
	 * @throws InterruptedException 
     * @name Select Expense_type8
     */
//    public void Expense_type1() 
// 	{
// 	    
// 		WebElement elem = getWebElement(Expense_type1);
//
//// 		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Expense_type8", "Select_Expense_type8 failed. Unable to locate object: " + Expense_type8Elem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Expense_type8", "Select_Expense_type8 failed. Unable to locate object: " + Expense_type8Elem.toString());
////
//// 			Assert.fail("Unable to locate object: " + Expense_type8Elem.toString());
////         }
//   //m_Driver.navigate().refresh();
//      elem.click();
//
// 
//	       
//	     	 		}
 

	 
	/**
 	 * Select Expense_type8
	 * @throws InterruptedException 
     * @name Select Expense_type8
     */
    public void Select_Expense_type8(String Expense_type8) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Expense_type8Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Expense_type8", "Select_Expense_type8 failed. Unable to locate object: " + Expense_type8Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Expense_type8", "Select_Expense_type8 failed. Unable to locate object: " + Expense_type8Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + Expense_type8Elem.toString());
//         }

 		Select dropdown = new Select(elem);
	
 		dropdown.selectByVisibleText(Expense_type8);
 		
 	   WebDriverWait wdw=new WebDriverWait(m_Driver,20);
 	wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl00_ddExpenseHead']"))).sendKeys(Expense_type8);
 	 	
		
	       
	     	 		}
 

      
	/**
 	 * Enter Description9
     * @name Enter Description9
     */
 	public void Enter_Description9(String Description9)
 	{
 	    
 		WebElement elem = getWebElement(Description9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description9", "Enter_Description9 failed. Unable to locate object: " + Description9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description9", "Enter_Description9 failed. Unable to locate object: " + Description9Elem.toString());

 			Assert.fail("Unable to locate object: " + Description9Elem.toString());
         }

 		elem.sendKeys(Description9);
 		
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_Description9 " + Description9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description9 " + Description9);
  		elem.sendKeys(Keys.TAB);
 	}

      
	/**
 	 * Enter NetTotal10
     * @name Enter NetTotal10
     */
 	public void Enter_NetTotal10(String NetTotal10)
 	{
 	    
 		WebElement elem = getWebElement(NetTotal10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NetTotal10", "Enter_NetTotal10 failed. Unable to locate object: " + NetTotal10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NetTotal10", "Enter_NetTotal10 failed. Unable to locate object: " + NetTotal10Elem.toString());

 			Assert.fail("Unable to locate object: " + NetTotal10Elem.toString());
         }

 		elem.sendKeys(NetTotal10);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NetTotal10 " + NetTotal10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NetTotal10 " + NetTotal10);
  		
 	}

    
	/**
 	 * Select VATRate11
     * @name Select VATRate11
     */
    public void Select_VATRate11(String VATRate11)
 	{
 	    
 		WebElement elem = getWebElement(VATRate11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRate11", "Select_VATRate11 failed. Unable to locate object: " + VATRate11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRate11", "Select_VATRate11 failed. Unable to locate object: " + VATRate11Elem.toString());

 			Assert.fail("Unable to locate object: " + VATRate11Elem.toString());
         }
 		vatrate=VATRate11;
 		Select dropdown = new Select(elem);
 		dropdown.selectByVisibleText(VATRate11);
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrProduct_ctl01_LinkButtonEx1']"));
 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATRate11 " + VATRate11);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRate11 " + VATRate11);
 		elem.sendKeys(Keys.TAB);
 	}

      
	/**
 	 * Enter VATRate12
     * @name Enter VATRate12
     */
// 	public void Enter_VATRate12(String VATRate12)
// 	{
// 	    
// 		WebElement elem = getWebElement(VATRate12Elem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate12", "Enter_VATRate12 failed. Unable to locate object: " + VATRate12Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate12", "Enter_VATRate12 failed. Unable to locate object: " + VATRate12Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + VATRate12Elem.toString());
//         }
//
// 		elem.sendKeys(VATRate12);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate12 " + VATRate12);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate12 " + VATRate12);
// 	}

      
	/**
 	 * Enter VAT13
     * @name Enter VAT13
     */
// 	public void Enter_VAT13(String VAT13)
// 	{
// 	    
// 		WebElement elem = getWebElement(VAT13Elem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VAT13", "Enter_VAT13 failed. Unable to locate object: " + VAT13Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VAT13", "Enter_VAT13 failed. Unable to locate object: " + VAT13Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + VAT13Elem.toString());
//         }
//
// 		elem.sendKeys(VAT13);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_VAT13 " + VAT13);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_VAT13 " + VAT13);
// 	}

      
	/**
 	 * Enter SubTotal14
     * @name Enter SubTotal14
     */
// 	public void Enter_SubTotal14(String SubTotal14)
// 	{
// 	    
// 		WebElement elem = getWebElement(SubTotal14Elem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SubTotal14", "Enter_SubTotal14 failed. Unable to locate object: " + SubTotal14Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SubTotal14", "Enter_SubTotal14 failed. Unable to locate object: " + SubTotal14Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + SubTotal14Elem.toString());
//         }
//
// 		elem.sendKeys(SubTotal14);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_SubTotal14 " + SubTotal14);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_SubTotal14 " + SubTotal14);
// 	}

      
	/**
 	 * Enter Notes15
     * @name Enter Notes15
     */
 	public void Enter_Notes15(String Notes15)
 	{
 	    
 		WebElement elem = getWebElement(Notes15Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Notes15", "Enter_Notes15 failed. Unable to locate object: " + Notes15Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Notes15", "Enter_Notes15 failed. Unable to locate object: " + Notes15Elem.toString());

 			Assert.fail("Unable to locate object: " + Notes15Elem.toString());
         }

 		elem.sendKeys(Notes15);
 		
 		elem.sendKeys(Keys.TAB);
 		elem.sendKeys(Keys.TAB);
 
  		ExtentReportManager.passStep(m_Driver, "Enter_Notes15 " + Notes15);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Notes15 " + Notes15);
 	}

     
	/**
 	 * Click Save16
	 * @throws InterruptedException 
     * @name Click Save16
     */
	public void Click_Save16() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Save16Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save16", "Click_Save16 failed. Unable to locate object: " + Save16Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save16", "Click_Save16 failed. Unable to locate object: " + Save16Elem.toString());

			Assert.fail("Unable to locate object: " + Save16Elem.toString());
        }
				//m_Driver.switchTo().activeElement();
		
//		 WebDriverWait wait = new WebDriverWait(m_Driver, 20);
//         wait.until(ExpectedConditions.visibilityOfElementLocated((By) elem));
				
		jsExec.executeScript("arguments[0].click();", elem);

      //  m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[3]/div/a[1]")).click();
    

		ExtentReportManager.passStep(m_Driver, "Click_Save16");

		TestModellerLogger.PassStep(m_Driver, "Click_Save16");
	}
    
	public String vatrate1()
	{
		return vatrate;
	}
//	public void Click_Supplier_plussign()
//	{
//        
//		WebElement elem = getWebElement(Supplier_plussignElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Supplier_plussign", "Click_Supplier_plussign failed. Unable to locate object: " + Supplier_plussignElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Supplier_plussign", "Click_Supplier_plussign failed. Unable to locate object: " + Supplier_plussignElem.toString());
//
//			Assert.fail("Unable to locate object: " + Supplier_plussignElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Supplier_plussign");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Supplier_plussign");
//	}
//}
}