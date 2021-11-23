package VAT3.FullREC_S2_NOVAT;

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
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b5d42ceb-4526-4531-bacd-4b7a732130c3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 994, profileId = 100890)
public class Supplier_PostVATReturn3stVATReturnReport_3 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn3stVATReturnReport","ScriptVATReturn3stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "8e1bf2bb-635b-4652-bcac-189d64c48f01")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="Vat3_FR_S2NOVAT_POSTVR3";
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
    

pages.VAT3.VATReturn3rdVATRetrunReport _VATReturn3rdVATRetrunReport = new pages.VAT3.VATReturn3rdVATRetrunReport(driver);
//    TestModellerLogger.SetLastNodeGuid("4def1fd0-159a-438c-923f-b533feef9558");
//    _VATReturn3rdVATRetrunReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8c630d5c-8762-4ec9-9817-4841428a2bb8");
//    _VATReturn3rdVATRetrunReport.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b9664ea4-797d-42b0-aaa5-91e5e63868e5");
    _VATReturn3rdVATRetrunReport.Click__VAT_Returns_();
    

    TestModellerLogger.SetLastNodeGuid("c9648fad-a8df-454a-b978-f289b2d9ad43");
    _VATReturn3rdVATRetrunReport.Click_SettingsTAB();
    

    TestModellerLogger.SetLastNodeGuid("0fbe2754-ff07-48b5-9eba-62d27ad2c158");
    _VATReturn3rdVATRetrunReport.Click_VATReturnReportTAB();
    

    TestModellerLogger.SetLastNodeGuid("aa0261eb-3bee-45f1-8d96-b15ed02c4bdc");
    _VATReturn3rdVATRetrunReport.Click_DownLoadLink();
    

    TestModellerLogger.SetLastNodeGuid("c2605320-1dd6-42c3-aca6-d07eb87b9080");
    _VATReturn3rdVATRetrunReport.Click_PDFOption();
    

    TestModellerLogger.SetLastNodeGuid("ac28e009-0bef-4304-b299-83ae3b2bcbb3");
    _VATReturn3rdVATRetrunReport.Click__VATReturnReportClose();
    

    }

}
