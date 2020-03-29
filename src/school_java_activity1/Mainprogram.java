package school_java_activity1;

import java.util.Scanner;

public class Mainprogram 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		SimpleQuizAverage sqa = new SimpleQuizAverage();
		MidtermGrade mg = new MidtermGrade();
		ThreeValues tv = new ThreeValues();
		EmployeeNetPay enp = new EmployeeNetPay();
		Menu m = new Menu();
		InputVerify iv = new InputVerify();
		
		while(!m.getMenuChoice().equals("6"))
		{
			Menu.mainMenu();
			m.setMenuChoice(sc.nextLine());
			
			switch(m.getMenuChoice())
			{
			case "1":
				
				System.out.println("\n\n");
				
				for(int i = 0; i < sqa.getScoreArrayLength(); i++)
				{
					System.out.print("Enter value for Quiz[" + (i+1) + "]: ");
					iv.setTemp(sc.nextLine());
					if(InputVerify.parsableToDouble(iv.getTemp()))
					{
						sqa.setScore(i, Double.parseDouble(iv.getTemp()));
					}
					else 
					{
						break;
					}
				}
				
				if(InputVerify.parsableToDouble(iv.getTemp())) 
				{
					System.out.println("\nAverage: " + sqa.getAverage());
					Menu.printPause();
					sc.nextLine();
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
				}
				
				break;
				
			case "2":
				
				System.out.println("\n\n");
				
				System.out.print("Enter Minor A Score: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					mg.setMinorAScore(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.print("Enter Midterm Exam Score: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					mg.setMidtermScore(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.println("\nMidterm Grade: " + mg.getMidtermGrade());
				Menu.printPause();
				sc.nextLine();
				break;
				
			case "3":
				
				System.out.println("\n\n");
				
				System.out.print("Enter value for num 1: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					tv.setNum1(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.print("Enter value for num 2: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					tv.setNum2(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.print("Enter value for num 3: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					tv.setNum3(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.println("\nDifference of " + tv.getNum1() + " and " + tv.getNum2() + ": " + ThreeValues.getDifference(tv.getNum1(), tv.getNum2()));
				System.out.println("Squared Sum of " + tv.getNum2() + " and " + tv.getNum3() + ": " + ThreeValues.getSquareSum(tv.getNum2(), tv.getNum3()));
				System.out.println("Average of all values: " + ThreeValues.getAverage(tv.getNum1(), tv.getNum2(), tv.getNum3()));
				Menu.printPause();
				sc.nextLine();
				break;
				
			case "4":
				
				System.out.println("\n\n");
				
				System.out.print("Enter employee name: ");
				enp.setEmployeeName(sc.nextLine());
				
				System.out.print("Enter number of hours worked: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					enp.setHoursWorked(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.print("Enter rate per hour: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					enp.setHourRate(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.print("Enter deductions: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToDouble(iv.getTemp()))
				{
					enp.setDeductions(Double.parseDouble(iv.getTemp()));
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				
				System.out.println("\nEmployee Name: " + enp.getEmployeeName());
				System.out.println("Net Pay: " + enp.getNetPay());
				Menu.printPause();
				sc.nextLine();
				break;
				
			case "5":
				
				System.out.println("\n\n");
				
				System.out.print("Enter money: ");
				iv.setTemp(sc.nextLine());
				if(InputVerify.parsableToInt(iv.getTemp()))
				{
					NumberDenomination.printDenominationArray(Integer.parseInt(iv.getTemp()));
					Menu.printPause();
					sc.nextLine();
				}
				else
				{
					Menu.printInvalidwithPause();
					sc.nextLine();
					break;
				}
				break;
				
			case "6":
				System.out.println("\n\nGoodbye!");
				break;
				
			default:
				Menu.printInvalidwithPause();
				sc.nextLine();
			}
		}
		
	}

}
