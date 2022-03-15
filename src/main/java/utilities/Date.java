package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class Date extends BasePage
{
	
	
	

	public Date(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String gernateRandom() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		// System.out.println(dtf.format(now));

		String r = dtf.format(now);
		String t= r.replace("/", "");
		t=t.replace(" ", "");
		t=t.replace(":", "");
		return t;
		}
		

}
