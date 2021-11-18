package Ashiv_tests_Demo;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://ashiv.cloud.testinsights.io/app/#!/model-engine/guid/90723369-316d-4b21-8dab-7ee045106779
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 24, profileId = 100078)
public class LoginTest extends TestBase
{
    

    
    @Test  (groups= {"Login Test","Login Test - Default Profile"})
    @TestModellerPath(guid = "b0b6821f-fa08-421e-9b47-44e8a2ab8ed1")
    public void GoToUrlAssertUrlPositiveEnterUserNamePositiveEnterpasswordClickLogin() throws HeadlessException, IOException, AWTException, InterruptedException
    {
        
    	Ashiv_Demo_Pages.LoginSendbox4 _LoginSendbox4 = new Ashiv_Demo_Pages.LoginSendbox4(getDriver());
    TestModellerLogger.SetLastNodeGuid("7bc6bb50-88fb-4dc4-94b5-e59a56afb567");
    _LoginSendbox4.GoToUrl();

	/*
	 * TestModellerLogger.SetLastNodeGuid("d1d78c15-36d0-426e-a233-5e790ee7202c");
	 * _LoginSendbox4.AssertUrl();
	 */

    TestModellerLogger.SetLastNodeGuid("7e962a40-57c9-4766-a91a-80c9baa029db");
    _LoginSendbox4.Enter_User_Name("admin");

    TestModellerLogger.SetLastNodeGuid("7eaa7bba-c59c-42bc-9167-3a54e7476154");
    _LoginSendbox4.Enter_password("admin1@1");

    TestModellerLogger.SetLastNodeGuid("567cb5e6-67d1-4bb3-9253-a6317b5e4aa3");
 
    _LoginSendbox4.Click_Log_in();

    }


}