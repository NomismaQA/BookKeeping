package test.PartialReconciledCases;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0e82eb7c-6df5-44cc-b29f-c3ca37247d85
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1140, profileId = 101030)
public class Vatsetting_vatsettings extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
      
    @Test  (groups= {"Vatsetting","Vatsetting - vatsettings"})
    @TestModellerPath(guid = "2d14ddad-c055-435e-b467-6c8877b1d314")
    public void vatsettingsGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlC1() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="TC1";
    	Sheet="Vatsetting";
    	data =ExcelUtility.toReadExcelData("TC1", "Vatsetting");

        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

////    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.PartialReconciledCases.AgentSearch _AgentSearch = new pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.PartialReconciledCases.Searchclient _Searchclient = new pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    
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
    

pages.PartialReconciledCases.Vatsetting _Vatsetting = new pages.PartialReconciledCases.Vatsetting(driver);
//    TestModellerLogger.SetLastNodeGuid("452044e6-7204-4603-8a08-77e9c3250afe");
//    _Vatsetting.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9916f127-8204-49fd-9d43-41612eeb65ae");
//    _Vatsetting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("05b73142-ad1d-4368-92e3-06371cec4e5c");
    _Vatsetting.Click_VATSettings();
    

    TestModellerLogger.SetLastNodeGuid("a8bc2289-5744-4d05-bc14-252f49a34a2e");
    _Vatsetting.Click_VATMenu();
    

    TestModellerLogger.SetLastNodeGuid("92fe19af-d3e0-4984-945f-602737ef732f");
    _Vatsetting.Click_TopEditbutton();
    

    TestModellerLogger.SetLastNodeGuid("2b1c032b-2948-470b-a33b-45a5cad2af42");
    _Vatsetting.Click_Editicon();
    

//    TestModellerLogger.SetLastNodeGuid("0c5a0bb6-a779-4053-be47-31d9b2985a4e");
//    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("eb6ba5b5-a8a3-45ec-8523-0b5ea2e3d1f9");
    _Vatsetting.Select_VATStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3e0aea71-3d25-417b-a730-766ee2bf5c8d");
    _Vatsetting.Enter_ctl00cPHtxtDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b2ce5845-dda3-47ed-b27b-6c19e7812bd3");
    _Vatsetting.Click__Save_();
    

    }
}
/*

    @Test  (groups= {"Vatsetting","Vatsetting - vatsettings"})
    @TestModellerPath(guid = "cb221cd5-1784-4fc5-99af-598c5e444100")
    public void vatsettingsGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlC2() throws InterruptedException
    {
        
        pages.PartialReconciledCases.nlogin _nlogin = new pages.PartialReconciledCases.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_LgBcRuE9V");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("libero");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Feest, Larson and West");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Vatsetting _Vatsetting = new pages.Vatsetting(driver);
    TestModellerLogger.SetLastNodeGuid("452044e6-7204-4603-8a08-77e9c3250afe");
    _Vatsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9916f127-8204-49fd-9d43-41612eeb65ae");
    _Vatsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05b73142-ad1d-4368-92e3-06371cec4e5c");
    _Vatsetting.Click_VATSettings();
    

    TestModellerLogger.SetLastNodeGuid("a8bc2289-5744-4d05-bc14-252f49a34a2e");
    _Vatsetting.Click_VATMenu();
    

    TestModellerLogger.SetLastNodeGuid("92fe19af-d3e0-4984-945f-602737ef732f");
    _Vatsetting.Click_TopEditbutton();
    

    TestModellerLogger.SetLastNodeGuid("2b1c032b-2948-470b-a33b-45a5cad2af42");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("0c5a0bb6-a779-4053-be47-31d9b2985a4e");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("eb6ba5b5-a8a3-45ec-8523-0b5ea2e3d1f9");
    _Vatsetting.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("3e0aea71-3d25-417b-a730-766ee2bf5c8d");
    _Vatsetting.Enter_ctl00cPHtxtDate("2021-02-25 09:12:26");
    

    TestModellerLogger.SetLastNodeGuid("b2ce5845-dda3-47ed-b27b-6c19e7812bd3");
    _Vatsetting.Click__Save_();
    

    }

}
/*
    @Test  (groups= {"Vatsetting","Vatsetting - vatsettings"})
    @TestModellerPath(guid = "385a730c-597b-442f-af1d-3979a15e99fb")
    public void vatsettingsGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlC3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("IZiIubrO5Q");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("vero");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stamm and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Vatsetting _Vatsetting = new pages.Vatsetting(driver);
    TestModellerLogger.SetLastNodeGuid("452044e6-7204-4603-8a08-77e9c3250afe");
    _Vatsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9916f127-8204-49fd-9d43-41612eeb65ae");
    _Vatsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05b73142-ad1d-4368-92e3-06371cec4e5c");
    _Vatsetting.Click_VATSettings();
    

    TestModellerLogger.SetLastNodeGuid("a8bc2289-5744-4d05-bc14-252f49a34a2e");
    _Vatsetting.Click_VATMenu();
    

    TestModellerLogger.SetLastNodeGuid("92fe19af-d3e0-4984-945f-602737ef732f");
    _Vatsetting.Click_TopEditbutton();
    

    TestModellerLogger.SetLastNodeGuid("2b1c032b-2948-470b-a33b-45a5cad2af42");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("0c5a0bb6-a779-4053-be47-31d9b2985a4e");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("eb6ba5b5-a8a3-45ec-8523-0b5ea2e3d1f9");
    _Vatsetting.Select_VATStatus("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("3e0aea71-3d25-417b-a730-766ee2bf5c8d");
    _Vatsetting.Enter_ctl00cPHtxtDate("2021-10-20 10:28:24");
    

    TestModellerLogger.SetLastNodeGuid("b2ce5845-dda3-47ed-b27b-6c19e7812bd3");
    _Vatsetting.Click__Save_();
    

    }

    @Test  (groups= {"Vatsetting","Vatsetting - vatsettings"})
    @TestModellerPath(guid = "262949b9-6538-4ac3-92a8-ad420c60c25d")
    public void vatsettingsGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlC4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("F4wBicmYMG");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("necessitatibus");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kub, Towne and Hegmann");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Vatsetting _Vatsetting = new pages.Vatsetting(driver);
    TestModellerLogger.SetLastNodeGuid("452044e6-7204-4603-8a08-77e9c3250afe");
    _Vatsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9916f127-8204-49fd-9d43-41612eeb65ae");
    _Vatsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05b73142-ad1d-4368-92e3-06371cec4e5c");
    _Vatsetting.Click_VATSettings();
    

    TestModellerLogger.SetLastNodeGuid("a8bc2289-5744-4d05-bc14-252f49a34a2e");
    _Vatsetting.Click_VATMenu();
    

    TestModellerLogger.SetLastNodeGuid("92fe19af-d3e0-4984-945f-602737ef732f");
    _Vatsetting.Click_TopEditbutton();
    

    TestModellerLogger.SetLastNodeGuid("2b1c032b-2948-470b-a33b-45a5cad2af42");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("0c5a0bb6-a779-4053-be47-31d9b2985a4e");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("eb6ba5b5-a8a3-45ec-8523-0b5ea2e3d1f9");
    _Vatsetting.Select_VATStatus("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("3e0aea71-3d25-417b-a730-766ee2bf5c8d");
    _Vatsetting.Enter_ctl00cPHtxtDate("44253");
    

    TestModellerLogger.SetLastNodeGuid("b2ce5845-dda3-47ed-b27b-6c19e7812bd3");
    _Vatsetting.Click__Save_();
    

    }

    @Test  (groups= {"Vatsetting","Vatsetting - vatsettings"})
    @TestModellerPath(guid = "8825ec6b-6c19-43db-ab34-89647ea7a374")
    public void vatsettingsGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlC5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("1iLei_sGn6");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("officia");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hand Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Vatsetting _Vatsetting = new pages.Vatsetting(driver);
    TestModellerLogger.SetLastNodeGuid("452044e6-7204-4603-8a08-77e9c3250afe");
    _Vatsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9916f127-8204-49fd-9d43-41612eeb65ae");
    _Vatsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05b73142-ad1d-4368-92e3-06371cec4e5c");
    _Vatsetting.Click_VATSettings();
    

    TestModellerLogger.SetLastNodeGuid("a8bc2289-5744-4d05-bc14-252f49a34a2e");
    _Vatsetting.Click_VATMenu();
    

    TestModellerLogger.SetLastNodeGuid("92fe19af-d3e0-4984-945f-602737ef732f");
    _Vatsetting.Click_TopEditbutton();
    

    TestModellerLogger.SetLastNodeGuid("2b1c032b-2948-470b-a33b-45a5cad2af42");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("0c5a0bb6-a779-4053-be47-31d9b2985a4e");
    _Vatsetting.Click_Editicon();
    

    TestModellerLogger.SetLastNodeGuid("eb6ba5b5-a8a3-45ec-8523-0b5ea2e3d1f9");
    _Vatsetting.Select_VATStatus("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("3e0aea71-3d25-417b-a730-766ee2bf5c8d");
    _Vatsetting.Enter_ctl00cPHtxtDate("44253");
    

    TestModellerLogger.SetLastNodeGuid("b2ce5845-dda3-47ed-b27b-6c19e7812bd3");
    _Vatsetting.Click__Save_();
    

    }

}*/