package school_java_activity2;

import java.util.*;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static String menuChoice = "";
	
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
						hn.addValue(i, Double.parseDouble(sc.nextLine()));
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
					System.out.print("\nEnter amount of hours: ");
					eop.setHours(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter hour rate: ");
					eop.setHourRate(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter deductions: ");
					eop.setDeductions(Double.parseDouble(sc.nextLine()));
					
					System.out.println("\nNet Pay: " + eop.getNetPay());
					
					System.out.println("\nPress Enter to continue...");
					sc.nextLine();
					
				} catch(NumberFormatException e)
				{
					System.out.println("\nInvalid Input Detected. Returning to main menu...");
				}
				
				break;
				
			case "3":
				
				System.out.println("\nSelected Problem 3 - Grade and Remark");
				
				try 
				{
					System.out.print("\nEnter miderm exam score: ");
					gar.setMidtermExamScore(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter final exam score: ");
					gar.setFinalExamScore(Double.parseDouble(sc.nextLine()));
					
					System.out.println("\nFinal Grade: " + gar.getGrade());
					System.out.println("Remark: " + gar.getRemark());
					
					System.out.println("\nPress Enter to continue...");
					sc.nextLine();
					
				} catch (NumberFormatException e)
				{
					System.out.println("\nInvalid Input Detected. Returning to main menu...");
				}
				
				break;
				
			case "4":
				
				System.out.println("\nSelected Problem 4 - Course Enrollee number and Remark");
				
				try 
				{
					System.out.print("\nEnter Course title: ");
					cer.setCourseTitle(sc.nextLine());
					System.out.print("Enter number of enrollees: ");
					cer.setEnrolleeCount(Integer.parseInt(sc.nextLine()));
					
					System.out.println("\nEnrollee Count: " + cer.getEnrolleeCount());
					System.out.println("Remark: " + cer.getRemark());
					
					System.out.println("\nPress Enter to continue...");
					sc.nextLine();
					
				} catch (NumberFormatException e)
				{
					System.out.println("\nInvalid Input Detected. Returning to main menu...");
				}
				
				break;
				
			case "5":

				System.out.println("\nSelected Problem 5 - Employee Separation Pay");
				
				try 
				{
					System.out.print("\nEnter name: ");
					esp.setEmployeeName(sc.nextLine());
					System.out.print("Enter basic salary: ");
					esp.setBasicSalary(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter service time (in years): ");
					esp.setServiceTime(Double.parseDouble(sc.nextLine()));
					
					System.out.println("\nEmployee Name: " + esp.getEmployeeName());
					System.out.println("Basic Salary: " + esp.getBasicSalary());
					System.out.println("Service Time: " + esp.getServiceTime());
					System.out.println("Separation Pay: " + esp.getSeparationPay());
					
					System.out.println("\nPress Enter to continue...");
					sc.nextLine();
					
				} catch (NumberFormatException e)
				{
					System.out.println("\nInvalid Input Detected. Returning to main menu...");
				}
				
				break;
				
			case "6":
				
				System.out.println("\nGoodbye");
				
				break;
				
			default:
				
				System.out.println("\nInvalid Input. Press Enter to continue.");
				sc.nextLine();
				
				break;
			}
			
		}
	}
}
