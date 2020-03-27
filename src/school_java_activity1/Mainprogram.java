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
		NumberDenomination nd = new NumberDenomination();
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
				}
				else
				{
					Menu.printInvalidStop();
				}
				
				Menu.printPause();
				sc.nextLine();
				
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
					Menu.printInvalidStop();
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
					Menu.printInvalidStop();
					break;
				}
				
				System.out.println("\nMidterm Grade: " + mg.getMidtermGrade());
				Menu.printPause();
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
				Menu.printInvalidwithPause();
				sc.nextLine();
			}
		}
		
	}

}
