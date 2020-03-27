package school_java_activity1;

public class InputVerify
{
	public static boolean parsableToDouble(String input)
	{
		boolean valid = true;
		double num = 0;
		try {
			num = Double.parseDouble(input);
		} catch(NumberFormatException e){
			valid =  false;
		}
		
		// redundant thing just to remove warning
		Double.toString(num);
		
		return valid;
	}
}
