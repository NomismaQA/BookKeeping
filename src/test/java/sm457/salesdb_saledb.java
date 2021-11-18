package sm457;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelUtility;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6314afaf-cb6f-45e2-b17a-c8c21618a549
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1428, profileId = 101298)
public class salesdb_saledb extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "9d57d493-f221-40a5-8a77-19d138ee5373")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme1() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC1";
    	Sheet="sm457";
    	data =ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
    	  pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    	    _nlogin.GoToUrl();
    	    

//    	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    	    _nlogin.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    	    _nlogin.Enter_nLOGIN(data[1]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    	    _nlogin.Enter_nPASS(data[2]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    	    _nlogin.Click_Login();
    	    

    	pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
//    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    	    _AgentSearch.GoToUrl();
//    	    

//    	    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    	    _AgentSearch.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
//    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    	    _Searchclient.GoToUrl();
//    	    

//    	    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    	   // _Searchclient.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	    	    	
    	    saledasboard _saledasboard = new saledasboard(driver);
//    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
//    _saledasboard.GoToUrl();
    
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
//    _saledasboard.Enter_Enter_transcode("");
    

//    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
//    _saledasboard.Click_payment_status();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
//    _saledasboard.Select_select_Duestatus("All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
//    _saledasboard.Enter_daterange_from("44303");
    
//
//    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
//    _saledasboard.Enter_daterange_to("2020-12-05 23:38:45");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    
    }
    }
/*

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "95b0a39c-60b8-4d85-aa4b-eb139c098b1c")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme2()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-05-07 14:59:13");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "321ad7ba-4200-4a5e-a361-afc674aa250e")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme3()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("44303");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "6d146c6c-c1ae-4439-a626-f8875df5fb53")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme4()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("2020-10-06 14:15:00");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-09-25 01:39:08");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "814ebbd3-f6b9-45db-af75-9d775f9a2f2b")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme5()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("2021-09-12 17:58:44");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-01-09 21:27:25");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "720f0072-d3be-46b4-ac7f-232a6f037448")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme6()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("Due");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-06-09 00:31:10");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "0995a938-1b17-4b9b-ab0b-76c079c659d8")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme7()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("Not Due");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-01-15 22:04:31");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "03e03516-0488-4d2a-8d01-b617f7df5ea8")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme8()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Customer Name");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-12-14 11:54:46");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "dcd82460-fa4a-449a-b7df-c9b84ffca5aa")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpayme9()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Tran#");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-07-26 09:15:19");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "3d19ba94-11ee-49bd-b81c-0a4f0c988409")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym10()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Ref#");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-03-23 21:41:39");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }
}





/* @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "5478c776-6622-42e5-8148-2c0a64d2c187")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym11()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-08-20 06:12:33");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "944f5039-dee4-48cd-98cf-38bdffc8413a")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym12()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("All");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Type");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-12-29 18:34:33");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "8f5bdd68-beec-4ddf-9723-1a0a980f008a")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym13()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("abc");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-12-14 22:11:48");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "c9a23398-99e8-4797-ab1e-cb08280c8a4e")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym14()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("ABCD Company");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-06-20 01:50:57");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "8eca195c-e582-4a2c-bc21-0491f5268bba")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym15()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-02-05 09:42:45");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "b7acd84d-c44b-4b5b-bbdf-3438b9897789")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym16()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Food");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-07-04 22:35:36");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "035dec8a-c3c3-4853-81d5-3226b24de68a")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym17()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Good");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-02-23 01:38:12");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "a4d00370-4d31-4171-80b7-888366c2647c")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym18()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("John");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-01-06 15:58:20");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "6942e958-d1d4-4fba-beff-30273f2d833d")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym19()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("nid");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-09-03 15:07:08");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "5a517f5e-ce50-4772-90e7-6d580ef2f952")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym20()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Nidhi (2343454555)");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-07-27 09:03:18");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "72b2750f-5344-4818-930f-01d7c485d5e0")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym21()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Nidhis");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2021-03-28 13:16:21");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

    @Test  (groups= {"salesdb","salesdb - saledb"})
    @TestModellerPath(guid = "7721f9bf-9211-40b2-bbd1-d7dff95ddb34")
    public void saledbGoToUrlPositiveSelectSelectcustomerPositiveSelectsearchcateEnterEntertranscodeClickpaym22()
    {
        
        pages.saledasboard _saledasboard = new pages.saledasboard(driver);
    TestModellerLogger.SetLastNodeGuid("7e28a082-b5cd-463d-86de-ebca3d9067b6");
    _saledasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d02b2ac-e775-4904-954a-ef38f8931998");
    _saledasboard.Select_Select_customer("Sohan");
    

    TestModellerLogger.SetLastNodeGuid("914c514b-eec0-46fe-a8f5-9d8d7e056b79");
    _saledasboard.Select_search_cate("Select");
    

    TestModellerLogger.SetLastNodeGuid("70b1bde3-d0ad-4960-af62-c02b0aa80340");
    _saledasboard.Enter_Enter_transcode("");
    

    TestModellerLogger.SetLastNodeGuid("3372815d-16cb-4b05-936e-133db74399c4");
    _saledasboard.Click_payment_status();
    

    TestModellerLogger.SetLastNodeGuid("bb1c8e93-d2ab-401e-9e95-d57dc8563a5c");
    _saledasboard.Select_select_Duestatus("All");
    

    TestModellerLogger.SetLastNodeGuid("7ab2ad70-28d0-4306-98bb-6028be366a7d");
    _saledasboard.Enter_daterange_from("44303");
    

    TestModellerLogger.SetLastNodeGuid("1fe060ef-e8c0-4452-8e82-aaaa50a2eb78");
    _saledasboard.Enter_daterange_to("2020-07-10 05:38:26");
    

    TestModellerLogger.SetLastNodeGuid("563fb128-954e-4474-bad9-254789e60b81");
    _saledasboard.Click_Click_Update_btn();
    

    }

}*/