package Test_Add_LLP;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c7bca122-6ee0-40af-9480-aab33a64ceb2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1885, profileId = 102471)
public class Test_Add_PLC extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "184a894e-3d8a-4009-ad8f-8e12d27133ff")
    public void GoToUrlClickPLCClicked_AddPublicLimitedScreen_TC_1() throws InvalidFormatException, InterruptedException, IOException
    {
    	
    	sTestCaseID="TC127";
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
    	
        Pages_LLP.PLCMANNUAL _PLCMANNUAL = new Pages_LLP.PLCMANNUAL(driver);
        
           _PLCMANNUAL.HighLightPLC();
           
  utilities.Screenshotcapture.Getscreenshot("Public Limited Company_TC01", "Add PLC Business");
  
   TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    utilities.Screenshotcapture.Getscreenshot("Add Public Limited Screen_TC01", "Add PLC Business");

//    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
//    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
//    _PLCMANNUAL.Enter_Enter_Com_Name_3("accusantium");
//    
//
//    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
//    _PLCMANNUAL.Enter_Enter_RegNo_4("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
//    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5("2021-10-15 08:43:05");
//    
//
//    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
//    _PLCMANNUAL.Enter_Enter_dir_FN_6("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
//    _PLCMANNUAL.Enter_Enter_dir_LN_7("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
//    _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
//    
//
//    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
//    _PLCMANNUAL.Click_Enter_Save_Click9();
    

    }

    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "509c201d-c8fe-46dc-9879-eef859d35754")
    public void GoToUrlClickPLCClicked_AddPublicLimitedCompany_TC_2() throws InterruptedException, IOException, InvalidFormatException
    {
    	
       	sTestCaseID="TC127";
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
        
      Pages_LLP.PLCMANNUAL _PLCMANNUAL = new Pages_LLP.PLCMANNUAL(driver);
      
    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    

    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
    

    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
    _PLCMANNUAL.Enter_Enter_Com_Name_3(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
    _PLCMANNUAL.Enter_Enter_RegNo_4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
    _PLCMANNUAL.Enter_Enter_dir_FN_6(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
    _PLCMANNUAL.Enter_Enter_dir_LN_7(data[8]);
    

   // TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
  //  _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
    
    utilities.Screenshotcapture.Getscreenshot("Add Public Limited UI Screen_TC02", "Add PLC Business");
    
    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
    _PLCMANNUAL.Click_Enter_Save_Click9();
    
    _PLCMANNUAL.ClickClientEle();
    _PLCMANNUAL.searchClient(data[4]);
    _PLCMANNUAL.searchClientBtn();
    _PLCMANNUAL.HighLightBusinessList();
    utilities.Screenshotcapture.Getscreenshot("Business Display Under The Busineess List_TC02", "Add PLC Business");

    }

    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "46d32224-1f9e-40fd-b572-73a476aab546")
    public void GoToUrlClickPLCClicked_CompanyHouseSearch_TC_3() throws InvalidFormatException, InterruptedException, IOException
    {
       	sTestCaseID="TC128";
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
        
    	 Pages_LLP.PLCMANNUAL _PLCMANNUAL = new Pages_LLP.PLCMANNUAL(driver);
 
    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    _PLCMANNUAL.Enter_House_Search_Popup(data[4]);

    utilities.Screenshotcapture.Getscreenshot("Company House Search_TC03", "Add PLC Business");
    

    }
    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "46d32224-1f9e-40fd-b572-73a476aab546")
    public void GoToUrlClickPLCClicked_FileUploadSection_TC_4() throws InvalidFormatException, InterruptedException, IOException
    {
       	sTestCaseID="TC129";
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
        
    	 Pages_LLP.PLCMANNUAL _PLCMANNUAL = new Pages_LLP.PLCMANNUAL(driver);
 
    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    
    _PLCMANNUAL.Enter_Choosefile_toupload("D:\\ImportBusinessTemplate_PLC.csv");
    _PLCMANNUAL.Click_Click_Upload_btn();
    utilities.Screenshotcapture.Getscreenshot("File show under import business section_TC04", "Add PLC Business");
    
    _PLCMANNUAL.Click_CcheckboxElem();
    utilities.Screenshotcapture.Getscreenshot("File Upload Successfull Validation Message  Display_TC04", "Add PLC Business");
    _PLCMANNUAL.ClickClientEle();
    _PLCMANNUAL.searchClient(data[4]);
    _PLCMANNUAL.searchClientBtn();
    _PLCMANNUAL.HighLightBusinessList();
    
    utilities.Screenshotcapture.Getscreenshot("Bussiness upload from the sheet and shown under business list_TC04", "Add PLC Business");
    }
    
    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "46d32224-1f9e-40fd-b572-73a476aab546")
    public void GoToUrlClickPLCClicked_CompanyHouseSearch_TC_5() throws InvalidFormatException, InterruptedException, IOException
    {
       	sTestCaseID="TC127";
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
        
    	 Pages_LLP.PLCMANNUAL _PLCMANNUAL = new Pages_LLP.PLCMANNUAL(driver);
 
    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    

    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
    

    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
    _PLCMANNUAL.Enter_Enter_Com_Name_3("nostrum");
    

    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
    _PLCMANNUAL.Enter_Enter_RegNo_4("");
    

    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5("44518");
    

    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
    _PLCMANNUAL.Enter_Enter_dir_FN_6("");
    

    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
    _PLCMANNUAL.Enter_Enter_dir_LN_7("");
    

    TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
    _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
    

    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
    _PLCMANNUAL.Click_Enter_Save_Click9();
    

    }


}