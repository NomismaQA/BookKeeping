package tests.Bank_Bussines_search;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2d2df0cd-2a04-40a0-90ff-d10cd65fda86
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1814, profileId = 102291)
public class Busssrc_srcbussiness extends TestBase
{
    

	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect17() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	sTestCaseID="TC17";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
    _BusSearch.Select_Select_Status5(data[7]);
    

//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();
    

    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "6393038a-a9ed-4678-9ba8-21370d9bd1fa")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect1() throws InvalidFormatException, InterruptedException
    {
        sTestCaseID="TC1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();
      
    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "a3383bac-e60e-4041-a855-e3730d944727")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect2() throws InvalidFormatException, InterruptedException
    {
        
       sTestCaseID="TC2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    
//
//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9(); 
    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "81af9b61-d552-48dd-b1b7-4c6efdd01fcb")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect3() throws InterruptedException, InvalidFormatException
    {
     sTestCaseID="TC3";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();   
     
    

    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "cfb2d70a-29f8-4b7c-a879-86e148904bb1")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect4() throws InterruptedException, InvalidFormatException
    {
        
      sTestCaseID="TC4";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();  
    

    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "cfcbd5f4-70cc-4cbe-be84-d1fd1b7299c7")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect5() throws InterruptedException, InvalidFormatException
    {
        
      sTestCaseID="TC5";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
//    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    
//
//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();  
    }

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "dbe9eb32-2d0b-4a97-9e1a-cf0c01a9e5e4")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect6() throws InterruptedException, InvalidFormatException
    {
        
    sTestCaseID="TC6";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
    _BusSearch.Select_Select_Status5(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();  
    

    }
   

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "c9f6141f-165c-424b-9f7b-d52c071bb4d8")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect() throws InvalidFormatException, InterruptedException
    {
        
         sTestCaseID="TC0";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//    _BusSearch.Select_Select_Status5("ALL");
//
//   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();  

    }


    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "5a72e2fa-f389-4384-bf69-2428bebe0288")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect8() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC8";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
//    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9();   
      
        }
    
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "5a72e2fa-f389-4384-bf69-2428bebe0288")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect9() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC9";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect10() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC10";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect11() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC11";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect121() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC12";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect13() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC13";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect14() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC14";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
   
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect15() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC15";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect16() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC16";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect18() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC18";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect19() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC19";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect20() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC20";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect21() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC21";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);

    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect22() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC22";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect23() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC23";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

} 
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect24() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC24";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect25() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC25";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

} 
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect26() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC26";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);

  TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
    _BusSearch.Select_Select_Acmgr6(data[8]);
   

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect27() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC27";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 
    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect28() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC28";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);

    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect29() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC29";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);

    TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect30() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC30";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

//     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

} 
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "ea482c09-a2c1-4457-9b4e-f0962646df9c")

    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect31() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC31";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     
//
//     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "81af9b61-d552-48dd-b1b7-4c6efdd01fcb")

    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect32() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC32";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

//     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
//     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "81af9b61-d552-48dd-b1b7-4c6efdd01fcb")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect33() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC33";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}
    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "81af9b61-d552-48dd-b1b7-4c6efdd01fcb")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect34() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC34";
     	Sheet="Banking";
     	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
         
         pages.nlogin _nlogin = new pages.nlogin(driver);
     TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
     _nlogin.GoToUrl();
     

//     TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//     _nlogin.AssertUrl();
     

     TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
     _nlogin.Enter_nLOGIN(data[1]);
     

     TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
     _nlogin.Enter_nPASS(data[2]);
     

     TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
     _nlogin.Click_Login();
     

 pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
     TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
     


     TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
     _AgentSearch.Click_Agents();
     

     TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
     _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
     TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
     _AgentSearch.Click_Search();
     

     TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
     _AgentSearch.Click__Nidhi1_();
       
         
        pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
        _BusSearch.Click_Clients__click_2();
        
//        _BusSearch.GoToUrl();
       
        
//     _BusSearch.Enter_Enter_Client_Name1(data[4]);
     

     TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
     _BusSearch.Select_Select_Service2(data[5]);
     

     TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
     _BusSearch.Select_Select_Type4(data[6]);
     

     TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
     _BusSearch.Select_Select_Status5(data[7]);
 //
 //   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//     _BusSearch.Select_Select_Acmgr6(data[8]);
     

     TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
     _BusSearch.Click_Click_Search_btn7();
     _BusSearch.Click_TD_Client_name9(); 

}

    @Test  (groups= {"Buss_src","Buss_src - src_bussiness"})
    @TestModellerPath(guid = "c9f6141f-165c-424b-9f7b-d52c071bb4d8")
    public void PositiveEnterEnterClientName1PositiveSelectSelectService2PositiveSelectSelectType4PositiveSelect7() throws InvalidFormatException, InterruptedException
    {
        
         sTestCaseID="TC7";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

pages.Banking_Business_Search.Agent_Src_Buss _AgentSearch = new pages.Banking_Business_Search.Agent_Src_Buss(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
   _AgentSearch.GoToUrl();
    


    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
   
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
      
        
       pages.Banking_Business_Search.BusSearch _BusSearch = new  pages.Banking_Business_Search.BusSearch(driver);
       _BusSearch.Click_Clients__click_2();
       
//       _BusSearch.GoToUrl();
      
       
//    _BusSearch.Enter_Enter_Client_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("cd3d6059-6ee5-41b2-ac06-eb05798ae856");
    _BusSearch.Select_Select_Service2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("fe04a53d-905d-4bc4-b81d-97b0e0cf3475");
    _BusSearch.Select_Select_Type4(data[6]);
    

TestModellerLogger.SetLastNodeGuid("fe4117b3-3145-4368-af94-d6c84e876a88");
 _BusSearch.Select_Select_Status5(data[7]);
//
//   TestModellerLogger.SetLastNodeGuid("f9628856-de0e-45a9-9b10-cb6a61a35f88");
//    _BusSearch.Select_Select_Acmgr6(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("0886b595-e94e-4d0d-b3c3-79da06997c86");
    _BusSearch.Click_Click_Search_btn7();
    _BusSearch.Click_TD_Client_name9();  
}
    
    
}