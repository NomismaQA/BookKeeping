package test.ashiv;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f05343ee-f6c2-439d-8b9f-8285da5a75ae
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1779, profileId = 102234)
public class RULE1_flowrun extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "d4b18723-b1dd-48ba-a67c-35968eb4301f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="TC1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
    	pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();


    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

	pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);


    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
               
        pages.banking.ashiv.bankview _bankview = new  pages.banking.ashiv.bankview(driver);
        
        _bankview.Click_Bank_Menu_View();
        
        _bankview.Click_Bank__Rules_dropdown();
        
        pages.banking.ashiv.BankRuleUNR_Runrl _rulecreate=new pages.banking.ashiv.BankRuleUNR_Runrl(driver);

        _rulecreate.Click_Add_Bank_rule_btn();

        
       _rulecreate.Enter_Rule_Desc(data[5]);
       _rulecreate.desc();
       
       _rulecreate.Click_Account_Select_code();
        
        _rulecreate.Enter_box0(data[6]);
       
        _rulecreate.Select_Select_VateRate_Type(data[7]);
        
       _rulecreate.Select_Tran_Type_Code(data[8]);
       
        _rulecreate.Click_Save__Btn_Click();
    
pages.banking.ashiv.bankmenu _bankmenu2 = new pages.banking.ashiv.bankmenu(driver);
        

        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
         _bankmenu2.Click_Bankingmenu();
         

         TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
         _bankmenu2.Click_Newmenu();
         
         TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
         _bankmenu2.Click_New_Transactionclick();

         pages.banking.ashiv.BANKTRN_UNR _nBANKTRN = new pages.banking.ashiv.BANKTRN_UNR(driver);
       
          TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
          _nBANKTRN.Select_BK_SELECT(data[9]);
          

          TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
          _nBANKTRN.Enter_NDate(data[10]);
     
          ;
         _nBANKTRN.Enter_n_desc();
          

          TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
         _nBANKTRN.Enter_Recived_amt(data[12]);
          

          

        TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
          _nBANKTRN.Select_Select_VATRate(data[13]);

       
             TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
          _nBANKTRN.Click__Save_();

        
        
        
        
        
        
    }

 


//    @Test  (groups= {"Rule1","Rule1 - rule1"})
//    @TestModellerPath(guid = "4484047e-1435-40bf-84e4-93295b93c6c4")
//    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi1() throws InterruptedException, InvalidFormatException, IOException
//    {
//    	sTestCaseID="TS1.1";
//    	Sheet="Banking";
//    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
//    	
//        pages.nlogin _nlogin = new pages.nlogin(driver);
//    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
//    _nlogin.GoToUrl();
//    
//
////    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
////    _nlogin.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
//    _nlogin.Enter_nLOGIN(data[1]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
//    _nlogin.Enter_nPASS(data[2]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
//    _nlogin.Click_Login();
//    
//
//pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    
//
//
//
//    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
//    _AgentSearch.Click_Agents();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
//
////    
//    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
//    _AgentSearch.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
//    _AgentSearch.Click__Nidhi1_();
//    
//
//pages.Searchclient _Searchclient = new pages.Searchclient(driver);
////    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
////    _Searchclient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
//    _Searchclient.Click__Clients_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
//    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
//    _Searchclient.Click_Searchbtn();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
//    _Searchclient.Click__NidhiEnt();
//    
//
//        pages.bankmenu _bankmenu = new pages.bankmenu(driver);
//        _bankmenu.Click_Bankingmenu();
//        
//pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
//        
//        _bankview.Click_Bank_Menu_View();
//        
//        _bankview.Click_Bank__Rules_dropdown();
//        
//        pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);
//
//        _rulecreate.Click_Add_Bank_rule_btn();
//        
//       // _rulecreate.Select_Condition_Formula("");
//        
//       _rulecreate.Enter_Rule_Desc(data[5]);
//       _rulecreate.desc();
//       
//       _rulecreate.Click_Account_Select_code();
//        
//        _rulecreate.Enter_box0(data[6]);
//       
//        _rulecreate.Select_Select_VateRate_Type(data[7]);
//        
//       _rulecreate.Select_Tran_Type_Code(data[8]);
//       
//        _rulecreate.Click_Save__Btn_Click();
//    
//pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
//        
//
//        TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
//         _bankmenu2.Click_Bankingmenu();
//         
//
//         TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//         _bankmenu2.Click_Newmenu();
//         
//         TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
//         _bankmenu2.Click_New_Transactionclick();
//
//         BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
//       
//          TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
//          _nBANKTRN.Select_BK_SELECT(data[9]);
//          
//
//          TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
//          _nBANKTRN.Enter_NDate(data[10]);
//     
//          ;
//         _nBANKTRN.Enter_n_desc();
//          
//
//          TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
//         _nBANKTRN.Enter_Recived_amt(data[12]);
//          
////
////          TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
////       _nBANKTRN.Enter_spnt_amt(data[12]);
//          
//
//        TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
//          _nBANKTRN.Select_Select_VATRate(data[13]);
//          
//
////          TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
////          _nBANKTRN.Click_Select_Option1();
//      //    
//      //
////          TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
////          _nBANKTRN.Enter_BOX2(data[11]);
//       
//             TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
//          _nBANKTRN.Click__Save_();
//
//        
//    
//    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos1() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.4";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
    	pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    pages.banking.ashiv.AgentSearch _AgentSearch = new pages.banking.ashiv.AgentSearch(driver);

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
    

    pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.banking.ashiv.bankmenu _bankmenu = new pages.banking.ashiv.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.banking.ashiv.bankview _bankview = new pages.banking.ashiv.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.banking.ashiv.BankRuleUNR_Runrl _rulecreate=new pages.banking.ashiv.BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

    pages.banking.ashiv.bankmenu _bankmenu2 = new pages.banking.ashiv.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     pages.banking.ashiv.BANKTRN_UNR _nBANKTRN = new pages.banking.ashiv.BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
  
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

    
    
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos8() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.6";
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
    
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

    
   

    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi10() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TS1.7";
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
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

    
    
        
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos11() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.8";
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
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
         _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

}
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos12() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.9";
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();
      
    
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos13() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.1";
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();
    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos15() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="TS1.2";
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi21() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TS1.3";
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
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

    
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos16() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TS1.5";
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
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
    pages.BankRule.BankRuleUNR_Runrl _rulecreate=new BankRuleUNR_Runrl(driver);

    _rulecreate.Click_Add_Bank_rule_btn();
    
   // _rulecreate.Select_Condition_Formula("");
    
   _rulecreate.Enter_Rule_Desc(data[5]);
   _rulecreate.desc();
   
   _rulecreate.Click_Account_Select_code();
    
    _rulecreate.Enter_box0(data[6]);
   
    _rulecreate.Select_Select_VateRate_Type(data[7]);
    
   _rulecreate.Select_Tran_Type_Code(data[8]);
   
    _rulecreate.Click_Save__Btn_Click();

pages.bankmenu _bankmenu2 = new pages.bankmenu(driver);
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
     _bankmenu2.Click_Bankingmenu();
     

     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_Newmenu();
     
     TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
     _bankmenu2.Click_New_Transactionclick();

     BANKTRN_UNR _nBANKTRN = new BANKTRN_UNR(driver);
   
      TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
      _nBANKTRN.Select_BK_SELECT(data[9]);
      

      TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
      _nBANKTRN.Enter_NDate(data[10]);
 
 
     _nBANKTRN.Enter_n_desc();
      

      TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
     _nBANKTRN.Enter_Recived_amt(data[12]);
      
//
//      TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
//   _nBANKTRN.Enter_spnt_amt(data[12]);
      

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
      _nBANKTRN.Select_Select_VATRate(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
//      _nBANKTRN.Click_Select_Option1();
  //    
  //
//      TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
//      _nBANKTRN.Enter_BOX2(data[11]);
   
         TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
      _nBANKTRN.Click__Save_();

    }
    }
/*
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos17() throws InterruptedException, IOException, InvalidFormatException
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
    

        pages.bankmenu _bankmenu = new pages.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
        pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
        
        _bankview.Click_Bank_Menu_View();
        
        _bankview.Click_Bank__Rules_dropdown();
        
        pages.BankRule.BankRuleCreate _rulecreate=new pages.BankRule.BankRuleCreate(driver);

        _rulecreate.Click_Add_Bank_rule_btn();
        
//        _rulecreate.Select_Condition_Formula("");
        
        _rulecreate.Enter_Rule_Desc(data[5]);
        
        _rulecreate.Click_Account_Select_code();
        
        _rulecreate.Enter_box0(data[6]);
        
        _rulecreate.Select_Select_VateRate_Type(data[7]);
        
        _rulecreate.Select_Tran_Type_Code(data[8]);
        _rulecreate.Click_Save__Btn_Click();
    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi9() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TC9";
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
    

        pages.bankmenu _bankmenu = new pages.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
        pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
        
        _bankview.Click_Bank_Menu_View();
        
        _bankview.Click_Bank__Rules_dropdown();
        
        pages.BankRule.BankRuleCreate _rulecreate=new pages.BankRule.BankRuleCreate(driver);

        _rulecreate.Click_Add_Bank_rule_btn();
        
//        _rulecreate.Select_Condition_Formula("");
        
        _rulecreate.Enter_Rule_Desc(data[5]);
        
        _rulecreate.Click_Account_Select_code();
        
        _rulecreate.Enter_box0(data[6]);
        
        _rulecreate.Select_Select_VateRate_Type(data[7]);
        
        _rulecreate.Select_Tran_Type_Code(data[8]);
        _rulecreate.Click_Save__Btn_Click();
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos18() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC18";
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
    

        pages.bankmenu _bankmenu = new pages.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
        pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
        
        _bankview.Click_Bank_Menu_View();
        
        _bankview.Click_Bank__Rules_dropdown();
        
        pages.BankRule.BankRuleCreate _rulecreate=new pages.BankRule.BankRuleCreate(driver);

        _rulecreate.Click_Add_Bank_rule_btn();
        
//        _rulecreate.Select_Condition_Formula("");
        
        _rulecreate.Enter_Rule_Desc(data[5]);
        
        _rulecreate.Click_Account_Select_code();
        
        _rulecreate.Enter_box0(data[6]);
        
        _rulecreate.Select_Select_VateRate_Type(data[7]);
        
        _rulecreate.Select_Tran_Type_Code(data[8]);
        _rulecreate.Click_Save__Btn_Click();
    }
}
*/
    
    