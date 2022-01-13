package tests.Receive_Payment;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.Receive_Payment.SaleInvoices;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ab25ce48-ae5a-49c2-a54a-6dc26d4079fa
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1870, profileId = 102429)
public class SaleInvoice_nuinvoice extends TestBase
{
    
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "96a4a398-2309-4405-8dbf-4531208e6278")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue81() throws InvalidFormatException, InterruptedException
    {
    	/*Sale Invoice receive partial payment*/
    	sTestCaseID="TC81";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
    	
        
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    
    _SaleInvoices.Click_Click_Create_Nu_Invoice_2();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("d260def7-7b99-4de7-ba59-e7c063399d2f");
//    _SaleInvoices.Enter_Nu_Inv_InvoiceDate_2(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("8b721bec-ca87-40dd-b71e-755125420222");
//    _SaleInvoices.Enter_Nu_Inv_DueDate_3(data[7]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   
   _SaleInvoices.invoiceno();
    

    TestModellerLogger.SetLastNodeGuid("1bce4ad5-82d4-4024-a3a5-03f616e05d33");
    _SaleInvoices.Select_Nu_Inv_Select_Bank_5(data[8]);
    

//    TestModellerLogger.SetLastNodeGuid("226e93e6-a115-494e-938a-90ef9d00b76f");
//    _SaleInvoices.Enter_Nu_Inv_PaymentTerm_6("");
    

    TestModellerLogger.SetLastNodeGuid("816442bc-c3cb-4531-849d-2e6cdb0d010c");
    _SaleInvoices.Enter_Nu_Inv_ReferenceNo_7(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("993e3c3a-d47a-4dc6-b968-18bc6244017a");
   _SaleInvoices.Select_Nu_Inv_Product_8(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("013971c8-b1f4-4f9c-8bcd-479a74f989be");
    _SaleInvoices.Enter_Nu_Inv_UnitPrice_9(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("e11d4e6e-4ace-4e85-80a9-9662602cb2ce");
    _SaleInvoices.Enter_Nu_Inv_Quantity_10(data[13]);
   
    TestModellerLogger.SetLastNodeGuid("8acc3f99-9ef5-475a-8326-bec64586a975");
    _SaleInvoices.Click_Nu_Inv__Save__15();
    _SaleInvoices.Click_Nu_Inv_Savepopup();
   
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
     pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
    _sd.Enter_Sd_Search_input_3();
    _sd.Click_Sd_Search_Update_8();
   
 	 utilities.PassScreenshot.Getscreenshot11("Search displayed in grid before payment", "Sale Invoice");
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   /*make payment*/
   _rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   _rp.Enter_Enter_AmtPaid_3(data[16]);
  // _rp.Select_Enter_Account_5(Sheet);
   _rp.Select_Enter_Account_5("1400 - Default Bank");
   _rp.Click_Click_Sve__btn_7();
   /*confirmation message of make payment*/
   utilities.PassScreenshot.Getscreenshot11("Confirmation message after payment","Sale Invoice");
   driver.navigate().refresh();
   utilities.PassScreenshot.Getscreenshot11("Sale invoice after payment made","Sale Invoice");
   /*again seach to click on transaction*/
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_Sd_Search_input_3();
       _sd.transaction_click();
      utilities.PassScreenshot.Getscreenshot11("Sale invoice Transaction verification shot","Sale Invoice");
      
     
    
    

    }

    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "86d96e07-6ab8-4ffb-8267-700bee7c4f81")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue82() throws InvalidFormatException, InterruptedException
    {
    	/*Advance Payment Case*/
    	sTestCaseID="TC82";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
    	
        
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_Nu_Invoice_2();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("d260def7-7b99-4de7-ba59-e7c063399d2f");
//    _SaleInvoices.Enter_Nu_Inv_InvoiceDate_2(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("8b721bec-ca87-40dd-b71e-755125420222");
//    _SaleInvoices.Enter_Nu_Inv_DueDate_3(data[7]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   
   _SaleInvoices.invoiceno();
    

    TestModellerLogger.SetLastNodeGuid("1bce4ad5-82d4-4024-a3a5-03f616e05d33");
    _SaleInvoices.Select_Nu_Inv_Select_Bank_5(data[8]);
    

//    TestModellerLogger.SetLastNodeGuid("226e93e6-a115-494e-938a-90ef9d00b76f");
//    _SaleInvoices.Enter_Nu_Inv_PaymentTerm_6("");
    

    TestModellerLogger.SetLastNodeGuid("816442bc-c3cb-4531-849d-2e6cdb0d010c");
    _SaleInvoices.Enter_Nu_Inv_ReferenceNo_7(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("993e3c3a-d47a-4dc6-b968-18bc6244017a");
   _SaleInvoices.Select_Nu_Inv_Product_8(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("013971c8-b1f4-4f9c-8bcd-479a74f989be");
    _SaleInvoices.Enter_Nu_Inv_UnitPrice_9(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("e11d4e6e-4ace-4e85-80a9-9662602cb2ce");
    _SaleInvoices.Enter_Nu_Inv_Quantity_10(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("f24a4fc2-04eb-43c7-ba1d-5b258c5c2500");
//    _SaleInvoices.Click_Nu_Inv_chk_AutoEmail_11();
    

//    TestModellerLogger.SetLastNodeGuid("8571b8c7-a1ce-4e7f-925c-b741c12f620c");
//    _SaleInvoices.Select_Nu_Inv_Template_12("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e302a1b4-572f-4152-bc8a-9f51dda8dbb2");
//    _SaleInvoices.Enter_Nu_Inv_Note_13("");
    
//
//    TestModellerLogger.SetLastNodeGuid("c0af1884-a50a-496d-8d7b-bbe0fa648ebc");
//    _SaleInvoices.Enter_Nu_Inv_FileUpload1_14("");
    

    TestModellerLogger.SetLastNodeGuid("8acc3f99-9ef5-475a-8326-bec64586a975");
    _SaleInvoices.Click_Nu_Inv__Save__15();
    _SaleInvoices.Click_Nu_Inv_Savepopup();
    //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
    pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_Sd_Search_input_3();
   _sd.Click_Sd_Search_Update_8();
   utilities.PassScreenshot.Getscreenshot11("Search displayed in grid before payment", "Sale Invoice");
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   /*make payment*/
   _rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   _rp.Enter_Enter_AmtPaid_3(data[16]);
  // _rp.Select_Enter_Account_5(Sheet);
   _rp.Select_Enter_Account_5("1400 - Default Bank");
   _rp.Click_Click_Sve__btn_7();
   /*confirmation message of make payment*/
   utilities.PassScreenshot.Getscreenshot11("Confirmation message after payment","Sale Invoice");
   driver.navigate().refresh();
   utilities.PassScreenshot.Getscreenshot11("Sale invoice after payment made","Sale Invoice");
   /*again seach to click on transaction*/
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_Sd_Search_input_3();
       _sd.transaction_click();
      utilities.PassScreenshot.Getscreenshot11("Sale invoice Transaction verification shot","Sale Invoice");

    }
   
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "8c6f535a-8c67-4711-87b4-dde4b58ccd52")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue83() throws InvalidFormatException, InterruptedException
    {
        
    	/*Full Payment Case*/
    	sTestCaseID="TC83";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
    	
        
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_Nu_Invoice_2();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
    

//    TestModellerLogger.SetLastNodeGuid("d260def7-7b99-4de7-ba59-e7c063399d2f");
//    _SaleInvoices.Enter_Nu_Inv_InvoiceDate_2(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("8b721bec-ca87-40dd-b71e-755125420222");
//    _SaleInvoices.Enter_Nu_Inv_DueDate_3(data[7]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   
   _SaleInvoices.invoiceno();
    

    TestModellerLogger.SetLastNodeGuid("1bce4ad5-82d4-4024-a3a5-03f616e05d33");
    _SaleInvoices.Select_Nu_Inv_Select_Bank_5(data[8]);
    

//    TestModellerLogger.SetLastNodeGuid("226e93e6-a115-494e-938a-90ef9d00b76f");
//    _SaleInvoices.Enter_Nu_Inv_PaymentTerm_6("");
    

    TestModellerLogger.SetLastNodeGuid("816442bc-c3cb-4531-849d-2e6cdb0d010c");
    _SaleInvoices.Enter_Nu_Inv_ReferenceNo_7(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("993e3c3a-d47a-4dc6-b968-18bc6244017a");
   _SaleInvoices.Select_Nu_Inv_Product_8(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("013971c8-b1f4-4f9c-8bcd-479a74f989be");
    _SaleInvoices.Enter_Nu_Inv_UnitPrice_9(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("e11d4e6e-4ace-4e85-80a9-9662602cb2ce");
    _SaleInvoices.Enter_Nu_Inv_Quantity_10(data[13]);
    

//    TestModellerLogger.SetLastNodeGuid("f24a4fc2-04eb-43c7-ba1d-5b258c5c2500");
//    _SaleInvoices.Click_Nu_Inv_chk_AutoEmail_11();
    

//    TestModellerLogger.SetLastNodeGuid("8571b8c7-a1ce-4e7f-925c-b741c12f620c");
//    _SaleInvoices.Select_Nu_Inv_Template_12("Simple Invoice Template");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e302a1b4-572f-4152-bc8a-9f51dda8dbb2");
//    _SaleInvoices.Enter_Nu_Inv_Note_13("");
    
//
//    TestModellerLogger.SetLastNodeGuid("c0af1884-a50a-496d-8d7b-bbe0fa648ebc");
//    _SaleInvoices.Enter_Nu_Inv_FileUpload1_14("");
    

    TestModellerLogger.SetLastNodeGuid("8acc3f99-9ef5-475a-8326-bec64586a975");
    _SaleInvoices.Click_Nu_Inv__Save__15();
    _SaleInvoices.Click_Nu_Inv_Savepopup();
   
    //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
    pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_Sd_Search_input_3();
   _sd.Click_Sd_Search_Update_8();
   utilities.PassScreenshot.Getscreenshot11("Search displayed in grid before payment", "Sale Invoice");
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   /*make payment*/
   _rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   _rp.Enter_Enter_AmtPaid_3(data[16]);
  // _rp.Select_Enter_Account_5(Sheet);
   _rp.Select_Enter_Account_5("1400 - Default Bank");
   _rp.Click_Click_Sve__btn_7();
   /*confirmation message of make payment*/
   utilities.PassScreenshot.Getscreenshot11("Confirmation message after payment","Sale Invoice");
   driver.navigate().refresh();
   utilities.PassScreenshot.Getscreenshot11("Sale invoice after payment made","Sale Invoice");
   /*again seach to click on transaction*/
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_Sd_Search_input_3();
       _sd.transaction_click();
      utilities.PassScreenshot.Getscreenshot11("Sale invoice Transaction verification shot","Sale Invoice");
    }

    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "5490c8af-4ffd-4874-bd2a-5ea9bcceb06f")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue84() throws InvalidFormatException, InterruptedException
    {
    	/*Credit note partial amount */
    	sTestCaseID="TC84";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
      
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_Credit_Note_3();
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
   // _SaleInvoices.Enter_Credit_note_ReferenceNo1("credit note");
   _SaleInvoices.Enter_Creditno();
   _SaleInvoices.Enter_Credit_invoicenumber(data[8]);
   _SaleInvoices.Enter_Credit_Desc("credit invoice");
    _SaleInvoices.Select_Nu_Inv_Product_8(data[9]);
    _SaleInvoices.Enter_Crediit_UnitPrice_9(data[10]);
   _SaleInvoices.Enter_Credit_Quantity_10(data[11]);
       _SaleInvoices.Click_Credit__Save();
   // _SaleInvoices.Click_Credit_Savepopup();
   
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
    _sd.Click_credit_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Searh Before  partial reconsilation","CreditInvoice"); 
 
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
     
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[12]);

   _rp.Select_Enter_Account_5(data[13]);
   _rp.Click_Click_Sve__btn_7(); 
   _sd.Click_credit_Update_8();
   utilities.PassScreenshot.Getscreenshot11("Confirmation message","CreditInvoice");
    
   _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
   _sd.Click_credit_Update_8();
   utilities.PassScreenshot.Getscreenshot11("Searh After partial Reconsilaton","CreditInvoice"); 
    

    }
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "b4a59cdd-ddba-4f56-8ed4-225722bd6146")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue85() throws InvalidFormatException, InterruptedException
    {
        
       /*Credit note advanced amount */
    	sTestCaseID="TC85";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
              pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_Credit_Note_3();
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
   // _SaleInvoices.Enter_Credit_note_ReferenceNo1("credit note");
   _SaleInvoices.Enter_Creditno();
   _SaleInvoices.Enter_Credit_invoicenumber(data[8]);
   _SaleInvoices.Enter_Credit_Desc("credit invoice");
    _SaleInvoices.Select_Nu_Inv_Product_8(data[9]);
    _SaleInvoices.Enter_Crediit_UnitPrice_9(data[10]);
   _SaleInvoices.Enter_Credit_Quantity_10(data[11]);
       _SaleInvoices.Click_Credit__Save();
   // _SaleInvoices.Click_Credit_Savepopup();
   
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
    _sd.Click_credit_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Searh Before  Advance reconsilation","CreditInvoice"); 
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
     
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[12]);

   _rp.Select_Enter_Account_5(data[13]);
   _rp.Click_Click_Sve__btn_7(); 
   utilities.PassScreenshot.Getscreenshot11("Confirmation","CreditInvoice"); 
   _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
    _sd.Click_credit_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Searh After  Advance reconsilation","CreditInvoice"); 
    }
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "b4a59cdd-ddba-4f56-8ed4-225722bd6146")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue86() throws InterruptedException, InvalidFormatException
    {
        
       /*Credit note fully amount */
    	sTestCaseID="TC86";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
              pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_Credit_Note_3();
    _SaleInvoices.Select_Nu_Inv_Customer_1(data[5]);
   // _SaleInvoices.Enter_Credit_note_ReferenceNo1("credit note");
   _SaleInvoices.Enter_Creditno();
   _SaleInvoices.Enter_Credit_invoicenumber(data[8]);
   _SaleInvoices.Enter_Credit_Desc("credit invoice");
    _SaleInvoices.Select_Nu_Inv_Product_8(data[9]);
    _SaleInvoices.Enter_Crediit_UnitPrice_9(data[10]);
   _SaleInvoices.Enter_Credit_Quantity_10(data[11]);
       _SaleInvoices.Click_Credit__Save();
   // _SaleInvoices.Click_Credit_Savepopup();
   
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
    _sd.Click_credit_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Before full reconsilaton","CreditInvoice"); 
   pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
     
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[12]);

   _rp.Select_Enter_Account_5(data[13]);
   _rp.Click_Click_Sve__btn_7(); 
   utilities.PassScreenshot.Getscreenshot11("Confirmation mesage","CreditInvoice"); 
   _sd.Select_Sd_Search_Category_2("Inv#");
_sd.Enter_Credit_Search_input_3();
    _sd.Click_credit_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Confirmation mesage","CreditInvoice"); 
    }
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "b4a59cdd-ddba-4f56-8ed4-225722bd6146")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue87() throws InterruptedException, InvalidFormatException
    {
        
       /*Down load Csv */
    	sTestCaseID="TC87";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
            
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
        
        _SaleInvoices.Click_Sale_New_menu1();
   pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
//    _sd.Select_Sd_Search_Category_2("Inv#");
//_sd.Enter_Credit_Search_input_3();
   _sd.download_CsvElem();
//    _sd.Click_credit_Update_8();
   

    }
  
    /*@Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "b4a59cdd-ddba-4f56-8ed4-225722bd6146")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue88() throws InterruptedException, InvalidFormatException
    {
        
       /*Upload vat only invoice */
    /*  	sTestCaseID="TC88";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
            
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
        
        _SaleInvoices.Click_Sale_New_menu1();
   pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
//    _sd.Select_Sd_Search_Category_2("Inv#");
//_sd.Enter_Credit_Search_input_3();
   _sd.download_CsvElem();*/
 //   _sd.Click_credit_Update_8();
       
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "96a4a398-2309-4405-8dbf-4531208e6278")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue89() throws InvalidFormatException, InterruptedException
    {
    	/*vat only invoice partial payment*/
    	sTestCaseID="TC89";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
      
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_New__VATOnlyInvoice_4();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Vat_only_inovice_Customer_1(data[5]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Vat_only_inovice_nvoiceNo_2();
   
   _SaleInvoices.vatonlyinvoicereturn();
 //  _SaleInvoices.Enter_Vat_only_inovice_nvoiceDate_3(Sheet);
   _SaleInvoices.Enter_Vat_only_inovice_SubTotal_4(data[6]);
   _SaleInvoices.Select_Vat_only_inovice_VATRate_5("Reduced Rate");
//    
//    _SaleInvoices.Select_Vat_only_inovice_Bank_9(data[7]);
 
      _SaleInvoices. Click_vatonlyinvoice_Save_15();
  
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
     pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
 _sd.Enter_VALTONLYINV_Search_input_3();
    _sd.Click_Sd_Search_Update_8();
    utilities.PassScreenshot.Getscreenshot11(" Before search","VAT Only Invoice"); 
  pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   
   //_rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[8]);

   _rp.Select_Enter_Account_5(data[9]);
   _rp.Click_Click_Sve__btn_7();
   utilities.PassScreenshot.Getscreenshot11("confirmation","VAT Only Invoice"); 
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_VALTONLYINV_Search_input_3();
      _sd.Click_Sd_Search_Update_8();
      utilities.PassScreenshot.Getscreenshot11("After partial reconsilation","VAT Only Invoice"); 
    
    } 
    
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "96a4a398-2309-4405-8dbf-4531208e6278")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue90() throws InvalidFormatException, InterruptedException
    {
    	/*vat only invoice Advance payment*/
    	sTestCaseID="TC90";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
      
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_New__VATOnlyInvoice_4();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Vat_only_inovice_Customer_1(data[5]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Vat_only_inovice_nvoiceNo_2();
   
   _SaleInvoices.vatonlyinvoicereturn();
 //  _SaleInvoices.Enter_Vat_only_inovice_nvoiceDate_3(Sheet);
   _SaleInvoices.Enter_Vat_only_inovice_SubTotal_4(data[6]);
   _SaleInvoices.Select_Vat_only_inovice_VATRate_5("Standard Rate");
//    
//    _SaleInvoices.Select_Vat_only_inovice_Bank_9(data[7]);
 
      _SaleInvoices. Click_vatonlyinvoice_Save_15();
  
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
     pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
 _sd.Enter_VALTONLYINV_Search_input_3();
    _sd.Click_Sd_Search_Update_8();
    utilities.PassScreenshot.Getscreenshot11("before advacne reconsilation","VAT Only Invoice"); 
  pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   
   //_rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[8]);

   _rp.Select_Enter_Account_5(data[9]);
   _rp.Click_Click_Sve__btn_7();
   utilities.PassScreenshot.Getscreenshot11("Confirmation","VAT Only Invoice"); 
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_VALTONLYINV_Search_input_3();
      _sd.Click_Sd_Search_Update_8();
      utilities.PassScreenshot.Getscreenshot11("after advace recomcilation","VAT Only Invoice"); 
    }
    @Test  (groups= {"Sale_Invoice","Sale_Invoice - nu_invoice"})
    @TestModellerPath(guid = "96a4a398-2309-4405-8dbf-4531208e6278")
    public void ClickSaleNewmenu1PositiveSelectNuInvCustomer1PositiveEnterNuInvInvoiceDate2PositiveEnterNuInvDue91() throws InvalidFormatException, InterruptedException
    {
    	/*vat only invoice Full payment*/
    	sTestCaseID="TC91";
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
       

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
      
        pages.Receive_Payment.SaleInvoices _SaleInvoices = new pages.Receive_Payment.SaleInvoices(driver);
       
    _SaleInvoices.Click_Sale_New_menu1();
    _SaleInvoices.Click_Click_Create_New__VATOnlyInvoice_4();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Vat_only_inovice_Customer_1(data[5]);
    
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Vat_only_inovice_nvoiceNo_2();
   
   _SaleInvoices.vatonlyinvoicereturn();
 //  _SaleInvoices.Enter_Vat_only_inovice_nvoiceDate_3(Sheet);
   _SaleInvoices.Enter_Vat_only_inovice_SubTotal_4(data[6]);
   _SaleInvoices.Select_Vat_only_inovice_VATRate_5("Reduced Rate");
//    
//    _SaleInvoices.Select_Vat_only_inovice_Bank_9(data[7]);
 
      _SaleInvoices. Click_vatonlyinvoice_Save_15();
  
  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
     pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
    _sd.Select_Sd_Search_Category_2("Inv#");
 _sd.Enter_VALTONLYINV_Search_input_3();
    _sd.Click_Sd_Search_Update_8();
    utilities.PassScreenshot.Getscreenshot11("Full Before reconsilation","VAT Only Invoice"); 
  pages.Receive_Payment.ReceivePayment _rp=new pages.Receive_Payment.ReceivePayment(driver);
   
   //_rp.click_3dot();
   _rp.Click_Click_Receive_payment_2();
   
   _rp.Enter_Enter_AmtPaid_3(data[8]);

   _rp.Select_Enter_Account_5(data[9]);
   _rp.Click_Click_Sve__btn_7();
   utilities.PassScreenshot.Getscreenshot11("Confirmation","VAT Only Invoice"); 
   _sd.Select_Sd_Search_Category_2("Inv#");
   _sd.Enter_VALTONLYINV_Search_input_3();
      _sd.Click_Sd_Search_Update_8();
      utilities.PassScreenshot.Getscreenshot11("after reconsilation","VAT Only Invoice"); 
    }
   
}
