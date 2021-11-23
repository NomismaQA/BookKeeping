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
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/259baa6e-bb21-438c-bb56-b2ec82a7209c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 978, profileId = 100869)
public class Supplier_SubmitVAT_DefaultProfileFullyReconcile_2 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ScriptVATReturn1stVATReturnReport","ScriptVATReturn1stVATReturnReport - Default Profile"})
    @TestModellerPath(guid = "0851a750-a8bf-40e7-a71b-cab9aa2d47fd")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginButtonGoToUrlAssertUrlCl() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="FULL_Rec_S2F_SumitVat";
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
    	     
        pages.VAT3.SubmitVAT _SubmitVAT = new pages.VAT3.SubmitVAT(driver);
//    TestModellerLogger.SetLastNodeGuid("15f9fa4a-8532-4032-b0bf-cafbb3b4e392");
//    _SubmitVAT.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("935de893-b654-454a-b8a7-b14007778b92");
//    _SubmitVAT.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("4a2f95d8-3539-411e-9137-64e9b56f2b10");
    _SubmitVAT.Click_VATReturnsTAB();
    

    TestModellerLogger.SetLastNodeGuid("0f96de08-35de-4dce-970d-0a6ddc281f00");
    _SubmitVAT.Click_ClickOnEditLink();
    

    TestModellerLogger.SetLastNodeGuid("e82ad76f-ea2f-4a04-943b-aaf520f978d0");
    _SubmitVAT.Select_VATTypeCategory("VAT INPUT()");
    

    TestModellerLogger.SetLastNodeGuid("e82d1a89-7cd9-4dd7-87c2-1c9887ff7252");
    _SubmitVAT.Click_SaveContinue();
    

    TestModellerLogger.SetLastNodeGuid("39a36972-765d-4cda-8ecb-33e496954625");
    _SubmitVAT.Click_MarkasFiled();
    

    }

}
