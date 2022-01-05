package Generic;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Practice {

	

	
	
	public static void main(String[] args) {
		String vvv="1330 - Listed investments - UK";
		String[] xxx = vvv.split("-", 2);
		//for (String string : xxx) {
			System.out.println(xxx[1].replaceFirst(" ", ""));
		//}
		/*String vvv="1321 - Default director - Director Capital Distribution";
		String[] ledgersplit = vvv.split("-", 2);
		for (String string : ledgersplit) {
			System.out.println(string);
		}
    	String expectedledger = ledgersplit[1].trim();
     	String expectedledger1 = expectedledger.replace("Default director -", "");
     	System.out.println(expectedledger1);*/
		
		
		
		
	}
	
}
