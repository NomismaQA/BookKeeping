package VAT3_ExpenseReimbAdvanceReconcile;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/10ba7e74-2b0d-4199-962f-6108eeb15d5f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1426, profileId = 101297)
public class expenseadd_expense1 extends TestBase
{
    

    
    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "ca95c160-1b3b-486e-ad18-df45eaaf59fc")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick1() throws InterruptedException
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
    _nlogin.Enter_nPASS("WwSF6MPw4f");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

    pages.PartialReconciledCases.AgentSearch _AgentSearch = new  pages.PartialReconciledCases.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("explicabo");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

    pages.PartialReconciledCases.Searchclient _Searchclient = new  pages.PartialReconciledCases.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Luettgen and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("aaa");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

   /* @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "6916d9f2-d8bc-40f4-8fcd-ffe1fcb86a16")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick2()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("opZBLTCUAQ");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("animi");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Toy Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("zzzz");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "37a75559-79ba-4178-9402-94a45940fba5")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("iLTSolYHVe");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("omnis");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schaefer, Robel and Kuhn");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Aliquam cum consectetur iste libero qui ad voluptas.
Nihil sit laudantium voluptas vel.
Numquam et dolores amet modi itaque est facere.
Enim voluptatem sed magni perspiciatis neque.
Et et rerum blanditiis quaerat consequatur modi et eum.
Excepturi provident ut saepe sunt.
Consectetur eaque perspiciatis in nostrum omnis ut.
Id molestiae placeat et voluptate adipisci ratione dolor.
Rerum similique doloremque.
Molestiae odio pariatur non eligendi ea a nihil fugit pariatur.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "00974f2f-3819-40de-8bf0-5476bf137279")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("SfhLpZEeHz");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptas");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Murazik - Gleichner");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Optio amet mollitia adipisci enim exercitationem quos.
Sed et qui.
Illo dolor nisi voluptatum quas et temporibus beatae odit.
Incidunt ullam qui voluptas.
Eligendi eveniet eius sed ab architecto dolores corporis.
Accusamus accusamus at accusamus ea quaerat esse.
Nam dolor veritatis rerum beatae voluptatum.
Tempore quo consectetur quos totam a ullam totam totam.
Quibusdam dolor voluptatibus exercitationem cum omnis natus.
Voluptas est quidem perferendis sint porro.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "090a7f63-44b7-4b66-b826-0f54cedfc5cd")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("pmgzjgZGER");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("non");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Abernathy, Smith and Mosciski");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("In iure ad natus beatae et sit.
Alias et totam enim accusamus amet distinctio sint rem facilis.
Non nam sint nobis nulla sit possimus officia.
Totam saepe iste facilis ratione aperiam ut fuga facilis.
Assumenda vel error est.
Veniam quis corporis omnis non officiis nostrum esse ea dolor.
Voluptates rerum cumque molestiae vel quia.
Quam occaecati aut earum qui neque fugiat hic aperiam.
Ipsam officiis minima facilis perferendis.
Ea natus debitis quia autem saepe quia.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "5d4785f2-0b77-49f5-b488-b828a0f949e8")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("M2LfAw4iJR");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ratione");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Smitham and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Qui porro quaerat quo sit aspernatur.
Eveniet assumenda saepe enim exercitationem et.
Sed totam non ut harum maxime ex.
Impedit mollitia aut illo ut molestiae.
Dolores rerum minus et aspernatur id corrupti sed.
Sequi vel quo.
Ut incidunt eaque fuga aliquid enim voluptas.
Dolorum dolor quia.
Odit quo aut nam est sapiente natus.
Voluptatem enim consequatur.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "feee7d6f-4284-4215-8d66-65f0b772fb98")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick7()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("V5hhAL27kK");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptatum");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kuhic - Prosacco");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Aut soluta officiis odit non.
Asperiores voluptatem deleniti qui voluptas consectetur.
Expedita esse optio modi praesentium qui officia quas cumque.
Voluptatem qui tenetur natus ipsam quaerat provident odit.
Quaerat nostrum tenetur totam.
Ut ab omnis est maxime voluptatem.
Qui alias molestiae vel quis possimus aliquam aspernatur sunt fugit.
Ea ut est cupiditate sunt repudiandae cum voluptas rerum.
Dicta non non cumque rerum.
Quia voluptate quidem vel omnis.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "89b7f6b4-55e1-49b3-87aa-96fca5d5a219")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TmWQ1yORTO");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("tempore");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kshlerin - Stamm");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Voluptatibus quia omnis.
Architecto ut cum.
Praesentium non est blanditiis corporis repellat.
Sequi quisquam earum quae qui minus voluptatem nam laboriosam.
Repellendus repellat ratione ducimus et rerum non temporibus porro dolor.
Voluptatem hic molestias fuga quas.
Ipsa aliquid voluptatem optio nulla provident cumque.
Tenetur iusto iusto sed commodi.
Ut non sed quis ut provident reiciendis fugiat.
Omnis libero qui eius molestias necessitatibus est et quam tempora.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Overseas allowance");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "23447c1a-8c00-4cae-b10a-1f33605ce5c3")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClick9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("456yLJPN_A");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Becker, Shields and Erdman");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Aut sed non consequatur natus doloremque quaerat ipsam.
Blanditiis sit consequatur perferendis.
Qui quos modi consectetur debitis ut iusto dicta debitis nesciunt.
Ut asperiores tempora voluptatem nihil quo.
Non optio magnam soluta perferendis rerum blanditiis numquam soluta voluptatem.
Est quos quas deleniti dolor.
Sunt culpa eos hic.
Quis necessitatibus distinctio ab saepe exercitationem aperiam doloremque neque.
Dolorum labore autem ipsam rerum laudantium.
Ad minus nam nam veniam eum.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "1a52bd44-4f57-4b62-b872-2174bd346beb")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic10()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("5_j4VGB1i8");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quo");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Connelly LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Corporis consequuntur quis.
Alias inventore et iure.
Excepturi illum perferendis qui ex facilis et qui et ad.
Sint modi sunt atque sit nostrum.
Sed velit magnam.
Architecto ut atque dolorem pariatur impedit dolores.
Nemo officia in quia est commodi.
Voluptate esse iure perferendis voluptatem quaerat et corporis.
Beatae omnis et consectetur impedit alias incidunt.
Cum necessitatibus quod placeat aspernatur provident autem provident ipsam dolores.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "7968e0ec-817f-4176-a653-37805b215d64")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic11()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("qywDsmEB3u");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("maxime");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Upton Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Nemo ea animi ducimus omnis fuga rerum nemo.
Deserunt deleniti hic omnis eveniet ducimus rerum reiciendis et nobis.
Dolorem ex esse in nobis cupiditate provident repellendus velit.
Dolores fuga consequatur quibusdam nam et laboriosam et neque.
Dolores in voluptas modi sint ipsa.
Enim sint voluptatem voluptas libero modi eos.
Hic earum voluptatem omnis labore sunt aut aut explicabo.
At culpa delectus.
Hic ullam voluptas totam.
Enim magnam deserunt consectetur.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "d7ebe946-8bd1-4ad9-a972-56974d519dbc")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic12()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("w49xnF5wcT");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptatem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Walker, Jakubowski and Huels");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Libero consequuntur et praesentium rerum beatae.
Sapiente odio velit aperiam eum fuga ex.
Commodi fugit voluptatem accusamus eum quia quasi ut qui.
Ipsa occaecati qui voluptatibus odio.
Repellendus repudiandae repellendus et veritatis mollitia amet.
Qui nihil aut qui et.
Qui ullam ea et a.
Id sed error quis mollitia eos laborum odit mollitia.
Dolorem voluptatibus alias et magnam repudiandae quo.
Est voluptas non eaque est quia.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "c0d6001e-3c5e-4f17-89c5-b492dbde6cdc")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic13()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("3NzfX_y7AO");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quia");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wuckert Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Qui sed doloribus qui reiciendis sed atque praesentium.
Fugit consectetur nulla similique consequatur dignissimos dicta aut modi provident.
At qui in sapiente.
Impedit alias error laboriosam odit.
Repellendus nulla aliquid qui qui non.
Expedita delectus voluptatum veniam ut deleniti fugiat qui autem dignissimos.
Velit numquam voluptatibus qui recusandae fugiat consectetur sapiente doloremque dolore.
Fugit sint quia illum et.
Repellat numquam libero vero officiis sed.
Error tempore similique neque explicabo magni sint.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "5a550258-f50d-470e-aa30-45447508b6a9")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic14()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("UwtOvQz1Dp");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("iste");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Johns Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Qui neque omnis ab ut aut.
Rerum quaerat voluptatem accusantium et ut.
Itaque iste quaerat velit molestiae magni et vitae.
Porro ut eligendi perspiciatis quia quo sed velit.
Dolore cumque eligendi ipsum repellendus id iure aut.
Ducimus expedita aliquam.
Possimus minima molestiae ducimus exercitationem exercitationem sapiente quos quisquam ea.
Laudantium inventore illum nulla totam et quia qui.
Minima dolorum velit ipsa assumenda est et consequatur quae.
Et molestiae dignissimos.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "44686538-a2ca-4e74-89f6-1b4bfd563e12")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic15()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("kMGZeGmJ8R");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nisi");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Purdy, Reilly and Schamberger");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Velit voluptas ad excepturi in facilis eos.
Rerum cum cupiditate.
Voluptatem dignissimos tempore quod enim voluptatem enim laboriosam.
Pariatur excepturi omnis quia ea accusantium.
Vero sunt et.
Et ut harum.
Nisi repudiandae ipsa ratione.
Suscipit minus ab saepe dolor.
Vel at animi rerum soluta.
Qui aut error voluptas sint consectetur.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "82244720-64b3-40b7-9c23-890d2092e059")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic16()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Z5kZLismLE");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("qui");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cartwright, Zieme and Botsford");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Laudantium et ratione.
Numquam labore aliquam.
Eum mollitia esse nesciunt quasi debitis.
Est quae non exercitationem fugit recusandae odio quam in.
Repellat eum quia et cumque sit.
Sit dignissimos et est ipsa saepe.
Aut delectus ut incidunt debitis ea.
Quod deserunt error tempore recusandae mollitia cumque voluptatibus.
Accusantium ducimus maxime nobis.
At ab quia soluta.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "5db59172-7136-4c41-9b5d-03d0960c58d2")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("81NW3Sa8jV");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("assumenda");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rolfson, Bashirian and Gerlach");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Sed ullam quia consectetur hic sint eos unde et.
Qui fugit qui eum doloribus repellendus.
Non fugiat animi illum et nihil.
A et voluptate quidem repudiandae cupiditate non aut consequatur dolorem.
Eum rerum non sed incidunt ducimus expedita molestiae facilis aut.
Quia quaerat qui maiores.
Ut sed distinctio accusantium exercitationem.
Numquam ut rerum molestias quas quidem sunt.
Deleniti maxime esse in.
Voluptas ut tempore animi voluptatem nesciunt voluptatibus.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "07cc2e86-2f8e-4e29-a6fb-ace46e7297ac")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("smqx8ucake");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("optio");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Reilly - Weissnat");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Fugiat praesentium et.
Temporibus vero reiciendis ratione est et.
Molestias et ipsam non suscipit quam accusantium.
Qui impedit fugiat excepturi culpa.
Enim porro vel.
Nulla voluptatem debitis.
Eos voluptatem id aliquam.
Quasi exercitationem architecto dolor provident consequatur.
Velit ad quis voluptatem qui.
Fuga quis quos enim repellat.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "c52d92b4-ce6f-421e-a020-2314cc7a2643")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("zAQspdewzD");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("molestiae");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Prosacco and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Repellat nisi unde porro similique qui molestias quisquam dolorem.
Expedita non veritatis omnis.
Et placeat et delectus.
Ut unde quia suscipit ipsam ad tempore.
Aut eum optio dolore omnis.
Occaecati quibusdam et ipsam ipsam ducimus eius.
Ut perferendis ut accusamus itaque in et.
Dolor est id impedit recusandae qui.
Numquam ea nostrum est.
Est dignissimos blanditiis velit.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "8ea32443-c1f7-4410-b51c-43bb6519ada4")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("JSBIQA2J9F");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quidem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Beatty LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("44301");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Qui quasi expedita.
Repudiandae accusantium est voluptatem ut praesentium.
Vero quam qui consequatur unde amet maxime.
Modi ex laborum aut earum.
Tenetur hic qui autem.
Labore ea ut qui a delectus cumque rerum occaecati enim.
Suscipit aliquid sit quidem non accusantium rerum et vero.
Laudantium id quis optio aut voluptatem.
Quaerat a architecto enim tempora repellat eius sequi.
Accusantium iusto ea nulla corporis modi alias molestiae voluptatem quaerat.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "299c9a4b-d3b6-4eba-97ca-0dd7a6c1f884")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("xxTxQi_Zbb");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("doloribus");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Mann - Feil");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("2020-10-07 18:12:15");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Aliquid sapiente atque.
Alias excepturi quas perferendis voluptatem.
Id vero cum quo.
Voluptate quia accusantium quasi est nostrum deleniti dignissimos.
Laboriosam voluptas ducimus cumque vero cum.
Voluptas voluptates repudiandae et distinctio dolorem soluta non.
Quae et quis sed molestiae possimus.
Ad veritatis culpa.
Sed neque quibusdam vel officiis.
Asperiores repudiandae cum veritatis et nesciunt rem.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }

    @Test  (groups= {"expenseadd","expenseadd - expense"})
    @TestModellerPath(guid = "1b486f33-0b25-4740-910a-3f58ba9f4b03")
    public void expenseGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlClic22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("WzhlWVCvUW");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ullam");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Nienow and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EXPMENU _EXPMENU = new pages.EXPMENU(driver);
    TestModellerLogger.SetLastNodeGuid("0a5dffd5-b879-445b-a0ae-fab759897400");
    _EXPMENU.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78b10868-1ae4-43ae-a188-fe623aee3e85");
    _EXPMENU.Click_Expendituremenu();
    

    TestModellerLogger.SetLastNodeGuid("f0bfd3fa-0a4f-47b8-9583-6f8d6cea1ac2");
    _EXPMENU.Click_Newplus_Click();
    

pages.Reinbursment _Reinbursment = new pages.Reinbursment(driver);
    TestModellerLogger.SetLastNodeGuid("5b271a48-8cae-4fd9-b0f2-9a66c64f2a47");
    _Reinbursment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d7695d9-d466-4b00-a337-94fe42809998");
    _Reinbursment.Select_Employee_Select("Nidhi sh");
    

    TestModellerLogger.SetLastNodeGuid("e82918ac-f244-4a93-a281-a7ee194ad5e2");
    _Reinbursment.Enter_Date_toselect("2021-08-31 18:30:43");
    

    TestModellerLogger.SetLastNodeGuid("6dcff787-0978-4c3f-b407-3d8b51b263aa");
    _Reinbursment.Enter_add_Description("Animi aut aspernatur.
Qui eum voluptas.
Et et voluptas ut tenetur.
Aut voluptatem totam vitae repellat expedita odio officia sed dignissimos.
Est iusto voluptas autem necessitatibus neque aut sunt laudantium.
Quo distinctio omnis voluptas facere.
Voluptas qui iusto id non tenetur id omnis eaque nihil.
Ad est cum perferendis asperiores et ut.
Qui odio aut ut beatae aut consequatur.
Qui ut animi eligendi et dolore.");
    

    TestModellerLogger.SetLastNodeGuid("c4db986b-c1dd-4c41-ab0c-b212f05d61f0");
    _Reinbursment.Select_Select_VATtypeRates("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c5af902f-6546-41ef-8d2f-890d537b459d");
    _Reinbursment.Select_Select_ExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("238b8365-5985-4618-a713-d079c1838f62");
    _Reinbursment.Enter_Enter_Amts("");
    

    TestModellerLogger.SetLastNodeGuid("caaa2579-4dc6-4199-8cac-5ff51ec39057");
    _Reinbursment.Click_Clicked_Save();
    

    }
*/
}