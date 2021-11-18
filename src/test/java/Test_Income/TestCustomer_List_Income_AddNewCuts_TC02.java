package Test_Income;

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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7473dbcb-9e2a-4101-a2e1-119e14acf5ad
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1869, profileId = 102423)
public class TestCustomer_List_Income_AddNewCuts_TC02 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_Customer_List","Test_Customer_List - Default Profile"})
    @TestModellerPath(guid = "1956db1c-1a3c-4084-943e-f3e2ca108b9c")
    public void GoToUrlClickView1ClickCustomerList2PositiveSelectSelectCategorySearch3PositiveEnterEnterName4PAddNewCustomer_TC02() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC02_Customer_List";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

      pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);

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
        

        pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);

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
        

        
        
        
        
        
        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
     
    
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
        
        pages.banking.ashiv.SaleInvoice _SaleInvoicel= new pages.banking.ashiv.SaleInvoice(driver);
        
        
        _SaleInvoicel.Click_SalesTab();
        
    	
    	  Pages_Income.Customer_LIst _Customer_LIst = new Pages_Income.Customer_LIst(driver);  


    TestModellerLogger.SetLastNodeGuid("3ce99e93-9c97-497a-9be2-9a78fa47871f");
    _Customer_LIst.Click_View1();
    

    TestModellerLogger.SetLastNodeGuid("a67701c3-5be7-42bb-b4e7-c729a22952bd");
    _Customer_LIst.Click_Customer_List2();
    
//
//    TestModellerLogger.SetLastNodeGuid("83d74803-ba77-4619-8736-5885c22d08e0");
//    _Customer_LIst.Select_Select_Category_Search3("Customer Name");
//    
//
//    TestModellerLogger.SetLastNodeGuid("824f0dab-2bee-49fd-81c5-64851f5c39a0");
//    _Customer_LIst.Enter_Enter_Name4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("816c5847-3691-4f87-a50c-ada34637d7ce");
//    _Customer_LIst.Enter_EnterDate5("");
    

  //  TestModellerLogger.SetLastNodeGuid("d39d95ef-25e4-4c08-af4d-100818854a38");
  //  _Customer_LIst.Select_SelectPayment6("All");
    

  //  TestModellerLogger.SetLastNodeGuid("b0c14e41-eea4-4b0b-9591-4e59fbc57dbc");
  //  _Customer_LIst.Select_Select_Status7("All");
    

   // TestModellerLogger.SetLastNodeGuid("f1e4220d-b3ac-4fa6-b59d-bb6f4e0d3d6a");
  //  _Customer_LIst.Select_Select_Account_Notes_8("All");
    

//    TestModellerLogger.SetLastNodeGuid("bdd9f53c-96f7-4de8-9f72-2193925bb51f");
//    _Customer_LIst.Click_SearchBtn_9();
    
  //    _Customer_LIst.Tc01GetMsg();
    TestModellerLogger.SetLastNodeGuid("30c8f167-736d-44dc-923c-2000a6cd583f");
    _Customer_LIst.Click_Add_CustomerBtn_10();
    

    TestModellerLogger.SetLastNodeGuid("e0e12437-df51-4974-bf9c-36083be806de");
    _Customer_LIst.Enter_Enter_CustomerName_11(data[5]);
    
//
//    TestModellerLogger.SetLastNodeGuid("1614b88f-1f05-463e-8369-4ce9a59e3032");
//    _Customer_LIst.Enter_Enter_FirstName_12("FirstName");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d0a28ff4-ac8a-4c74-a34a-4812f0e4f28c");
//    _Customer_LIst.Enter_Enter_LastName_13("LastName");
//    
//
    TestModellerLogger.SetLastNodeGuid("99cde74d-92a2-4c8f-9771-d01f0b83e837");
    _Customer_LIst.Click_Save_15();
//    
//
    TestModellerLogger.SetLastNodeGuid("540b240a-4e80-4601-bfee-6d1f3dba6181");
    _Customer_LIst.Click_Get_Msg_16();
//    
//
//    TestModellerLogger.SetLastNodeGuid("974eb2d0-e8cd-482d-8cad-968a2c805c14");
//    _Customer_LIst.Click_Select_AllCheakBoxBtn17();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f837fc3-5946-4e70-9821-a1e417593461");
//    _Customer_LIst.Click_Send_Mail_18();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1f8a63f1-6cc8-44e4-ac8a-7d27229fe12b");
//    _Customer_LIst.Select_Select_Banks_19("Default Bank");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e0bcab68-eb35-4ac9-a911-90f6a7164b5f");
//    _Customer_LIst.Enter_Enter_DateFrom_20("12345");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ff4be45b-45f1-4d78-b406-a08ff3f62eff");
//    _Customer_LIst.Enter_Enter_DateTo_21("12345");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2bc544fe-4bbe-4637-ae1b-ffa24f0ee9d7");
//    _Customer_LIst.Select_Select_EmailTemplate_22("Customer Statement");
//    
//
//    TestModellerLogger.SetLastNodeGuid("eaa5f455-ed74-43a9-a312-4d1bb86ee8f1");
//    _Customer_LIst.Enter_Enter_EmailID_23("muhammad.ashiv@nomisma.co.uk");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d616e40-11ca-4b2c-af77-24456f130a52");
//    _Customer_LIst.Click_SendBtn_24();
//    

    }

}