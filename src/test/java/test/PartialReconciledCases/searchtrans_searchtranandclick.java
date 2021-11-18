package test.PartialReconciledCases;

import reports.TestNGListener;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/099de040-1984-4bfc-85eb-4246ba234a29
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1275, profileId = 101154)
public class searchtrans_searchtranandclick extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "22abe88f-ee14-427a-a301-28b641f5f328")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse1() throws InterruptedException, InvalidFormatException
    {
        
    	sTestCaseID="TC15";
		Sheet="Sheet1";
		data =ExcelUtility.toReadExcelData(sTestCaseID,Sheet);
    	
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("admin");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("sandbox@nom");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

   pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    //    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
  //    _AgentSearch.AssertUrl();
    
   TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("Nidhi1");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("NidhiEnt");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//    _bankmenu.GoToUrl();
    

    //TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
   // _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

   // TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
  //  _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.ForSearching _src = new pages.PartialReconciledCases.ForSearching(driver);
 //   TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
 //   _src.GoToUrl();
    

   // TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
   // _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Transaction No");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
   _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("24/01/2021");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
   _src.Enter_DATE_TO("31/03/2021");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

//    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
//    _src.Click__39();
    
    }
    }

/*
    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "33ba8b2b-865a-45a6-9265-43b4790a1fd6")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse2()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("VdFFe3N9Xn");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("consectetur");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kessler - Stanton");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "0a1ab71a-5db5-4af3-b848-9015b3432419")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Z1aPrPUHSi");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dignissimos");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kuhn and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("2020-10-07 10:20:14");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "7510aa2c-2183-4cd5-8cce-57920dec3310")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Zrx9GhXP7u");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("corrupti");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Langworth LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("2021-04-10 15:03:58");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "9ed195a2-07f4-423a-9cba-1fa5f826a965")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("x1Y42RCVD3");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eos");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stamm, Watsica and Von");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("2020-08-20 02:47:52");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "c49c7c69-dfaf-44cd-8ca0-a0d62b797bc6")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("IK6lQSHzbg");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("animi");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Roberts - Frami");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("2021-04-12 10:24:24");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "dc355785-c749-47d7-b6b6-9a9d3fe3c028")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse7()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("43VvAX8QqT");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("optio");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hammes LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Transaction No");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "5363c5e4-68d7-4fa8-b596-228710dd6461")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TeB8aeVxvs");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("non");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Dicki LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Description");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"searchtrans","searchtrans - searchtranandclick"})
    @TestModellerPath(guid = "49e22c92-e6e6-4542-ad2b-e50588fdb3ce")
    public void searchtranandclickGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("DBuv38VENL");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Leannon and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Received-Spent Amount");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44275");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44275");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

}*/