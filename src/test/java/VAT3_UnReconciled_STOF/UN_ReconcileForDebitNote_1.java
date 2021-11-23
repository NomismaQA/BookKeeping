package VAT3_UnReconciled_STOF;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.PartialReconcilationLAtestForDeditnote;
import pages.SuplierBill.*;

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
import utilities.ExcelData;
//import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47c92856-78ee-4b1a-a893-c561a22d7ce2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1183, profileId = 101073)
public class UN_ReconcileForDebitNote_1 extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
  public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP1() throws InterruptedException, IOException, InvalidFormatException, HeadlessException, AWTException
    {
    	sTestCaseID="UNR_DEB1";
       	Sheet="VAT3";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
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
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
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
    
DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
//TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//_DebitNoteSToFRS.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//_DebitNoteSToFRS.AssertUrl();


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


TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
_DebitNoteSToFRS.Enter_Date(data[7]);

TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.click_ExpenseType();

TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.Enter_BOX22(data[8]);


TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
_DebitNoteSToFRS.Enter_Description(data[9]);


TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
_DebitNoteSToFRS.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
_DebitNoteSToFRS.Select_VATRateType(data[11]);


//TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//_DebitNoteSToFRS.Enter_VATRate();
//
//
//TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//_DebitNoteSToFRS.Enter_VATAmount("100");
//
//
//TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//_DebitNoteSToFRS.Enter_Amount_Net("100");
//
//
//TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//_DebitNoteSToFRS.Click_Tickformorelineitems();
//

TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
_DebitNoteSToFRS.Click__Save_();


    
}

//TestModellerLogger.SetLastNodeGuid("9bcccc53-1773-466b-b426-6ee41539f8e3"); 
//Reconsilecount.Select_R31(data[22]);
//TestModellerLogger.SetLastNodeGuid("154f0835-2441-4733-9a24-ba5927a5e7e1");
//Reconsilecount.Click_Success_Transactions_reconciled_successfully();


@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "6cb57d3d-4a0e-45f3-b5f2-ef11cf334916")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP2() throws HeadlessException, IOException, InterruptedException, AWTException, InvalidFormatException
    {
    	
	sTestCaseID="UNR_DEB2";
   	Sheet="VAT3";
    data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
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
        
    DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
    //TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
    //_DebitNoteSToFRS.GoToUrl();
    //
    //
    //TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
    //_DebitNoteSToFRS.AssertUrl();


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


    TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
    _DebitNoteSToFRS.Enter_Date(data[7]);


    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.click_ExpenseType();

    TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
    _DebitNoteSToFRS.Enter_BOX22(data[8]);


    TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
    _DebitNoteSToFRS.Enter_Description(data[9]);


    TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
    _DebitNoteSToFRS.Enter_UnitPrice(data[10]);


    TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
    _DebitNoteSToFRS.Select_VATRateType(data[11]);


    //TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
    //_DebitNoteSToFRS.Enter_VATRate();
    //
    //
    //TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
    //_DebitNoteSToFRS.Enter_VATAmount("100");
    //
    //
    //TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
    //_DebitNoteSToFRS.Enter_Amount_Net("100");
    //
    //
    //TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
    //_DebitNoteSToFRS.Click_Tickformorelineitems();
    //

    TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
    _DebitNoteSToFRS.Click__Save_();

    
          

   }


 @Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "b1ba9307-29ad-4bbf-8371-fbf2057bb849")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP3() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="UNR_DEB3";

       	Sheet="VAT3";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
 pages.nlogin _nlogin = new pages.nlogin(driver);
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();
 

// TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// _nlogin.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
 

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
// TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// _AgentSearch.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// _AgentSearch.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
// TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// _Searchclient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
// _Searchclient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 
DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
//TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//_DebitNoteSToFRS.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//_DebitNoteSToFRS.AssertUrl();


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


TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
_DebitNoteSToFRS.Enter_Date(data[7]);


TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.click_ExpenseType();

TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.Enter_BOX22(data[8]);

TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
_DebitNoteSToFRS.Enter_Description(data[9]);


TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
_DebitNoteSToFRS.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
_DebitNoteSToFRS.Select_VATRateType(data[11]);


//TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//_DebitNoteSToFRS.Enter_VATRate();
//
//
//TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//_DebitNoteSToFRS.Enter_VATAmount("100");
//
//
//TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//_DebitNoteSToFRS.Enter_Amount_Net("100");
//
//
//TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//_DebitNoteSToFRS.Click_Tickformorelineitems();
//

TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
_DebitNoteSToFRS.Click__Save_();


   


    }

@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "7bcbc9d5-95fd-476f-8583-90d5c3eb232d")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP6() throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException
    {
	sTestCaseID="UNR_DEB4";
   	Sheet="VAT3";
    data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
 pages.nlogin _nlogin = new pages.nlogin(driver);
        
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 _nlogin.GoToUrl();
 

// TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// _nlogin.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 _nlogin.Enter_nLOGIN(data[1]);
 

 TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 _nlogin.Enter_nPASS(data[2]);
 

 TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 _nlogin.Click_Login();
 

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
// TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
// _AgentSearch.GoToUrl();
// 

// TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
// _AgentSearch.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 _AgentSearch.Click_Agents();
 

 TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 _AgentSearch.Click_Search();
 

 TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 _AgentSearch.Click__Nidhi1_();
 

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
// TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
// _Searchclient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
// _Searchclient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 _Searchclient.Click__Clients_();
 

 TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 _Searchclient.Click_Searchbtn();
 

 TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 _Searchclient.Click__NidhiEnt();
 
DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
//TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//_DebitNoteSToFRS.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//_DebitNoteSToFRS.AssertUrl();


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


TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
_DebitNoteSToFRS.Enter_Date(data[7]);


TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.click_ExpenseType();

TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.Enter_BOX22(data[8]);


TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
_DebitNoteSToFRS.Enter_Description(data[9]);


TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
_DebitNoteSToFRS.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
_DebitNoteSToFRS.Select_VATRateType(data[11]);


//TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//_DebitNoteSToFRS.Enter_VATRate();
//
//
//TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//_DebitNoteSToFRS.Enter_VATAmount("100");
//
//
//TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//_DebitNoteSToFRS.Enter_Amount_Net("100");
//
//
//TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//_DebitNoteSToFRS.Click_Tickformorelineitems();
//

TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
_DebitNoteSToFRS.Click__Save_();



    }


@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
    @TestModellerPath(guid = "e0a24dbb-8b0f-4d96-9d24-7a2ff2feb0fb")
    public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP7() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
	sTestCaseID="UNR_DEB5";
   	Sheet="VAT3";
    data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
       pages.nlogin _nlogin = new pages.nlogin(driver);
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       

//       TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//       _nlogin.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
       _nlogin.Enter_nLOGIN(data[1]);
       

       TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
       _nlogin.Enter_nPASS(data[2]);
       

       TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
       _nlogin.Click_Login();
       

   pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//       TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//       _AgentSearch.GoToUrl();
   //    

//       TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//       _AgentSearch.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//       TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//       _Searchclient.GoToUrl();
   //    
   //
//       TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//       _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
       
   DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
   //TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
   //_DebitNoteSToFRS.GoToUrl();
   //
   //
   //TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
   //_DebitNoteSToFRS.AssertUrl();


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
   
   TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
   _DebitNoteSToFRS.Enter_Date(data[7]);

   TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
   _DebitNoteSToFRS.click_ExpenseType();

   TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
   _DebitNoteSToFRS.Enter_BOX22(data[8]);


   TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
   _DebitNoteSToFRS.Enter_Description(data[9]);


   TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
   _DebitNoteSToFRS.Enter_UnitPrice(data[10]);


   TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
   _DebitNoteSToFRS.Select_VATRateType(data[11]);


   //TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
   //_DebitNoteSToFRS.Enter_VATRate();
   //
   //
   //TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
   //_DebitNoteSToFRS.Enter_VATAmount("100");
   //
   //
   //TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
   //_DebitNoteSToFRS.Enter_Amount_Net("100");
   //
   //
   //TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
   //_DebitNoteSToFRS.Click_Tickformorelineitems();
   //

   TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
   _DebitNoteSToFRS.Click__Save_();

  
        
}
@Test  (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
@TestModellerPath(guid = "e0a24dbb-8b0f-4d96-9d24-7a2ff2feb0fb")
public void GoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClickAgentsP71() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
{
		
	sTestCaseID="UNR_DEB6";
   	Sheet="VAT3";
    data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
    
   pages.nlogin _nlogin = new pages.nlogin(driver);
   
   TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
   _nlogin.GoToUrl();
   
   TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
   _nlogin.Enter_nLOGIN(data[1]);
   

   TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
   _nlogin.Enter_nPASS(data[2]);
   

   TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
   _nlogin.Click_Login();
   

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//   TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//   _AgentSearch.GoToUrl();
//    

//   TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//   _AgentSearch.AssertUrl();
   

   TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
   _AgentSearch.Click_Agents();
   

   TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
   _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   

   TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
   _AgentSearch.Click_Search();
   

   TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
   _AgentSearch.Click__Nidhi1_();
   

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//   TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//   _Searchclient.GoToUrl();
//    
//
//   TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//   _Searchclient.AssertUrl();
   

   TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
   _Searchclient.Click__Clients_();
   

   TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
   _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
   

   TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
   _Searchclient.Click_Searchbtn();
   

   TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
   _Searchclient.Click__NidhiEnt();
   
DebitNoteSToFRS _DebitNoteSToFRS = new DebitNoteSToFRS(driver);
//TestModellerLogger.SetLastNodeGuid("a9ac356a-1ff8-48d1-98c6-5613b1e1ba5a");
//_DebitNoteSToFRS.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("281ed0ae-1966-4313-83f9-f02959a1af8f");
//_DebitNoteSToFRS.AssertUrl();


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


TestModellerLogger.SetLastNodeGuid("a8f7d6e5-89f8-4f36-a154-0755a90aa5e9");
_DebitNoteSToFRS.Enter_Date(data[7]);


TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.click_ExpenseType();

TestModellerLogger.SetLastNodeGuid("d0e22573-153e-435a-8026-8e497c35f9ee");
_DebitNoteSToFRS.Enter_BOX22(data[8]);

TestModellerLogger.SetLastNodeGuid("3f663a04-c82a-4f31-a2c8-3238da8ddb0c");
_DebitNoteSToFRS.Enter_Description(data[9]);


TestModellerLogger.SetLastNodeGuid("3b383dc0-235e-4780-9859-f151196feb92");
_DebitNoteSToFRS.Enter_UnitPrice(data[10]);


TestModellerLogger.SetLastNodeGuid("62f8964d-0533-4137-b19f-ed7484c16874");
_DebitNoteSToFRS.Select_VATRateType(data[11]);


//TestModellerLogger.SetLastNodeGuid("0c1c1062-a24e-491f-b466-c4f25be009dc");
//_DebitNoteSToFRS.Enter_VATRate();
//
//
//TestModellerLogger.SetLastNodeGuid("df34f121-e6c7-4386-b83d-071d26d7877e");
//_DebitNoteSToFRS.Enter_VATAmount("100");
//
//
//TestModellerLogger.SetLastNodeGuid("d9ad9e73-0fa4-4130-8856-5d6c154b68b4");
//_DebitNoteSToFRS.Enter_Amount_Net("100");
//
//
//TestModellerLogger.SetLastNodeGuid("afe47079-aab8-40ac-8075-8edfd92c146a");
//_DebitNoteSToFRS.Click_Tickformorelineitems();
//

TestModellerLogger.SetLastNodeGuid("093d78cf-a676-401c-9139-02e7e7db005f");
_DebitNoteSToFRS.Click__Save_();


   
}
}