package Test_Income;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7dbaef3b-53c5-41ae-b3b2-097c798b5dcb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1881, profileId = 102459)
public class TestViewQuotes_UserStories extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC01() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

    TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
    _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
    utilities.Screenshotcapture.Getscreenshot("Quote Btn work same as create a New Quote", "View Quote");
    
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

    }
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC02() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

    TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
    _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
    Pages_Income.New_Quotes _New_Quotes = new Pages_Income.New_Quotes(driver);
    

    

    TestModellerLogger.SetLastNodeGuid("2969c497-f8f5-449e-8898-979cd071f4fc");
    _New_Quotes.Select_Select_Customer_3("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("9d81aa56-a561-44dd-a214-246de99d0cd8");
    _New_Quotes.Enter_Enter_InvoiceNo_4("Q22");
    

    TestModellerLogger.SetLastNodeGuid("dfb821ec-6cb2-4308-ae72-ad89a80a592b");
    _New_Quotes.Enter_Enter_InvoiceDate_5("");
    

    TestModellerLogger.SetLastNodeGuid("8ac84b36-5be2-4966-9312-605b04a83987");
    _New_Quotes.Select_Select_Income_type_14("Sale");
    

    TestModellerLogger.SetLastNodeGuid("5c67cbe0-da2d-472e-ae93-c167890eb9d9");
    _New_Quotes.Enter_Enter_Description_15("Ashiv");
    

    TestModellerLogger.SetLastNodeGuid("558e6801-e03f-4685-8f5a-9f827e0e4a41");
    _New_Quotes.Enter_Enter_UnitPrice_16("1000");
    

    TestModellerLogger.SetLastNodeGuid("b3d3aa35-6520-45e1-b042-357c7872fa05");
    _New_Quotes.Enter_Enter_Quantity_17("1");
    

    TestModellerLogger.SetLastNodeGuid("0001d694-396c-4ab8-8b72-752b15e3a4ae");
    _New_Quotes.Select_Select_VATRate_19("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("515f0ebb-755d-4d9c-837b-be91c5fada37");
    _New_Quotes.Click_Save_20();
    
    _New_Quotes.success_messageViewQuotes();
    
    
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC03() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

  //  TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
  //  _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
    _View_Quotes.Click_Three_Dot_4();
    

    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
    _View_Quotes.Click_Preview_Btn_13();
    

    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
    _View_Quotes.Click_Save_View_14();
    

    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
    _View_Quotes.Click_close_19();
    
    
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC04() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

  //  TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
  //  _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
    _View_Quotes.Click_Three_Dot_4();
    

    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
    _View_Quotes.Click_Email_5();
    

    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
    _View_Quotes.Click_Myself_gmailcom_6();
    

    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
    

  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
  //  _View_Quotes.Enter_Enter_Subject_8("aa");
    

    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
    _View_Quotes.Click_Text_Boby_9("Testing");
    

    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
    _View_Quotes.Click_Send_10();
    

    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
    _View_Quotes.Click_Get_suss_Msg_11();
    

    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC05() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

  //  TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
 //   _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
    _View_Quotes.Click_Three_Dot_4();
    

    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
    _View_Quotes.Click_Edit_25();
    

    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Edit");
    

    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
    _View_Quotes.Click_Save_21();
    
    _View_Quotes.success_Edit_Msg();
    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC06() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

  //  TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
   // _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
       TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
       _View_Quotes.Click_Three_Dot_4();
       

       TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
       _View_Quotes.Click_Copy_20();
       

       TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
       _View_Quotes.Click_Save_21();
       _View_Quotes.success_Copy_Msg();
    

}
    
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC07() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

  //  TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
  //  _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
       TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
       _View_Quotes.Click_Three_Dot_4();
       

       TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
       _View_Quotes.Click_Delete_27();
       

       TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
       _View_Quotes.Click_DeleteBtn_28();
       _View_Quotes.success_Delete_Msg();    
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
//    _View_Quotes.Click_Invoice_22();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
//    _View_Quotes.Click_Save_23();
//    
//
//    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
//    _View_Quotes.Click_Save_24();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
    
    
    
    @Test  (groups= {"Test_View_Quotes","Test_View_Quotes - User Stories"})
    @TestModellerPath(guid = "7025e5a7-9f5e-4f08-81e6-02d12ecc1138")
    public void ClickView1ClickViewQuotes2ClickQuote3AddNewQuaoteClickThreeDot4ClickEmail5ClickMyselfgmailcom6_TC08() throws InvalidFormatException, InterruptedException, HeadlessException, IOException, AWTException
    {
   	 sTestCaseID="TC01_View Quote";
     Sheet="Fin-3821";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

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

        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

        pages.banking.ashiv.Searchclient _Searchclient = new pages.banking.ashiv.Searchclient(driver);

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
        pages.SaleCreditNote _SaleCreditNote = new pages.SaleCreditNote(driver);
        

        TestModellerLogger.SetLastNodeGuid("41f6f46c-f112-4637-917e-dbdc89c9bae5");
       _SaleCreditNote.Click_SalesTab();
    	
        Pages_Income.View_Quotes _View_Quotes = new Pages_Income.View_Quotes(driver);   ///////////////////////////////////
        
         TestModellerLogger.SetLastNodeGuid("cfa04f65-f8ef-4abc-bcc8-f8682a65af3e");
         _View_Quotes.Click_View_1();
    

        TestModellerLogger.SetLastNodeGuid("d0a62cb7-5396-47f0-bf0a-590c2544a9d6");
       _View_Quotes.Click_View_Quotes_2();
    

 //   TestModellerLogger.SetLastNodeGuid("7431ce53-714c-4ec3-a4bf-8a1e167bb42b");
  //  _View_Quotes.Click_Quote_3_Add_New_Quaote();
    
   
    
//    TestModellerLogger.SetLastNodeGuid("63b61cc5-5dd7-465e-a75e-a0e23f8ba089");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eee39e0c-6652-4e69-a4e7-d679eac059ee");
//    _View_Quotes.Click_Email_5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e32e5005-273e-436c-9578-08e1b1fe4dc5");
//    _View_Quotes.Click_Myself_gmailcom_6();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ab55b1f-ee8e-4ff0-8845-d09dacb3aefa");
//    _View_Quotes.Enter_Enter_Email_7("muhammad.ashiv@nomisma.co.uk");
//    
//
//  //  TestModellerLogger.SetLastNodeGuid("e7c54a85-6485-43f8-a2e2-12bdbfb79836");
//  //  _View_Quotes.Enter_Enter_Subject_8("aa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83a4ee7f-90eb-49c5-a7d4-18746d054820");
//    _View_Quotes.Click_Text_Boby_9("Testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd40332c-0b86-4dbb-a479-c0390ffb2a7d");
//    _View_Quotes.Click_Send_10();
//    
//
//    TestModellerLogger.SetLastNodeGuid("78c34593-b7d3-46d5-adf6-c4b0600f39ed");
//    _View_Quotes.Click_Get_suss_Msg_11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdd6eba9-479f-4aed-8ca2-1548da50defb");
//    _View_Quotes.Click_Cancel_Btn_12();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd0deef-1865-4f81-80c8-7560c9cc66dd");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("293ae141-6f69-4f79-bdf4-f17b147de27b");
//    _View_Quotes.Click_Preview_Btn_13();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a86fca99-3877-4693-9447-4591b856caaa");
//    _View_Quotes.Click_Save_View_14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ecdfa119-7018-40af-ae7b-375f7f77ac3c");
//    _View_Quotes.Click_close_19();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80b4de84-500e-49ab-ab24-794920901c4f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33eb5c4b-6c29-4ffd-9b22-0c44162a546c");
//    _View_Quotes.Click_Copy_20();
//    
//
//    TestModellerLogger.SetLastNodeGuid("342ac2d2-0db3-480b-aaac-7d753fdd6d17");
//    _View_Quotes.Click_Save_21();
//    
//
    TestModellerLogger.SetLastNodeGuid("e4de87da-a8f5-4f3a-b8e7-a41a145bebd5");
    _View_Quotes.Click_Three_Dot_4();
    

    TestModellerLogger.SetLastNodeGuid("0a4d1021-9f91-4906-a032-cc2937a1e305");
    _View_Quotes.Click_Invoice_22();
    

    TestModellerLogger.SetLastNodeGuid("26c563ad-9a19-4473-b45b-95877b34a9c5");
    _View_Quotes.Click_Save_23();
    

    TestModellerLogger.SetLastNodeGuid("164507d4-499b-40ea-9e51-37706a311c90");
    _View_Quotes.Click_Save_24();
    _View_Quotes.success_Invoice_Msg();
//
//    TestModellerLogger.SetLastNodeGuid("9233cb94-e54c-419f-996f-01fd1a2fead2");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c03df0c-1987-48f0-afec-181eaf17bdc8");
//    _View_Quotes.Click_Edit_25();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b202d2a8-9fbe-4949-84c5-9d2d30c7cf1c");
//    _View_Quotes.Enter_Enter_Edit_InvoiceNo_26("Q11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fc160e0e-1a0d-49aa-9320-b17d80653182");
//    _View_Quotes.Click_Save_21();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d80bf3b5-aca7-4aaa-8c86-01a96469f02f");
//    _View_Quotes.Click_Three_Dot_4();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d4850cbf-3dea-4127-84a3-c869858e5645");
//    _View_Quotes.Click_Delete_27();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450f015b-33e5-4d66-9c9d-82d0ecc90c32");
//    _View_Quotes.Click_DeleteBtn_28();
//    

}
}