package Supplier_STNDToFRS;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8002979a-59f9-40b4-8131-203e38631b3e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1122, profileId = 101017)
public class VerifySupplierAddRecordSTOFRS_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	
	

    
    @Test  (groups= {"VerifySupplierAddRecordSTOFRS","VerifySupplierAddRecordSTOFRS - Default Profile"})
    @TestModellerPath(guid = "62ebd26f-5381-485f-a8bb-0d699b74e027")
    public void GoToUrlAssertUrlClickExpenditureTABClickRecordClickClickRecordClose() throws HeadlessException, InterruptedException, IOException, AWTException, InvalidFormatException
    {
    	sTestCaseID="TC151";
    	Sheet="Sale_NewInvoice";
    	data = ExcelUtility.toReadExcelData(sTestCaseID, Sheet);
    	
        Supplier_pages.VerifySupplierAddRecordSTOFRS _VerifySupplierAddRecordSTOFRS = new Supplier_pages.VerifySupplierAddRecordSTOFRS(driver);
    TestModellerLogger.SetLastNodeGuid("af7d803f-b885-4416-aa75-930e7f6b5620");
    _VerifySupplierAddRecordSTOFRS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4abc6dd0-1ee6-4047-943b-57c5c89a7093");
    _VerifySupplierAddRecordSTOFRS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8e347a6-807b-4b92-bf50-beed4049117e");
    _VerifySupplierAddRecordSTOFRS.Click_ExpenditureTAB();
    

    TestModellerLogger.SetLastNodeGuid("e810b22f-f16b-4cb5-a09e-ad275c75894e");
    _VerifySupplierAddRecordSTOFRS.Click_RecordClick();
    

    TestModellerLogger.SetLastNodeGuid("1c1a3e30-de4c-437a-a9c9-caf12eb6dcd5");
    _VerifySupplierAddRecordSTOFRS.Click_RecordClose();
    

    }

}
