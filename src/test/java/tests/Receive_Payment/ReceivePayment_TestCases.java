package tests;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4752d16c-4af0-4759-851e-9df00d424f74
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1872, profileId = 102435)
public class ReceivePayment_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "6da6c668-45e6-432f-a6c7-5fb1b02f551b")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte()
    {
        
    	pages.Receive_Payment.ReceivePayment _ReceivePayment = new pages.Receive_Payment.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1400 - Default Bank");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "60dcd5db-4a9d-4298-9585-219460e275b1")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte1()
    {
        
    	pages.Receive_Payment.ReceivePayment _ReceivePayment = new pages.Receive_Payment.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("2021-09-04 06:51:09");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1072 - Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "782bcf91-ec5b-4572-be08-9ded55c8a1e3")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte2()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("2022-10-07 02:43:09");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("Director");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "5ab79ae0-2e51-4b77-b631-84932e701692")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte3()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("Cash at hand and in bank");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "94ff115c-afeb-426d-9ea0-1d6f0995ca0f")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte4()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1071 - Cash Takings");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "6f310965-3341-42ce-83c7-5c124930acbf")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte5()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1321 - Ammar Ashraf SAND");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "20baabf0-a76c-40ec-82e6-f23b32ff7594")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte6()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1321 - Default Director");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

    @Test  (groups= {"Receive_Payment","Receive_Payment - Test Cases"})
    @TestModellerPath(guid = "74e97b9d-afae-45ba-9772-d1ea65f85add")
    public void GoToUrlClickClickReceivepayment2EnterEnterAmtPaid3PositiveEnterEnterDatePaid4PositiveSelectEnte7()
    {
        
        pages.ReceivePayment _ReceivePayment = new pages.ReceivePayment(driver);
    TestModellerLogger.SetLastNodeGuid("405a744b-b586-4432-b60e-4e009223d263");
    _ReceivePayment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed99d49e-556e-449d-80f5-f26a47b4bed4");
    _ReceivePayment.Click_Click_Receive_payment_2();
    

    TestModellerLogger.SetLastNodeGuid("c9770703-fbae-4c48-9ae8-545b5a5768f2");
    _ReceivePayment.Enter_Enter_AmtPaid_3("");
    

    TestModellerLogger.SetLastNodeGuid("4804dbc8-fbb2-41fb-9565-ff6f5be61c4a");
    _ReceivePayment.Enter_Enter_DatePaid_4("44491");
    

    TestModellerLogger.SetLastNodeGuid("83c99ad4-d05c-455c-b630-111530b6637b");
    _ReceivePayment.Select_Enter_Account_5("1073 - Cheque Takings");
    

    TestModellerLogger.SetLastNodeGuid("4e23bc02-4494-4333-954e-70e086ebf45e");
    _ReceivePayment.Enter_Enter_Des_6("");
    

    TestModellerLogger.SetLastNodeGuid("a60d807b-6385-498f-a0b7-4cc99b5ee431");
    _ReceivePayment.Click_Click_Sve__btn_7();
    

    }

}