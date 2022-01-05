package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiedReader {
	
	public static String getvalue(String key) {
	//	File file = new File("C:\\Users\\Administrator\\Desktop\\java sel\\TestModeller-JavaSeleniumFramework-master\\Framework\\src\\test\\resources\\project.properties");
		File file = new File("D:\\Old Datea\\Framework_Sandeep\\src\\test\\resources\\project.properties"); 
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str = prop.getProperty(key);
		return str;
	
		
		
	}

	public static void main(String[] args) {
		
		 System.out.println(PropertiedReader.getvalue("selenium.browserType"));
		
			int[] myArray;
			myArray= new int[10];
			//Array ref= new Array();
			int[] a = new int[4];
			
			//a.length;
			int len=myArray.length;
			Arrays.sort(myArray);
			

	}

}
