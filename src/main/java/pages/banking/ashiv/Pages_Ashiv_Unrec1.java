package pages.banking.ashiv;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ea5f77fb-4896-42c2-8363-cb06c63026d9
@TestModellerModule(guid = "ea5f77fb-4896-42c2-8363-cb06c63026d9")
public class Pages_Ashiv_Unrec1 extends BasePage
{
	public Pages_Ashiv_Unrec1 (WebDriver driver)
	{
		super(driver);
	}


	private By Un_reco_TransElem = By.xpath("//A[contains(text(),'Unreconciled Transactions')]");

	private By sel_bnk_dropdownElem = By.xpath("//label[normalize-space()= 'Bank Name']/../div/select");

	private By Sel_date_range_drop_downElem = By.xpath("//label[normalize-space()= 'Date Range']/../div/select");

	private By Sel_Date_From1Elem = By.xpath("//label[normalize-space()= 'Date Range']/../div/input[1]");

	private By Sel_Date_To2Elem = By.xpath("//label[normalize-space()= 'Date Range']/../div/input[2]");

	private By Update_btn_clickedElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$btnUpdate']");

	private By Tab_RunRules1_btnElem = By.xpath("//A[@id='hrefAutoAllocate']");

	private By Tab_Nu_Rule_btnElem = By.xpath("//A[@id='hrefAddFormula']");

	private By Top_Right_side_Rec_btnElem = By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']");

	private By Top_Rightside_mnu_NuTrans_btnElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnNewTransaction']");

	private By Del_btn_2Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnDeleteTran']");

	private By Footer_pagintionElem = By.xpath("//SELECT[@name='ctl00$cpHFooter$ddlPage']");

	private By btn_dump_excelexportElem = By.xpath("//A[@id='ctl00_cPHFilter_btnExportToExcel']");

	private By btn_dump_pdfElem = By.xpath("//A[@id='ctl00_cPHFilter_lkbtnExportToPdf']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100980");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100980");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100980");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100980";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100980")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Un_reco_Trans
     * @name Click Un_reco_Trans
     */
	public void Click_Un_reco_Trans()
	{
        
		WebElement elem = getWebElement(Un_reco_TransElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Un_reco_Trans", "Click_Un_reco_Trans failed. Unable to locate object: " + Un_reco_TransElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Un_reco_Trans", "Click_Un_reco_Trans failed. Unable to locate object: " + Un_reco_TransElem.toString());

			Assert.fail("Unable to locate object: " + Un_reco_TransElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Un_reco_Trans");

		TestModellerLogger.PassStep(m_Driver, "Click_Un_reco_Trans");
	}

    
	/**
 	 * Select sel_bnk_dropdown
     * @name Select sel_bnk_dropdown
     */
    public void Select_sel_bnk_dropdown(String sel_bnk_dropdown)
 	{
 	    
 		WebElement elem = getWebElement(sel_bnk_dropdownElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_sel_bnk_dropdown", "Select_sel_bnk_dropdown failed. Unable to locate object: " + sel_bnk_dropdownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_sel_bnk_dropdown", "Select_sel_bnk_dropdown failed. Unable to locate object: " + sel_bnk_dropdownElem.toString());

 			Assert.fail("Unable to locate object: " + sel_bnk_dropdownElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(sel_bnk_dropdown);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_sel_bnk_dropdown " + sel_bnk_dropdown);

 		TestModellerLogger.PassStep(m_Driver, "Select_sel_bnk_dropdown " + sel_bnk_dropdown);
 	}

    
	/**
 	 * Select Sel_date_range_drop_down
     * @name Select Sel_date_range_drop_down
     */
    public void Select_Sel_date_range_drop_down(String Sel_date_range_drop_down)
 	{
 	    
 		WebElement elem = getWebElement(Sel_date_range_drop_downElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sel_date_range_drop_down", "Select_Sel_date_range_drop_down failed. Unable to locate object: " + Sel_date_range_drop_downElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sel_date_range_drop_down", "Select_Sel_date_range_drop_down failed. Unable to locate object: " + Sel_date_range_drop_downElem.toString());

 			Assert.fail("Unable to locate object: " + Sel_date_range_drop_downElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sel_date_range_drop_down);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sel_date_range_drop_down " + Sel_date_range_drop_down);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sel_date_range_drop_down " + Sel_date_range_drop_down);
 	}

      
	/**
 	 * Enter Sel_Date_From1
     * @name Enter Sel_Date_From1
     */
 	public void Enter_Sel_Date_From1(String Sel_Date_From1)
 	{
 	    
 		WebElement elem = getWebElement(Sel_Date_From1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sel_Date_From1", "Enter_Sel_Date_From1 failed. Unable to locate object: " + Sel_Date_From1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sel_Date_From1", "Enter_Sel_Date_From1 failed. Unable to locate object: " + Sel_Date_From1Elem.toString());

 			Assert.fail("Unable to locate object: " + Sel_Date_From1Elem.toString());
         }

 		elem.sendKeys(Sel_Date_From1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Sel_Date_From1 " + Sel_Date_From1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Sel_Date_From1 " + Sel_Date_From1);
 	}

      
	/**
 	 * Enter Sel_Date_To2
     * @name Enter Sel_Date_To2
     */
 	public void Enter_Sel_Date_To2(String Sel_Date_To2)
 	{
 	    
 		WebElement elem = getWebElement(Sel_Date_To2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Sel_Date_To2", "Enter_Sel_Date_To2 failed. Unable to locate object: " + Sel_Date_To2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Sel_Date_To2", "Enter_Sel_Date_To2 failed. Unable to locate object: " + Sel_Date_To2Elem.toString());

 			Assert.fail("Unable to locate object: " + Sel_Date_To2Elem.toString());
         }

 		elem.sendKeys(Sel_Date_To2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Sel_Date_To2 " + Sel_Date_To2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Sel_Date_To2 " + Sel_Date_To2);
 	}

     
	/**
 	 * Click Update_btn_clicked
     * @name Click Update_btn_clicked
     */
	public void Click_Update_btn_clicked()
	{
        
		WebElement elem = getWebElement(Update_btn_clickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_btn_clicked", "Click_Update_btn_clicked failed. Unable to locate object: " + Update_btn_clickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_btn_clicked", "Click_Update_btn_clicked failed. Unable to locate object: " + Update_btn_clickedElem.toString());

			Assert.fail("Unable to locate object: " + Update_btn_clickedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Update_btn_clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_btn_clicked");
	}

     
	/**
 	 * Click Tab_RunRules1_btn
	 * @throws InterruptedException 
     * @name Click Tab_RunRules1_btn
     */
	public void Click_Tab_RunRules1_btn() throws InterruptedException
	{
        
	//	WebElement elem=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hrefAutoAllocate']")));

//List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[5]/div/ul/li"));



WebElement Select=m_Driver.findElement(By.xpath("//select[@id='ctl00_cpHFooter_ddlPage']"));

Select dropdown1 = new Select(Select);



dropdown1.selectByVisibleText("200");
Thread.sleep(30000);
WebElement Rulebtn=m_Driver.findElement(By.xpath("//*[@id='hrefAutoAllocate']"));
Rulebtn.click();
//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='hrefAutoAllocate']")));
Thread.sleep(30000);
WebElement ReconcileBtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']"));
ReconcileBtn.click();
Thread.sleep(15000);
WebElement Select2=m_Driver.findElement(By.xpath("//select[@id=\"ctl00_cpHFooter_ddlPage\"]"));

Select dropdown2 = new Select(Select2);



dropdown2.selectByVisibleText("200");
Thread.sleep(30000);
WebElement Rulebtn1=m_Driver.findElement(By.xpath("//*[@id='hrefAutoAllocate']"));
Rulebtn1.click();
//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='hrefAutoAllocate']")));
Thread.sleep(30000);
WebElement ReconcileBtn1=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_LinkButtonEx1']"));
ReconcileBtn1.click();
Thread.sleep(10000);
String Msg=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]")).getText();
System.out.println("Reconcile Information = "+Msg);




  //int size=list.size(); 
 // for(int i=1;i<=size-1;i++)
  
	
	 
  
//  for(int p=0;p<1;p++)
//  { 
//	  list=m_Driver.findElements(By.xpath( "//*[@id='ctl00_divSubContent']/div[5]/div/ul/li"));
//  
// 
//  jsExec.executeScript("arguments[0].scrollIntoView();",list.get(i));
//  list.get(i).click();
  
  
  
 
  
}

		
          	

	

	//}
	/**
 	 * Click Tab_Nu Rule_btn
     * @name Click Tab_Nu Rule_btn
     */
	public void Click_Tab_Nu_Rule_btn()
	{
        
		WebElement elem = getWebElement(Tab_Nu_Rule_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tab_Nu_Rule_btn", "Click_Tab_Nu_Rule_btn failed. Unable to locate object: " + Tab_Nu_Rule_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tab_Nu_Rule_btn", "Click_Tab_Nu_Rule_btn failed. Unable to locate object: " + Tab_Nu_Rule_btnElem.toString());

			Assert.fail("Unable to locate object: " + Tab_Nu_Rule_btnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tab_Nu_Rule_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Tab_Nu_Rule_btn");
	}

     
	/**
 	 * Click Top_Right_side_Rec_btn
     * @name Click Top_Right_side_Rec_btn
     */
	public void Click_Top_Right_side_Rec_btn()
	{
        
		WebElement elem = getWebElement(Top_Right_side_Rec_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Top_Right_side_Rec_btn", "Click_Top_Right_side_Rec_btn failed. Unable to locate object: " + Top_Right_side_Rec_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Top_Right_side_Rec_btn", "Click_Top_Right_side_Rec_btn failed. Unable to locate object: " + Top_Right_side_Rec_btnElem.toString());

			Assert.fail("Unable to locate object: " + Top_Right_side_Rec_btnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Top_Right_side_Rec_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Top_Right_side_Rec_btn");
	}

     
	/**
 	 * Click Top_Rightside_mnu_NuTrans_btn
     * @name Click Top_Rightside_mnu_NuTrans_btn
     */
	public void Click_Top_Rightside_mnu_NuTrans_btn()
	{
        
		WebElement elem = getWebElement(Top_Rightside_mnu_NuTrans_btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Top_Rightside_mnu_NuTrans_btn", "Click_Top_Rightside_mnu_NuTrans_btn failed. Unable to locate object: " + Top_Rightside_mnu_NuTrans_btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Top_Rightside_mnu_NuTrans_btn", "Click_Top_Rightside_mnu_NuTrans_btn failed. Unable to locate object: " + Top_Rightside_mnu_NuTrans_btnElem.toString());

			Assert.fail("Unable to locate object: " + Top_Rightside_mnu_NuTrans_btnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Top_Rightside_mnu_NuTrans_btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Top_Rightside_mnu_NuTrans_btn");
	}

     
	/**
 	 * Click Del_btn_2
     * @name Click Del_btn_2
     */
	public void Click_Del_btn_2()
	{
        
		WebElement elem = getWebElement(Del_btn_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Del_btn_2", "Click_Del_btn_2 failed. Unable to locate object: " + Del_btn_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Del_btn_2", "Click_Del_btn_2 failed. Unable to locate object: " + Del_btn_2Elem.toString());

			Assert.fail("Unable to locate object: " + Del_btn_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Del_btn_2");

		TestModellerLogger.PassStep(m_Driver, "Click_Del_btn_2");
	}

    
	/**
 	 * Select Footer_pagintion
     * @name Select Footer_pagintion
     */
    public void Select_Footer_pagintion(String Footer_pagintion)
 	{
 	    
 		WebElement elem = getWebElement(Footer_pagintionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Footer_pagintion", "Select_Footer_pagintion failed. Unable to locate object: " + Footer_pagintionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Footer_pagintion", "Select_Footer_pagintion failed. Unable to locate object: " + Footer_pagintionElem.toString());

 			Assert.fail("Unable to locate object: " + Footer_pagintionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Footer_pagintion);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Footer_pagintion " + Footer_pagintion);

 		TestModellerLogger.PassStep(m_Driver, "Select_Footer_pagintion " + Footer_pagintion);
 	}

     
	/**
 	 * Click btn_dump_excelexport
     * @name Click btn_dump_excelexport
     */
	public void Click_btn_dump_excelexport()
	{
        
		WebElement elem = getWebElement(btn_dump_excelexportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_btn_dump_excelexport", "Click_btn_dump_excelexport failed. Unable to locate object: " + btn_dump_excelexportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_btn_dump_excelexport", "Click_btn_dump_excelexport failed. Unable to locate object: " + btn_dump_excelexportElem.toString());

			Assert.fail("Unable to locate object: " + btn_dump_excelexportElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_btn_dump_excelexport");

		TestModellerLogger.PassStep(m_Driver, "Click_btn_dump_excelexport");
	}

     
	/**
 	 * Click btn_dump_pdf
     * @name Click btn_dump_pdf
     */
	public void Click_btn_dump_pdf()
	{
        
		WebElement elem = getWebElement(btn_dump_pdfElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_btn_dump_pdf", "Click_btn_dump_pdf failed. Unable to locate object: " + btn_dump_pdfElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_btn_dump_pdf", "Click_btn_dump_pdf failed. Unable to locate object: " + btn_dump_pdfElem.toString());

			Assert.fail("Unable to locate object: " + btn_dump_pdfElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_btn_dump_pdf");

		TestModellerLogger.PassStep(m_Driver, "Click_btn_dump_pdf");
	}
}