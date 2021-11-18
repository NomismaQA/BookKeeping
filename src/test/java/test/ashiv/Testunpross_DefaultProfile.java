package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/09132f73-fc0c-4ad6-8527-8a705dcfdd43
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1848, profileId = 102381)
public class Testunpross_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;


    
    @Test  (groups= {"Test unpross","Test unpross - Default Profile"})
    @TestModellerPath(guid = "ce8be29c-6a6d-42b3-9744-65b87484bc2b")
    public void GoToUrlClickView2ClickUnprocessedReceipts3ClickUploadReceipt4Enterctl00cPHFileUpload5ClickUplo() throws InvalidFormatException, InterruptedException
    {
      	sTestCaseID="TC15";
       	Sheet="BankingBank";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.Login1VAT _Login1VAT = new pages.banking.ashiv.Login1VAT(driver);
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
    

    pages.banking.ashiv.AgentsSelect _AgentsSelect = new pages.banking.ashiv.AgentsSelect(driver);
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
    

    pages.banking.ashiv.ClientSelect _ClientSelect = new pages.banking.ashiv.ClientSelect(driver);

    

    TestModellerLogger.SetLastNodeGuid("ff5edd38-07b0-452b-95d6-f33e07e1e975");
    _ClientSelect.Click_ClientsTAB();
    

    TestModellerLogger.SetLastNodeGuid("14a94a5a-c1ac-4e4f-afd4-69a84ffa5a24");
    _ClientSelect.Enter_ClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed3e4750-33a4-4d75-a14c-9d75935c79c7");
    _ClientSelect.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e537c9d6-4166-4745-b27e-a178d69d2884");
    _ClientSelect.Click_SelectClient();
    
        As_Supplier.Unpros _Unpros = new As_Supplier.Unpros(driver);
//    TestModellerLogger.SetLastNodeGuid("dbad4ded-902b-4280-92fa-8b56629bfd4a");
//    _Unpros.GoToUrl();
//    
        _Unpros.Click_Expen1();

    TestModellerLogger.SetLastNodeGuid("b7640708-6a80-4f51-ac51-f8bfe6192dbf");
    _Unpros.Click_View_2();
    

    TestModellerLogger.SetLastNodeGuid("629b30f7-d311-472f-92a6-ce540d57c606");
    _Unpros.Click_Unprocessed_Receipts_3();
    

    TestModellerLogger.SetLastNodeGuid("7a9eebce-c56b-4892-866d-56094d55a3f3");
    _Unpros.Click_Upload_Receipt_4();
    

    TestModellerLogger.SetLastNodeGuid("0e218ec4-a50b-4aa2-9b88-8e8e2eb700cb");
    _Unpros.Enter_ctl00cPHFileUpload_5("D:\\New folder\\INV-1.pdf");
    

    TestModellerLogger.SetLastNodeGuid("4bf5a0d3-73aa-4c59-be3b-b8bc5acfcfb6");
    _Unpros.Click_Upload_6();
    Thread.sleep(2000);
    utilities.Screenshotcapture.Getscreenshot("unpross File Information", "Unpross");
    

    }

}