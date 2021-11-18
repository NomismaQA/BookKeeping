package pages;

import pages.BasePage;

import java.sql.Driver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Ashiv_Demo_Pages.GetData;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3b7cdf97-a2c6-44b1-9f5f-84bed2b43852
@TestModellerModule(guid = "3b7cdf97-a2c6-44b1-9f5f-84bed2b43852")
public class BankNewTransaction extends BasePage
{
	public BankNewTransaction (WebDriver driver)
	{
		super(driver);
	}



	//private By BankingTABElem = By.xpath("//A[@href='../AccountUI/BankTran.aspx?FYCode=52512&CompanyCode=13298&IsFirstRequest=1']");
	private By BankingTABElem = By.xpath("(//*[contains(text(),'Banking')])[1]");
	private By NewTABElem = By.xpath("(//*[@class='text-white'])[2]");

	private By NewTransactionElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By BankNameElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccount']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDate']");

	private By DescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDescription']");

	private By ReceivedAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDbAmount']");

	private By SpentAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtAmount']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptRecord$ctl00$ddVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$ltVATAmount']");

	private By AllocateToElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']/SPAN[@class='select2-selection__placeholder']");

	private By AllocateTo1InsideElem = By.cssSelector("INPUT[aria-autocomplete='list']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnSaveAndOpenDashbord']");


public static String Out3="";
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100296");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100296");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100296");
	}


	/**
	 * AssertUrl
	 * @name AssertUrl
	 */
	public void AssertUrl()
	{
		String currentUrl = m_Driver.getCurrentUrl();
		String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100296";

		if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100296")) {
			Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
		}
	}


	/**
	 * Click BankingTAB
	 * @name Click BankingTAB
	 */
	
	
	
	public void Click_BankingTAB()
	{

		WebElement elem = getWebElement(BankingTABElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BankingTAB", "Click_BankingTAB failed. Unable to locate object: " + BankingTABElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BankingTAB", "Click_BankingTAB failed. Unable to locate object: " + BankingTABElem.toString());

			Assert.fail("Unable to locate object: " + BankingTABElem.toString());
		}
		//m_Driver.findElement(By.xpath("//*[@id='EditPopUpClose']/span")).click();
		elem.click();
		//jsExec.executeScript("arguments[0].click();", elem);    	

		ExtentReportManager.passStep(m_Driver, "Click_BankingTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_BankingTAB");
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
	 * Click NewTransaction
	 * @name Click NewTransaction
	 */
	public void Click_NewTransaction()
	{

		WebElement elem = getWebElement(NewTransactionElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTransaction", "Click_NewTransaction failed. Unable to locate object: " + NewTransactionElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTransaction", "Click_NewTransaction failed. Unable to locate object: " + NewTransactionElem.toString());

			Assert.fail("Unable to locate object: " + NewTransactionElem.toString());
		}

		elem.click();


		ExtentReportManager.passStep(m_Driver, "Click_NewTransaction");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTransaction");
	}


	/**
	 * Select BankName
	 * @name Select BankName
	 */
	public void Select_BankName(String BankName)
	{

		WebElement elem = getWebElement(BankNameElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BankName", "Select_BankName failed. Unable to locate object: " + BankNameElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BankName", "Select_BankName failed. Unable to locate object: " + BankNameElem.toString());

			Assert.fail("Unable to locate object: " + BankNameElem.toString());
		}

		Select dropdown = new Select(elem);

		dropdown.selectByVisibleText(BankName);


		ExtentReportManager.passStep(m_Driver, "Select_BankName " + BankName);

		TestModellerLogger.PassStep(m_Driver, "Select_BankName " + BankName);
	}


	/**
	 * Enter Date
	 * @name Enter Date
	 */
	public void Enter_Date(String Date)
	{

		WebElement elem = getWebElement(DateElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

			Assert.fail("Unable to locate object: " + DateElem.toString());
		}

		elem.sendKeys(Date);


		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
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


		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
	}


	/**
	 * Enter ReceivedAmount
	 * @name Enter ReceivedAmount
	 */
	public void Enter_ReceivedAmount(String ReceivedAmount)
	{

		WebElement elem = getWebElement(ReceivedAmountElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ReceivedAmount", "Enter_ReceivedAmount failed. Unable to locate object: " + ReceivedAmountElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ReceivedAmount", "Enter_ReceivedAmount failed. Unable to locate object: " + ReceivedAmountElem.toString());

			Assert.fail("Unable to locate object: " + ReceivedAmountElem.toString());
		}

		elem.sendKeys(ReceivedAmount);


		ExtentReportManager.passStep(m_Driver, "Enter_ReceivedAmount " + ReceivedAmount);

		TestModellerLogger.PassStep(m_Driver, "Enter_ReceivedAmount " + ReceivedAmount);
	}


	/**
	 * Enter SpentAmount
	 * @name Enter SpentAmount
	 */
	public void Enter_SpentAmount(String SpentAmount)
	{

		WebElement elem = getWebElement(SpentAmountElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SpentAmount", "Enter_SpentAmount failed. Unable to locate object: " + SpentAmountElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SpentAmount", "Enter_SpentAmount failed. Unable to locate object: " + SpentAmountElem.toString());

			Assert.fail("Unable to locate object: " + SpentAmountElem.toString());
		}

		elem.sendKeys(SpentAmount);


		ExtentReportManager.passStep(m_Driver, "Enter_SpentAmount " + SpentAmount);

		TestModellerLogger.PassStep(m_Driver, "Enter_SpentAmount " + SpentAmount);
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
	 * Click AllocateTo
	 * @throws InterruptedException 
	 * @name Click AllocateTo
	 */
	public void Click_AllocateTo() throws InterruptedException
	{

		WebElement elem = getWebElement(AllocateToElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AllocateTo", "Click_AllocateTo failed. Unable to locate object: " + AllocateToElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AllocateTo", "Click_AllocateTo failed. Unable to locate object: " + AllocateToElem.toString());

			Assert.fail("Unable to locate object: " + AllocateToElem.toString());
		}

		elem.click();
		Thread.sleep(1000);


		ExtentReportManager.passStep(m_Driver, "Click_AllocateTo");

		TestModellerLogger.PassStep(m_Driver, "Click_AllocateTo");
	}


	/**
	 * Enter AllocateTo1Inside
	 * @throws InterruptedException 
	 * @name Enter AllocateTo1Inside
	 */
	public void Enter_AllocateTo1Inside(String AllocateTo1Inside) throws InterruptedException
	{

		WebElement elem = getWebElement(AllocateTo1InsideElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AllocateTo1Inside", "Enter_AllocateTo1Inside failed. Unable to locate object: " + AllocateTo1InsideElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AllocateTo1Inside", "Enter_AllocateTo1Inside failed. Unable to locate object: " + AllocateTo1InsideElem.toString());

			Assert.fail("Unable to locate object: " + AllocateTo1InsideElem.toString());
		}

		String p =AllocateTo1Inside;
		System.out.print("box2"   +p );
		//m_Driver.findElement(By.xpath("//*[Contains(text(),'" +p+ "')]")).click();
		////*[contains(text(),'ABC')]
		m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
		Thread.sleep(4000);
		// 		elem.sendKeys(AllocateTo1Inside);
		// 		Thread.sleep(1000);
		// 		elem.sendKeys(Keys.ENTER);
		// 		List<WebElement> li = m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li"));

		// 		int size = li.size();
		// 		System.out.println("Size"+size);
		// 		
		// 		for (int i = 0; i <size; i++) {
		//			WebElement selected = li.get(i);
		//			String[] dd = selected.getText().split(" ");
		//			//System.out.println(led[0].trim());
		//			System.out.println("11"+dd[0]);
		//			System.out.println("12"+AllocateTo1Inside);
		//			
		//			if (dd[0].trim().equals(AllocateTo1Inside)) 
		//			{
		//				//robot.setAutoDelay(200);
		//				//Thread.sleep(5000);
		//				selected.click();
		//				break;
		//			}
		//}



		ExtentReportManager.passStep(m_Driver, "Enter_AllocateTo1Inside " + AllocateTo1Inside);

		TestModellerLogger.PassStep(m_Driver, "Enter_AllocateTo1Inside " + AllocateTo1Inside);
	}


	/**
	 * Click SaveButton
	 * @name Click SaveButton
	 */
	public void Click_SaveButton()
	{

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
		}

		elem.click();


		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");


	}

	int t=1;
	public void FillTrns() throws InterruptedException

	{
		GetData ob=new GetData(m_Driver);
		//HashMap<String, String>hm1=new HashMap<String, String>();
		String out=ob.out();
		String out2=ob.out2();
		String[]data1=out.split("_");
		String[]data2=out2.split("-");
		System.out.println(data1.length);
		System.out.println(data2.length);
		//hm1=ob.GetTData();
		//for(Map.Entry<String, String>kk:hm1.entrySet())
		{
			// out=out+"#"+kk.getKey();
			//System.out.println(kk.getKey());
		}


for(int p=0;p<10;p++)
{
System.out.println("New For");
		List<WebElement> list=m_Driver.findElements(By.xpath("//*[@id='tableID']/tbody/tr/td[4]"));
		int size=list.size();
		for(int i=0;i<size;i++)
		{
			WebElement date =jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDate']")));
			//	List<	WebElement> date = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
			//		List<	WebElement> date=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[4]")));
			//date.get(i).sendKeys("14/09/2021");
			Thread.sleep(4000);
			date.sendKeys("14/09/2021");
			Thread.sleep(4000);
			//System.out.println(date);

			WebElement Received=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtDbAmount']")));
			//List<	WebElement> Received=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[7]")));
			Thread.sleep(4000);
			Received.sendKeys("400");
			Thread.sleep(4000);
			//System.out.println(Received);
			WebElement spent=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_txtAmount']")));
			//List<	WebElement> spent=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[8]")));
			Thread.sleep(4000);
			spent.sendKeys("1");
			Thread.sleep(4000);
			//System.out.println(spent);
			WebElement Vat=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl0"+i+"_ddVATRate']")));
			//WebElement VatType=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptRecord$ctl0"+i+"$ddVATRate']"));
			//List<	WebElement> VatType=	jsWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tableID']/tbody/tr/td[11]")));

			Thread.sleep(4000);
			Select dropdown = new Select(Vat);
			Thread.sleep(4000);
			dropdown.selectByVisibleText("Standard Rate");
			Thread.sleep(4000);
			//System.out.println(Vat);
			//List<WebElement>dis=m_Driver.findElements(By.xpath("//*[@id='tableID']/tbody/tr/td[5]"));
			WebElement dist=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_cPH_rptRecord_ctl0"+i+"_txtDescription\"]")));
			Thread.sleep(4000);
			dist.sendKeys(data2[t]);
			Thread.sleep(4000);
			List<WebElement> Allot=m_Driver.findElements(By.xpath("//*[@id=\"tableID\"]/tbody/tr/td[14]/select"));
			

			Thread.sleep(4000);
			Select dropdown1 = new Select(Allot.get(i));
			Thread.sleep(4000);
			dropdown1.selectByVisibleText(data1[t]);
			Thread.sleep(4000);

			t++;
			if(i==9)

			{
				m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnSave\"]")).click();
				Thread.sleep(4000);
			}

		}
}







	}
}











