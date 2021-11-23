package VAT3.FullREC_S2_FLAT;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e19e6b99-0a4c-49fc-bef1-7c26642dc7af
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1537, profileId = 101523)
public class Supplier_SubcontractorBill_SubContractor extends TestBase
{
    

	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "1b1ebbbd-7e07-48c1-8857-8b59161ea9c3")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="";
       	Sheet="Vat3FulRec";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//        _nlogin.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
        _nlogin.Enter_nLOGIN(data[1]);
        

        TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
        _nlogin.Enter_nPASS(data[2]);
        

        TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
        _nlogin.Click_Login();
        

    pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    //    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//      TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//       _Searchclient.GoToUrl();
//       
   
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
     pages.VAT3.Subcontractorbill _Subcontractorbill = new  pages.VAT3.Subcontractorbill(driver);
//TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
//   _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
//    _Subcontractorbill.Enter_tDate6(data[7]);
    

//  TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
//    _Subcontractorbill.Enter_DueDate7("02/6/2021");
    
//    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
//    _Subcontractorbill.Expense_type1();
//    
    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8(data[8]);
   

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9(data[9]);
    

   TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11(data[11]);
    
//
//    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
//    _Subcontractorbill.Enter_VATRate12("");
    

//    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
//    _Subcontractorbill.Enter_VAT13("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
//    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }
}
    /*

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "7d60c2e2-a051-488a-9558-516fffc087e6")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv1()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Autem rerum quasi delectus quasi iste id.
Ullam neque eaque qui aut aut.
Veritatis a accusantium rerum ipsam minus non.
Ut saepe minus non eum quo voluptatem.
Nihil ut ad voluptatem quasi sit aut debitis ut enim.
Voluptatem sint debitis.
Aliquid quia et omnis vel voluptatibus numquam sunt.
Qui in non quasi laboriosam nisi ex iste minima incidunt.
Neque id maxime dignissimos minus voluptatibus voluptatem.
Quae nihil saepe accusantium nam modi eum.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "af6973af-bc28-4ed6-8c9a-55d5dd9885f0")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv2()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Culpa beatae rerum hic quia nam qui soluta libero et.
Ut et repudiandae rem ipsa quis quaerat molestias laborum in.
Doloremque qui fugiat mollitia cupiditate.
Eligendi autem eos nulla.
Blanditiis est deleniti quidem minima voluptate dolores nisi veritatis omnis.
Beatae est cumque magni incidunt at id ea porro assumenda.
Modi quae dolore fugit laborum.
Eius doloribus exercitationem earum.
Qui laudantium qui.
Ea consequatur at perferendis enim sint culpa aut ipsam modi.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "056c3aa7-df3c-42e4-8315-2f015abd5bca")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv3()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Qui rerum quo quidem blanditiis consequuntur sit ratione unde et.
Neque autem ea consequuntur architecto deleniti.
Sit accusantium ut doloribus labore ducimus minus omnis nihil et.
Facilis rerum non saepe porro maxime enim voluptatem distinctio.
Recusandae ea ipsam deserunt natus perferendis.
Inventore et ratione odio aspernatur aut ullam velit expedita.
Impedit reprehenderit ut et nihil nobis.
Et corrupti laudantium enim architecto.
At et qui molestias dicta dolorum et.
Cum et necessitatibus quos ab aliquid.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "3e481517-b561-4980-a1a9-133e35bea712")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv4()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Perspiciatis fugiat harum optio inventore.
Error omnis possimus in molestias.
Sapiente est architecto omnis sunt maiores eaque exercitationem.
Ad id non in id aut aperiam.
Perferendis esse autem sit repellat ea et eum in perferendis.
Quis neque et non culpa.
Sapiente impedit animi aut voluptatem molestias aut inventore quo ut.
Quam sed quia voluptas.
Et quod neque dolores iure sapiente voluptas.
Quisquam repellat ut omnis consequatur ex.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "eec8f6fc-810a-42e2-86f2-8faf6d5ec183")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv5()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Tempore et tempore omnis.
Et architecto optio voluptates commodi.
Neque sunt nihil voluptate blanditiis.
Hic possimus ea quia assumenda ducimus excepturi repellat.
Dolor neque quia sed magnam ab.
Inventore iste autem ducimus unde accusantium.
Est quae aliquam.
Sed et labore repellat enim perspiciatis minima consequatur magnam.
Rerum et sit neque omnis sint aliquam repudiandae autem quis.
Modi soluta doloremque.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "ed8bd729-b3ab-41b4-8af9-7a8f10d3ddcb")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv6()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Et aut ratione et expedita harum minima sint cum.
Velit ratione dolor pariatur dolor quaerat.
Et corrupti quia et est veniam.
Aut voluptas vel tempore aut expedita saepe quia quia.
Eligendi sed dolores rerum.
Ea est iure molestias voluptas culpa est.
Et deserunt aut.
Quam consectetur vero numquam aut est vel vel.
Qui id harum sit et beatae itaque quae sequi.
Consequuntur omnis quia magni.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Domestic Reverse Charge - 20%");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "d09f01c3-d0b4-4537-b148-a5b09c1893e1")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv7()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Voluptatem aspernatur occaecati amet laboriosam voluptas maxime.
Assumenda voluptatibus voluptatum.
Ut sint nobis consequatur possimus architecto dolor sed alias possimus.
Voluptatem quas fugiat aperiam voluptates ut.
Quia numquam veritatis nostrum tenetur voluptates quia consectetur voluptatum ab.
Non eos eaque.
Ratione deserunt magni.
Iusto quis voluptatum molestiae deserunt similique.
Est aliquam soluta quas minus quo qui.
Vero voluptatem accusamus inventore sapiente est id error animi.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Domestic Reverse Charge - 5%");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "1c3f9807-390f-4f7c-97db-b69c262b5703")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positiv8()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("Labour");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Praesentium voluptatum saepe qui labore ea et et.
Repudiandae et facilis repellendus rem quisquam.
Ullam hic molestias ut voluptatem labore.
Beatae sit voluptas minima provident dolorem optio eum aut.
Optio magni sunt laborum nesciunt perferendis quia voluptatem dolorem qui.
Dolorem non voluptatum qui suscipit sint rem et inventore.
Velit modi soluta vel enim rem beatae quo.
Quod dicta consequatur assumenda dicta nisi harum fugiat.
Itaque sit nihil quos.
Voluptatibus repudiandae ut nostrum aut adipisci est modi quia.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "0d7a1e87-0b26-4bcb-940a-9f9c00e82b80")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positi()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("Material");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Dolore quis voluptates velit quibusdam necessitatibus ut et.
Dicta et minus ex dignissimos iure illo.
Soluta sit porro officiis et et autem cumque.
Ullam sit velit sint sunt occaecati voluptates veritatis occaecati et.
Eius aperiam magnam qui itaque sequi.
Consectetur dolore iste cupiditate ut dolorem.
Delectus necessitatibus praesentium debitis quia consequatur.
Quo eveniet officia ea quae aperiam repellat.
Dolorem exercitationem molestiae officia.
Corrupti est vitae voluptatem recusandae assumenda sint.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "8af6d3c6-9dbf-49d0-9866-170f843ec544")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positi1()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("2021-03-26 20:39:37");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Ut est veniam autem accusantium quia.
Ducimus amet adipisci iusto ut quas eos distinctio.
Saepe sed ea.
Nihil voluptatem animi.
Sed alias voluptatem consequatur eos.
Iste pariatur ut voluptatem omnis vel architecto libero consequatur officiis.
Autem aut minus voluptatem quisquam voluptatibus molestias.
Veniam eaque est aut consequuntur accusantium.
Quia delectus quia.
Aut qui nemo.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "87286b04-930a-43e7-88ea-5e51494a081a")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positi2()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("44349");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("2021-08-30 01:27:50");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Qui omnis et officia nulla sapiente modi fugit.
Omnis ab voluptatem accusamus neque deleniti sit.
Iure vero ut voluptates id eius labore laudantium rerum.
Dolores voluptatibus quasi.
Et et explicabo similique ipsum quod et in.
Illum sed culpa in aut.
Nemo aut eligendi consequatur asperiores et qui laboriosam qui pariatur.
Alias quia quia at est.
Praesentium accusamus voluptatibus quis.
Mollitia nemo ad rerum consequatur sed dicta quis sequi.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "9045ab1a-f9c4-4c53-afa5-6ce437b69a6a")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positi3()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("2020-10-10 03:41:55");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Provident sit corporis et aut.
Magnam et cupiditate.
Porro quo id et quis.
Sunt ea quia impedit asperiores est.
Non iure qui aut dolorum sint aliquam.
Eligendi est quod deserunt officiis.
Et nesciunt iure et consequatur omnis velit.
Rem ut dicta odio quasi asperiores delectus aperiam itaque enim.
Quibusdam explicabo esse et delectus et optio enim consequatur accusantium.
Repellat quia dolores sint.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

    @Test  (groups= {"Subcontractor_Bill","Subcontractor_Bill - SubContractor"})
    @TestModellerPath(guid = "50c32dfb-0933-486f-80f8-7ed6d0ccaad1")
    public void GoToUrlClickExpenditureMenu1ClickNewmenu2ClickNewSubcontractorBill3PositiveEnterBillNo4Positi4()
    {
        
        pages.Subcontractorbill _Subcontractorbill = new pages.Subcontractorbill(driver);
    TestModellerLogger.SetLastNodeGuid("608ca8eb-e970-4d52-b565-e8420b441a87");
    _Subcontractorbill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("55115740-7602-4a67-900b-764c76d8678f");
    _Subcontractorbill.Click_Expenditure_Menu1();
    

    TestModellerLogger.SetLastNodeGuid("f6c0429a-b8a1-4353-acf0-fd2ea13412c2");
    _Subcontractorbill.Click_New_menu2();
    

    TestModellerLogger.SetLastNodeGuid("319222a5-1f43-403b-a204-2d3d2b0d6642");
    _Subcontractorbill.Click_New_Subcontractor_Bill3();
    

    TestModellerLogger.SetLastNodeGuid("b77fcbb3-c81e-427d-8709-4ba6cb6cc9e9");
    _Subcontractorbill.Enter_BillNo4("");
    

    TestModellerLogger.SetLastNodeGuid("29f9850d-e497-4295-a45c-ab87208d8e49");
    _Subcontractorbill.Select_Supplier5("nidhi20");
    

    TestModellerLogger.SetLastNodeGuid("339cb1a8-d4c7-4d47-90f6-742374eafedc");
    _Subcontractorbill.Enter_tDate6("2021-08-02 14:34:22");
    

    TestModellerLogger.SetLastNodeGuid("607ee1d8-c5ac-4006-9f00-69cfe8e4b611");
    _Subcontractorbill.Enter_DueDate7("44349");
    

    TestModellerLogger.SetLastNodeGuid("396f06a2-cf27-4aec-b98f-9f8300ab8da0");
    _Subcontractorbill.Select_Expense_type8("");
    

    TestModellerLogger.SetLastNodeGuid("b3d55fc2-b14e-4816-8f93-54b4d1ae82dd");
    _Subcontractorbill.Enter_Description9("Minus sunt fuga rerum.
Sit repudiandae consectetur.
Sit nulla quaerat.
Expedita facere rem nihil beatae qui.
Repudiandae quam doloribus libero corrupti ea pariatur.
Ut debitis rerum voluptatem dolorem.
Ullam nulla facilis repellat cum voluptas quas ab.
Ducimus pariatur aut et consequatur qui cupiditate quas quam laudantium.
Sit ipsam aut tenetur in quisquam deleniti qui.
Qui ut optio et libero ea et dolorem.");
    

    TestModellerLogger.SetLastNodeGuid("f2cc0975-c3b8-4ff5-9de0-ac0d992dd0f6");
    _Subcontractorbill.Enter_NetTotal10("");
    

    TestModellerLogger.SetLastNodeGuid("8cee3f51-9f81-4b14-925b-46ee0945440f");
    _Subcontractorbill.Select_VATRate11("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c051d205-36ff-4b05-9a03-283746de51b4");
    _Subcontractorbill.Enter_VATRate12("");
    

    TestModellerLogger.SetLastNodeGuid("a9dd6b44-2f3f-4dec-8a25-4f28381b9429");
    _Subcontractorbill.Enter_VAT13("");
    

    TestModellerLogger.SetLastNodeGuid("bc291cdd-1ee3-439d-88af-64f6161524ae");
    _Subcontractorbill.Enter_SubTotal14("");
    

    TestModellerLogger.SetLastNodeGuid("1219502f-2fd0-43c4-9d37-9874ee4e313a");
    _Subcontractorbill.Enter_Notes15("");
    

    TestModellerLogger.SetLastNodeGuid("38654dce-5f3a-4de7-914c-d3a09009d113");
    _Subcontractorbill.Click_Save16();
    

    }

}*/