package test.ashiv;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5daf1fe6-dec6-463b-8d4c-1d368533f4ee
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1832, profileId = 102333)
public class SRCndFND_srcNDfnd extends TestBase
{
    

    
    @Test  (groups= {"SRCndFND","SRCndFND - srcNDfnd"})
    @TestModellerPath(guid = "75b08f47-8838-4a46-b4ce-a67f7c9db5f6")
    public void GoToUrlGoToUrlClickClickonsearchicon1PositiveEnterSearchAmount3PositiveEnterSearchDateFrom4Pos() throws InterruptedException, IOException
    {
        
        pages.banking.ashiv.Search_Find _Search_Find = new     pages.banking.ashiv.Search_Find(driver);
    TestModellerLogger.SetLastNodeGuid("2223428c-0d57-486f-8f94-a1018227f59b");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ef74fc10-2d99-4338-9369-454bc21a9fb3");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
    _Search_Find.Click_Clickon_search_icon1();
    

    TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
    
    _Search_Find.Enter_Search_Amount3("100");
    

    TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
    _Search_Find.Enter_Search_DateFrom4("44473");
    

    TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
    _Search_Find.Enter_Search_DateTo5("44473");
    

    TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
    _Search_Find.Click_Search_btn_click6();
    

    }

    @Test  (groups= {"SRCndFND","SRCndFND - srcNDfnd"})
    @TestModellerPath(guid = "9b03cec3-6492-4158-b417-04c47169308f")
    public void GoToUrlGoToUrlClickClickonsearchicon1PositiveEnterSearchAmount3PositiveEnterSearchDateFrom4Pos1() throws InterruptedException, IOException
    {
        
        pages.banking.ashiv.Search_Find _Search_Find = new pages.banking.ashiv.Search_Find(driver);
    TestModellerLogger.SetLastNodeGuid("2223428c-0d57-486f-8f94-a1018227f59b");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ef74fc10-2d99-4338-9369-454bc21a9fb3");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
    _Search_Find.Click_Clickon_search_icon1();
    

    TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
    _Search_Find.Enter_Search_Amount3("100");
    

    TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
    _Search_Find.Enter_Search_DateFrom4("2022-01-10 01:42:06");
    

    TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
    _Search_Find.Enter_Search_DateTo5("2021-07-10 05:08:25");
    

    TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
    _Search_Find.Click_Search_btn_click6();
    

    }

    @Test  (groups= {"SRCndFND","SRCndFND - srcNDfnd"})
    @TestModellerPath(guid = "c2df8ffa-ccce-415b-9723-120568b360d5")
    public void GoToUrlGoToUrlClickClickonsearchicon1PositiveEnterSearchAmount3PositiveEnterSearchDateFrom4Pos2() throws InterruptedException, IOException
    {
        
        pages.banking.ashiv.Search_Find _Search_Find = new     pages.banking.ashiv.Search_Find(driver);
    TestModellerLogger.SetLastNodeGuid("2223428c-0d57-486f-8f94-a1018227f59b");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ef74fc10-2d99-4338-9369-454bc21a9fb3");
    _Search_Find.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a9dde95-9204-4033-889c-99593994af4a");
    _Search_Find.Click_Clickon_search_icon1();
    

    TestModellerLogger.SetLastNodeGuid("8b872776-6a72-4212-b8dd-cfa7c0b0026a");
    _Search_Find.Enter_Search_Amount3("100");
    

    TestModellerLogger.SetLastNodeGuid("2c787bb2-a391-48c0-b8ef-fc06ebd08f5f");
    _Search_Find.Enter_Search_DateFrom4("2021-03-13 05:37:35");
    

    TestModellerLogger.SetLastNodeGuid("31a91c84-e7f9-4bfe-86a3-8dadcdce99a3");
    _Search_Find.Enter_Search_DateTo5("2021-10-04 15:40:22");
    

    TestModellerLogger.SetLastNodeGuid("8712bbe3-9979-4ba2-8bdd-bc3927522ce5");
    _Search_Find.Click_Search_btn_click6();
    

    }

}