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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c6881ec7-1215-43b4-b853-58c0193e64eb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 849, profileId = 100728)
public class ScriptSaleCreditNoteStandToFlat_DefaultProfile_1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	

    
    @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "854b68e0-ffd5-42ee-846c-dcf3c8b15a56")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl1() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC328";
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    

    }

  @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "a4d21356-ce4a-4dc4-917d-9982237ef892")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl2() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC329";
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
  

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
   

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

  //  TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
  //  _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    

    }
   @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "3ed9c236-bfaa-4c33-b17c-748bcd8583b3")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl3() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC330";
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
//    /TestModellerLogger.SetLastNodeGuid("1243c994-d23d-40d1-bc93-38dfdab760ed");
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    

    }

    @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "2cc21c8a-9cc4-4284-93ff-6768139dcc06")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl4() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC331";
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
   

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    

    }

   @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "36a1f736-bed1-4998-a5f8-618d95f09623")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl5() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC332";
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

   TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
   

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

   // TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
   // _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    

    }

     @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "7d5f788f-7b26-4589-a4f4-7f5a13b38a17")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl6() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC333";
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
    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
    _SaleCreditNote.Enter_CreditNoteDate(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
    _SaleCreditNote.Select_IncomeType1(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
    _SaleCreditNote.Enter_InvoiceNo(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
    _SaleCreditNote.Enter_CreditDescription(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
    _SaleCreditNote.Enter_UnitPrice(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
    _SaleCreditNote.Enter_Quantity(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
    _SaleCreditNote.Select_VATRateType(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//    _SaleCreditNote.Click_Tickformorelineitems();
    

    TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
    _SaleCreditNote.Enter_Note(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
    _SaleCreditNote.Click_SaveButton();
    }

/* @Test  (groups= {"ScriptSaleCreditNote","ScriptSaleCreditNote - Default Profile"})
    @TestModellerPath(guid = "d5a68b74-55ae-4a96-b7e6-8aeac0c8a89c")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl7() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC15";
       	Sheet="Sale_NewInvoice";
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
    

pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//    TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//    _SaleCreditNote.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//    _SaleCreditNote.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
    _SaleCreditNote.Click_SalesTab();
    

    TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
    _SaleCreditNote.Click_NewButton();
    

    TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
    _SaleCreditNote.Click_NewCreditNote();
    

    TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
    _SaleCreditNote.Select_CustomerName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
    _SaleCreditNote.Enter_CreditNoteNo("");
    

    }*/

}
