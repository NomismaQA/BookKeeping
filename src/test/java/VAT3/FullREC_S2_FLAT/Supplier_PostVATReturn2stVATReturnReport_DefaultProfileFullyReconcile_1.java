package VAT3.FullREC_S2_FLAT;

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
import utilities.ExcelData;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2a0650a1-85af-44b2-b854-57d71eba6013
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 979, profileId = 100870)
public class Supplier_PostVATReturn2stVATReturnReport_DefaultProfileFullyReconcile_1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn2stVATReturnReport","ScriptVATReturn2stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "9d44cf6f-3ba5-4fa8-9eca-3e2f661fe1a6")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="FULL_Rec_S2F_POSTVR2";
     	Sheet="VAT3";
    	data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
    	pages.nlogin _nlogin = new pages.nlogin(driver);
        
        
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
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
    

pages.VAT3.VATReturn2stVATReturnReport _VATReturn2stVATReturnReport = new pages.VAT3.VATReturn2stVATReturnReport(driver);
//    TestModellerLogger.SetLastNodeGuid("575d6d54-f8f3-46ae-86f4-44bbb4110820");
//    _VATReturn2stVATReturnReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5783c53f-8aa4-434c-9fda-b7cf007f2190");
//    _VATReturn2stVATReturnReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("21719f97-70cf-400b-841d-fcd475e03ef5");
    _VATReturn2stVATReturnReport.Click_VATReturnsTAB2();
    

    TestModellerLogger.SetLastNodeGuid("49135dbe-f8dd-4acd-9409-1debc577f7b8");
    _VATReturn2stVATReturnReport.Click_SettingTab2();
    

    TestModellerLogger.SetLastNodeGuid("b488bec7-fb80-418d-8dc7-0900b85c7edc");
    _VATReturn2stVATReturnReport.Click_VATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("0c8031b0-9c4a-476d-bbe8-18cc99d8d3f9");
    _VATReturn2stVATReturnReport.Click_DownloadVATReturnBackupReport();
    

    TestModellerLogger.SetLastNodeGuid("c52ffb87-ef26-4e2f-8f01-55c75ec823b6");
    _VATReturn2stVATReturnReport.Click__VATReturnBackupReportClose();
    

    }

}
