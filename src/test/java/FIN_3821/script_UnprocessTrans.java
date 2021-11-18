package FIN_3821;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4167a3bc-7dc3-4673-80b7-a1128e4abcde
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1523, profileId = 101505)
public class script_UnprocessTrans extends TestBase
{
    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"script","script - Unprocess_Trans"})
    @TestModellerPath(guid = "8fc7394e-f5e4-4fac-b972-d423456eef59")
    public void GoToUrlClickUnreconsiledBnktrnClickReports3menuClickUnprocessedTransReprtClickunprocessedtrnsrp() throws InvalidFormatException, InterruptedException
    {
    	
    	sTestCaseID="script_UnprocessTrans";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
    	pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
        
        
    	
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
       	
        
FIN_3821.UnreconsiledBanktrn _UnreconsiledBanktrn = new FIN_3821.UnreconsiledBanktrn(driver);
//    TestModellerLogger.SetLastNodeGuid("3062a097-09b6-4099-aa87-6bdbea4fc3ed");
//    _UnreconsiledBanktrn.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c744f008-b3fb-4066-b49e-402d90092300");
    _UnreconsiledBanktrn.Click_Unreconsiled_Bnk_trn();
    

FIN_3821.unprocessedtran _unprocessedtran = new FIN_3821.unprocessedtran(driver);
    TestModellerLogger.SetLastNodeGuid("ad4a55b2-2a03-4622-a40f-aa3ea7992367");
    _unprocessedtran.Click_Reports3_menu();
    

    TestModellerLogger.SetLastNodeGuid("0945e093-1c0f-494a-bb76-87fc33c4896f");
    _unprocessedtran.Click_Unprocessed_Trans_Reprt();
    

    TestModellerLogger.SetLastNodeGuid("81ffac9d-02c5-47c2-83cd-423f1fbaf96e");
    _unprocessedtran.Click_unprocessed_trns_rpt_link();
    

    }

}