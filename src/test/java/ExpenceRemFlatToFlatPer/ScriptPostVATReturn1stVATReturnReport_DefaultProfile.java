package ExpenceRemFlatToFlatPer;

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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/259baa6e-bb21-438c-bb56-b2ec82a7209c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 978, profileId = 100869)
public class ScriptPostVATReturn1stVATReturnReport_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn1stVATReturnReport","ScriptVATReturn1stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "0851a750-a8bf-40e7-a71b-cab9aa2d47fd")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	
    	sTestCaseID="TC567";
    	Sheet="JournalReconcile";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
        
    	pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
        
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//        _nlogin.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
    

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
    

pages.VATReturn1stVATReturnReport _VATReturn1stVATReturnReport = new pages.VATReturn1stVATReturnReport(driver);
//    TestModellerLogger.SetLastNodeGuid("1f9cfbdc-c35f-4a18-b1be-f70e9bb456c8");
//    _VATReturn1stVATReturnReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("30fb0358-7a58-4e43-8013-f8cdaf9914d0");
//    _VATReturn1stVATReturnReport.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("7c81e8c0-e177-491c-a441-a01d789ff0fa");
    _VATReturn1stVATReturnReport.Click_VATReturnsTAB();
    

//    TestModellerLogger.SetLastNodeGuid("cb9cd54f-a2b2-40b3-b845-54c49d333854");
//    _VATReturn1stVATReturnReport.Click_SettingTAB();
//    
//
//    TestModellerLogger.SetLastNodeGuid("df3f386c-b63c-44ff-b704-acbd9eeaf56b");
//    _VATReturn1stVATReturnReport.Click_VATReturnReport();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f8d8e85-edcc-47c9-a904-c82deec4e161");
//    _VATReturn1stVATReturnReport.Click_DownloadReturnReportPDF();
//    
//
//    TestModellerLogger.SetLastNodeGuid("651ce399-df59-49c6-9332-d68d27008348");
//    _VATReturn1stVATReturnReport.Click_PDF();
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a931cb-c9bc-4447-9488-90d6ad08bb2e");
//    _VATReturn1stVATReturnReport.Click__VATReturnReportClose();
//    

    }

}
