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

//https://ashiv.cloud.testinsights.io/app/#!/model-engine/guid/3f2087d4-c272-4bc6-ba05-520d7679db13
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 32, profileId = 100093)
public class CreateSelectAgentTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CreateSelectAgentTest","CreateSelectAgentTest - Default Profile"})
    @TestModellerPath(guid = "cbbc16b1-a3d9-4664-92ef-3fa808c72d6e")
    public void GoToUrlClickAddAgentPositiveEnterAgentNameClickActiveClickSaveAgentPositiveEnterSearchAgentNam() throws InterruptedException, HeadlessException, IOException, AWTException
    {
        
           Ashiv_Demo_Pages.CreateSelectAgent _CreateSelectAgent = new Ashiv_Demo_Pages.CreateSelectAgent(getDriver());
    TestModellerLogger.SetLastNodeGuid("a49a5963-b06e-4c93-a65e-f4d6e087124c");
    _CreateSelectAgent.GoToUrl();
    
    TestModellerLogger.SetLastNodeGuid("7e962a40-57c9-4766-a91a-80c9baa029db");
    _CreateSelectAgent.Enter_User_Name("admin");

    TestModellerLogger.SetLastNodeGuid("7eaa7bba-c59c-42bc-9167-3a54e7476154");
    _CreateSelectAgent.Enter_password("admin1@1");

    TestModellerLogger.SetLastNodeGuid("567cb5e6-67d1-4bb3-9253-a6317b5e4aa3");
 
    _CreateSelectAgent.Click_Log_in();


//    TestModellerLogger.SetLastNodeGuid("346f825b-ae5e-4d5f-bc83-d7a6da6cffd8");
 //   _CreateSelectAgent.Click__Add_Agent_();

   // TestModellerLogger.SetLastNodeGuid("5d5e7bad-a754-492c-aeaa-ee1dff2d14c9");
  //  _CreateSelectAgent.Enter_Agent_Name("Ashiv_Demo1");

  //  TestModellerLogger.SetLastNodeGuid("780b55e3-c6a3-4019-a37c-8af84e00d9ce");
 //   _CreateSelectAgent.Click_Active();

 //   TestModellerLogger.SetLastNodeGuid("c18ce21c-1422-4cb1-b882-c9305aed556f");
 //   _CreateSelectAgent.Click_Save_Agent();

    TestModellerLogger.SetLastNodeGuid("e0617623-f511-4cd8-a5e0-c51d7912ac08");
    _CreateSelectAgent.Enter_SearchAgentName("Ashiv_Demo1");

    TestModellerLogger.SetLastNodeGuid("47d5d4c2-b5fa-4808-8a20-3e645d5cdcd6");
    _CreateSelectAgent.Click_Search();

    TestModellerLogger.SetLastNodeGuid("83e07cda-55f8-488c-9ec4-055bfdd016e5");
    _CreateSelectAgent.Click_Select_Agent();

    }


}