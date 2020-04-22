package school_java_activity2;

import java.util.*;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static String menuChoice = "";
	
	public static int inputInt(Scanner input, String varName)
	{
		boolean askForInput = true;
		int testVar = 0;
		
		while(askForInput)
		{
			try
			{
				
				System.out.print("\nEnter " + varName + ": ");
				testVar = Integer.parseInt(input.nextLine());
				askForInput = false;
				
			} catch (NumberFormatException e)
			{
				System.err.println("\nNot a valid integer. Please try again.");
			}
		}
			
		return testVar;
	}
	
	public static double inputDouble(Scanner input, String varName)
	{
		boolean askForInput = true;
		double testVar = 0;
		
		while(askForInput)
		{
			try
			{
				System.out.print("\nEnter " + varName + ": ");
				testVar = Double.parseDouble(input.nextLine());
				askForInput = false;
				
			} catch(NumberFormatException e)
			{
				System.err.println("\nNot a valid double. Please try again");
			}
		}
		
		return testVar;
	}
	
	public static void main(String args[]) 
	{
		HighestNumber hn = new HighestNumber();
		EmployeeOvertimePay eop = new EmployeeOvertimePay();
		GradeAndRemark gar = new GradeAndRemark();
		CourseEnrolleeRemark cor = new CourseEnrolleeRemark();
		EmployeeSeparationPay esp = new EmployeeSeparationPay();
		
		while(!menuChoice.equals("6"))
		{
			System.out.println("\n");
		}
	}
}
