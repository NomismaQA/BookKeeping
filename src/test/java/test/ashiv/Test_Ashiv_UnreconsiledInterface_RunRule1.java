package test.ashiv;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/abcc0b2c-4847-4be6-9265-003105a5c9bf
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1781, profileId = 102237)
public class Test_Ashiv_UnreconsiledInterface_RunRule1 extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "3b781724-5701-48af-9bec-20d97198300b")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
    	
    	sTestCaseID="TC19";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    

    pages.banking.ashiv.AgentSearch _AgentSearch = new  pages.banking.ashiv.AgentSearch(driver);

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    pages.banking.ashiv.Searchclient _Searchclient = new  pages.banking.ashiv.Searchclient(driver);

    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.banking.ashiv.bankmenu _bankmenu = new  pages.banking.ashiv.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
        pages.banking.ashiv.Unrec1 _Unrec1 = new   pages.banking.ashiv.Unrec1(driver);

    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    
    pages.banking.ashiv.fnyr _fnyr=new  pages.banking.ashiv.fnyr(driver);
    _fnyr.Select_Financial_yr_dropdown("Jan 2021 - Dec 2021");
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("NIDHI");
    
//
//    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
//    _Unrec1.Select_Sel_date_range_drop_down("This Month");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
//    _Unrec1.Enter_Sel_Date_From1("44412");
//    
//
//    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
//    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }
}
/*
    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "c5e0a0ea-7e51-4985-8366-abd53452180d")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn1()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("2021-02-24 01:42:40");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "5c8114ce-403b-4ad1-bba5-c78aafabf173")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn2()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("2021-10-10 12:09:28");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "7dee7b06-8548-4a6c-beca-6a1c9983b9b9")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn3()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("2021-06-19 05:32:07");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "f2b584a7-68d6-4bc3-9722-8b8acc2e43bb")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn4()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("2021-09-04 14:27:25");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "5ac86ee8-bf7c-4ee3-9952-0ede1f952d8a")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn5()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Quarter");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "40117520-83b9-48a0-ae72-594dd732f709")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn6()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "7fa6c744-22e2-4fe2-b5d7-f7e0b0af46b1")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn7()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Last Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "02488aac-3846-49c7-b6ee-a30c61dff561")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveEn8()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Last Quarter");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "d7220979-afa5-4660-830b-d9d863449d66")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Last Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "81fc78f6-a15e-40b4-b691-68342a96eac6")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE1()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Month To Date");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "4cbfc57f-9c00-4aca-96a2-344e6ce4413d")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE2()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Quarter To Date");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "cd309f6b-d6f7-4a2e-8087-d7a1bcbcfd4f")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE3()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Year To Date");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "80515f4a-a998-44e9-bfbf-902c9a65bdf4")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE4()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("All");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("Custom");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "a24e6ac1-4f4d-49af-94a8-525be84f5e39")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE5()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("bank1");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

    @Test  (groups= {"Unreconsiled_Interface","Unreconsiled_Interface - Run_Rule1"})
    @TestModellerPath(guid = "e92cf5ff-3f21-402b-a375-7d2cc2ef8ab9")
    public void GoToUrlClickUnrecoTransPositiveSelectselbnkdropdownPositiveSelectSeldaterangedropdownPositiveE6()
    {
        
        pages.Unrec1 _Unrec1 = new pages.Unrec1(driver);
    TestModellerLogger.SetLastNodeGuid("10f4403d-c69d-4663-b930-d56c4cb76eb8");
    _Unrec1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c5396966-5d41-4fa9-aeb2-41a0420025e9");
    _Unrec1.Click_Un_reco_Trans();
    

    TestModellerLogger.SetLastNodeGuid("5ba0e2d6-0b34-4a31-a53c-138e9f98ad0e");
    _Unrec1.Select_sel_bnk_dropdown("Default Bank");
    

    TestModellerLogger.SetLastNodeGuid("14553903-730f-40e0-b639-dbcad8658a61");
    _Unrec1.Select_Sel_date_range_drop_down("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6df7bfca-d30e-494d-b649-f63a34f094f8");
    _Unrec1.Enter_Sel_Date_From1("44412");
    

    TestModellerLogger.SetLastNodeGuid("22a05561-c6cb-4140-8011-b2daf49d1ea2");
    _Unrec1.Enter_Sel_Date_To2("44412");
    

    TestModellerLogger.SetLastNodeGuid("3309d06a-b168-4b45-8430-3491509370f8");
    _Unrec1.Click_Update_btn_clicked();
    

    TestModellerLogger.SetLastNodeGuid("9e30c27c-2397-443b-b794-9a54ec3a42e2");
    _Unrec1.Click_Tab_RunRules1_btn();
    

    TestModellerLogger.SetLastNodeGuid("4d690494-6028-40a1-9b42-7e040dff1a57");
    _Unrec1.Click_Top_Right_side_Rec_btn();
    

    }

}*/