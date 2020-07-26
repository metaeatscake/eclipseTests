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
				System.err.println("\nNot a valid double number. Please try again");
			}
		}
		
		return testVar;
	}
	
	public static void mainMenu()
	{
		String[] menuNames = new String[] 
				{
						"Highest Number among 3 values",
						"Employee Net Pay",
						"Grade and Remark",
						"Course Enrollee number and Remark",
						"Employee Separation Pay",
						"Exit"
				};
		
		System.out.println("\n\n=====Activity 2 Menu=====");
		
		for(int i = 0; i < menuNames.length; i++)
		{
			System.out.println("[" + (i+1) + "] " + menuNames[i]);
		}
		
		System.out.print("\nEnter Choice: ");
	}
	
	public static void main(String args[]) 
	{
		HighestNumber hn = new HighestNumber();
		EmployeeOvertimePay eop = new EmployeeOvertimePay();
		GradeAndRemark gar = new GradeAndRemark();
		CourseEnrolleeRemark cer = new CourseEnrolleeRemark();
		EmployeeSeparationPay esp = new EmployeeSeparationPay();
		
		while(!menuChoice.equals("6"))
		{
			
			mainMenu();
			menuChoice = sc.nextLine();
			
			switch(menuChoice)
			{
			case "1":
				
				System.out.println("\nSelected Problem 1 - Highest number among 3 numbers");
				hn.clearValues();
				
				try 
				{
					for(int i = 0; i < hn.getArraySize(); i++)
					{
						System.out.print("\nEnter a value for num [" + (i+1) + "]: ");
						hn.addValue(i, Integer.parseInt(sc.nextLine()));
					}
					
					System.out.println("\nHighest Value: " + hn.getHighest());
					System.out.println("\nPress Enter to continue...");
					sc.nextLine();
					
				} catch(NumberFormatException e)
				{
					System.out.println("\nInvalid Input Detected. Returning to main menu...");
				}
				
				break;
				
			case "2":
				
				System.out.println("\nSelected Problem 2 - Employee Net Pay");
				
				try 
				{
					
				} catch(NumberFormatException e)
				{
					
				}
				
				break;
				
			case "3":
				
				break;
				
			case "4":
				
				break;
				
			case "5":
				
				break;
				
			case "6":
				
				break;
				
			default:
				
				System.out.println("\nInvalid Input. Press Enter to continue.");
				sc.nextLine();
				
				break;
			}
			
		}
	}
}
