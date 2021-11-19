package tests.banking_add_ltd_company;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;
import java.text.ParseException;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dc6e86a2-49a1-4ae7-800b-5d63d6b94c2a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1843, profileId = 102366)
public class LtdAdd_AddLTD extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void TCcase1() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="TC63";
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    
  

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    
    
    pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
    _Addltdbus.Click_Click_Plus_Sign1();
    

    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
   // _//Addltdbus.Businessurl();
    
    TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
    _Addltdbus.Click_Limited_Company();
    

    

    }

    
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void TC_Case2() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="TC54";
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    
  

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    
    
    pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
    _Addltdbus.Click_Click_Plus_Sign1();
    

    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
   // _//Addltdbus.Businessurl();
    
    TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
    _Addltdbus.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ac6beac4-facf-402c-b560-ab2b89d94bac");
    _Addltdbus.Enter_Enter_Business_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("e0ded04a-6be3-40e4-bb61-01fdfed8c456");
    _Addltdbus.Enter_Enter_Reg_Num2(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("04dbdd2a-99e5-4742-ac19-362008585b21");
    _Addltdbus.Enter_Enter_Reg_Date3(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("cd1e919b-ed60-404f-8a46-c0a644d5d566");
    _Addltdbus.Enter_Enter_First_Name4(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("9266759d-5a58-4e97-919d-aa182b702cd7");
    _Addltdbus.Enter_Enter_Last_Name5(data[8]);
    

 

    TestModellerLogger.SetLastNodeGuid("3b6a0ec8-ebfa-4234-9bf1-33e4cd1c7060");
    _Addltdbus.Click_Click_buss_Save__btn();
    

    }


    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "cf392ef0-c150-4516-9e00-99fefa77d8f6")
    public void GoToUrlClickClickPlusSign1ClickClickNewClient2ClickClickonLimited3ClickLimitedCompanyPositiveE1() throws InvalidFormatException, IOException, InterruptedException
    {
        
    	sTestCaseID="TC55";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
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
//    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//    _AgentSearch.Click_Agents();
//    
    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
       
    	
        pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

    

    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
    _Addltdbus.Click_Click_Plus_Sign1();
    

    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
     
    _Addltdbus.Enter_Choosefile_toupload(data[4]);
    
    _Addltdbus.Click_Click_Upload_btn();
    _Addltdbus.Click_CcheckboxElem();
 
    
    

    }

    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "6d6ebb22-5082-4b26-be01-b74928b8fd78")
    public void GoToUrlClickClickPlusSign1ClickClickNewClient2ClickClickonLimited3ClickLimitedCompanyPositiveE2() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC56";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
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
//        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//        _AgentSearch.Click_Agents();
    //    
        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        
        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
           
        	
            pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

        

       TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
        _Addltdbus.Click_Click_Plus_Sign1();
        

        TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
       _Addltdbus.Click_Click_New_Client2();
       

       TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
       _Addltdbus.Click_Click_on_Limited3();
        
     _Addltdbus.Enter_House_Search(data[4]);
          //  _Addltdbus.Click_Createcompany();
       
       
    }
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "6d6ebb22-5082-4b26-be01-b74928b8fd78")
    public void BackbuttonTC11() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC57";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
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
//        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//        _AgentSearch.Click_Agents();
    //    
        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        
        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
           
        	
            pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

        

       TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
        _Addltdbus.Click_Click_Plus_Sign1();
        

        TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
       _Addltdbus.Click_Click_New_Client2();
       

       TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
       _Addltdbus.Click_Click_on_Limited3();
        
     _Addltdbus.bak_btn();
    
}
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void date_formatcheck() throws InvalidFormatException, InterruptedException, IOException, ParseException
    {
    	sTestCaseID="TC58";
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    
  

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    
    
    pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
    _Addltdbus.Click_Click_Plus_Sign1();
    

    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
   // _//Addltdbus.Businessurl();
    
    TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
    _Addltdbus.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ac6beac4-facf-402c-b560-ab2b89d94bac");
    _Addltdbus.Enter_Enter_Business_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("e0ded04a-6be3-40e4-bb61-01fdfed8c456");
    _Addltdbus.Enter_Enter_Reg_Num2(data[5]);
    

    pages.new_bank_trans.Ltd_Negative_Scenario _negative=new pages.new_bank_trans.Ltd_Negative_Scenario(driver);
    _negative.Enter_Enter_Reg_Date3(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("cd1e919b-ed60-404f-8a46-c0a644d5d566");
    _Addltdbus.Enter_Enter_First_Name4(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("9266759d-5a58-4e97-919d-aa182b702cd7");
    _Addltdbus.Enter_Enter_Last_Name5(data[8]);
    

 

    TestModellerLogger.SetLastNodeGuid("3b6a0ec8-ebfa-4234-9bf1-33e4cd1c7060");
    _Addltdbus.Click_Click_buss_Save__btn();

}
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void Reg_no_invalid() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="TC59";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    
    pages.nlogin _nlogin = new pages.nlogin(driver);
TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
_nlogin.GoToUrl();


//TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//_nlogin.AssertUrl();


TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
_nlogin.Enter_nLOGIN(data[1]);


TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
_nlogin.Enter_nPASS(data[2]);


TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
_nlogin.Click_Login();


pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);


TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
_AgentSearch.Click_Agents();



TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
_AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
_AgentSearch.Click_Search();


TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
_AgentSearch.Click__Nidhi1_();



pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
_Addltdbus.Click_Click_Plus_Sign1();


TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
_Addltdbus.Click_Click_New_Client2();


TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
_Addltdbus.Click_Click_on_Limited3();

//_Addltdbus.Businessurl();

TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
_Addltdbus.Click_Limited_Company();


TestModellerLogger.SetLastNodeGuid("ac6beac4-facf-402c-b560-ab2b89d94bac");
_Addltdbus.Enter_Enter_Business_Name1(data[4]);

pages.new_bank_trans.Ltd_Negative_Scenario _ng= new  pages.new_bank_trans.Ltd_Negative_Scenario(driver);
//TestModellerLogger.SetLastNodeGuid("e0ded04a-6be3-40e4-bb61-01fdfed8c456");
_ng.Enter_Enter_Reg_Num2(data[5]);


TestModellerLogger.SetLastNodeGuid("04dbdd2a-99e5-4742-ac19-362008585b21");
_Addltdbus.Enter_Enter_Reg_Date3(data[6]);


TestModellerLogger.SetLastNodeGuid("cd1e919b-ed60-404f-8a46-c0a644d5d566");
_Addltdbus.Enter_Enter_First_Name4(data[7]);


TestModellerLogger.SetLastNodeGuid("9266759d-5a58-4e97-919d-aa182b702cd7");
_Addltdbus.Enter_Enter_Last_Name5(data[8]);




TestModellerLogger.SetLastNodeGuid("3b6a0ec8-ebfa-4234-9bf1-33e4cd1c7060");
_Addltdbus.Click_Click_buss_Save__btn();

    
}
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void Director_name() throws InterruptedException, InvalidFormatException, IOException, ParseException
    {
    	sTestCaseID="TC60";
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    
  

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    
    
    pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
    _Addltdbus.Click_Click_Plus_Sign1();
    

    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
   // _//Addltdbus.Businessurl();
    
    TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
    _Addltdbus.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ac6beac4-facf-402c-b560-ab2b89d94bac");
    _Addltdbus.Enter_Enter_Business_Name1(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("e0ded04a-6be3-40e4-bb61-01fdfed8c456");
    _Addltdbus.Enter_Enter_Reg_Num2(data[5]);
    

    pages.new_bank_trans.Ltd_Negative_Scenario _negative=new pages.new_bank_trans.Ltd_Negative_Scenario(driver);
    _negative.Enter_Enter_Reg_Date3(data[6]);
    

    
    _negative.Enter_Enter_First_Name4(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("9266759d-5a58-4e97-919d-aa182b702cd7");
    _Addltdbus.Enter_Enter_Last_Name5(data[8]);
    
    TestModellerLogger.SetLastNodeGuid("3b6a0ec8-ebfa-4234-9bf1-33e4cd1c7060");
    _Addltdbus.Click_Click_buss_Save__btn();
    
}
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void payrol_company() throws InterruptedException, InvalidFormatException, IOException, ParseException
    {
    sTestCaseID="TC61";
	Sheet="Banking";
	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    
    pages.nlogin _nlogin = new pages.nlogin(driver);
TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
_nlogin.GoToUrl();


//TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//_nlogin.AssertUrl();


TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
_nlogin.Enter_nLOGIN(data[1]);


TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
_nlogin.Enter_nPASS(data[2]);


TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
_nlogin.Click_Login();


pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);


TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
_AgentSearch.Click_Agents();



TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
_AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
_AgentSearch.Click_Search();


TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
_AgentSearch.Click__Nidhi1_();



pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);


TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
_Addltdbus.Click_Click_Plus_Sign1();


TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
_Addltdbus.Click_Click_New_Client2();


TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
_Addltdbus.Click_Click_on_Limited3();

// _//Addltdbus.Businessurl();

TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
_Addltdbus.Click_Limited_Company();


TestModellerLogger.SetLastNodeGuid("ac6beac4-facf-402c-b560-ab2b89d94bac");
_Addltdbus.Enter_Enter_Business_Name1(data[4]);


TestModellerLogger.SetLastNodeGuid("e0ded04a-6be3-40e4-bb61-01fdfed8c456");
_Addltdbus.Enter_Enter_Reg_Num2(data[5]);


TestModellerLogger.SetLastNodeGuid("04dbdd2a-99e5-4742-ac19-362008585b21");
_Addltdbus.Enter_Enter_Reg_Date3(data[6]);


TestModellerLogger.SetLastNodeGuid("cd1e919b-ed60-404f-8a46-c0a644d5d566");
_Addltdbus.Enter_Enter_First_Name4(data[7]);


TestModellerLogger.SetLastNodeGuid("9266759d-5a58-4e97-919d-aa182b702cd7");
_Addltdbus.Enter_Enter_Last_Name5(data[8]);

_Addltdbus.Click_Checkbox__Payroll__Profile();


TestModellerLogger.SetLastNodeGuid("3b6a0ec8-ebfa-4234-9bf1-33e4cd1c7060");
_Addltdbus.Click_Click_buss_Save__btn_payrol();

    }
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "6d6ebb22-5082-4b26-be01-b74928b8fd78")
    public void case_10() throws IOException, InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC62";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
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
   
        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        
        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
           
        	
            pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

            _Addltdbus.client_menu_housesearch();

       TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
        _Addltdbus.Click_Click_Plus_Sign1();
        

        TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
       _Addltdbus.Click_Click_New_Client2();
       

       TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
       _Addltdbus.Click_Click_on_Limited3();
        
 //  _Addltdbus.Enter_House_Search(data[4]);
          //  _Addltdbus.Click_Createcompany();
       
       _Addltdbus.house_search1(data[4]);
       
}
    
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "eaf5778b-53ac-4bbc-89bd-56ff953f44de")
    public void TCcase6() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="TC64";
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
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
  

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    
  

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

    _Addltdbus.client_menu_housesearch();
    
    _Addltdbus.client_menu_newclienttab();
//    TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
//    _Addltdbus.Click_Click_Plus_Sign1();
    

//    TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
//    _Addltdbus.Click_Click_New_Client2();
    

    TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
    _Addltdbus.Click_Click_on_Limited3();
    
   // _//Addltdbus.Businessurl();
    
    TestModellerLogger.SetLastNodeGuid("ea584055-5c84-4c76-9d84-63878ddeb234");
    _Addltdbus.Click_Limited_Company();
    
    }
  
    @Test  (groups= {"Ltd_Add","Ltd_Add - Add_LTD"})
    @TestModellerPath(guid = "6d6ebb22-5082-4b26-be01-b74928b8fd78")
    public void TC_CASE3() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="TC65";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
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
//        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//        _AgentSearch.Click_Agents();
    //    
        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        
        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
           
        	
            pages.new_bank_trans.Addltdbus _Addltdbus = new  pages.new_bank_trans.Addltdbus(driver);

        

       TestModellerLogger.SetLastNodeGuid("4579977a-03e8-4756-bf77-4c363173a34f");
        _Addltdbus.Click_Click_Plus_Sign1();
        

        TestModellerLogger.SetLastNodeGuid("e19b0f06-3b42-4f11-9002-70df97ee77d8");
       _Addltdbus.Click_Click_New_Client2();
       

       TestModellerLogger.SetLastNodeGuid("173734a5-2b2a-4a8b-b194-2ea21f4054f5");
       _Addltdbus.Click_Click_on_Limited3();
        
     _Addltdbus.Enter_House_Search3(data[4]);
          //  _Addltdbus.Click_Createcompany();
       
    
    }
    
    
    
}