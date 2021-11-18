package Ashiv_Demo_Pages;

public class java_Demo {

	
	public static void main(String[] args) 
	{

	
	String a="Transaction #23 inserted successfully.";
	String out[]=a.split("#");
	String o=out[1];
	String[] Out2=o.split(" ");
	String Out3=Out2[0];
	System.out.println(Out3);
	int i=Integer.parseInt(Out3); 
	
	
	
	System.out.println(i+1);
	

	}
	}
		
	
	
	
