package BankRule;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://ashiv.cloud.testinsights.io/app/#!/module-collection/guid/d244c606-57ef-45ca-b169-bfb87fc73727
@TestModellerModule(guid = "d244c606-57ef-45ca-b169-bfb87fc73727")
public class TestModellerio_Quality_with_Every_Release extends BasePage {
	public TestModellerio_Quality_with_Every_Release(WebDriver driver) {
		super(driver);
	}

	List<WebElement> data;
	int i, size;

	private By DataElem = By.xpath("//TD[@class='el-selection']");

	private By BankingElem = By
			.xpath("//A[@href='../AccountUI/BankTran.aspx?FYCode=117211&CompanyCode=16874&IsFirstRequest=1']");

	private By New_TransactionElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDate']");

	private By DescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDescription']");

	private By AmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDbAmount']");

	private By SpentElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtAmount']");

	private By Select_an_optionElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");

	private By Enter_OptionElem = By.cssSelector("INPUT[aria-autocomplete='list']");
	private By _Save_New_Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnSave']");

	public void GoToUrl() {
		m_Driver.get("https://ashiv.cloud.testinsights.io/app/#!/test-modeller/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL",
				"Go to URL - https://ashiv.cloud.testinsights.io/app/#!/test-modeller/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL",
				"Go to URL - https://ashiv.cloud.testinsights.io/app/#!/test-modeller/");
	}

	/**
	 * AssertUrl
	 * 
	 * @name AssertUrl
	 */
	public void AssertUrl() {
		String currentUrl = m_Driver.getCurrentUrl();
		String expectedUrl = "https://ashiv.cloud.testinsights.io/app/#!/test-modeller/";

		if (!currentUrl.equals("https://ashiv.cloud.testinsights.io/app/#!/test-modeller/")) {
			Assert.fail("Expecting URL - " + expectedUrl + " Found " + currentUrl);
		}
	}

	/**
	 * Click Data
	 * 
	 * @name Click Data
	 */
	/*
	 * public void Click_Data() {
	 * 
	 * WebElement elem = getWebElement(DataElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Click_Data", "Click_Data failed. Unable to locate object: " +
	 * DataElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Data",
	 * "Click_Data failed. Unable to locate object: " + DataElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + DataElem.toString()); }
	 * 
	 * elem.click();
	 * 
	 * 
	 * ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Data");
	 * 
	 * TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Data"); }
	 */

	/**
	 * Click Banking
	 * 
	 * @name Click Banking
	 */
	public void Click_Banking() {

		WebElement elem = getWebElement(BankingElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Banking",
					"Click_Banking failed. Unable to locate object: " + BankingElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Banking",
					"Click_Banking failed. Unable to locate object: " + BankingElem.toString());

			Assert.fail("Unable to locate object: " + BankingElem.toString());
		}

		elem.click();

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Banking");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Banking");
	}

	/**
	 * Click New Transaction
	 * 
	 * @name Click New Transaction
	 */
	
	  public void Click_New_Transaction() {
	  
	  WebElement elem = getWebElement(New_TransactionElem);
	  
	  if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	  "Click_New_Transaction",
	  "Click_New_Transaction failed. Unable to locate object: " +
	  New_TransactionElem.toString());
	  
	  TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Transaction",
	  "Click_New_Transaction failed. Unable to locate object: " +
	  New_TransactionElem.toString());
	  
	  Assert.fail("Unable to locate object: " + New_TransactionElem.toString()); }
	  
	  elem.click();
	  
	  ExtentReportManager.passStepWithScreenshot(m_Driver,
	  "Click_New_Transaction");
	  
	  TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_New_Transaction");
	  }
	 

	/**
	 * Enter Date
	 * 
	 * @name Enter Date
	 */
	/*
	 * public void Enter_Date(String Date) {
	 * 
	 * WebElement elem = getWebElement(DateElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Enter_Date", "Enter_Date failed. Unable to locate object: " +
	 * DateElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date",
	 * "Enter_Date failed. Unable to locate object: " + DateElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + DateElem.toString()); }
	 * 
	 * elem.sendKeys(Date);
	 * 
	 * 
	 * ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);
	 * 
	 * TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date); }
	 */

	/**
	 * Enter Description
	 * 
	 * @name Enter Description
	 */
	/*
	 * public void Enter_Description(String Description) {
	 * 
	 * WebElement elem = getWebElement(DescriptionElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Enter_Description", "Enter_Description failed. Unable to locate object: " +
	 * DescriptionElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description",
	 * "Enter_Description failed. Unable to locate object: " +
	 * DescriptionElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + DescriptionElem.toString()); }
	 * 
	 * elem.sendKeys(Description);
	 * 
	 * 
	 * ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);
	 * 
	 * TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description); }
	 */

	/**
	 * Enter Amount
	 * 
	 * @name Enter Amount
	 */
	/*
	 * public void Enter_Amount(String Amount) {
	 * 
	 * WebElement elem = getWebElement(AmountElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Enter_Amount", "Enter_Amount failed. Unable to locate object: " +
	 * AmountElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount",
	 * "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + AmountElem.toString()); }
	 * 
	 * elem.sendKeys(Amount);
	 * 
	 * 
	 * ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);
	 * 
	 * TestModellerLogger.PassStep(m_Driver, "Enter_Amount " + Amount); }
	 */

	/**
	 * Enter Spent
	 * 
	 * @name Enter Spent
	 */
	/*
	 * public void Enter_Spent(String Spent) {
	 * 
	 * WebElement elem = getWebElement(SpentElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Enter_Spent", "Enter_Spent failed. Unable to locate object: " +
	 * SpentElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Spent",
	 * "Enter_Spent failed. Unable to locate object: " + SpentElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + SpentElem.toString()); }
	 * 
	 * elem.sendKeys(Spent);
	 * 
	 * 
	 * ExtentReportManager.passStep(m_Driver, "Enter_Spent " + Spent);
	 * 
	 * TestModellerLogger.PassStep(m_Driver, "Enter_Spent " + Spent); }
	 */

	/**
	 * Click Select an option
	 * 
	 * @name Click Select an option
	 */
	/*
	 * public void Click_Select_an_option() {
	 * 
	 * WebElement elem = getWebElement(Select_an_optionElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Click_Select_an_option",
	 * "Click_Select_an_option failed. Unable to locate object: " +
	 * Select_an_optionElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_an_option",
	 * "Click_Select_an_option failed. Unable to locate object: " +
	 * Select_an_optionElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + Select_an_optionElem.toString()); }
	 * 
	 * elem.click();
	 * 
	 * 
	 * ExtentReportManager.passStepWithScreenshot(m_Driver,
	 * "Click_Select_an_option");
	 * 
	 * TestModellerLogger.PassStepWithScreenshot(m_Driver,
	 * "Click_Select_an_option"); }
	 * 
	 *//**
		 * Enter Enter Option
		 * 
		 * @name Enter Enter Option
		 */

	/*
	 * public void Enter_Enter_Option(String Enter_Option) {
	 * 
	 * WebElement elem = getWebElement(Enter_OptionElem);
	 * 
	 * if (elem == null) { ExtentReportManager.failStepWithScreenshot(m_Driver,
	 * "Enter_Enter_Option", "Enter_Enter_Option failed. Unable to locate object: "
	 * + Enter_OptionElem.toString());
	 * 
	 * TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Option",
	 * "Enter_Enter_Option failed. Unable to locate object: " +
	 * Enter_OptionElem.toString());
	 * 
	 * Assert.fail("Unable to locate object: " + Enter_OptionElem.toString()); }
	 * 
	 * elem.sendKeys(Enter_Option);
	 * 
	 * 
	 * ExtentReportManager.passStep(m_Driver, "Enter_Enter_Option " + Enter_Option);
	 * 
	 * TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Option " + Enter_Option);
	 * }
	 * 
	 * 
	 *//**
		 * Click Save & New
		 * 
		 * @name Click Save & New
		 */
	public void Click__Save_New_() {

		WebElement elem = getWebElement(_Save_New_Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_New_",
					"Click__Save_New_ failed. Unable to locate object: " + _Save_New_Elem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_New_",
					"Click__Save_New_ failed. Unable to locate object: " + _Save_New_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_New_Elem.toString());
		}

		elem.click();

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Click__Save_New_");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click__Save_New_");
	}

	
}