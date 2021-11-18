package utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class UploadFile extends BasePage
{

	public UploadFile(WebDriver driver) {
		super(driver);
		// 
	}
public static void UploadFile1(String path)
{
	try 
	{
		StringSelection sel =new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	catch (Exception e) {
		System.err.println("Issue In uploadfile"+e);
	}
}
	
}
