package VAT3_InvoiceUnreconcileCases;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/54e5bdb7-c111-48ce-97b4-107a3bda5318
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 894, profileId = 100788)
public class ScriptVATOnlyInvoiceStandToFlat_DefaultProfile_2 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	

    
    @Test  (groups= {"ScriptVATOnlyInvoice","ScriptVATOnlyInvoice - Default Profile"})
    @TestModellerPath(guid = "80a9d069-199d-4f54-bdaa-4b6389ffb3ce")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC357";
    	
    	Sheet="VAT3_Invoice";
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
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.VATOnlyInvoice _VATOnlyInvoice = new pages.VATOnlyInvoice(driver);
//    TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
//    _VATOnlyInvoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
//    _VATOnlyInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
    _VATOnlyInvoice.Click_SalesTAB();
    

    TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
    _VATOnlyInvoice.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
    _VATOnlyInvoice.Click_VATOnlyInvoice();
    

    TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
    _VATOnlyInvoice.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
    _VATOnlyInvoice.Enter_InvoiceNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
    _VATOnlyInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
    _VATOnlyInvoice.Enter_SubTotal(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
    _VATOnlyInvoice.Select_VATRateType(data[9]);
    
    

//    TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
//    _VATOnlyInvoice.Enter_VATRate("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
//    _VATOnlyInvoice.Enter_VATAmount("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
//    _VATOnlyInvoice.Enter_GrossTotal("");
//    

//    TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
//    _VATOnlyInvoice.Enter_ConvertedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
    _VATOnlyInvoice.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptVATOnlyInvoice","ScriptVATOnlyInvoice - Default Profile"})
    @TestModellerPath(guid = "d40062cd-e960-458c-a525-9f4b0e3ec85d")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	
    	sTestCaseID="TC358";
    	Sheet="VAT3_Invoice";
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
    

pages.VATOnlyInvoice _VATOnlyInvoice = new pages.VATOnlyInvoice(driver);
//    TestModellerLogger.SetLastNodeGuid("022b9dec-7d48-413f-862f-046626f82bd5");
//    _VATOnlyInvoice.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("56572bdb-37f0-4286-88f7-beee95c645c7");
//    _VATOnlyInvoice.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f0e2d203-a051-48b0-b278-8778e9dd05d2");
    _VATOnlyInvoice.Click_SalesTAB();
    

    TestModellerLogger.SetLastNodeGuid("274df502-bd54-494b-ac44-5675d06e691c");
    _VATOnlyInvoice.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d36b3d17-9a87-4ed1-b5ec-4c04544f4fc7");
    _VATOnlyInvoice.Click_VATOnlyInvoice();
    

    TestModellerLogger.SetLastNodeGuid("af5213eb-5d8a-417b-a6c7-f9001ab08632");
    _VATOnlyInvoice.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fb8ddf53-f049-479e-bc7f-7616b0c519b3");
    _VATOnlyInvoice.Enter_InvoiceNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8c89f2f4-6bf3-42a1-88c1-ca505b8030fd");
    _VATOnlyInvoice.Enter_InvoiceDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("06ffea53-9b87-4d49-94a9-5911b6d93cf5");
    _VATOnlyInvoice.Enter_SubTotal(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("17ab7377-3f0f-4615-b7e3-000f92b59dc3");
    _VATOnlyInvoice.Select_VATRateType(data[9]);
    

//    TestModellerLogger.SetLastNodeGuid("83b15b8a-fef9-45c4-99a5-7b6bf52e2e39");
//    _VATOnlyInvoice.Enter_VATRate("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b562ab8-e40c-4f33-b2d0-0682cb23afb6");
//    _VATOnlyInvoice.Enter_VATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("945fc6d7-6180-473c-a32b-0a95f5a89bac");
//    _VATOnlyInvoice.Enter_GrossTotal("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1b120cb0-aa11-4b86-a6d8-2e40fc7e36ef");
//    _VATOnlyInvoice.Enter_ConvertedAmount("100");
//    

    TestModellerLogger.SetLastNodeGuid("a2bdfe37-c194-4ea0-b657-4d576468655c");
    _VATOnlyInvoice.Click_SaveButton();
    

    }

}
