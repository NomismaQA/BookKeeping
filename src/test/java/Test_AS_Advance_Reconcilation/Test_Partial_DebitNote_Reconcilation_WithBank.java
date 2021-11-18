package Test_AS_Advance_Reconcilation;

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
public class Test_Partial_DebitNote_Reconcilation_WithBank extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsTC01() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="TC400DebitNoteWithBankP";
       	Sheet="Fin-3821";
        data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
        
        pages.banking.ashiv.nlogin _nlogin = new  pages.banking.ashiv.nlogin(driver);
        
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
    

pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);
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
    

pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
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
    

    Pages_Reconcilation_TC.DebitNoteSToFRS _DebitNoteSToFRS = new Pages_Reconcilation_TC.DebitNoteSToFRS(driver);

    TestModellerLogger.SetLastNodeGuid("f4ead229-e1a6-4686-9726-2a8d72975380");
    _DebitNoteSToFRS.Click_ExpenditureTAB();


    TestModellerLogger.SetLastNodeGuid("13d7978e-e074-45d2-8c0b-01b123aa6311");
    _DebitNoteSToFRS.Click_NewTAB();


    TestModellerLogger.SetLastNodeGuid("e0eca6d7-6b04-416d-855d-2a9e825dcd28");
    _DebitNoteSToFRS.Click_NewDebitNote();


    TestModellerLogger.SetLastNodeGuid("190c6323-be0b-4dd1-b552-dbe6423a4af8");
    _DebitNoteSToFRS.Select_SupplierName(data[5]);


    TestModellerLogger.SetLastNodeGuid("c9f1fef7-60b9-4d4b-a4a0-825e5638fb6e");
    _DebitNoteSToFRS.Enter_BillNo(data[6]);


   // TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
   // _DebitNoteSToFRS.Enter_Date("");


    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Select_ExpenseType(data[8]);


    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description("Ashiv");


    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);


    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[12]);
   Thread.sleep(5000);

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();
pages.banking.ashiv.bankmenu _bankmenu = new pages.banking.ashiv.bankmenu(driver);

   

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.PartialReconciledCases.nBANKTRN _nBANKTRN = new pages.PartialReconciledCases.nBANKTRN(driver);

 

    TestModellerLogger.SetLastNodeGuid("32c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[18]);
    


    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[19]);
    

    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
//    


   
  
    Pages_Reconcilation_TC.PartialReconcilationLAtestInvoice_JonralEntry _PartialReconcilationLAtest = new Pages_Reconcilation_TC.PartialReconcilationLAtestInvoice_JonralEntry(driver);

    _PartialReconcilationLAtest.click_Adem();
     _PartialReconcilationLAtest.click_ReconBtn();
     
     //_PartialReconcilationLAtest.Select_Accounttype(data[20]);
     _PartialReconcilationLAtest.Select_AccountType_4__8(data[20]);
     
     _PartialReconcilationLAtest.Select_Account(data[5]);
     
     
     _PartialReconcilationLAtest.Advance_Reconcilation1("Partial Reconcile");
     
     _PartialReconcilationLAtest.ViewRecon(data[20], data[5]);
     _PartialReconcilationLAtest.Partial_DebitNote_Reconcilation();

     Pages_Reconcilation_TC.SupplierBillSToFRS _SupplierBillSToFRS = new Pages_Reconcilation_TC.SupplierBillSToFRS(driver);

     TestModellerLogger.SetLastNodeGuid("5c30d940-2a3c-4ce2-9f6d-f491e71a1755");
     _SupplierBillSToFRS.Click_ExpenditureTAB();

     _SupplierBillSToFRS.Search("Supplier Name", data[5]);

     _SupplierBillSToFRS.PartialDebitNoteScreenshot();
  
   }

 
 

}