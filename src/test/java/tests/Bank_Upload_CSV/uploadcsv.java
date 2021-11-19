package tests.Bank_Upload_CSV;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a8d96a08-2bcb-4e4b-8a4e-5a5d89849148
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1820, profileId = 102312)
public class uploadcsv extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a61ad3dc-6637-4e00-b05c-0cd2f48e2c33")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb() throws InterruptedException, InvalidFormatException
    {
    	 sTestCaseID="TC36";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata();

    
    }


    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "76cfe250-48d5-43d5-a634-9c08a2b29fdd")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb1() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC37";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata();  
       

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "c7d0d18f-82e6-42d9-93ed-70c30c9948ab")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb2() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC38";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
    

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "38f29392-8fbb-44cd-b850-c104a4076751")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb3() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC39";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata();
    

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "763f0e08-843d-40a9-be60-5dac75a9c7dd")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb4() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC40";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
    }


    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "471433c7-4d98-46a7-b34e-73b6b83e24e6")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb5() throws InvalidFormatException, InterruptedException
    {
        sTestCaseID="TC41";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "1711d086-03a6-4e67-bd6c-c60c71fc2fc7")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb6() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC42";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
        

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "42f6a834-3936-460e-b66b-44876caa1347")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb7() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC43";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata();    
       
    

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "3d78d059-298f-46b2-a495-8a1cb859f8ef")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUploadb8() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC44";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 

    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC45";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload46() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC46";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload47() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC47";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload48() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC48";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }

    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload49() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC49";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload50() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC50";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
  
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload51() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC51";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload52() throws InterruptedException, InvalidFormatException
    {
    	//ACOUNTING PERIOD LOCK CASE
    	sTestCaseID="TC52";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
       
    
    }
    @Test  (groups= {"upload_csv","upload_csv - Default Profile"})
    @TestModellerPath(guid = "a4edb22c-42e8-4181-92cf-80f7c9237e17")
    public void GoToUrlClickbankmenu1ClickUploadCSV2PositiveSelectSelectBank4EnterChooseUploadCSV4ClickUpload53() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC53";
      	Sheet="Banking";
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


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

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
       pages.bankmenu _bankmenu = new pages.bankmenu(driver);
       

       TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
        _bankmenu.Click_Bankingmenu();
       
 	 pages.Bank_UploadCSV.UploadCSV _UploadCSV = new  pages.Bank_UploadCSV.UploadCSV(driver);
 
    	
     
// 
//  _UploadCSV.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9fd58dc-15ab-4678-88ca-add393513d78");
//    _UploadCSV.Click_bank_menu_1();
    

    TestModellerLogger.SetLastNodeGuid("f799770f-f356-4721-ac0d-e313c3746d32");
    _UploadCSV.Click_Upload_CSV2();
    

    TestModellerLogger.SetLastNodeGuid("96990b1a-f5a2-4087-ad9d-761222c8a0b5");
    _UploadCSV.Select_Select_Bank4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("811c55a8-5fef-4b5b-8754-a1a89f4e7ed9");
    _UploadCSV.Enter_Choose_Upload_CSV4(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("8166fd1c-bd37-4c4a-ad8d-cb45194956db");
    _UploadCSV.Click_Upload_btn_CSV5();
    

   TestModellerLogger.SetLastNodeGuid("89c8891f-4803-41f5-8e44-52147c479bce");
   _UploadCSV.Select_Dt_CSV_Colum_map7(data[7]);
   

    TestModellerLogger.SetLastNodeGuid("e8fc23b5-7ac0-49b1-b560-234d9b208d52");
   _UploadCSV.Select_Des_CSV_Colum_map8(data[8]);
    
   TestModellerLogger.SetLastNodeGuid("d5537698-513e-4df7-a9d3-7948f5e1f088");
    _UploadCSV.Select_Amt_CSV_Colum_map9(data[9]);
    _UploadCSV.Select_Moneyout_CSV_Colum(data[10]);
   TestModellerLogger.SetLastNodeGuid("20ce7913-f7ad-4a0c-8f70-ff380f21c8da");
   try {
	_UploadCSV.Click_Submit_Map_btn_CSV10();
} catch (InterruptedException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
 _UploadCSV.verifyuploaddata(); 
 _UploadCSV.Click_Import__btn11();
       

}

}



