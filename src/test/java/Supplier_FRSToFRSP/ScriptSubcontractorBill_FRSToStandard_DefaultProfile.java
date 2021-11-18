package Supplier_FRSToFRSP;

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
public class ScriptSubcontractorBill_FRSToStandard_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptSubcontractorBillSToFRS","ScriptSubcontractorBillSToFRS - Default Profile"})
    @TestModellerPath(guid = "0d9648c1-3d2d-48e7-bff1-619d6b9a009c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC254";
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
    


   pages.Subcontractorbill _SubcontractorN = new pages.Subcontractorbill(driver);
//TestModellerLogger.SetLastNodeGuid("6018ac47-e9cf-4171-b996-3a24d78757cc");
//_SubcontractorN.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("20f4c8d4-b6df-4990-b4c3-8ebbc0824907");
//_SubcontractorN.AssertUrl();


TestModellerLogger.SetLastNodeGuid("ff4b155c-ad2e-48c0-81c3-51d0dacaa6a6");
_SubcontractorN.Click_Expenditure_Menu1();


TestModellerLogger.SetLastNodeGuid("becf8109-2d72-4b67-8953-e89c8ad59005");
_SubcontractorN.Click_New_menu2();


TestModellerLogger.SetLastNodeGuid("633a6a7b-4dff-43c1-9fba-3589cef545d1");
_SubcontractorN.Click_New_Subcontractor_Bill3();


TestModellerLogger.SetLastNodeGuid("91e4ffcf-65b0-4881-900a-0325c9ecb9f8");
_SubcontractorN.Enter_BillNo4(data[5]);


TestModellerLogger.SetLastNodeGuid("4fd3b433-534e-46d4-8747-d8a9e3ffd89b");
_SubcontractorN.Select_Supplier5(data[6]);


TestModellerLogger.SetLastNodeGuid("0437b205-4ea5-45c0-9ccd-c21dddeba1d4");
_SubcontractorN.Enter_tDate6(data[7]);


TestModellerLogger.SetLastNodeGuid("04d964b7-b5de-44ba-a5aa-8c5d82839c98");
_SubcontractorN.Enter_DueDate7(data[8]);


TestModellerLogger.SetLastNodeGuid("a62f7495-5d10-441f-8d75-580d4ecc6b7c");
_SubcontractorN.Select_Expense_type8(data[9]);


TestModellerLogger.SetLastNodeGuid("e6917d98-53ad-4318-9c8a-b8c4c705991a");
_SubcontractorN.Enter_Description9(data[10]);


TestModellerLogger.SetLastNodeGuid("cb1baeb2-b00f-4af9-8bec-3071a977725b");
_SubcontractorN.Enter_NetTotal10(data[11]);


TestModellerLogger.SetLastNodeGuid("4e9a2e35-6e21-4259-9bf8-47e486fcf927");
_SubcontractorN.Select_VATRate11(data[12]);


//TestModellerLogger.SetLastNodeGuid("1c814cf6-9c3d-4b0f-bbff-395b2e28c035");
//_SubcontractorN.Enter_VATRate(data[13]);


//TestModellerLogger.SetLastNodeGuid("baef6454-50a9-4dc8-8de0-6bea5aa592a4");
//_SubcontractorN.Enter_Note(data[14]);


TestModellerLogger.SetLastNodeGuid("a3dfe750-3574-492d-9439-4e15a2a93a0a");
_SubcontractorN.Click_Save16();
 }
}
