package Test_Income;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/254df83a-a072-4e67-b2f8-cc48fcb63e83
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1876, profileId = 102447)
public class Testupload_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Test_upload","Test_upload - Default Profile"})
    @TestModellerPath(guid = "a9e743e0-a530-4758-8548-d3506e38450a")
    public void ClickUploadBtn1ClickCSVSample2EnterEnterFileUpload3ClickUploadBtn4PositiveSelectStartDate5Posi() throws InterruptedException
    {
        
        Pages_Income.Repeat_Invoice_Upload _Repeat_Invoice_Upload = new Pages_Income.Repeat_Invoice_Upload(driver);
    TestModellerLogger.SetLastNodeGuid("ce914b44-0ca0-4a1e-8909-a36aeeb2c69c");
    _Repeat_Invoice_Upload.Click_UploadBtn_1();
    

    TestModellerLogger.SetLastNodeGuid("54cad36e-62e1-48ba-a1f8-a87cd1b25bb8");
    _Repeat_Invoice_Upload.Click_CSV_Sample_2();
    

    TestModellerLogger.SetLastNodeGuid("ac84b8a2-9521-4bbc-920b-0bd2c07cc094");
    _Repeat_Invoice_Upload.Enter_EnterFileUpload_3("asas");
    

    TestModellerLogger.SetLastNodeGuid("c4f66ca1-fc60-4856-a755-1a243fd6a62d");
    _Repeat_Invoice_Upload.Click_UploadBtn_4();
    

    TestModellerLogger.SetLastNodeGuid("09067b0c-89b4-4f38-a3ed-375c1f9dcae2");
    _Repeat_Invoice_Upload.Select_StartDate_5("Start Date");
    

    TestModellerLogger.SetLastNodeGuid("ef12a424-d8bc-4ee4-9862-af5a0c937eb9");
    _Repeat_Invoice_Upload.Select_Customer_6("Customer");
    

    TestModellerLogger.SetLastNodeGuid("0d50c9fa-9739-4a68-8873-4b4576033d83");
    _Repeat_Invoice_Upload.Select_Income_Type_7("Income Type");
    

    TestModellerLogger.SetLastNodeGuid("29ad6f0c-e57d-4d43-ba5b-8a4031d88433");
    _Repeat_Invoice_Upload.Select_Dis_8("Description");
    

    TestModellerLogger.SetLastNodeGuid("6dc21ef9-4eaf-43ae-83fc-82c9e4166b7f");
    _Repeat_Invoice_Upload.Select_Amount_9("Amount");
    

    TestModellerLogger.SetLastNodeGuid("66380919-1005-4640-9173-f100d149ebff");
    _Repeat_Invoice_Upload.Select_Vat_10("VAT");
    

    TestModellerLogger.SetLastNodeGuid("7f0b6012-d790-41c8-97b6-8266eaf4dfac");
    _Repeat_Invoice_Upload.Select_Vat_Rate_Type_11("VAT Rate Type");
    

    TestModellerLogger.SetLastNodeGuid("2f6245d9-4b13-4bd1-a78a-b2021fdb1bed");
    _Repeat_Invoice_Upload.Select_Frequency_12("Frequency");
    

    TestModellerLogger.SetLastNodeGuid("7e670a6e-3533-48bb-a806-07ed0bd67261");
    _Repeat_Invoice_Upload.Select_Total_Occurence_13("Total Occurences");
    

    TestModellerLogger.SetLastNodeGuid("9238fec8-30b8-46e6-9d19-b04043713e44");
    _Repeat_Invoice_Upload.Click_Submit_14();
    

    TestModellerLogger.SetLastNodeGuid("3a2fafe9-44bc-4066-a3b4-30f0683ea3ad");
    _Repeat_Invoice_Upload.Select_Select_Customer_15("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("ff0173f3-1e66-439e-be29-4e084b588ff9");
    _Repeat_Invoice_Upload.Select_Select_Income_Type_16("Sale");
    

    TestModellerLogger.SetLastNodeGuid("a94e1313-b19e-499c-a270-22741a537a64");
    _Repeat_Invoice_Upload.Select_Select_Customer_17("Default Customer");
    

    TestModellerLogger.SetLastNodeGuid("e436cb6d-cb59-4527-a790-1150447008af");
    _Repeat_Invoice_Upload.Select_Select_Income_Type_18("Sale");
    

    TestModellerLogger.SetLastNodeGuid("6cccb26d-bab4-412c-a331-71dd9bf7e2bf");
    _Repeat_Invoice_Upload.Click_Import_19();
    

    }

}