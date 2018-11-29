/*
 * This program calculates a paycheck amount.z
 * Nico Busatto 11/27/2018
 */

import java.text.*;
import java.util.*;

public class Payroll {
	
	//declare variables
	
	static String iString; //generic input string
	static String iFirstName, iLastName; //First and Last name
	static int iHours; //Hours after conversion
	static double iRate; //Rate after conversion
	static double cPay; //Calculated Pay
	static String oPay; //Pay after formatting
	static Scanner myScanner; //Input device
	static NumberFormat nf; //Used to format currency
	
	public static void main(String[] args) {
		
		//Call Init()
		init();
		
		//Call Input()
		input();
		
		//Call Calcs()
		calcs();
		
		//Call Output
		output();
		
		System.out.println("Program ending, have a good one!");
	}

    public static void init() {
	   //Prompt for First Name
	   myScanner = new Scanner (System.in);
	   //Change delimiter from blank space to Enter Key 
	   // to allow spaces in string
	   myScanner.useDelimiter(System.getProperty("line.separator"));
	   //Set formatter to use U.S. currency format
	   nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
   }
   
    public static void input() {
	   //Prompt for First name
	   System.out.print("Enter your First Name: ");
	   iFirstName = myScanner.next();
	   
	   //Prompt for Last name
	   System.out.print("Enter your Last Name: ");
	   iLastName = myScanner.next();
	   
	   //Prompt, input and convert rate
	   System.out.print("Enter your hours: ");
	   iString = myScanner.next();
	   iHours = Integer.parseInt(iString);
	   
	   //Prompt, input and convert rate
	   System.out.print("Enter rate: ");
	   iString = myScanner.next();
	   iRate = Double.parseDouble(iString);

   }
   
    public static void calcs() {
	   //Calculate pay
	   cPay = iHours * iRate;
   }
   
    public static void output() {
	   //Display name as Last, First
	   System.out.println("Name: " + iLastName + ", " + iFirstName);
	   //Format and Output pay
	   oPay = nf.format(cPay);
	   System.out.println("Pay is: " + oPay);
	   
   }

}   