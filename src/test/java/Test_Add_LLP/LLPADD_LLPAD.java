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
public class LLPADD_LLPAD extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "026256f3-4dd6-446e-8e22-84c311f89ec8")
    public void GoToUrlClickLLPClick1ClickMannualLLP2PositiveEnterCompanyName3EnterRegNo4EnterUTRNoLLP5Positi16() throws InvalidFormatException, InterruptedException, IOException, HeadlessException, AWTException
    {
    	sTestCaseID="TC116";
       	Sheet="Banking";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.banking.ashiv.nlogin _nlogin = new    pages.banking.ashiv.nlogin(driver);
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
       Pages_LLP.LLPManual _LLPManual = new Pages_LLP.LLPManual(driver);
        
    TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
    _LLPManual.GoToUrl();
    

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
    

    }


    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "9fa1e396-4364-4b70-bd5f-4d4689545f8f")
    public void GoToUrlClickLLPClick1ClickMannualLLP2PositiveEnterCompanyName3EnterRegNo4EnterUTRNoLLP5Positi117() throws InvalidFormatException, InterruptedException, IOException
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
        
    TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
    _LLPManual.GoToUrl();
    

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
     
    	
    

    }

    @Test  (groups= {"LLP_ADD","LLP_ADD - LLP_AD"})
    @TestModellerPath(guid = "014b3ac9-220c-4d51-a609-3087c639f149")
    public void GoToUrlClickLLPClick1ClickMannualLLP2PositiveEnterCompanyName3EnterRegNo4EnterUTRNoLLP5Positi118() throws InterruptedException, InvalidFormatException, IOException
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
        
    TestModellerLogger.SetLastNodeGuid("75010886-3948-4b0d-8a8e-08bf2ea951f0");
    _LLPManual.GoToUrl();
    

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
      
    	

    }

}