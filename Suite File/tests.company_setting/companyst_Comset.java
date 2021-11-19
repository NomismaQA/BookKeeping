package tests.company_setting;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.Dimension;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/83d0e8fd-68b5-4f68-8374-7f181678a299
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1883, profileId = 102465)
public class companyst_Comset extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

	
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "5589fb5d-f662-40d9-9078-caadc7867846")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi() throws InvalidFormatException, InterruptedException
    {
     /*Click on edit button of client */
    	sTestCaseID="TC92";
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
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    pages.Company_Settings.Settingeditbuss _bss=new  pages.Company_Settings.Settingeditbuss(driver);
    	    _bss.Click_Src_edit_icon_click_1();
    	    _bss.Select_Select_Services_Click_2(data[5]);
    	    _bss.Click_Click_Save__btn_6();
    	    _bss.Click_Click_Back_btn_7();
    	    utilities.PassScreenshot.Getscreenshot11("search bussiness through","Search grid->Edit Bussiness");
    	  }

    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "2173ec7c-a70b-4a4c-be24-b8d4302b77d3")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi1() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC93";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    pages.Company_Settings.Settingeditbuss _bss=new  pages.Company_Settings.Settingeditbuss(driver);
    	    _bss.Click_Src_edit_icon_click_1();
    	    _bss.Select_Select_Services_Click_2(data[5]);
    	    _bss.Click_Click_Save__btn_6();
    	    _bss.Click_Click_Back_btn_7();
    	    utilities.PassScreenshot.Getscreenshot11("search bussiness through","Search grid->Edit Bussiness");
    		

    }


    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "54b57e11-4e2e-4690-bb88-8bc8eb5a3952")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi2() throws InvalidFormatException, InterruptedException
    {
        /*This is TC edited bk,fa,kb-fa,NA -shot has been taken*/

    	sTestCaseID="TC94";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	 pages.nlogin _nlogin = new pages.nlogin(driver);
    	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    	    _nlogin.GoToUrl();
    	    

//    	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    	    _nlogin.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    	    _nlogin.Enter_nLOGIN(data[1]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    	    _nlogin.Enter_nPASS(data[2]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    	    _nlogin.Click_Login();
    	    

    	pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	
        pages.Company_Settings.setting _setting = new pages.Company_Settings.setting (driver);


    TestModellerLogger.SetLastNodeGuid("ea26a9c3-6ff1-4d85-a5d2-6252d6c46bd4");
    _setting.Click_Click_Settings__1();
    

    TestModellerLogger.SetLastNodeGuid("15ef4acf-2dab-4e2a-9273-b8301fbc420a");
    _setting.Click_Click_General_tab_2();
        _setting.editservice();
        /*Search Business with is marked as NONE(INACTIVE*/
    _AgentSearch.GoToUrl();
       _AgentSearch.Click_Agents();
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    _AgentSearch.Click_Search();
        _AgentSearch.Click__Nidhi1_();
       pages.Company_Settings.Search_Inactiveclient _st=new pages.Company_Settings.Search_Inactiveclient(driver);
      _st.GoToUrl();
      _st.Click__Clients_();
      _st.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
      _st.Select_status("Inactive");
   //   _st.Select_Type("Inactive");
      _st.Click_Searchbtn();
      utilities.PassScreenshot.Getscreenshot11("inactive bussiness","Edit Setting");
      Thread.sleep(1000);

    }
   
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "07708298-324e-4a5a-a1e7-e3e29325ae40")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi3() throws InvalidFormatException, InterruptedException
    {
    	 /*Click on edit button of client */
    	sTestCaseID="TC95";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    pages.Company_Settings.Settingeditbuss _bss=new  pages.Company_Settings.Settingeditbuss(driver);
    	    _bss.Click_Src_edit_icon_click_1();
    	    _bss.Select_Select_Services_Click_2(data[5]);
    	    _bss.Click_Click_Save__btn_6();
    	    _bss.Click_Click_Back_btn_7();
    	    utilities.PassScreenshot.Getscreenshot11("search bussiness through","Search grid->Edit Bussiness");  
        

    }
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi4() throws InvalidFormatException, InterruptedException
    {
        
        /*Click setting edit check Registration validation */
    	sTestCaseID="TC96";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_Right_Edit_btn_3();
    	   _set.Select_Select_Services_4(data[5]);
  	    _set.Enter_Negative_RegNo_13();
    	   _set.Click_Click_Save__bttn_19();
    
    	   
    	   
    	   
    	   
    	   
    	   
    }
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi97() throws InvalidFormatException, InterruptedException
    {
        
        /*Click setting edit Check adress validation */
    	sTestCaseID="TC97";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_Right_Edit_btn_3();
    	   _set.Select_Select_Services_4(data[5]);
  	    _set.Enter_Negative_RegNo_13();
    	   _set.Click_Click_Save__bttn_19();
        	   
    }
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi98() throws InvalidFormatException, InterruptedException
    {
        
        /*Click setting edit Check adress validation */
    	sTestCaseID="TC98";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_Right_Edit_btn_3();
    	   _set.Select_Select_Services_4(data[5]);
  	    _set.Enter_Negative_Address_15();
    	   _set.Click_Click_Save__bttn_19();
        	   
    }
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi99() throws InvalidFormatException, InterruptedException
    {
        
        /*Click setting edit Check adress validation */
    	sTestCaseID="TC99";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_Right_Edit_btn_3();
    	   _set.Select_Select_Services_4(data[5]);
  	    _set.Enter_postcode_RegNo_13();
    	   _set.Click_Click_Save__bttn_19();
        	   
    }
    
    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi100() throws InvalidFormatException, InterruptedException
    {
        
        /*Click setting edit Check adress validation */
    	sTestCaseID="TC100";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_Right_Edit_btn_3();
    	  
    	   _set.Enter_Negative_Email_address_8();
        	   
    }
    

    @Test  (groups= {"company_st","company_st - Com_set"})
    @TestModellerPath(guid = "113a4acc-1e52-44da-a250-1c9b948cd60f")
    public void GoToUrlClickClickSettings1ClickClickGeneraltab2ClickClickRightEditbtn3PositiveSelectSelectServi101() throws InvalidFormatException, InterruptedException, ParseException
    {
        
        /*Click setting nomisma date validation check */
    	sTestCaseID="TC101";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    
    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    
    	    _Searchclient.Click__NidhiEnt();
    	   pages.Company_Settings.setting _set=new pages.Company_Settings.setting(driver);
    	   _set.Click_Click_Settings__1();
    	   _set.Click_Click_General_tab_2();
    	       	   _set.Click_Click_Right_Edit_btn_3();
    	     // _set.Select_Select_Services_4("Bookkeeping");
    	     // _set.Enter_Click_CompanyName_5(Sheet);
    	    //  _set.Enter_Click_TradingName_6(Sheet);
    	   _set.Enter_Enter_RegDate_14(data[6]);
    	   _set.date_validation(); 
    	   _set.Click_Click_CeaseDate_18(data[7]);
    	  _set.date_validation(); 
    	  
    	   //_set.Enter_Negative_Email_address_8();
        	   
    }
    
    

}