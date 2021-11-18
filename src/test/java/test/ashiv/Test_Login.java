package test.ashiv;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class Test_Login extends TestBase

{

	String sTestCaseID=null;
	String[] data=null;
	String Sheet =null;






//	
	  @Test (groups= {"Rule1","Rule1 - rule1"})
	  
	  @TestModellerPath(guid = "d4b18723-b1dd-48ba-a67c-35968eb4301f") 
	 
	  public void Login() throws Exception {
	  sTestCaseID="TC5"; 
	  Sheet="BankingBank"; 
	  data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
	  
	
	  pages.banking.ashiv.nlogin _nlogin = new pages.banking.ashiv.nlogin(driver);
	  TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
	  _nlogin.GoToUrl();
	  
	  TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
	  // _nlogin.AssertUrl();
	  
	  
	  TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
	  _nlogin.Enter_nLOGIN(data[1]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
	  _nlogin.Enter_nPASS(data[2]);
	  
	  
	  TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
	  _nlogin.Click_Login();
	  
	
	  }
	
	
	
}
