package utilities;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class VATVerification extends BasePage
{
	
	int finVat=0;
	int finalprice=0;
	public VATVerification(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public int VatVerify(String actVat, String price, String Quan)
	{
		try 
		{
			//System.out.println("HI");
			int Tprice=Integer.parseInt(price)*Integer.parseInt(Quan);
			
			System.out.println(Tprice);
			System.out.println(actVat);
			if(actVat.equalsIgnoreCase("Standard Rate"))
	 		{
				System.out.println("HI");
		 			finVat=(Tprice*20)/100;
		 			System.out.println(finVat);
			 		
		 		}
			else if(actVat.equalsIgnoreCase("Reduced Rate"))
		 		{
		 			finVat=(Tprice*5)/100;
		 			System.out.println(finVat);
		 		}
			else
			{
				finVat=0;
			}
		 		finalprice=Tprice+finVat;
			
		} catch (Exception e) 
		{
			System.out.println("Issue in Vatverify method"+e);
		}
		return finalprice;
		
	 		
	}
}

