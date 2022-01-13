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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ed0708db-19c2-4b8f-a937-63b7f9e80b9c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1871, profileId = 102432)
public class Sdsearch_Search extends TestBase
{
    

    
    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "1a16dccc-2f13-423f-a1c6-2e883fbcfb84")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-09-20 08:11:09");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "2d71eae4-1536-4199-bff3-5e9604e64fe7")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd1()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("r (12345)");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-10-07 22:20:29");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("2020-10-28 10:05:32");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "9527a7a2-cb71-44a8-b632-15b4296c1bf5")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd2()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-08-27 17:38:56");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("2022-02-24 21:15:24");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "18297838-b8ec-4b1a-964c-bdf35a7f47ae")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd3()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("ggg (2345)");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("44491");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "e4d6874f-b234-4823-96b0-384c3fcc6eb3")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd4()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Ref#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2022-05-20 23:15:20");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "03f360c6-5830-4bbb-9c8a-8d6f505795f5")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd5()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Type");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("All");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-02-19 13:27:23");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "1222a4d0-7458-42c5-8426-e579c4eebe8a")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd6()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Customer Name");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Not Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-10-11 00:28:50");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "fb00f0ce-5e39-4fb6-b5cb-deb5fb4537d0")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd7()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Tran#");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-09-27 05:09:14");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

    @Test  (groups= {"Sd_search","Sd_search - Search"})
    @TestModellerPath(guid = "6070ca91-afda-4152-9f09-686aa33e55bd")
    public void GoToUrlPositiveSelectSdSearchCustomer1PositiveSelectSdSearchCategory2EnterSdSearchinput3ClickSd8()
    {
        
        pages.SDSearch _SDSearch = new pages.SDSearch(driver);
    TestModellerLogger.SetLastNodeGuid("b7c98eae-80dc-45f6-a45a-9cb620b0b247");
    _SDSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec278fec-4fa1-4cd1-85cb-6c6d31c33663");
    _SDSearch.Select_Sd_Search_Customer_1("All");
    

    TestModellerLogger.SetLastNodeGuid("60703987-d2fd-4661-91cc-dc105b576a46");
    _SDSearch.Select_Sd_Search_Category_2("Select");
    

    TestModellerLogger.SetLastNodeGuid("4f219b6e-57ad-4b75-8af5-69fdf902438b");
    _SDSearch.Enter_Sd_Search_input_3("");
    

    TestModellerLogger.SetLastNodeGuid("b35f6546-a658-41de-8514-4be2e01987e7");
    _SDSearch.Click_Sd_Search_paymentstatus_4();
    

    TestModellerLogger.SetLastNodeGuid("0051b5c9-51d7-4f73-ab05-95abf17ead48");
    _SDSearch.Select_Sd_Search__due_5("Due");
    

    TestModellerLogger.SetLastNodeGuid("df65870b-2623-40d8-83da-8f47db2b166f");
    _SDSearch.Enter_Sd_Search_DateFrom_6("2021-07-02 20:37:14");
    

    TestModellerLogger.SetLastNodeGuid("cf075ee7-1c71-4e95-95a4-0ea2ea03465b");
    _SDSearch.Enter_Sd_Search_DateTo_7("44491");
    

    TestModellerLogger.SetLastNodeGuid("53e013d4-5ff0-47cc-9f81-12d140adb712");
    _SDSearch.Click_Sd_Search_Update_8();
    

    }

}