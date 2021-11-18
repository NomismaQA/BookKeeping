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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6d47a07d-45ee-4033-88d8-db00322a9f8d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1117, profileId = 101011)
public class SubcontractorBill_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"SubcontractorBill","SubcontractorBill - Default Profile"})
    @TestModellerPath(guid = "6ef9821f-c4e1-46e7-9833-cf5d63ed1f74")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertAgentClientBusinessExpenditure_NewSubcontrator_SaveBtnSuccessMessageScreenWithInvoiceNumRecallLastTrnschangeBillNum() throws HeadlessException, InterruptedException, IOException, AWTException, InvalidFormatException
    {
    	
    	sTestCaseID="TC16";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new  pages.banking.ashiv.Login1VAT(driver);
        TestModellerLogger.SetLastNodeGuid("93e4a214-3f97-41d2-8063-dd91c879e847");
        _Login1VAT.GoToUrl();
        

        TestModellerLogger.SetLastNodeGuid("7eff8b4c-1e47-48a4-bcad-b3639d0cdfd5");
        _Login1VAT.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("ceaa193b-d8c0-48f9-911f-018e2571da20");
        _Login1VAT.Enter_UserName(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("95b31ed9-af0a-49e7-8bfa-8471d379cdff");
        _Login1VAT.Enter_Password(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("942414e4-1d0e-45ba-bdd1-43293b97e0ff");
        _Login1VAT.Click_LoginButton();
        

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new   pages.banking.ashiv.AgentsSelect(driver);
    
//        TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//        _AgentsSelect.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//        _AgentsSelect.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
        _AgentsSelect.Click_AgentsTab();
        

        TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
        _AgentsSelect.Enter_AgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
        _AgentsSelect.Click_SearchButton();
        

        TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
        _AgentsSelect.Click_SelectAgent();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver); 
    	 
    	  TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	  _Searchclient.Click__Clients_(); 

    	  TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	  _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);


    	  TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	  _Searchclient.Click_Searchbtn(); 
    	  
    	  TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	  _Searchclient.Click__NidhiEnt(); 
        
        As_Supplier.SubcontractorBill _SubcontractorBill = new As_Supplier.SubcontractorBill(driver);
//    TestModellerLogger.SetLastNodeGuid("355a9f96-5c6e-472d-8244-fc4e783d33da");
//    _SubcontractorBill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b9a9b49e-0aaa-427e-87a4-19884938463b");
//    _SubcontractorBill.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4796aef3-8477-4275-b4bb-6d6a3ebba61c");
    _SubcontractorBill.Click_ExpenditueTAB();
    

    TestModellerLogger.SetLastNodeGuid("78a64503-4448-4f57-9eb6-742843d999ad");
    _SubcontractorBill.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("21157931-04de-463a-90f4-ba56626d317f");
    _SubcontractorBill.Click_NewSubcontractorBill();
    
    utilities.Screenshotcapture.Getscreenshot("Subcontractor From", "SubContractor");

    TestModellerLogger.SetLastNodeGuid("b1860480-a11d-4594-a0bc-88b7617e0124");
    _SubcontractorBill.Select_Supplier(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("63b23bd0-6a37-42bd-9464-4f7a93d29413");
    _SubcontractorBill.Enter_BillNo(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("19378d60-a3bc-4743-9a34-44f4274e1b54");
    _SubcontractorBill.Enter_Date("");
    
    _SubcontractorBill.Select_ExpenseType(data[12]);
    _SubcontractorBill.Enter_Description(data[6]);

    TestModellerLogger.SetLastNodeGuid("18384de8-0044-4ae4-b91e-19ae43f17ae2");
    _SubcontractorBill.Enter_GrossTotal(data[10]);
    _SubcontractorBill.Select_SelectVATRate(data[11]);
    

   // TestModellerLogger.SetLastNodeGuid("4b405988-6083-4403-bb8e-a9dd93cc4cb6");
   // _SubcontractorBill.Enter_VATRate("100");
    

    TestModellerLogger.SetLastNodeGuid("392e3777-3641-4c73-b42f-46449b31f81a");
    _SubcontractorBill.Click_SaveButton();
    Thread.sleep(2000);

    TestModellerLogger.SetLastNodeGuid("78a64503-4448-4f57-9eb6-742843d999ad");
    _SubcontractorBill.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("21157931-04de-463a-90f4-ba56626d317f");
    _SubcontractorBill.Click_NewSubcontractorBill();
    
    _SubcontractorBill.ClickCancelBtn();
    
    
    }

}
