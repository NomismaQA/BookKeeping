package FIN_3821;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/33526af2-9cfa-42b5-a553-c4ef03ff2cf9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1522, profileId = 101504)
public class Script_UnprocessRcpt extends TestBase
{
    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    
    @Test  (groups= {"Script","Script - Unprocess_Rcpt"})
    @TestModellerPath(guid = "4ab09b90-8583-414f-a913-d7088691cd29")
    public void GoToUrlClickPendingReceiptClickReportsmenu2ClickUnprocessedReceiptslinkClickpdficon() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="Script_UnprocessRcpt";
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
    
     FIN_3821.Pendingrcpt _Pendingrcpt = new FIN_3821.Pendingrcpt (driver);
//    TestModellerLogger.SetLastNodeGuid("8466d8e0-a49e-4acb-abe2-b271d02f8939");
//    _Pendingrcpt.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3a660c89-923e-4ee5-a675-c7701376bc07");
    _Pendingrcpt.Click_Pending_Receipt();
    
FIN_3821.unprocessed_rcpt _unprocessed_rcpt = new FIN_3821.unprocessed_rcpt(driver);

    TestModellerLogger.SetLastNodeGuid("a1245fd5-cb47-42c6-bde1-89a6b3b4e7b2");
    _unprocessed_rcpt.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("20c1721c-cd3d-4474-8122-e4c329f2e4e5");
    _unprocessed_rcpt.Click_Unprocessed_Receiptslink();
    

    TestModellerLogger.SetLastNodeGuid("84080e01-69ab-4459-be77-dfea929ae361");
    _unprocessed_rcpt.Click_pdf_icon();
    

    }

}