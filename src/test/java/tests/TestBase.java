package tests;

import utilities.CapabilityLoader;
import utilities.PropertiesLoader;
import utilities.Screenshotcapture;
import utilities.reports.ExtentReportManager;
import ie.curiositysoftware.allocation.dto.AllocationType;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import ie.curiositysoftware.allocation.engine.DataAllocationEngine;
import ie.curiositysoftware.jobengine.services.ConnectionProfile;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mongodb.MapReduceCommand.OutputType;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

public class TestBase {
    /********** Replace with your own details ***********/
    protected WebDriver driver;

    protected ConnectionProfile cp = new ConnectionProfile(PropertiesLoader.getProperties().getProperty("testModeller.apiHost"), PropertiesLoader.getProperties().getProperty("testModeller.apiKey"));

    protected DataAllocationEngine dataAllocationEngine = new DataAllocationEngine(cp);

    public WebDriver getDriver()
    {
        return driver;
        
    }

    @BeforeSuite(alwaysRun = true)
    public void setupReporter()
    {
        ExtentReportManager.setupReporter();
        
    }

    @BeforeSuite(alwaysRun = true)
    public void allocateData(ITestContext testContext)
    {
        // Create a list of all the pools that need allocating
        List<AllocationType> allocationTypes = new ArrayList<AllocationType>();

        ITestNGMethod[] methods =  testContext.getAllTestMethods();
        try {

            for (int i = 0; i < methods.length; i++) {
                ITestNGMethod method = methods[i];

                Method testMethod = method.getConstructorOrMethod().getMethod();

                if (testMethod != null && testMethod.isAnnotationPresent(DataAllocation.class))
                {
                    DataAllocation dataAllocation = testMethod.getAnnotation(DataAllocation.class);

                    for (String testType : dataAllocation.groups()) {
                        AllocationType allocationType = new AllocationType(dataAllocation.poolName(), dataAllocation.suiteName(), testType);

                        allocationTypes.add(allocationType);
                    }
                }
            }
        } catch (Throwable e) {
            System.err.println(e);
        }

        // Publish and allocate data
        if (!dataAllocationEngine.resolvePools(PropertiesLoader.getProperties().getProperty("testModeller.serverName"), allocationTypes)) {
            System.out.println("Error - " + dataAllocationEngine.getErrorMessage());
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void initDriver(Method method)
    {
        ExtentReportManager.createNewTest(method);

        driver = CapabilityLoader.createWebDriver();
    }

   @AfterMethod(alwaysRun = true)
   public void tearDown(ITestResult result)
   {
    
	   // Here will compare if test is failing then only it will enter into if condition
	   if(ITestResult.FAILURE==result.getStatus())
	   {
		   try 
		   {
			   // Create refernce of TakesScreenshot
			   TakesScreenshot ts=(TakesScreenshot)driver;

			   // Call method to capture screenshot
			   File source=ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		   // String dest =System.getProperty("user.dir")+ "\\report"  +"\\Saving\\"+screenShotName+".png";
			    //FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
	  // Screenshotcapture.captureAsImage(driver, null);
			   String dest =System.getProperty("user.dir")+ "\\report"  +"\\Saving\\"+result.getName()+".png";
			    
		      
	    File destination = new File(dest);
	     FileUtils.copyFile(source, destination);
	     
			   System.out.println("Screenshot taken");
		   }
   
		   catch (Exception e)
		   {
			   System.out.println("Exception while taking screenshot "+e.getMessage());
		   } 
	   }
	   driver.quit();
   }
   
//    public void closerDriver()
//    {
//	   
//    	 driver.quit();
//    }

    @AfterSuite
    public void closeReporter()
    {
        ExtentReportManager.closeReporter();
    }
}
