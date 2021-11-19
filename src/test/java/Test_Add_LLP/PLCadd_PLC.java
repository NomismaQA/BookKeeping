package Test_Add_LLP;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c7bca122-6ee0-40af-9480-aab33a64ceb2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1885, profileId = 102471)
public class PLCadd_PLC extends TestBase
{
    

    
    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "184a894e-3d8a-4009-ad8f-8e12d27133ff")
    public void GoToUrlClickPLCClicked1ClickPLCManualclicked2PositiveEnterEnterComName3EnterEnterRegNo4Positiv()
    {
        
        pages.Add_PLC_BUS.PLCMANNUAL _PLCMANNUAL = new pages.Add_PLC_BUS.PLCMANNUAL(driver);
    TestModellerLogger.SetLastNodeGuid("03ee5231-8931-49d0-adb6-ea1b951816d8");
    _PLCMANNUAL.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    

    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
    

    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
    _PLCMANNUAL.Enter_Enter_Com_Name_3("accusantium");
    

    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
    _PLCMANNUAL.Enter_Enter_RegNo_4("");
    

    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5("2021-10-15 08:43:05");
    

    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
    _PLCMANNUAL.Enter_Enter_dir_FN_6("");
    

    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
    _PLCMANNUAL.Enter_Enter_dir_LN_7("");
    

    TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
    _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
    

    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
    _PLCMANNUAL.Click_Enter_Save_Click9();
    

    }

    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "509c201d-c8fe-46dc-9879-eef859d35754")
    public void GoToUrlClickPLCClicked1ClickPLCManualclicked2PositiveEnterEnterComName3EnterEnterRegNo4Positiv1()
    {
        
    	pages.Add_PLC_BUS.PLCMANNUAL _PLCMANNUAL = new pages.Add_PLC_BUS.PLCMANNUAL(driver);
    TestModellerLogger.SetLastNodeGuid("03ee5231-8931-49d0-adb6-ea1b951816d8");
    _PLCMANNUAL.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    

    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
    

    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
    _PLCMANNUAL.Enter_Enter_Com_Name_3("nesciunt");
    

    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
    _PLCMANNUAL.Enter_Enter_RegNo_4("");
    

    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5("2022-08-05 18:28:01");
    

    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
    _PLCMANNUAL.Enter_Enter_dir_FN_6("");
    

    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
    _PLCMANNUAL.Enter_Enter_dir_LN_7("");
    

    TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
    _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
    

    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
    _PLCMANNUAL.Click_Enter_Save_Click9();
    

    }

    @Test  (groups= {"PLC_add","PLC_add - PLC"})
    @TestModellerPath(guid = "46d32224-1f9e-40fd-b572-73a476aab546")
    public void GoToUrlClickPLCClicked1ClickPLCManualclicked2PositiveEnterEnterComName3EnterEnterRegNo4Positiv2()
    {
        
    	pages.Add_PLC_BUS.PLCMANNUAL _PLCMANNUAL = new pages.Add_PLC_BUS.PLCMANNUAL(driver);
    TestModellerLogger.SetLastNodeGuid("03ee5231-8931-49d0-adb6-ea1b951816d8");
    _PLCMANNUAL.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f88452fa-8c7b-4ddf-9e35-46ccf6953375");
    _PLCMANNUAL.Click_PLC_Clicked_1();
    

    TestModellerLogger.SetLastNodeGuid("c1010a60-4424-4578-a902-8cb179029e6f");
    _PLCMANNUAL.Click_PLC_Manual_clicked_2();
    

    TestModellerLogger.SetLastNodeGuid("4ac6351a-7b14-43f5-a14b-bbad316f28de");
    _PLCMANNUAL.Enter_Enter_Com_Name_3("nostrum");
    

    TestModellerLogger.SetLastNodeGuid("558e77b7-f50e-4a2b-9769-db6a776cac0b");
    _PLCMANNUAL.Enter_Enter_RegNo_4("");
    

    TestModellerLogger.SetLastNodeGuid("43cb8d73-0afa-49da-873e-af08d3c739b6");
    _PLCMANNUAL.Enter_Enter_Buss_RegDate_5("44518");
    

    TestModellerLogger.SetLastNodeGuid("92a938e2-0f51-4974-a0f3-75917d7803cc");
    _PLCMANNUAL.Enter_Enter_dir_FN_6("");
    

    TestModellerLogger.SetLastNodeGuid("fb46b261-4311-4c55-8193-5ec6acbe2223");
    _PLCMANNUAL.Enter_Enter_dir_LN_7("");
    

    TestModellerLogger.SetLastNodeGuid("6c0f24d2-657b-44bc-abb1-8b8fc92ffaff");
    _PLCMANNUAL.Click_Cr_Payroll__Profile_chkbox_8();
    

    TestModellerLogger.SetLastNodeGuid("84589d59-ef2d-4e9b-a7b7-6f93aac626ab");
    _PLCMANNUAL.Click_Enter_Save_Click9();
    

    }

}