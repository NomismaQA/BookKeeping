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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b2be98ef-27a4-4dc7-8ef3-954c09b61151
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1526, profileId = 101514)
public class SA_SAClient extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "945cd79a-a9d7-43f1-b3b2-694057cdcf02")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="Dashboard-Self-Assessment";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
        
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
        
       FIN_3821.AgentSearch_SA _AgentSearch = new FIN_3821.AgentSearch_SA(driver);
//      TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//      _AgentSearch.GoToUrl();
  //    

//      TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//      _AgentSearch.AssertUrl();
      

      TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
      _AgentSearch.Click_Agents();
      

      TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
      _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
      

      TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
      _AgentSearch.Click_Search();
      

      TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
      _AgentSearch.Click__Nidhi1_();
      
     FIN_3821.client _Searchclient = new FIN_3821.client(driver);
////    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
////    _Searchclient.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
////    _Searchclient.AssertUrl();
    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Enter_Client_Name2("a");
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Select_Service_Sa("Self Assessment");
    

   TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Select_Type("Individual");

           TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click_Search_btnn();
       
       
        
   //   FIN_3821.SA _SA = new FIN_3821.SA(driver);
    // TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
////    _SA.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
//    _SA.Click_SA();
//    

//FIN_3821.SA2 _SA2 = new FIN_3821.SA2(driver);
//
//    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
//    _SA2.Click_Clients_Left_menu();
//   
//
//    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
//    _SA2.Enter_Client_name2("Self Assessment");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
//    _SA2.Select_Client_type2("Individual");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
//    _SA2.Select_Without_Feeds3("Active");
//    
//
//    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
//    _SA2.Select_Unreco_Trans4("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
//    _SA2.Click_Update_btt5();
    

    }
   

/*    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "238b53b4-9779-45c7-8e7e-8f8776f5b448")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel1()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("repellat");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "543e8870-21e6-45c9-b471-d15e7b63c86c")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel2()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("impedit");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "287dcc2d-d06e-4b84-b7ee-ee50e9d9b575")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel3()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Individual");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "fcc74759-b109-4814-a8d9-6b9c07744d46")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel4()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("incidunt");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("LimitedCompany");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "75036a8d-5ab6-4deb-ab46-24b3173d8d7a")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel5()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("molestiae");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("LLP");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "d54dae82-fa80-418f-80de-d7bab9a619b4")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel6()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("quisquam");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Partnership");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "55ab7dc6-e6f4-465a-a472-15f4b5132e66")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel7()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("accusamus");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("PLC");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "9f4cc736-f717-46cc-b6bf-f517581b4020")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel8()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("est");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("SoleTrader");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }*/

}