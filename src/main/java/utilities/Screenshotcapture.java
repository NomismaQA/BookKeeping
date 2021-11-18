package utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import pages.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshotcapture extends BasePage 
{

	//private static final int OutputType = 0;
	public Screenshotcapture(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String path;
	 public static void captureAsImage(WebDriver driver,String screenShotName) throws IOException, HeadlessException, AWTException
	    {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        
    String dest =System.getProperty("user.dir")+ "\\report"+"\\As_Screenshot\\"+screenShotName+".png";
    
	       //File destination = new File(dest);
    File destination = new File(dest);
    
     FileUtils.copyFile(source, destination);
     

	     // return "ErrorScreenshots/"+screenShotName+".png";

	    }
	        
	    

//	    public static String captureAsBase64(WebDriver driver)
//	    {
//	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//	    }
//
//	    public static byte[] captureAsByteArray(WebDriver driver)
//	    {
//	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	    }

public static void Getscreenshot(String Filename,String Foldername)
{
	String path="";
	try 
	{
		String loc=System.getProperty("user.dir");
		path=loc+"\\As_Screenshot\\"+Foldername+"\\"+Filename+".png";
		EventFiringWebDriver ewf=new EventFiringWebDriver(m_Driver);
		File src=ewf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		
	} 
	catch (Exception e) 
	{

     System.out.println("Issue in Getscreenshot");
	}
}

public static void FullScreenshot(String Filename,String Foldername)
{
	String path="";
	try 
	{
		String loc=System.getProperty("user.dir");
		path=loc+"\\As_Screenshot\\"+Foldername+"\\"+Filename+".png";
		Screenshot sc	  =new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(m_Driver);
		ImageIO.write(sc.getImage(), "PNG", new File(path));
		
	} 
	catch (Exception e) 
	{
		System.out.println("Issur In Full Screenshot"+e);
	}
}

}
