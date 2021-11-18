package BenkRuleTest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BankRule.BankRuleCr_Expt_Both;
import BankRule.BankRuleCreate;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f05343ee-f6c2-439d-8b9f-8285da5a75ae
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1779, profileId = 102234)
public class Rule1_rule1 extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet =null;


	@Test  (groups= {"Rule1","Rule1 - rule1"})
	@TestModellerPath(guid = "d4b18723-b1dd-48ba-a67c-35968eb4301f")
	public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi() throws InterruptedException, IOException, InvalidFormatException
	{
		sTestCaseID="Bank1";
		Sheet="Fin-3821";
		data =ExcelUtility.toReadExcelData(sTestCaseID, Sheet);

		pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
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


		pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);

		//   TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
		//_AgentSearch.GoToUrl();




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


		pages.PartialReconciledCases.bankmenu _bankmenu = new pages.PartialReconciledCases.bankmenu(driver);
		
		_bankmenu.Click_Bankingmenu();

		BankRule.bankview _bankview = new BankRule.bankview(driver);

		_bankview.Click_Bank_Menu_View();

		_bankview.Click_Bank__Rules_dropdown();


		// BankRule.BankRuleCr_Expt_Both _As=new BankRule.BankRuleCr_Expt_Both(driver);
//		    _As.enterFrsmedata(); 
		//_As.fill_deta();
		// String[] str=_As.chooseFromList();
		//	 System.out.println(str);
		// _As.fill_data2();
		
		Ashiv_Demo_Pages.GetData _GetData=new Ashiv_Demo_Pages.GetData(driver);
		
		_GetData.GetTData();

         pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver);
         
		//    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
		//_ReconcilationTransaction.GoToUrl();


		// TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
		// _ReconcilationTransaction.AssertUrl();


		TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
		_ReconcilationTransaction.Click_BankingTAB();


		TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
		_ReconcilationTransaction.Click_NewTAB();


		TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
		_ReconcilationTransaction.Click_NewTransaction();


		//TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
	//	_ReconcilationTransaction.Select_BankName("AA@Ashiv");


		//  TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
		//   _ReconcilationTransaction.Enter_Date("14/09/2021");

		//   _ReconcilationTransaction.Fill_From();


		//   TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
		//  _ReconcilationTransaction.Enter_Description("as");


		//  TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
		//  _ReconcilationTransaction.Enter_ReceivedAmount("100");


		//  TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
		//  _ReconcilationTransaction.Enter_SpentAmount("100");


		//  TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
		// _ReconcilationTransaction.Select_VATRateType("Standard Rate");


		// TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
		//  _ReconcilationTransaction.Enter_VATAmount("100");


		// TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
		// _ReconcilationTransaction.Click_AllocateTo();


		//   TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
		//  _ReconcilationTransaction.Enter_AllocateTo1Inside(null);


		// TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
		// _ReconcilationTransaction.Click_SaveButton();
		/////   _ReconcilationTransaction.FillTrns();
		
		Ashiv_Demo_Pages.Fill_Bank_tran _fill=new  Ashiv_Demo_Pages.Fill_Bank_tran(driver);
		
		_fill.FillTrns();



		//     BankRule.TestModellerio_Quality_with_Every_Release _FillData=new  BankRule.TestModellerio_Quality_with_Every_Release(driver);
		//    _FillData.Fill_Data();

		//  BankRule.BankRuleCreate _rulecreate=new BankRule.BankRuleCreate(driver);

		// _rulecreate.Click_Add_Bank_rule_btn();

		//  _rulecreate.Select_Condition_Formula("pages.BankRule.BankRuleCr_Stdard_Credit _rulecreate2=new pages.BankRule.BankRuleCr_Stdard_Credit(driver);");

		//    _rulecreate.Enter_Rule_Desc(data[5]);
		//       for(int i=0; i<=10;i++)
		//   {
		//  _rulecreate.Click_Account_Select_code();
		//   _rulecreate.Enter_box0();

		//   _rulecreate.Select_Select_VateRate_Type("Standard Rate");

		//   _rulecreate.Select_Tran_Type_Code("Both");
		// _rulecreate.Click_Save__Btn_Click();
	}


}








/* @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4484047e-1435-40bf-84e4-93295b93c6c4")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi1() throws InterruptedException, InvalidFormatException, IOException
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

   // }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "fed4dbec-783a-45fa-8a62-35a8dff836c0")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi4() throws InvalidFormatException, InterruptedException, IOException
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
    @TestModellerPath(guid = "240d72a4-3691-48ed-876b-b7104e2d7fff")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi7() throws InvalidFormatException, InterruptedException, IOException
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos1() throws InterruptedException, IOException, InvalidFormatException
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
        _rulecreate.Click_Save__Btn_Click();;


    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi8() throws InterruptedException, InvalidFormatException, IOException
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos8() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC8";
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
        _rulecreate.Click_Save__Btn_Click();;


    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi10() throws InterruptedException, InvalidFormatException, IOException
    {

    	sTestCaseID="TC10";
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos11() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC11";
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
        _rulecreate.Click_Save__Btn_Click();;

}
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos12() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC12";
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos13() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC13";
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos14() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC14";
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos15() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC15";
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi21() throws InterruptedException, InvalidFormatException, IOException
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
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos16() throws InterruptedException, IOException, InvalidFormatException
    {

    	sTestCaseID="TC16";
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
    }*/



