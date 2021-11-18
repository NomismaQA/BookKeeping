package test.PartialReconciledCases;

import reports.TestNGListener;
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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47e8a409-e47a-49bb-a2ca-a7323a0e9133
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 999, profileId = 100895)
public class Verifytrans_verifybacnktransaction extends TestBase
{	
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "157368e1-c415-441f-aebd-679cf3a933f1")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl1() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
        
    	sTestCaseID="TC1";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC1", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
 
      Thread.sleep(1000);
    pages.PartialReconciledCases.src _src = new pages.PartialReconciledCases.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhi2");
    
//
//   TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
//    _src.Select_Search_category("Select");
    
//    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
//   _src.Enter_Enter_code("");
    

  TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
  _src.Enter_Date_From("1/02/2021");
   

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("10/10/2021");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
  

    }


    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "3cb28400-3f55-4eb3-a448-cef0179ff99f")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl2() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
    	
    	sTestCaseID="TC2";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC2", "Sheet1");
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
       
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

      pages.PartialReconciledCases.src _src = new pages.PartialReconciledCases.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhi2");
    
//
////    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
////    _src.Select_Search_category("Select");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
//    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("01/01/2021");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("02/31/2021");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "8436314d-7cf0-4f56-b70d-33ff0fd25c59")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl3() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
        
    	sTestCaseID="TC3";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC3", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.PartialReconciledCases.src _src = new pages.PartialReconciledCases.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhi2");
    

//    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
//    _src.Select_Search_category("Select");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
//    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("02/01/2021");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("02/10/2021");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "2ff55d6a-eb79-4265-8bf5-6d650511d2df")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl4() throws InterruptedException, InvalidFormatException, HeadlessException, IOException, AWTException
    {
        
    	sTestCaseID="TC4";
    	Sheet="Sheet1";
    	data =ExcelUtility.toReadExcelData("TC4", "Sheet1");
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

//    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//    _nBANKTRN.Click_Select_Option1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//    _nBANKTRN.Enter_BOX2(data[11]);
//    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.PartialReconciledCases.src _src = new pages.PartialReconciledCases.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhi2");
    

//    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
//    _src.Select_Search_category("Select");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
//    _src.Enter_Enter_code("");
//    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("02/01/2021");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("02/10/2021");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }
}
/*
    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "e38a525d-2240-4da4-8228-6808450f7713")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl5()
    {
    	sTestCaseID="TC5";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC5", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_OgdxsGXTQ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ipsam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hansen Inc");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("2021-03-24 16:22:03");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "b746688f-edb4-4bd1-bcf6-2666d566eb3c")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl6()
    {
    	sTestCaseID="TC6";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC6", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver);
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("wvyR4BDKBz");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Greenfelder and Sons");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Transaction No");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "be5e638c-ae4c-4ab1-aed3-dc3634d8f133")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl7()
    {
    	sTestCaseID="TC7";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC7", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
   
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("xtyjyV32ad");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ernser, Hane and Windler");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Description");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "a1ccdc94-ca31-42e6-ac1c-450080f9fc07")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("MWoiE__XO6");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eaque");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Parker - Fahey");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Received-Spent Amount");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "23db1b49-c6d3-46bd-a80b-2d8d892037ef")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Eu3NXufQRV");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Boyer, Strosin and Kunde");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    
//
//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
//    _src.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("fdfds");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "517b0f91-2b9d-424d-8d39-48b4b58b5765")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl10()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("xwaKcx9jxu");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("totam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Ward - Ernser");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("N and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "7c65faea-ce2d-4ab9-b113-33e08778646e")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl11()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("mejrUUSbL5");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quo");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Smith and Sons");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("N and N corportaion2");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "1e3ca343-1e40-48bc-b036-83c5326f7355")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl12()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("yCKSh6G9mF");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("tempora");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Williamson - Jacobi");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "f205af2b-f010-4579-9885-2a3a9719f581")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl13()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("GhJgibpyQs");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("fugiat");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cormier - Feest");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid0and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "7bb73ab7-37b1-45d3-b335-0ccc432ad2bf")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl14()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("tt1u3I8NK6");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nihil");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Harber Group");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid0and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "07225b0f-dc48-4f09-bd56-41117705af6a")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl15()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("nWUYdIS6JZ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("numquam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Torphy, Upton and Rice");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid4 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "8c641bef-d016-4216-9231-aa7018cc882d")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl16()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("WySwWofYws");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Bednar, Metz and Hartmann");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid6 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "02feff4c-94d9-45d1-8791-f5f5f6f91ab0")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("EhLmVhkSE5");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("sed");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schaefer - Ortiz");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid6 and N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "cd6f7a57-4ff5-48b0-be42-71b3c1e1723d")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("vvMFXkQfyo");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("enim");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Moore - Gerlach");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid7N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "07959ff9-1ead-483d-b941-ecdd95ae6edb")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("0GnxpUClS8");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptatem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Herman, VonRueden and Walter");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nid7N corportaion1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "3d5989f8-7d93-413d-9860-01e8fe0bbf15")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("J1vm6ZqCpl");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quibusdam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Murazik Group");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "a4d06148-0488-41d5-bd20-188b5dcf75d5")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TXJ9d22aZa");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("sit");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wisoky Inc");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "292b7cd4-e40e-41b9-99b3-db2635f76ca1")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("wsfpAhyDfF");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nisi");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hackett, Greenfelder and Boehm");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

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
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "9537a8e3-61b4-4d6e-b921-1fce28bbc39c")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl23()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Zq5wciZywQ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptatem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Prosacco - Torp");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("test");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "81e83cab-63f3-4814-b189-5a608e76917b")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl24()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("fgLfPimJdf");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ea");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Huels Inc");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("NidhiLimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "66b2454c-d80d-4332-be31-82c72554b795")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl25()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("veZl6FoH5b");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("praesentium");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Greenholt LLC");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("NidhiLimited");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "cae71f73-f1e1-4779-b391-470b36c1537c")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl26()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("GTupyt3Qhk");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Predovic LLC");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "d77362c2-53a7-4237-b087-80596f401ca9")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl27()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("N_Pa_AWVsU");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ducimus");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Gislason, Friesen and Zieme");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "6e9aea64-37fd-4e3a-a6d2-6e36f7dacd39")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl28()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("iW0Hihq2Lv");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("culpa");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Metz Group");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "aca4ab6b-f93d-49e3-b783-3d28fe6e5112")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl29()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("OMYJf339gP");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ullam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Greenholt Group");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "7deae304-04b0-4751-a4f4-92b40804b4cd")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl30()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("sdl0NA3_Gp");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Runolfsson, Huel and Hartmann");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2020-04-02 23:58:42");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "5a6c42f2-ee8d-44ca-a9db-d3623123e5ef")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl31()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("UOkJ_fujHz");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("reprehenderit");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Dietrich, Christiansen and Moen");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2021-11-14 02:43:11");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "26449daf-7017-46b6-920f-548197156ed0")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl32()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("vu7fvJq4ah");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("aut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lehner Group");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

    @Test  (groups= {"Verifytrans","Verifytrans - verifybacnktransaction"})
    @TestModellerPath(guid = "ff5945c8-66a6-4cbd-858e-fba2da870e89")
    public void verifybacnktransactionGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrl33()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("DJvItSt4n5");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Crist - Price");
    

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
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.src _src = new pages.src(driver);
    TestModellerLogger.SetLastNodeGuid("894dc652-c38e-4f3c-a352-6daa08c8ccc2");
    _src.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21658f3c-d78b-46d2-a9af-c5087c77096b");
    _src.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bf8f2e9-31c9-4c8c-bab0-05a36509dc1c");
    _src.Select_Sbnk_act("6565676787");
    

    TestModellerLogger.SetLastNodeGuid("cd90bbfb-d2b8-4a65-95a3-f9f0ac3e5d9f");
    _src.Select_Search_category("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb558d04-d820-4f7f-8530-3071135b83f0");
    _src.Enter_Enter_code("");
    

    TestModellerLogger.SetLastNodeGuid("a2b82e9d-4a2a-47ce-9152-9a69b44c91c7");
    _src.Enter_Date_From("44233");
    

    TestModellerLogger.SetLastNodeGuid("3e208f0e-4146-4b7e-ac2f-b2da26b1e87e");
    _src.Enter_DATE_TO("44233");
    

    TestModellerLogger.SetLastNodeGuid("3cf33641-2628-4ddd-a2ac-854483405e81");
    _src.Click_Update_btn();
    

    TestModellerLogger.SetLastNodeGuid("f08f1db2-f3cd-4b7a-ab0b-6d568adfdaae");
    _src.Click__39();
    

    }

}*/