package utilities;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import pages.BasePage;

public class PassScreenshot extends BasePage
{
	public PassScreenshot(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void Getscreenshot11(String Filename,String Foldername) 
	{
		
	
		String path="";
		try
		{
		String loc=System.getProperty("user.dir");
	    path=loc+"\\SHOT\\"+Foldername+"\\"+Filename+".png";
		EventFiringWebDriver ewf=new EventFiringWebDriver(m_Driver);
		File src=ewf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));

		}
		catch (Exception e)
		{



		System.out.println("Issue in Getshot"+e);
		}
		}
	public String Dateformattt(StringBuilder dateString, String formatString) 
	{
        String separator = "";
        String slashSeperator = "/";
        if (formatString.contains(slashSeperator)) {
            separator = slashSeperator;
        } else {
            String dotSeparator = ".";
            if (formatString.contains(dotSeparator)) {
                separator = dotSeparator;
            }
        }

    if (dateString.length() == 8) {
        dateString.insert(2, separator);
        dateString.insert(5, separator);
    } else {
        return "False Date Entered";
    }

    return dateString.toString();
}
	
	
	
	
	}
	
	
	
	
	
	
	
     
