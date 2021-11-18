package VAT3_ExpenseReimbFullyReconcile;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47c92856-78ee-4b1a-a893-c561a22d7ce2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1183, profileId = 101073)
public class SaleInToFullyReconcileForExpenseRem_DefaultProfile_1 extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	 
	
	
	@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
  public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC202";
       	Sheet="VAT3_ExpenseRein";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
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
    

    pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

    pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//  TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//  _Reinbursment.GoToUrl();
//  
//pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
_Reinbursment.Click_ExpenseReimburs();


TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
_Reinbursment.Click_plussgin_clicked();

  TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
  _Reinbursment.Select_Employee_Select(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
  _Reinbursment.Enter_Date_toselect(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
  _Reinbursment.Enter_add_Description(data[7]);


  TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
  _Reinbursment.Select_Select_VATtypeRates(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
  _Reinbursment.Select_Select_ExpenseHead(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
  _Reinbursment.Enter_Enter_Amts(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
  _Reinbursment.Click_Clicked_Save();
    
    
pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//    _bankmenu.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//    _nBANKTRN.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[15]);
    

//    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//    _Reconcilation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1(data[18]);
    

//    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//    _Reconcilation.Click_View_Reconciled_button1();
//    


    pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
  //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
  //_PartialReconcilationLAtest.GoToUrl();
  //
  //
  //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
  //_PartialReconcilationLAtest.AssertUrl();


  TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
  _PartialReconcilationLAtest.Click_SelectALL();


  //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
  //_PartialReconcilationLAtest.Click_ReconcileSelected();


  TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
  _PartialReconcilationLAtest.Click_UngroupSelected();


  TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
  _PartialReconcilationLAtest.Click_R1();


  TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
  _PartialReconcilationLAtest.Click_R2();


  TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
  _PartialReconcilationLAtest.Click_ReconcileLink();


//  TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//  _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//  TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//  _PartialReconcilationLAtest.Click_ReconcileButton();
//  
//  pages.VATReturnSubmitVAT _VATReturn1stVATReturnReport = new pages.VATReturnSubmitVAT(driver);
////TestModellerLogger.SetLastNodeGuid("1f9cfbdc-c35f-4a18-b1be-f70e9bb456c8");
////_VATReturn1stVATReturnReport.GoToUrl();
////
////
////TestModellerLogger.SetLastNodeGuid("30fb0358-7a58-4e43-8013-f8cdaf9914d0");
////_VATReturn1stVATReturnReport.AssertUrl();
////
//
//TestModellerLogger.SetLastNodeGuid("7c81e8c0-e177-491c-a441-a01d789ff0fa");
//_VATReturn1stVATReturnReport.Click_VATReturnsTAB();


 
    }


@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "6cb57d3d-4a0e-45f3-b5f2-ef11cf334916")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2() throws HeadlessException, IOException, InterruptedException, AWTException, InvalidFormatException
    {
    	
    	sTestCaseID="TC203";
       	Sheet="VAT3_ExpenseRein";
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
        

    pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

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
        

    pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
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
        

        pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//        TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//        _EXPMENU.GoToUrl();
        

        TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
        _EXPMENU.Click_Expendituremenu();
        

        TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
        _EXPMENU.Click_Newplus_Click();
        

    pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//        TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//        _Reinbursment.GoToUrl();
    //    
    //pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
    _Reinbursment.Click_ExpenseReimburs();


    TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
    _Reinbursment.Click_plussgin_clicked();

        TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
        _Reinbursment.Select_Employee_Select(data[5]);
        

        TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
        _Reinbursment.Enter_Date_toselect(data[6]);
        

        TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
        _Reinbursment.Enter_add_Description("Standard");
     

        TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
        _Reinbursment.Select_Select_VATtypeRates(data[8]);
        

        TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
        _Reinbursment.Select_Select_ExpenseHead(data[9]);
        

        TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
        _Reinbursment.Enter_Enter_Amts(data[10]);
        

        TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
        _Reinbursment.Click_Clicked_Save();
        
        
    pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//        TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//        _bankmenu.GoToUrl();
        
    //
//        TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//        _bankmenu.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
        

        TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
        _bankmenu.Click_Newmenu();
        

    pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//        TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//        _nBANKTRN.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//        _nBANKTRN.AssertUrl();
    //    

        TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
        _nBANKTRN.Select_BK_SELECT(data[11]);
        

        TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
        _nBANKTRN.Enter_NDate(data[12]);
        

        TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
        _nBANKTRN.Enter_n_desc(data[13]);
        

        TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
        _nBANKTRN.Enter_Recived_amt(data[14]);
        

        TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
        _nBANKTRN.Enter_spnt_amt(data[15]);
        

//        TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//        _nBANKTRN.Select_Select_VATRate("Standard Rate");
        

        TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
        _nBANKTRN.Click_Select_Option1();
        

        TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
        _nBANKTRN.Enter_BOX2(data[16]);
        

//        TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//        _nBANKTRN.Click__1400_DATA();
        

        TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
        _nBANKTRN.Click__Save_();
        

    pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//        TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//        _Reconcilation.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//        _Reconcilation.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
        _Reconcilation.Click_Acntantleftmenu();
        

        TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
        _Reconcilation.Click_plussign();
        

        TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
        _Reconcilation.Select_SelectAccountType1(data[17]);
        

        TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
        _Reconcilation.Select_SelectAccount1(data[18]);
        

//        TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//        _Reconcilation.Click_View_Reconciled_button1();
    //    


        pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
      //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
      //_PartialReconcilationLAtest.GoToUrl();
      //
      //
      //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
      //_PartialReconcilationLAtest.AssertUrl();


      TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
      _PartialReconcilationLAtest.Click_SelectALL();


      //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
      //_PartialReconcilationLAtest.Click_ReconcileSelected();


      TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
      _PartialReconcilationLAtest.Click_UngroupSelected();


      TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
      _PartialReconcilationLAtest.Click_R1();


      TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
      _PartialReconcilationLAtest.Click_R2();


      TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
      _PartialReconcilationLAtest.Click_ReconcileLink();


//      TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//      _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//      TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//      _PartialReconcilationLAtest.Click_ReconcileButton();
      
//      pages.VATReturn1stVATReturnReport _VATReturn1stVATReturnReport = new pages.VATReturn1stVATReturnReport(driver);
//    TestModellerLogger.SetLastNodeGuid("1f9cfbdc-c35f-4a18-b1be-f70e9bb456c8");
//    _VATReturn1stVATReturnReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("30fb0358-7a58-4e43-8013-f8cdaf9914d0");
//    _VATReturn1stVATReturnReport.AssertUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("7c81e8c0-e177-491c-a441-a01d789ff0fa");
//    _VATReturn1stVATReturnReport.Click_VATReturnsTAB();
    
     
        }


@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "b1ba9307-29ad-4bbf-8371-fbf2057bb849")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC204";
       	Sheet="VAT3_ExpenseRein";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
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
    

    pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//  TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//  _EXPMENU.GoToUrl();
  

  TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
  _EXPMENU.Click_Expendituremenu();
  

  TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
  _EXPMENU.Click_Newplus_Click();
  

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//  TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//  _Reinbursment.GoToUrl();
//  
//pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
_Reinbursment.Click_ExpenseReimburs();


TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
_Reinbursment.Click_plussgin_clicked();

  TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
  _Reinbursment.Select_Employee_Select(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
  _Reinbursment.Enter_Date_toselect(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
  _Reinbursment.Enter_add_Description("Standard");


  TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
  _Reinbursment.Select_Select_VATtypeRates(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
  _Reinbursment.Select_Select_ExpenseHead(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
  _Reinbursment.Enter_Enter_Amts(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
  _Reinbursment.Click_Clicked_Save();
  
  
pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//  TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//  _bankmenu.GoToUrl();
  
//
//  TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//  _bankmenu.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
  _bankmenu.Click_Bankingmenu();
  

  TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
  _bankmenu.Click_Newmenu();
  

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//  TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//  _nBANKTRN.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//  _nBANKTRN.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
  _nBANKTRN.Select_BK_SELECT(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
  _nBANKTRN.Enter_NDate(data[12]);
  

  TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
  _nBANKTRN.Enter_n_desc(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
  _nBANKTRN.Enter_Recived_amt(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
  _nBANKTRN.Enter_spnt_amt(data[15]);
  

//  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//  _nBANKTRN.Select_Select_VATRate("Standard Rate");
  

  TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
  _nBANKTRN.Click_Select_Option1();
  

  TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
  _nBANKTRN.Enter_BOX2(data[16]);
  

//  TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//  _nBANKTRN.Click__1400_DATA();
  

  TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
  _nBANKTRN.Click__Save_();
  

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//  TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//  _Reconcilation.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//  _Reconcilation.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_Acntantleftmenu();
  

  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
  _Reconcilation.Click_plussign();
  

  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
  _Reconcilation.Select_SelectAccountType1(data[17]);
  

  TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
  _Reconcilation.Select_SelectAccount1(data[18]);
  

//  TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//  _Reconcilation.Click_View_Reconciled_button1();
//  


  pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
//TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
//_PartialReconcilationLAtest.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
//_PartialReconcilationLAtest.AssertUrl();


TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
_PartialReconcilationLAtest.Click_SelectALL();


//TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
//_PartialReconcilationLAtest.Click_ReconcileSelected();


TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
_PartialReconcilationLAtest.Click_UngroupSelected();


TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
_PartialReconcilationLAtest.Click_R1();


TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
_PartialReconcilationLAtest.Click_R2();


TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
_PartialReconcilationLAtest.Click_ReconcileLink();


//TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//_PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//_PartialReconcilationLAtest.Click_ReconcileButton();

    }

 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "70501952-6587-4385-a613-e1be47be081b")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP4() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC205";
       	Sheet="VAT3_ExpenseRein";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
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
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
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
    

    pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//  TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//  _EXPMENU.GoToUrl();
  

  TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
  _EXPMENU.Click_Expendituremenu();
  

  TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
  _EXPMENU.Click_Newplus_Click();
  

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//  TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//  _Reinbursment.GoToUrl();
//  
//pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
_Reinbursment.Click_ExpenseReimburs();


TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
_Reinbursment.Click_plussgin_clicked();

  TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
  _Reinbursment.Select_Employee_Select(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
  _Reinbursment.Enter_Date_toselect(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
  _Reinbursment.Enter_add_Description("Standard");


  TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
  _Reinbursment.Select_Select_VATtypeRates(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
  _Reinbursment.Select_Select_ExpenseHead(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
  _Reinbursment.Enter_Enter_Amts(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
  _Reinbursment.Click_Clicked_Save();
  
  
pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//  TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//  _bankmenu.GoToUrl();
  
//
//  TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//  _bankmenu.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
  _bankmenu.Click_Bankingmenu();
  

  TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
  _bankmenu.Click_Newmenu();
  

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//  TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//  _nBANKTRN.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//  _nBANKTRN.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
  _nBANKTRN.Select_BK_SELECT(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
  _nBANKTRN.Enter_NDate(data[12]);
  

  TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
  _nBANKTRN.Enter_n_desc(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
  _nBANKTRN.Enter_Recived_amt(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
  _nBANKTRN.Enter_spnt_amt(data[15]);
  

//  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//  _nBANKTRN.Select_Select_VATRate("Standard Rate");
  

  TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
  _nBANKTRN.Click_Select_Option1();
  

  TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
  _nBANKTRN.Enter_BOX2(data[16]);
  

//  TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//  _nBANKTRN.Click__1400_DATA();
  

  TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
  _nBANKTRN.Click__Save_();
  

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//  TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//  _Reconcilation.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//  _Reconcilation.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_Acntantleftmenu();
  

  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
  _Reconcilation.Click_plussign();
  

  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
  _Reconcilation.Select_SelectAccountType1(data[17]);
  

  TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
  _Reconcilation.Select_SelectAccount1(data[18]);
  

//  TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//  _Reconcilation.Click_View_Reconciled_button1();
//  


  pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
//TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
//_PartialReconcilationLAtest.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
//_PartialReconcilationLAtest.AssertUrl();


TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
_PartialReconcilationLAtest.Click_SelectALL();


//TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
//_PartialReconcilationLAtest.Click_ReconcileSelected();


TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
_PartialReconcilationLAtest.Click_UngroupSelected();


TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
_PartialReconcilationLAtest.Click_R1();


TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
_PartialReconcilationLAtest.Click_R2();


TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
_PartialReconcilationLAtest.Click_ReconcileLink();


//TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//_PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//_PartialReconcilationLAtest.Click_ReconcileButton();

    }

  @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "70501952-6587-4385-a613-e1be47be081b")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP5() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC206";
       	Sheet="VAT3_ExpenseRein";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
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
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
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
    

    pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//  TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//  _EXPMENU.GoToUrl();
  

  TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
  _EXPMENU.Click_Expendituremenu();
  

  TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
  _EXPMENU.Click_Newplus_Click();
  

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//  TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//  _Reinbursment.GoToUrl();
//  
//pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
_Reinbursment.Click_ExpenseReimburs();


TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
_Reinbursment.Click_plussgin_clicked();

  TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
  _Reinbursment.Select_Employee_Select(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
  _Reinbursment.Enter_Date_toselect(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
  _Reinbursment.Enter_add_Description("Standard");


  TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
  _Reinbursment.Select_Select_VATtypeRates(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
  _Reinbursment.Select_Select_ExpenseHead(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
  _Reinbursment.Enter_Enter_Amts(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
  _Reinbursment.Click_Clicked_Save();
  
  
pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//  TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//  _bankmenu.GoToUrl();
  
//
//  TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//  _bankmenu.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
  _bankmenu.Click_Bankingmenu();
  

  TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
  _bankmenu.Click_Newmenu();
  

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//  TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//  _nBANKTRN.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//  _nBANKTRN.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
  _nBANKTRN.Select_BK_SELECT(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
  _nBANKTRN.Enter_NDate(data[12]);
  

  TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
  _nBANKTRN.Enter_n_desc(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
  _nBANKTRN.Enter_Recived_amt(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
  _nBANKTRN.Enter_spnt_amt(data[15]);
  

//  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//  _nBANKTRN.Select_Select_VATRate("Standard Rate");
  

  TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
  _nBANKTRN.Click_Select_Option1();
  

  TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
  _nBANKTRN.Enter_BOX2(data[16]);
  

//  TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//  _nBANKTRN.Click__1400_DATA();
  

  TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
  _nBANKTRN.Click__Save_();
  

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//  TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//  _Reconcilation.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//  _Reconcilation.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_Acntantleftmenu();
  

  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
  _Reconcilation.Click_plussign();
  

  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
  _Reconcilation.Select_SelectAccountType1(data[17]);
  

  TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
  _Reconcilation.Select_SelectAccount1(data[18]);
  

//  TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//  _Reconcilation.Click_View_Reconciled_button1();
//  


  pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
//TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
//_PartialReconcilationLAtest.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
//_PartialReconcilationLAtest.AssertUrl();


TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
_PartialReconcilationLAtest.Click_SelectALL();


//TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
//_PartialReconcilationLAtest.Click_ReconcileSelected();


TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
_PartialReconcilationLAtest.Click_UngroupSelected();


TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
_PartialReconcilationLAtest.Click_R1();


TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
_PartialReconcilationLAtest.Click_R2();


TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
_PartialReconcilationLAtest.Click_ReconcileLink();


//TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//_PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//_PartialReconcilationLAtest.Click_ReconcileButton();

    }

@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "7bcbc9d5-95fd-476f-8583-90d5c3eb232d")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP6() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC207";
       	Sheet="VAT3_ExpenseRein";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    
//
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
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
//  TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
//  _EXPMENU.GoToUrl();
  

  TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
  _EXPMENU.Click_Expendituremenu();
  

  TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
  _EXPMENU.Click_Newplus_Click();
  

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
//  TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
//  _Reinbursment.GoToUrl();
//  
//pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
TestModellerLogger.SetLastNodeGuid("8f4c9059-3fc0-4c3c-bc15-134ca661e1a9");
_Reinbursment.Click_ExpenseReimburs();


TestModellerLogger.SetLastNodeGuid("cae24d0d-8e19-40c9-9146-e9b22063fd88");
_Reinbursment.Click_plussgin_clicked();

  TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
  _Reinbursment.Select_Employee_Select(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
  _Reinbursment.Enter_Date_toselect(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
  _Reinbursment.Enter_add_Description("Standard");


  TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
  _Reinbursment.Select_Select_VATtypeRates(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
  _Reinbursment.Select_Select_ExpenseHead(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
  _Reinbursment.Enter_Enter_Amts(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
  _Reinbursment.Click_Clicked_Save();
  
  
pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//  TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//  _bankmenu.GoToUrl();
  
//
//  TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//  _bankmenu.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
  _bankmenu.Click_Bankingmenu();
  

  TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
  _bankmenu.Click_Newmenu();
  

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//  TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//  _nBANKTRN.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//  _nBANKTRN.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
  _nBANKTRN.Select_BK_SELECT(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
  _nBANKTRN.Enter_NDate(data[12]);
  

  TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
  _nBANKTRN.Enter_n_desc(data[13]);
  

  TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
  _nBANKTRN.Enter_Recived_amt(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
  _nBANKTRN.Enter_spnt_amt(data[15]);
  

//  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//  _nBANKTRN.Select_Select_VATRate("Standard Rate");
  

  TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
  _nBANKTRN.Click_Select_Option1();
  

  TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
  _nBANKTRN.Enter_BOX2(data[16]);
  

//  TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//  _nBANKTRN.Click__1400_DATA();
  

  TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
  _nBANKTRN.Click__Save_();
  

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//  TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//  _Reconcilation.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//  _Reconcilation.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_Acntantleftmenu();
  

  TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
  _Reconcilation.Click_plussign();
  

  TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
  _Reconcilation.Select_SelectAccountType1(data[17]);
  

  TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
  _Reconcilation.Select_SelectAccount1(data[18]);
  

//  TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//  _Reconcilation.Click_View_Reconciled_button1();
//  


  pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForExpensePayable(driver);
//TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
//_PartialReconcilationLAtest.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
//_PartialReconcilationLAtest.AssertUrl();


TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
_PartialReconcilationLAtest.Click_SelectALL();


//TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
//_PartialReconcilationLAtest.Click_ReconcileSelected();


TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
_PartialReconcilationLAtest.Click_UngroupSelected();


TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
_PartialReconcilationLAtest.Click_R1();


TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
_PartialReconcilationLAtest.Click_R2();


TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
_PartialReconcilationLAtest.Click_ReconcileLink();


//TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
//_PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");
//
//
//TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
//_PartialReconcilationLAtest.Click_ReconcileButton();

    }
    

/*@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "e0a24dbb-8b0f-4d96-9d24-7a2ff2feb0fb")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP7() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
	   sTestCaseID="TC272";
      	Sheet="Reconcile";
       data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
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
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
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
    

  pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
//  TestModellerLogger.SetLastNodeGuid("4a368791-50ba-4762-9daa-e6881663c7c5");
//  _SaleCreditNote.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("86a841d0-4d6c-4c47-9128-fdf96874a918");
//  _SaleCreditNote.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
  _SaleCreditNote.Click_SalesTab();
  

  TestModellerLogger.SetLastNodeGuid("a1dedc7e-b8d5-4e5d-8d02-93387c7d697a");
  _SaleCreditNote.Click_NewButton();
  

  TestModellerLogger.SetLastNodeGuid("1d0f5c26-1f07-4ad5-8953-adfe5634232b");
  _SaleCreditNote.Click_NewCreditNote();
  

  TestModellerLogger.SetLastNodeGuid("8f0ac483-4b81-4ec8-b63a-c9243e4da070");
  _SaleCreditNote.Select_CustomerName(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("1062d571-8265-4c35-b27d-4d4ef9dad8d7");
  _SaleCreditNote.Enter_CreditNoteNo(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("783d5ff9-7311-4812-8e73-f0e433fdc8a4");
  _SaleCreditNote.Enter_CreditNoteDate(data[7]);
  

  TestModellerLogger.SetLastNodeGuid("749d2d39-5d01-4ef9-ad4d-6af022daeea6");
  _SaleCreditNote.Select_IncomeType1(data[8]);
  

  TestModellerLogger.SetLastNodeGuid("91d673df-2732-4b8e-8bd9-2ade1408cd1b");
  _SaleCreditNote.Enter_InvoiceNo(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("410b9063-8412-49e5-b62c-950ec76f591d");
  _SaleCreditNote.Enter_CreditDescription(data[10]);
  

  TestModellerLogger.SetLastNodeGuid("10a0cb0a-3cf3-483a-bcee-368d1ddad071");
  _SaleCreditNote.Enter_UnitPrice(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("93095997-7b8d-4e46-8903-a2a5b64060d3");
  _SaleCreditNote.Enter_Quantity(data[12]);
  

  TestModellerLogger.SetLastNodeGuid("f454ded6-253b-491a-9317-c1ad823e1c7c");
  _SaleCreditNote.Select_VATRateType(data[13]);
  

//  TestModellerLogger.SetLastNodeGuid("11492876-0446-47ae-87a0-3d0d8f753fd8");
//  _SaleCreditNote.Click_Tickformorelineitems();
  

  TestModellerLogger.SetLastNodeGuid("fa3946b2-757a-40c9-9974-911d0544a386");
  _SaleCreditNote.Enter_Note(data[14]);
  

  TestModellerLogger.SetLastNodeGuid("ff1a8f18-679c-4fbe-b321-b4eb48b484a1");
  _SaleCreditNote.Click_SaveButton();

pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
//    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
//    _bankmenu.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);
//    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
//    _nBANKTRN.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[18]);
    

   TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
   _nBANKTRN.Enter_spnt_amt(data[19]);
 

//    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//    _nBANKTRN.Select_Select_VATRate(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[20]);
    

//    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
//    _nBANKTRN.Click__1400_DATA();
//    

    TestModellerLogger.SetLastNodeGuid("392  f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

pages.PartialReconciledCases.Reconcilation _Reconcilation = new pages.PartialReconciledCases.Reconcilation(driver);
//    TestModellerLogger.SetLastNodeGuid("fc1c2835-8b62-466d-8b91-b2d2b6852de5");
//    _Reconcilation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("30a799ca-18ec-4e8a-9931-57fc4ea2c02b");
//    _Reconcilation.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
    _Reconcilation.Click_Acntantleftmenu();
    

    TestModellerLogger.SetLastNodeGuid("2f750f49-e648-45ca-898e-d60728db5570");
    _Reconcilation.Click_plussign();
    

    TestModellerLogger.SetLastNodeGuid("a3808a66-3e56-4e52-b2c1-61b7d5d15b32");
    _Reconcilation.Select_SelectAccountType1(data[21]);
    

    TestModellerLogger.SetLastNodeGuid("2018e2d9-51c8-4e54-8424-0f5147db31d6");
    _Reconcilation.Select_SelectAccount1(data[22]);
    

//    TestModellerLogger.SetLastNodeGuid("0892baec-0422-496a-93f9-1028cef59d2c");
//    _Reconcilation.Click_View_Reconciled_button1();
//    



    pages.PartialReconciledCases.PartialReconcilationLAtestForCreditnote _PartialReconcilationLAtest = new pages.PartialReconciledCases.PartialReconcilationLAtestForCreditnote(driver);
    //TestModellerLogger.SetLastNodeGuid("511bd3c6-4bfe-44f1-85bd-d9c919623efb");
    //_PartialReconcilationLAtest.GoToUrl();
    //
    //
    //TestModellerLogger.SetLastNodeGuid("6e247121-1606-4c0e-beb4-b3e6cb7495a3");
    //_PartialReconcilationLAtest.AssertUrl();


    TestModellerLogger.SetLastNodeGuid("af0c7fbd-9d1e-4a30-9e46-78b9d63e1c8f");
    _PartialReconcilationLAtest.Click_SelectALL();


    //TestModellerLogger.SetLastNodeGuid("d60148fa-f80f-4012-b7db-ab2180373216");
    //_PartialReconcilationLAtest.Click_ReconcileSelected();


    TestModellerLogger.SetLastNodeGuid("56eb2524-f022-46bb-bfc6-e57cfeaf10b8");
    _PartialReconcilationLAtest.Click_UngroupSelected();


    TestModellerLogger.SetLastNodeGuid("ca75e642-3957-4d56-af81-a254557876ea");
    _PartialReconcilationLAtest.Click_R1();


    TestModellerLogger.SetLastNodeGuid("4be1345f-a7ab-4379-ac1b-071bba6eebd1");
    _PartialReconcilationLAtest.Click_R2();


    TestModellerLogger.SetLastNodeGuid("0a7bb1d7-72ea-4dd0-9b74-37bf18c628a1");
    _PartialReconcilationLAtest.Click_ReconcileLink();


    TestModellerLogger.SetLastNodeGuid("f4325ab9-a0c9-4fd8-a969-0b4fa579e258");
    _PartialReconcilationLAtest.Select_SelectReconcileType("Partial Reconcile");


    TestModellerLogger.SetLastNodeGuid("fca7e12e-3436-4301-8150-392d2dcdc819");
    _PartialReconcilationLAtest.Click_ReconcileButton();
    }*/

}
