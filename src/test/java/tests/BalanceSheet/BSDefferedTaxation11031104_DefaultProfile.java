package tests.BalanceSheet;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.ReadExcelData;
import Generic.RetryAnalyzer;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3bb10c3c-4d67-44e9-b008-ada1fc8a32c7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 541, profileId = 100451)
public class BSDefferedTaxation11031104_DefaultProfile extends TestBase
{
    

	String sTestCaseID=null;
    String[] sData=null;
    String Sheet =null;
    @Test  (retryAnalyzer = RetryAnalyzer.class,groups= {"59885331-36ac-4960-9962-b27139da0c8a","BS_DefferedTaxation-1103_1104","BS_DefferedTaxation-1103_1104 - Default Profile"})
    @TestModellerPath(guid = "59885331-36ac-4960-9962-b27139da0c8a")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterPasswordClickLoginBtnsuccessfulloginGoToUrl() throws InterruptedException
    {
    	sTestCaseID="BSDefferedTaxation11031104";
    	Sheet="BalanceSheet";
        sData = ReadExcelData.toReadExcelData(sTestCaseID, Sheet);
        pages.SandboxPreLogin _pagesSandboxPreLogin = new pages.SandboxPreLogin(driver);
    TestModellerLogger.SetLastNodeGuid("85a68a19-1db3-462f-92e0-8295f3024e24");
    _pagesSandboxPreLogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f2674d01-df05-4f92-af31-f0ff398ac7e1");
    _pagesSandboxPreLogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d0c9a3a-65b1-4d69-97f9-e0818cfefbd2");
    _pagesSandboxPreLogin.Enter_UserName(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1b2abea1-38e3-49b5-ab32-9a210c036081");
    _pagesSandboxPreLogin.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4645956e-34e5-4f4a-9aea-1cb87ad0b003");
    _pagesSandboxPreLogin.Click_LoginBtn();
    

pages.Search_Agents _pagesSearch_Agents = new pages.Search_Agents(driver);
    

    TestModellerLogger.SetLastNodeGuid("ad7105a0-ca0b-42bd-b187-ea4bd10c1ca5");
    _pagesSearch_Agents.Enter_ctl00cPHFiltertxtAgentName(sData[3],driver);


    TestModellerLogger.SetLastNodeGuid("4d08981e-bded-4841-a18c-00d7c319d524");
    _pagesSearch_Agents.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("c9c694b7-7143-42e9-a8fe-eb2e05ad2c02");
    _pagesSearch_Agents.Click__Demo_Agent_();
    

pages.Search_Business _pagesSearch_Business = new pages.Search_Business(driver);
   
    //driver.navigate().refresh();
    TestModellerLogger.SetLastNodeGuid("2714a67d-87fd-42a3-96d9-efd09aee5080");
    _pagesSearch_Business.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("f039bffc-aa28-4f46-a412-1eb6214091e7");
    _pagesSearch_Business.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a7b135dd-2fb1-423f-81ac-0b6c00587590");
    _pagesSearch_Business.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("a9ef7b06-b298-4b0b-89e2-7a0187789cab");
    _pagesSearch_Business.Click__Raggaz_ltd();
    

pages.DeletejournalEntry1 _pagesDeletejournalEntry1 = new pages.DeletejournalEntry1(driver);
    /*TestModellerLogger.SetLastNodeGuid("884591c1-7014-4090-9162-f02306bb6d71");
    _pagesDeletejournalEntry1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8ae0f19b-10df-4104-b056-4d66f9123654");
    _pagesDeletejournalEntry1.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("658a1a6a-4df2-4aa5-9d3d-a5ac35030b4c");
    _pagesDeletejournalEntry1.Click_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("c22ad20b-472b-436f-8a21-aaef00c48180");
    _pagesDeletejournalEntry1.Click_Journals();
    

    TestModellerLogger.SetLastNodeGuid("5cf0a328-ae76-4d0a-ae9e-9cc8fba22bdc");
    _pagesDeletejournalEntry1.Select_ctl00ddlFinancialYear(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("f8f4724e-9e6f-4bbb-baf2-1ae01e6a4b64");
    _pagesDeletejournalEntry1.Click_xPath_idchAllRTI();
    

    TestModellerLogger.SetLastNodeGuid("d4e4d3ec-a2d4-4667-9023-6eb47e216d04");
    _pagesDeletejournalEntry1.Click_xPath_htmlbodyformmaindiv10div3headerdiva1i();

pages.UncloseAccountPeriod2 _pagesUncloseAccountPeriod = new pages.UncloseAccountPeriod2(driver);


    TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
    _pagesUncloseAccountPeriod.Click_SettingsTab();     

pages.EnabledCashVat enabledCashVat = new pages.EnabledCashVat(driver);
    /*TestModellerLogger.SetLastNodeGuid("6d0a3545-53fe-46b8-bbbf-b5fa29d4922c");
    _pagesRaggaz_ltd.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55da693f-7305-46d9-a03e-6a118ee18b4c");
    _pagesRaggaz_ltd.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("06b01013-179a-47f4-a4b9-c84ac741a792");
    enabledCashVat.Click_VAT_tab();
    

    TestModellerLogger.SetLastNodeGuid("1ad889fa-54da-4c6f-aba9-60ad4ef75188");
    enabledCashVat.Click__Edit();
    

    TestModellerLogger.SetLastNodeGuid("f0dd2f09-671b-45a4-9f11-6e6cd4700830");
    enabledCashVat.Click_chkEnableVATCashScheme();
    

    TestModellerLogger.SetLastNodeGuid("fb68cb23-73e9-4d99-8247-f656c42ebdac");
    enabledCashVat.Enter_EffectiveStartDate(sData[6]);
    

    TestModellerLogger.SetLastNodeGuid("e199d96d-1e7e-40ba-b6ab-bdb0085f816f");
    enabledCashVat.Enter_EffectiveEndDate(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("b566a050-0e80-4217-bfcf-1412106d43a2");
    enabledCashVat.Click_Save_btn();
    

pages.New_Invoice _pagesNew_Invoice = new pages.New_Invoice(driver);
    /*TestModellerLogger.SetLastNodeGuid("d21c2813-65b7-421e-9dce-9dd179f3f41e");
    _pagesNew_Invoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("27484494-0057-41cd-a819-a5b8959885b3");
    _pagesNew_Invoice.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("6d7aa226-2e89-4164-8420-707c872d10b6");
    _pagesNew_Invoice.Click_Sales_tab();
    

    TestModellerLogger.SetLastNodeGuid("15ca3143-0143-43a3-8c5b-a6747ddbe7e9");
    _pagesNew_Invoice.Click_plus_Hover();
    

    TestModellerLogger.SetLastNodeGuid("70f53dfb-be07-4d73-834f-a44e838a5089");
    _pagesNew_Invoice.Click_New_Invoice_tab();
    

    TestModellerLogger.SetLastNodeGuid("84e7bd45-b45c-4e30-a8a9-6db83c8f757f");
    _pagesNew_Invoice.Select_Select_Customer(sData[8]);
    

    TestModellerLogger.SetLastNodeGuid("cc42f944-049e-4d5d-bc05-2dacef74929b");
    _pagesNew_Invoice.Enter_InvoiceNo(sData[9]);
    

    TestModellerLogger.SetLastNodeGuid("cf867e60-309d-446e-9e16-e5fedfd78c8c");
    _pagesNew_Invoice.Enter_InvoiceDate(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("7d093d6b-3b14-4631-b40d-46e980496a23");
    _pagesNew_Invoice.Select_Income_Type(sData[11]);
    

    TestModellerLogger.SetLastNodeGuid("0adbe04a-777a-4361-b97b-5650d60d3502");
    _pagesNew_Invoice.Enter_Description(sData[12]);
    

    TestModellerLogger.SetLastNodeGuid("6aa79488-bfeb-4957-abbc-2918e49cb28b");
    _pagesNew_Invoice.Enter_UnitPrice(sData[13]);
    

    TestModellerLogger.SetLastNodeGuid("2e3e09d8-a359-4158-a5e9-a652e4b9da29");
    _pagesNew_Invoice.Enter_Quantity(sData[14]);
    

    TestModellerLogger.SetLastNodeGuid("1b9e2da1-7f22-448a-bbe5-84fecfe8d164");
    _pagesNew_Invoice.Select_VATRate(sData[15]);
    
    
    TestModellerLogger.SetLastNodeGuid("2c824b64-aae1-4207-aed9-585835d7d949");
    _pagesNew_Invoice.Click__Save_();
    

    //TestModellerLogger.SetLastNodeGuid("32b656e2-6d40-4cd5-ad44-6eb3d2c5ca47");
    //_pagesNew_Invoice.Click_Information();
    

pages.New_Supplier_Bill _pagesNew_Supplier_Bill = new pages.New_Supplier_Bill(driver);
   /* TestModellerLogger.SetLastNodeGuid("30bd966d-1dc3-4560-b888-c9f8a22f226f");
    _pagesNew_Supplier_Bill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0d513dbb-01e6-4c70-bb8d-b370f23154ae");
    _pagesNew_Supplier_Bill.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("a4837793-0a65-4d38-8aa4-fa7d94761090");
    _pagesNew_Supplier_Bill.Click_Expenditure_Tab();
    

    TestModellerLogger.SetLastNodeGuid("cf8e5324-b84a-49af-b45b-15c60c83a8c7");
    _pagesNew_Supplier_Bill.Click_New_Hover();
    

    TestModellerLogger.SetLastNodeGuid("f0c7a3f7-644d-40cb-8796-b218caa13523");
    _pagesNew_Supplier_Bill.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("438ae65f-d126-4c06-8f13-84ad615613b3");
    _pagesNew_Supplier_Bill.Select_Select_Supplier(sData[16]);
    

    //TestModellerLogger.SetLastNodeGuid("8311abd3-f143-4640-8dd6-7c487c371c51");
    //_pagesNew_Supplier_Bill.Enter_DefaultCurrency(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("8c466ecf-e36c-49a2-963a-6c177fb346ca");
    _pagesNew_Supplier_Bill.Enter_BillNo(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("0c6f9660-5607-479b-9464-dbb7b6f71916");
    _pagesNew_Supplier_Bill.Enter_Date(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("f2ef85c2-4f42-445d-8ac9-a0e916dad89a");
    _pagesNew_Supplier_Bill.Select_ExpenseType(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("18ed092b-abda-4e2b-8301-c6ea1cbab740");
    _pagesNew_Supplier_Bill.Enter_Description(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("15a777c3-a193-4dcc-8d9c-bf1e1026ddfb");
    _pagesNew_Supplier_Bill.Enter_UnitPrice(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("80e0e717-319a-4c4c-a4bb-c9d08b61e1c1");
    _pagesNew_Supplier_Bill.Select_VATRate(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("c803ccaf-42b4-4163-b458-349a74be2c85");
    _pagesNew_Supplier_Bill.Click__Save_();
    

    //TestModellerLogger.SetLastNodeGuid("32a8857e-c6d0-4a31-9a8b-9cb81501b421");
    //_pagesNew_Supplier_Bill.Click_Information();
    

    pages.verifyBS _pagesverifyBS = new pages.verifyBS(driver);
    /*TestModellerLogger.SetLastNodeGuid("66735795-46bb-49fc-ba78-5039790bd03c");
    _pagesverifyBS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("79019ec2-ec76-4854-8388-63145ba9d001");
    _pagesverifyBS.AssertUrl();*/
    

    TestModellerLogger.SetLastNodeGuid("fc2cdb54-4d1d-4c5e-905e-5ccde4200e69");
    _pagesverifyBS.Click_Reports_tab();
    

    TestModellerLogger.SetLastNodeGuid("195ad398-7e22-49e2-8770-a8548e1fa1a0");
    _pagesverifyBS.Click_Balance_Sheet_link();
    

    TestModellerLogger.SetLastNodeGuid("489eb3fd-e97e-49f7-aba2-610610f074e6");
    _pagesverifyBS.Select_selectFinancialYear(sData[24]);
    
    
pages.AddjournalEntry10incBnk _pagesAddjournalEntry10incBnk = new pages.AddjournalEntry10incBnk(driver);
    _pagesAddjournalEntry10incBnk.verify_BS_DefferedTaxation_1103_1104(sData[25],sData[26],sData[27],sData[28],sData[13],sData[14],sData[22]);
    
    
    TestModellerLogger.SetLastNodeGuid("4c963487-1d24-440a-9a40-16b18f3a3530");
    _pagesUncloseAccountPeriod.Click_SettingsTab(); 
    

    TestModellerLogger.SetLastNodeGuid("06b01013-179a-47f4-a4b9-c84ac741a792");
    enabledCashVat.Click_VAT_tab();
    

    TestModellerLogger.SetLastNodeGuid("1ad889fa-54da-4c6f-aba9-60ad4ef75188");
    enabledCashVat.Click__Edit();
    

    TestModellerLogger.SetLastNodeGuid("f0dd2f09-671b-45a4-9f11-6e6cd4700830");
    enabledCashVat.Click_chkEnableVATCashScheme();
    

    /*TestModellerLogger.SetLastNodeGuid("fb68cb23-73e9-4d99-8247-f656c42ebdac");
    enabledCashVat.Enter_EffectiveStartDate(sData[6]);
    

    TestModellerLogger.SetLastNodeGuid("e199d96d-1e7e-40ba-b6ab-bdb0085f816f");
    enabledCashVat.Enter_EffectiveEndDate(sData[7]);*/
    

    TestModellerLogger.SetLastNodeGuid("b566a050-0e80-4217-bfcf-1412106d43a2");
    enabledCashVat.Click_Save_btn();
    
    

pages.Invoice_Delete _pagesInvoice_Delete = new pages.Invoice_Delete(driver);
    /* TestModellerLogger.SetLastNodeGuid("14b88511-3b89-44b8-bcdf-75f712ed1aa8");
     _pagesInvoice_Delete.GoToUrl();
     

     TestModellerLogger.SetLastNodeGuid("1175e1ff-d7f3-4847-88b8-fca95b2b1b87");
     _pagesInvoice_Delete.AssertUrl();*/
     

     TestModellerLogger.SetLastNodeGuid("9ba74e0e-0171-424f-bac4-7796f1552c86");
     _pagesInvoice_Delete.Click_Sales_tab();
     

     TestModellerLogger.SetLastNodeGuid("3fc8824e-4eb7-4757-aadc-52d44367e54b");
     _pagesInvoice_Delete.Select_SelectFinancialYear(sData[5]);
     

     TestModellerLogger.SetLastNodeGuid("65374758-2a17-4c32-a6de-bcf68cc50769");
     _pagesInvoice_Delete.Click_checkNtodel();
     

     TestModellerLogger.SetLastNodeGuid("fa16ca29-a6e8-4013-94f5-df6848e532c6");
     _pagesInvoice_Delete.Click_DelImg();
     

     TestModellerLogger.SetLastNodeGuid("be4770a8-d74d-4a69-b97d-be3985eab0bb");
     _pagesInvoice_Delete.Click_Delete_tab();
     

     //TestModellerLogger.SetLastNodeGuid("f53c852e-68c7-4c28-b668-c2f19700f050");
     //_pagesInvoice_Delete.Click_Success_msg();
     

 pages.Del_Bill _pagesDel_Bill = new pages.Del_Bill(driver);
     /*TestModellerLogger.SetLastNodeGuid("15c4d21e-4942-46ea-9efb-869855af5a74");
     _pagesDel_Bill.GoToUrl();
     

     TestModellerLogger.SetLastNodeGuid("41710b94-f6c2-43ac-b3b9-9e0d327d1853");
     _pagesDel_Bill.AssertUrl();*/
     

     TestModellerLogger.SetLastNodeGuid("946b9645-19ad-4090-9604-6d9d24003a98");
     _pagesDel_Bill.Click_Expenditure_tab();
     

     TestModellerLogger.SetLastNodeGuid("35424716-2717-459b-902b-37e8dd4f1a2a");
     _pagesDel_Bill.Select_SelectFinancialYear(sData[5]);
     

     TestModellerLogger.SetLastNodeGuid("db10441a-3533-44c4-8606-32a4d0972d6a");
     _pagesDel_Bill.Click_Chkboxbill();
     

     TestModellerLogger.SetLastNodeGuid("8445471e-7035-458c-9c06-a7f546715a92");
     _pagesDel_Bill.Click_DelimgBill();
     

     TestModellerLogger.SetLastNodeGuid("6b8d851a-148a-4f12-baa7-e03ab39306db");
     _pagesDel_Bill.Click_Delete_tab();
     

     //TestModellerLogger.SetLastNodeGuid("5a77265c-2375-438d-8ba5-b12794924176");
     //_pagesDel_Bill.Click_Success_msg();    
    

    }

}
