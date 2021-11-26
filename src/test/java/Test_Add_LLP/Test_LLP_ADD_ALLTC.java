package Test_Add_LLP;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.banking.ashiv.Pages_Ashiv_Unrec1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/45a2739a-a03d-4ea8-9164-2873391f60a3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1884, profileId = 102468)
public class Test_LLP_ADD_ALLTC extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "026256f3-4dd6-446e-8e22-84c311f89ec8")
    public void Limited_liability_partnership_Company_ShouldbeVisibleOnScreen_TC01() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC116";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.nlogin _nlogin = new    pages.nlogin(driver);
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
        

        pages.banking.ashiv.AgentSearch _AgentSearch = new    pages.banking.ashiv.AgentSearch(driver);


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();    
        
        
        utilities.Screenshotcapture.Getscreenshot("Limited_liability_partnership_Company_ShouldbeVisibleOnScreen_TC01", "Add LLP Business");
  //     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
   
  //  TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
  //  _LLPManual.Click_LLP_Click_1();
    

//    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
//    _LLPManual.Click_Mannual_LLP_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
//    _LLPManual.Enter_Company_Name_3(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
//    _LLPManual.Enter_RegNo_4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
//    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
//    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
//    _LLPManual.Enter_Member_FN_7(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
//    _LLPManual.Enter_Member_FN_8(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
//    _LLPManual.Enter_Member2_FN_9(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
//    _LLPManual.Enter_Member2_FN_10(data[11]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
//    _LLPManual.Click_LLP_Save__11();
//    

    }


    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "9fa1e396-4364-4b70-bd5f-4d4689545f8f")
    public void Add_Limited_Liability_Screen_TC02() throws InvalidFormatException, InterruptedException, IOException
    {
       sTestCaseID="TC117";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
 //   TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    utilities.Screenshotcapture.Getscreenshot("Add_Limited_Liability_Screen_TC02", "Add LLP Business");

//    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
//    _LLPManual.Click_Mannual_LLP_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
//    _LLPManual.Enter_Company_Name_3(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
//    _LLPManual.Enter_RegNo_4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
//    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
//    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
//    _LLPManual.Enter_Member_FN_7(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
//    _LLPManual.Enter_Member_FN_8(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
//    _LLPManual.Enter_Member2_FN_9(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
//    _LLPManual.Enter_Member2_FN_10(data[11]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
//    _LLPManual.Click_LLP_Save__11();
//     
//    	
    

    }

    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void BusinessShouldBeSavedAndDisplayUnderTheBusineessList_TC03() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC116";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    _LLPManual.ClickClientEle();
    _LLPManual. searchClient(data[4]);
    _LLPManual.searchClientBtn();
    Thread.sleep(2000);
    
    utilities.Screenshotcapture.Getscreenshot("Business Display under the busineess List_TC02", "Add LLP Business");

      
    	

    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void HomeSearchlistWillDisplayAsPerTheSearchCriteriaOnASamePage_TC04() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC118";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    _LLPManual.Enter_House_Search(data[4]);
  //  _LLPManual.Click_Createcompany();
   

   
    utilities.Screenshotcapture.Getscreenshot("Company house Search list display", "Add LLP Business");
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void LLP_Upload_Csv_TC05() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC119";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    _LLPManual.Enter_Choosefile_toupload("D:\\ImportBusinessTemplate_LLP.csv");
    
   
    
   _LLPManual.Click_Click_Upload_btn();
   
   utilities.Screenshotcapture.Getscreenshot("File show under import business section_TC05", "Add LLP Business");
   
   _LLPManual.Click_CcheckboxElem();
   
   utilities.Screenshotcapture.Getscreenshot("File Upload Successfull Validation Message  Display_TC05", "Add LLP Business");
   _LLPManual.ClickClientEle();
   _LLPManual. searchClient(data[4]);
   _LLPManual.searchClientBtn();
   Thread.sleep(2000);
   
   utilities.Screenshotcapture.Getscreenshot("File Upload Business Display under the busineess List_TC05", "Add LLP Business");
   
   
   
  
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void HomeSearchlistWillDisplayAsPerTheSearchCriteriaOnASamePageAndAddCompanyPopupWillBeShownRegardingTheBusinessInformation_TC06() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC118";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
      _LLPManual.Enter_House_Search_Popup(data[4]);
   
   utilities.Screenshotcapture.Getscreenshot("Company pop up will be shown regarding the business information_TC06", "Add LLP Business");
    
    }
    
    ////////////////
    
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "026256f3-4dd6-446e-8e22-84c311f89ec8")
    public void Click_Client_ClickAddClient_Limited_liability_partnership_Company_ShouldbeVisibleOnScreen_TC07() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC116";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.nlogin _nlogin = new    pages.nlogin(driver);
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
        

        pages.banking.ashiv.AgentSearch _AgentSearch = new    pages.banking.ashiv.AgentSearch(driver);


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        
     
       Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
   
       _LLPManual.ClickClientEle();
       _LLPManual.AddClient();
       
       utilities.Screenshotcapture.Getscreenshot("Limited_liability_partnership_Company_ShouldbeVisibleOnScreen_TC07", "Add LLP Business");
       
  //  TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
  //  _LLPManual.Click_LLP_Click_1();
    

//    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
//    _LLPManual.Click_Mannual_LLP_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
//    _LLPManual.Enter_Company_Name_3(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
//    _LLPManual.Enter_RegNo_4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
//    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
//    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
//    _LLPManual.Enter_Member_FN_7(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
//    _LLPManual.Enter_Member_FN_8(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
//    _LLPManual.Enter_Member2_FN_9(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
//    _LLPManual.Enter_Member2_FN_10(data[11]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
//    _LLPManual.Click_LLP_Save__11();
//    

    }


    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "9fa1e396-4364-4b70-bd5f-4d4689545f8f")
    public void Click_Client_ClickAddClient_Add_Limited_Liability_Screen_TC08() throws InvalidFormatException, InterruptedException, IOException
    {
       sTestCaseID="TC117";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
     
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
 //   TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
        _LLPManual.ClickClientEle();
        _LLPManual.AddClient();

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    utilities.Screenshotcapture.Getscreenshot("Add_Limited_Liability_Screen_TC08", "Add LLP Business");

//    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
//    _LLPManual.Click_Mannual_LLP_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
//    _LLPManual.Enter_Company_Name_3(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
//    _LLPManual.Enter_RegNo_4(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
//    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
//    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
//    _LLPManual.Enter_Member_FN_7(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
//    _LLPManual.Enter_Member_FN_8(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
//    _LLPManual.Enter_Member2_FN_9(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
//    _LLPManual.Enter_Member2_FN_10(data[11]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
//    _LLPManual.Click_LLP_Save__11();
//     
//    	
    

    }

    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Click_Client_ClickAddClient_BusinessShouldBeSavedAndDisplayUnderTheBusineessList_TC09() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC120";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
    
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
        _LLPManual.ClickClientEle();
        _LLPManual.AddClient();

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    _LLPManual.ClickClientEle();
    _LLPManual. searchClient(data[4]);
    _LLPManual.searchClientBtn();
    Thread.sleep(2000);
    
    utilities.Screenshotcapture.Getscreenshot("Business Display under the busineess List_TC09", "Add LLP Business");

      
    	

    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Click_Client_ClickAddClient_HomeSearchlistWillDisplayAsPerTheSearchCriteriaOnASamePage_TC010() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC118";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
     _LLPManual.ClickClientEle();
     _LLPManual.AddClient();
     
    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    _LLPManual.Enter_House_Search(data[4]);
  //  _LLPManual.Click_Createcompany();
   

   
    utilities.Screenshotcapture.Getscreenshot("Company house Search list display_TC10", "Add LLP Business");
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Click_Client_ClickAddClient_Upload_Csv_TC011() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC119";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
      
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
     _LLPManual.ClickClientEle();
     _LLPManual.AddClient();
     
    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
    _LLPManual.Enter_Choosefile_toupload("D:\\ImportBusinessTemplate_LLP.csv");
    
   
    
   _LLPManual.Click_Click_Upload_btn();
   
   utilities.Screenshotcapture.Getscreenshot("File show under import business section_TC011", "Add LLP Business");
   
   _LLPManual.Click_CcheckboxElem();
   
   utilities.Screenshotcapture.Getscreenshot("Success full Validation Message Should Display_TC011", "Add LLP Business");
   _LLPManual.ClickClientEle();
   _LLPManual. searchClient(data[4]);
   _LLPManual.searchClientBtn();
   Thread.sleep(2000);
   
   utilities.Screenshotcapture.Getscreenshot("Business Display under the busineess List_TC011", "Add LLP Business");
   
   
   
  
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Click_Client_ClickAddClient_HomeSearchlistWillDisplayAsPerTheSearchCriteriaOnASamePageAndAddCompanyPopupWillBeShownRegardingTheBusinessInformation_TC012() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC118";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
     
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
     _LLPManual.ClickClientEle();
     _LLPManual.AddClient();

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    
      _LLPManual.Enter_House_Search_Popup(data[4]);
   
   utilities.Screenshotcapture.Getscreenshot("Company pop up will be shown regarding the business information_TC012", "Add LLP Business");
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Click_Client_ClickAddClient_Click_BackBtn__TC013() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC118";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
     
        
     Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
     _LLPManual.ClickClientEle();
     _LLPManual.AddClient();

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    _LLPManual.bak_btn();
    
    utilities.Screenshotcapture.Getscreenshot("Click on back button_TC013", "Add LLP Business");
     // _LLPManual.Enter_House_Search_Popup(data[4]);
   
   
    
    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void BusinessShouldBeSavedAndDisplayUnderTheBusineessList_Create_Payroll_Profile_TC014() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC121";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    _LLPManual.PayrollCompany();
    
    utilities.Screenshotcapture.Getscreenshot(" Create Payroll Profile_TC014", "Add LLP Business");

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    _LLPManual.ClickClientEle();
    _LLPManual. searchClient(data[4]);
    _LLPManual.searchClientBtn();
    Thread.sleep(2000);
    
    utilities.Screenshotcapture.Getscreenshot("Payroll Business Display under the busineess List_TC014", "Add LLP Business");

      
    	

    }
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Entering_wrong_date_formatTC015() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC122";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    _LLPManual.PayrollCompany();
    
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    utilities.Screenshotcapture.Getscreenshot("Entering the wrong date format Validation Message_TC015", "Add LLP Business");
  

      
    	

    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Registration_Number_Exceed_than_8_charTC016() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC123";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    _LLPManual.PayrollCompany();
    
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    utilities.Screenshotcapture.Getscreenshot("Registration Number Exceed Than 8 Char Validation Message_TC016", "Add LLP Business");
  

    }
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Direction_Name_is_Not_Provided_TC017() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC124";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    _LLPManual.PayrollCompany();
    
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    
    utilities.Screenshotcapture.Getscreenshot("Direction Name is Not Provided Validation Message_TC015", "Add LLP Business");
}
    
    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void Payrol_check_box_ticked_TC017() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC125";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
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


        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        
        pages.new_bank_trans.Addltdbus _addbu=new pages.new_bank_trans.Addltdbus(driver);
        
        _addbu.Click_Click_Plus_Sign1();
        _addbu.Click_Click_New_Client2();      
        Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
  //  TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
   // _LLPManual.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d7c4fbf-c4ea-4269-961a-b755b05d8b52");
    _LLPManual.Click_LLP_Click_1();
    


    TestModellerLogger.SetLastNodeGuid("5ceb7c8d-631a-4101-8673-3d00470c6748");
    _LLPManual.Click_Mannual_LLP_2();
    

    TestModellerLogger.SetLastNodeGuid("0d664f91-95a7-4466-a920-5c30bb3794c8");
    _LLPManual.Enter_Company_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3b25874-58f2-48b0-9e40-77788cd5f3bc");
    _LLPManual.Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("61a832be-7996-4533-be80-9ba3242cee85");
    _LLPManual.Enter_UTRNo_LLP_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b025e9c6-f6a4-44c2-830e-e5ea3bfecf6a");
    _LLPManual.Enter_Reg_BUS_Date_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("53730563-b1fc-451f-baf7-983e4b486ef2");
    _LLPManual.Enter_Member_FN_7(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("79861bcb-bdd6-471e-88dd-445247ca9029");
    _LLPManual.Enter_Member_FN_8(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("f097e1fb-a712-4f70-871b-e8f872a1d4cd");
    _LLPManual.Enter_Member2_FN_9(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("28348a97-6376-4d3c-8e72-dd31aee5a404");
    _LLPManual.Enter_Member2_FN_10(data[11]);
    _LLPManual.PayrollCompany();
    
    

    TestModellerLogger.SetLastNodeGuid("a900b508-b388-4828-b512-d5d3e8d634e4");
    _LLPManual.Click_LLP_Save__11();
    
   _LLPManual.ClickClientEle();
   _LLPManual.searchClient(data[4]);
   _LLPManual.searchClientBtn();
   _LLPManual.HighlightPayroll();
   
    
    
    
    utilities.Screenshotcapture.Getscreenshot("HighLight Payroll Business_TC017", "Add LLP Business");
}
    
    
    
    
    
}