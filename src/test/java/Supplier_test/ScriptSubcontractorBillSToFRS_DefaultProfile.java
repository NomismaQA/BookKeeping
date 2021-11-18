package Supplier_test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3b651a2f-a434-4adb-af4d-2f5dc3f64348
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1118, profileId = 101013)
public class ScriptSubcontractorBillSToFRS_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptSubcontractorBillSToFRS","ScriptSubcontractorBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "0d9648c1-3d2d-48e7-bff1-619d6b9a009c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC146";
    	Sheet="Supplier";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.Login1VAT _Login1VAT = new pages.Login1VAT(driver);
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
    

pages.AgentsSelect _AgentsSelect = new pages.AgentsSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("69016c4b-a736-45bf-a682-5c03ee8d17cd");
//    _AgentsSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd071d41-148c-42e8-8300-984c9dd4df87");
//    _AgentsSelect.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bd031a68-650a-4b8c-8e7c-0ce87415e17e");
    _AgentsSelect.Click_AgentsTab();
    

    TestModellerLogger.SetLastNodeGuid("d5b61053-e5d4-479f-87c7-e4be6b5f054a");
    _AgentsSelect.Enter_AgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("2bae82eb-0e45-434c-b1bd-7336f304d4f9");
    _AgentsSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("be317b25-3125-4191-86a5-e8ffee0d0334");
    _AgentsSelect.Click_SelectAgent();
    

pages.ClientSelect _ClientSelect = new pages.ClientSelect(driver);
//    TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
//    _ClientSelect.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b42ff41f-2fec-4f5c-b77b-2742ec894ec7");
//    _ClientSelect.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

Supplier_pages.SubcontractorBill _SubcontractorBill = new Supplier_pages.SubcontractorBill(driver);
//    TestModellerLogger.SetLastNodeGuid("355a9f96-5c6e-472d-8244-fc4e783d33da");
//    _SubcontractorBill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b9a9b49e-0aaa-427e-87a4-19884938463b");
//    _SubcontractorBill.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("4796aef3-8477-4275-b4bb-6d6a3ebba61c");
//    _SubcontractorBill.Click_ExpenditureTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78a64503-4448-4f57-9eb6-742843d999ad");
//    _SubcontractorBill.Click_NewTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("21157931-04de-463a-90f4-ba56626d317f");
//    _SubcontractorBill.Click_NewSubcontractorBill();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b1860480-a11d-4594-a0bc-88b7617e0124");
//    _SubcontractorBill.Select_SupplierName(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("63b23bd0-6a37-42bd-9464-4f7a93d29413");
//    _SubcontractorBill.Enter_BillNo(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("19378d60-a3bc-4743-9a34-44f4274e1b54");
//    _SubcontractorBill.Enter_Date(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("18384de8-0044-4ae4-b91e-19ae43f17ae2");
//    _SubcontractorBill.Enter_Total_Amount(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b405988-6083-4403-bb8e-a9dd93cc4cb6");
//    _SubcontractorBill.Enter_VATAmount(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("392e3777-3641-4c73-b42f-46449b31f81a");
//    _SubcontractorBill.Click__Save_();
    

    }

}
