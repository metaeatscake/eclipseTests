package school_java_activity1;

public class InputVerify
{
	private String tempInput;
	
	public void setTemp(String tempInput) {this.tempInput = tempInput;}
	public String getTemp() {return this.tempInput;}
	
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
	
	public static boolean parsableToInt(String input)
	{
		boolean valid = true;
		int num = 0;
		try {
			num = Integer.parseInt(input);
		} catch(NumberFormatException e){
			valid =  false;
		}
		
		// redundant thing just to remove warning
		Integer.toString(num);
		
		return valid;
	}
	
}
