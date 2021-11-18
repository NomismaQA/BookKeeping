package tests;

import reports.TestNGListener;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/01f01b25-2697-40d3-b786-40015d3c3769
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1092, profileId = 100992)
public class BankNewTransaction_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Reconciled_Transactions","Reconciled_Transactions - Default Profile"})
    @TestModellerPath(guid = "b164e6a8-ce41-451b-a061-5f2cde5ac7e1")
    public void GoToUrlAssertUrlClickBankingTABClickNewTABClickNewTransactionPositiveSelectBankNamePositiveEn() throws InterruptedException
    {
        
        pages.BankNewTransaction _ReconcilationTransaction = new pages.BankNewTransaction(driver);
    TestModellerLogger.SetLastNodeGuid("749d812e-6ce5-40e7-a772-65e7fb0254fd");
    _ReconcilationTransaction.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90aa0df5-01d7-437b-aa15-b1e333d31a77");
    _ReconcilationTransaction.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00b70107-cc4a-4697-a71f-dbb0d1c0ef03");
    _ReconcilationTransaction.Click_BankingTAB();
    

    TestModellerLogger.SetLastNodeGuid("94a4fa93-d2d5-4ff6-837c-ef202411eca4");
    _ReconcilationTransaction.Click_NewTAB();
    

    TestModellerLogger.SetLastNodeGuid("d0e7d4a2-32cb-48b0-b4da-56a9fea2e49b");
    _ReconcilationTransaction.Click_NewTransaction();
    

    TestModellerLogger.SetLastNodeGuid("555c6b39-680f-4865-8d40-608a332942d5");
    _ReconcilationTransaction.Select_BankName("James");
    

    TestModellerLogger.SetLastNodeGuid("ce3257a1-b75f-4eb6-b402-ae8fae76edeb");
   _ReconcilationTransaction.Enter_Date("44248");
    

    TestModellerLogger.SetLastNodeGuid("7944d2f0-3c7c-4e24-9587-0042391db73f");
    _ReconcilationTransaction.Enter_Description("as");
    

    TestModellerLogger.SetLastNodeGuid("8eaf3156-c404-4861-b137-cd99ca75a203");
    _ReconcilationTransaction.Enter_ReceivedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("ef855a7e-0884-43f7-bf3f-38745eaac39d");
    _ReconcilationTransaction.Enter_SpentAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("7a8babab-b1f5-4e2d-bbe5-6034eeffc428");
    _ReconcilationTransaction.Select_VATRateType("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c9f25a3d-bb87-4aef-bca1-41d264f6b770");
    _ReconcilationTransaction.Enter_VATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("59ffb8ed-2011-45c5-a461-586d33787838");
    _ReconcilationTransaction.Click_AllocateTo();
    

    TestModellerLogger.SetLastNodeGuid("e1e045f4-55c1-41b2-900d-fd565680b006");
    _ReconcilationTransaction.Enter_AllocateTo1Inside(null);
    

    TestModellerLogger.SetLastNodeGuid("90fe1e3b-a5c7-4859-9f3c-68f1c0d3cec9");
    _ReconcilationTransaction.Click_SaveButton();
    

    }

}
