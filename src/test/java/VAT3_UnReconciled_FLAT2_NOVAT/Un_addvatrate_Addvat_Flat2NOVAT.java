package VAT3_UnReconciled_FLAT2_NOVAT;

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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dc7a8b5b-82a0-44c3-9e29-7f0a6d63fdb5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1536, profileId = 101174)
public class Un_addvatrate_Addvat_Flat2NOVAT extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"addvatrate","addvatrate - Addvat"})
    @TestModellerPath(guid = "baaf9fe7-cad4-4537-8d18-e9dced4d838c")
    public void GoToUrlAssertUrlPositiveSelectVATStatus1PositiveEnterEffectiveDatePositiveSelectFlatrateBusines() throws InterruptedException, InvalidFormatException
    {
    	
    	sTestCaseID="UN_Add_Flat_NOVat_vat1";
       	Sheet="VAT3";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        
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
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    
    pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//  TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//  _EditSettingToStandard.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//  _EditSettingToStandard.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
  _EditSettingToStandard.Click_SettingsTab();
  

  TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
  _EditSettingToStandard.Click_VATTab();
  

  TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
  _EditSettingToStandard.Click_EditButton();
  

//  TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
//  _EditSettingToStandard.Click_VATTypeEdit();
    
        pages.addVatrate _addVatrate = new pages.addVatrate(driver);
//    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
//    _addVatrate.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
//    _addVatrate.AssertUrl();
        TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
        _addVatrate.Click_AddVatbtn();
//
//    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
//    _addVatrate.Select_VAT_Status1(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
//    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }
}
/*

    @Test  (groups= {"addvatrate","addvatrate - Addvat"})
    @TestModellerPath(guid = "c101d35f-4612-43cb-91bb-e1660fc31aca")
    public void GoToUrlAssertUrlPositiveSelectVATStatus1PositiveEnterEffectiveDatePositiveSelectFlatrateBusines1()
    {
        
        pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("2020-10-31 07:27:44");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"addvatrate","addvatrate - Addvat"})
    @TestModellerPath(guid = "034bc2c3-4049-479e-9e3f-50fe8aaa2cdb")
    public void GoToUrlAssertUrlPositiveSelectVATStatus1PositiveEnterEffectiveDatePositiveSelectFlatrateBusines2()
    {
        
        pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("2022-05-04 03:07:58");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"addvatrate","addvatrate - Addvat"})
    @TestModellerPath(guid = "0556c194-4082-4cc2-b63e-df9560060a81")
    public void GoToUrlAssertUrlPositiveSelectVATStatus1PositiveEnterEffectiveDatePositiveSelectFlatrateBusines3()
    {
        
        pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("44349");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"addvatrate","addvatrate - Addvat"})
    @TestModellerPath(guid = "48abb9e6-2c22-4a60-99b6-3b52c67b42f1")
    public void GoToUrlAssertUrlPositiveSelectVATStatus1PositiveEnterEffectiveDatePositiveSelectFlatrateBusines4()
    {
        
        pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("44349");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

}*/