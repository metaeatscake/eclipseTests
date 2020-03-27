package school_java_activity1;

public class Menu 
{
	private String mainMenuChoice;
	
	public Menu() 
	{
		this.mainMenuChoice = "";
	}
	
	public void setMenuChoice(String mainMenuChoice)
	{
		this.mainMenuChoice = mainMenuChoice;
	}
	
	public String getMenuChoice()
	{
		return this.mainMenuChoice;
	}
	
	public static void mainMenu()
	{
		System.out.println("\n\n=====Activity 1 Menu=====");
		System.out.println("[1] Quiz Average Calculator");
		System.out.println("[2] Midterm Grade Calculator");
		System.out.println("[3] Compare Three Values");
		System.out.println("[4] Employee Net Pay Calculator");
		System.out.println("[5] Money Denomination Program");
		System.out.println("[6] Exit");
		System.out.print("\nEnter Choice: ");
	}
	
	public static void printPause()
	{
		System.out.println("\n======================");
		System.out.println("Press Enter to continue");
		System.out.println("=======================\n");
	}
	
	public static void printInvalidwithPause()
	{
		System.out.println("\n======================");
		System.out.println("INVALID INPUT");
		System.out.println("Press Enter to continue");
		System.out.println("=======================\n");
	}
	
	public static void printInvalidStop()
	{
		System.out.println("\nInvalid Input Detected. Process stopped.\n");
	}
}
