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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/528fe538-b7c1-4103-9839-6690ad4a4c35
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1524, profileId = 101508)
public class businesswithoutuser_busineswithoutuser extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"business_without_user","business_without_user - busines_without_user"})
    @TestModellerPath(guid = "07a79700-10da-4224-835f-9940c249d9c2")
    public void GoToUrlClickWithoutBussinessusrClickAgentReportsClickBusinesseswithoutusersPositiveEnterClientN() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="Businesses_without_businessUsers";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
 
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
        
        //pages.nlogin _nlogin = new pages.nlogin(driver);
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
 FIN_3821.BusinessUser _BusinessUser = new FIN_3821.BusinessUser(driver);
 //   TestModellerLogger.SetLastNodeGuid("30ac18a6-c18c-459a-a0a0-372def465f5c");
   // _BusinessUser.GoToUrl();
    

    
    TestModellerLogger.SetLastNodeGuid("591224e8-b755-41d9-bf71-863633c2b6dc");
    _BusinessUser.Click_Without_Bussiness_usr();
    

FIN_3821.withoutuser _withoutuser = new FIN_3821.withoutuser(driver);
    TestModellerLogger.SetLastNodeGuid("061c6937-e1cd-40b8-9bef-0f69ed97a9b3");
    _withoutuser.Click_Agent_Reports();
    

    TestModellerLogger.SetLastNodeGuid("8156580c-8974-4806-a569-15030e664a55");
    _withoutuser.Click_Businesses__without__users();
    
//
//    TestModellerLogger.SetLastNodeGuid("dabdb721-dc93-4081-8c9e-a2b3444bfb7e");
//    _withoutuser.Enter_Client_Name1("doloremque");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ace96b4c-1879-4477-aca3-8ea53f7d87f7");
//    _withoutuser.Enter_user_count("");
    

    TestModellerLogger.SetLastNodeGuid("d74692c6-6b1a-4e81-9793-7acf45de9a5d");
    _withoutuser.Click_Search__btnn();
    

    }

}