package test.partialReconcileJonralEntrySToFlat;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d0c9af5b-17aa-4f8f-94b3-dc60f7a69091
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1296, profileId = 101167)
public class JournalEntry_JournalEntry extends TestBase
{

	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "319d74e4-4276-47c0-a704-ae1e8efde624")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo1() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC421";
    	Sheet="JournalReconcile";
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
    	    

//    	    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    	    _Searchclient.AssertUrl();
    	   

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("NidhiEnt");
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	   
    	    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    	    JournalEntry_JournalEntry.Click_Accountantlefttab();
    	
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
//    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
//    _JournalEntry.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
//    _JournalEntry.AssertUrl();
//    

  
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate(data[4]);
    
    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Reverse_Date(data[5]);
    
    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency(data[6]);

//    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
//    _JournalEntry.Enter_Enter_Description(data[7]);
    

 
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit(data[27]);
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit(data[28]);
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note(data[29]);
      TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }
/*
    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "c1c85c50-8c0a-45a1-88b4-051eeafa69d4")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo2()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Id fugiat non repellat nostrum cupiditate voluptates ratione est.
Vel non rerum harum rerum consequatur perferendis itaque eos ea.
Corrupti et minima blanditiis dolore enim dicta.
Autem rerum amet.
Alias sit dolores facere voluptates porro pariatur.
Assumenda non voluptatem.
Exercitationem consequatur ut qui vel labore natus alias mollitia labore.
Ea recusandae ut ipsa.
Dolorem quae eveniet sunt fuga.
Rerum corporis qui aliquam odit eius quis nisi.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("EUR");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "fb9465e1-9524-46a8-884e-d929ba0069d2")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo3()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("A voluptate autem neque et consequatur ex quisquam omnis.
Sit delectus voluptas vitae explicabo.
Quis cum mollitia consectetur quisquam harum non minima est.
Animi qui consequuntur.
Laboriosam quo aliquam reprehenderit.
Asperiores iste autem quibusdam aut.
Quia nisi voluptas dignissimos cum sed.
Ab iusto minus perspiciatis.
Sequi quia voluptas deleniti explicabo sint quia assumenda.
Mollitia quam maiores totam quo quis autem aspernatur voluptatem.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("USD");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "2c844d6e-17d8-4419-b3ee-73f8c9beaf01")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo4()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("SEK");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "24453022-8f16-43a3-9017-1968da1812c2")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo5()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Quia voluptatem omnis qui.
Dolorem eveniet deserunt provident ex facilis.
Consequatur autem id praesentium autem velit inventore.
Non qui sed accusamus et est eum ea.
Qui earum natus.
Eum deserunt illum expedita officiis iste voluptas totam autem sit.
Est commodi eius ratione inventore tempore tempore aliquam.
Aliquam enim vel dolor soluta exercitationem.
Odio ut provident dolores esse dicta est maiores dolor.
Aut et vero numquam sed dolores veritatis rerum quaerat.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("MUR");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "ea8e2475-d4b9-48ba-b41b-6bed41034866")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo6()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Molestiae labore corporis.
Quisquam nobis architecto et aut dolor.
Aut in quod.
Non quaerat adipisci incidunt cupiditate tempore.
Commodi enim et quia.
Enim illo eos placeat saepe quam.
Eum velit ut ratione.
Minus aut eaque debitis alias placeat.
Et fugit vel enim officiis et et minus qui.
Debitis doloremque occaecati unde.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("PLN");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "fbf76a74-0001-4998-82f8-1f4e3a86930a")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo7()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Aut animi aut aperiam qui.
Aliquid ea sed eligendi fugit repellendus et.
Harum ea ea cupiditate eaque magnam quis.
Dolor voluptatem aut labore nobis eum.
Quia quia et eos.
Quia odio ut ut est minima.
Facere laborum culpa omnis vitae sequi eius.
Fugiat sint molestias atque ullam asperiores aliquid illum impedit.
Ut et occaecati dolorem.
Corrupti atque et ab nemo adipisci blanditiis reprehenderit repudiandae possimus.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("INR");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "6eca6fe3-ee4c-4de3-9150-f3859054e8cc")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo8()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Provident voluptas velit et quibusdam dicta totam et.
Consequatur cumque ratione error blanditiis.
Dolorum adipisci illum impedit velit ab officia id explicabo.
Nesciunt odit repudiandae similique vel.
Deserunt est et praesentium.
Dolorum quia ex vel in qui vel.
Repellendus laboriosam ea.
Qui sunt voluptatem sunt quia nisi et.
Odit odit tempora rerum voluptatibus omnis et aut nobis odit.
Rerum repellat ut alias maiores laudantium.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("CAD");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "314fec90-08e5-44d0-a8a6-c6736f6afdd5")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDatePo9()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Perferendis animi est nam nemo recusandae et excepturi praesentium asperiores.
Omnis iure vel.
Sint in excepturi voluptatibus porro fugiat nulla tenetur quo iure.
Sint velit mollitia aut sunt minima aut enim.
Doloremque ipsum dignissimos et nostrum.
Totam explicabo quas eos magni quisquam ipsa a deleniti.
Quos alias placeat inventore dolorem facilis itaque minima et sit.
Sint ea nihil quo dignissimos architecto.
A nisi a.
Eligendi debitis consequatur facere ducimus reiciendis aliquam sapiente.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("AUD");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "c29b728a-2a94-4009-a689-f864a7dd54df")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP10()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Blanditiis fugit sequi beatae ad ea aliquam dolorem eum ut.
Ipsum ad ducimus unde.
Beatae voluptatem est facilis asperiores repellat eos doloribus.
Enim accusamus est esse velit a voluptatem nam eos.
Aut quia ut natus vitae qui aut in odit autem.
Esse molestiae illum sit quis tenetur similique.
Aut blanditiis aut neque corporis.
Corrupti error placeat amet ad qui molestias dolores excepturi maxime.
Minus laudantium id dolorem aut quam aperiam.
Labore saepe odio accusamus.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("MYS");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }
    /*

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "a0cfa25e-fb93-44ac-86fa-0d901ac26539")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP11()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Dolorem consequatur qui aliquid quaerat deleniti.
Ipsa ipsa deserunt deserunt aliquam magni reprehenderit eum et.
Veniam sint architecto.
Quidem quos delectus quos assumenda aperiam.
Delectus et architecto ab eligendi ex ea enim est nesciunt.
Aperiam sint atque est accusamus aut sunt voluptatibus doloremque quia.
Sed est cupiditate quibusdam voluptates consectetur sint.
Vero corrupti dignissimos necessitatibus beatae reiciendis.
Perspiciatis natus omnis doloremque iste delectus debitis.
Aut nesciunt alias rerum dolorum tenetur.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("SGD");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "3fc294bd-9743-4f71-9524-8b49d0e863c0")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP12()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Temporibus alias minus quam eos laudantium cupiditate eveniet ducimus ipsum.
Velit ullam iure deserunt accusantium voluptate quo aliquid totam.
Sed alias est.
Voluptas velit facilis rerum et et saepe.
Itaque cumque odio sequi expedita fugit inventore.
Nam sit eos.
Voluptas culpa voluptatem nostrum magni mollitia ut enim corrupti.
Qui alias dicta voluptas sed voluptatem debitis aliquam ut molestiae.
Nam commodi est voluptatem officiis placeat mollitia exercitationem dignissimos.
Officiis eos pariatur vel maxime.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("CHF");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "4c3b2c52-64df-45e3-9964-10e9e912359e")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP13()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Ex molestias nemo consequatur.
Quae accusantium fugit iusto quasi vel culpa.
Qui voluptate temporibus recusandae recusandae aut numquam sit eos.
Pariatur rerum reiciendis ipsa error.
Et ut doloremque temporibus vitae cupiditate placeat ut.
Labore et suscipit in quo et recusandae sit et corporis.
Vitae sed repudiandae quo non nulla numquam magnam praesentium commodi.
Consequatur praesentium in sunt quo repellendus temporibus impedit.
Distinctio iste perferendis optio atque aut possimus.
Blanditiis sint fuga voluptatum quod et.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("JPY");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "83196a2e-9e24-4600-938b-5bd7f8541c55")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP14()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Distinctio voluptatem ipsam quaerat ut enim et omnis.
Deserunt laborum officiis quia qui delectus ratione.
Temporibus nobis minima cupiditate.
Eius tempora est sunt.
Autem perspiciatis quod ipsum voluptatem fugiat assumenda repudiandae sint.
Non voluptatum nemo neque dolor blanditiis.
Officiis consequatur qui.
Quos assumenda qui est inventore.
Odit totam aspernatur dicta laborum.
Occaecati nihil ut vel.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("CNY");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "16b273b2-a387-4ad4-b303-9b7f60507a29")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP15()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Ut ipsa voluptate tempora ducimus cum.
Ipsam autem sed maxime minus fugit ex facilis.
Quas ullam est ut deleniti quia atque.
Dignissimos esse eum sint voluptas temporibus blanditiis perspiciatis.
Nobis cupiditate sapiente quia illo ipsa sunt optio.
Soluta incidunt ea minus voluptatibus.
Ut rerum sit voluptate praesentium totam earum qui.
Maxime repellendus aperiam exercitationem repellendus doloribus officia.
Velit explicabo et eum soluta sit ducimus quaerat.
Est odit cupiditate magnam corporis impedit et est.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("HKD");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "3fd8dacf-ceb9-4501-8641-fa544d56c047")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP16()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Nobis assumenda ab dicta quia quod eum ea et enim.
Autem repudiandae iure.
Similique nesciunt rerum.
Ut quis enim similique ratione omnis illum.
Et nemo dignissimos beatae animi est fugiat corporis illum.
Fugit sint est dignissimos ad ut dolor.
Necessitatibus id quisquam et.
Qui et aut maxime distinctio quis sed ut.
Ex voluptates assumenda aspernatur maiores.
Velit ratione beatae vitae.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("CZK");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "2a6449a5-0d7e-4c8a-8c6a-fb12fea40f29")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP17()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Tenetur quae quisquam eos praesentium.
Velit reprehenderit eveniet.
Beatae fugit amet dolorum corporis aut porro ut quia non.
Quo aut error dolor cum dolor repudiandae.
Quo quod distinctio quidem sequi qui explicabo nisi voluptatem quis.
Sapiente consequatur alias quam ad quibusdam culpa voluptatum.
Sit eligendi et ut voluptatem distinctio labore labore.
Vitae dolor fugiat dolores.
Inventore ratione quam voluptatum aperiam saepe.
Nam optio et non.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("NOK");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "0684225f-0d5f-4727-9002-30496113efb4")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP18()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Aut quo eum quis voluptatibus aspernatur cumque incidunt et ratione.
Possimus atque quos corrupti vero amet.
Quas vel laudantium ea earum ad vero voluptatem perspiciatis qui.
Occaecati repellat et autem sit at.
At officiis aspernatur nobis dolores ut est.
Est distinctio doloribus ut ea aliquid deleniti possimus aut porro.
Ea assumenda aut et nam omnis sed.
Veniam ratione et eum corporis quidem sapiente alias ipsam.
Qui cum velit autem accusantium fuga adipisci voluptas consequatur.
Quia eaque et occaecati.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("ZAR");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "8b899ed5-a1d4-4bd2-966e-cdda7751cbb7")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP19()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("44278");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Soluta qui possimus quod odio et dolores perferendis.
Voluptas assumenda repellendus minima est ut dignissimos.
Dolorem repudiandae quis eaque corporis.
Maxime corrupti ut suscipit unde earum harum.
Ut ut est dolorum.
Sed quaerat officiis voluptate.
Nam est totam aliquam voluptas sint quidem aut.
Est officiis sit incidunt dolorum autem voluptas perferendis.
Quia aspernatur qui architecto debitis.
Et iusto omnis.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("DKK");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "a9252d3c-6adf-4b65-a80c-2ba1d5d803a0")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP20()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("2021-02-26 14:21:58");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Et explicabo nostrum quas mollitia quis et qui.
Est ipsam optio ducimus quia eos.
Sunt fugit odit dolore ut.
Consequatur libero enim aut.
Vel eum iure ea consequatur similique iure.
Cum culpa dolorem harum dolore omnis.
Non id necessitatibus in eos accusamus perferendis porro.
Voluptatem dignissimos qui consequatur illo.
Fuga adipisci dolores.
Et possimus aspernatur et hic magni inventore quo sit.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }

    @Test  (groups= {"JournalEntry","JournalEntry - JournalEntry"})
    @TestModellerPath(guid = "193688cd-764f-48ed-a8a6-9b81d3b5b55e")
    public void JournalEntryGoToUrlAssertUrlClickAccountantlefttabClickplusiconclickPositiveEnterEntertDateP21()
    {
        
        pages.JournalEntry _JournalEntry = new pages.JournalEntry(driver);
    TestModellerLogger.SetLastNodeGuid("d0c3eb81-6771-4b77-bb75-55a02294146e");
    _JournalEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6e8ad6d-3564-4c46-83cb-581c6935ddc6");
    _JournalEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("45507c48-8c12-4e97-9191-2b506ef5c087");
    _JournalEntry.Click_Accountantlefttab();
    

    TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
    _JournalEntry.Click_plusiconclick();
    

    TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
    _JournalEntry.Enter_Enter_tDate("2022-01-04 09:33:40");
    

    TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
    _JournalEntry.Enter_Enter_Description("Deleniti eos corrupti est expedita in omnis voluptates.
Est quibusdam nam explicabo dicta et placeat sit iusto officia.
Harum eos totam a earum molestiae ea itaque enim beatae.
Eum non unde quo.
Suscipit porro qui est nulla veniam provident.
Alias sunt consequatur.
Accusantium vel ipsa ad.
Eum fugit nisi reprehenderit non impedit incidunt.
Quo rerum rerum.
Ut id perspiciatis dolore laboriosam esse corporis.");
    

    TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
    _JournalEntry.Select_Slect_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
    _JournalEntry.Enter_Clickaccountbox("");
    

    TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
    _JournalEntry.Enter_Enter_Debit("");
    

    TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
    _JournalEntry.Enter_Enter_Credit("");
    

    TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
    _JournalEntry.Enter_Enter_Note("");
    

    TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
    _JournalEntry.Click_Click_Save_btn();
    

    }*/


	private static void Click_Accountantlefttab() {
		// TODO Auto-generated method stub
		
	}

}