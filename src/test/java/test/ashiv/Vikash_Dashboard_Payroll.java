package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d524bf91-30d3-42d4-915e-c5e06a23a5a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1106, profileId = 101005)
public class Vikash_Dashboard_Payroll extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

	
    @Test  (groups= {"ScriptDebitNoteSToFRS","ScriptDebitNoteSToFRS - Default Profile"})
    @TestModellerPath(guid = "3e0064e9-38a6-4912-be21-7073afebf84a")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertAgentClientBusinessExpenditure_NewDebitNote_SaveBtnSuccessMessageScreenWithInvoiceNumRecallLastTrnschangeBillNum() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC17";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new  pages.banking.ashiv.Login1VAT(driver);
    TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
    _Login1VAT.GoToUrl();
    

  //  TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
  //  _Login1VAT.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
    _Login1VAT.Enter_UserName(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
    _Login1VAT.Enter_Password(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
    _Login1VAT.Click_LoginButton();
    

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new  pages.banking.ashiv.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName("agent dashboard");
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    
    
    
    
    pages.banking.ashiv.Payroll_Vikas_Dashboard Vikas=new pages.banking.ashiv.Payroll_Vikas_Dashboard(driver);
    		
    
    Vikas.payroll();
    
    Vikas.dashboard("2", "2");
    
    
    
    
    
    
    
    
    
    }
}
    