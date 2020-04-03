package school_java_activity2;

public class EmployeeOvertimePay 
{
	private double hours;
	private double hourRate;
	private double deductions;
	
	public EmployeeOvertimePay() 
	{
		this.hours = 0;
		this.hourRate = 0;
		this.deductions = 0;
	}
	
	public void setHours(double hours)
	{
		this.hours = hours;
	}
	
	public void setHourRate(double hourRate)
	{
		this.hourRate = hourRate;
	}
	
	public void setDeductions(double deductions)
	{
		this.deductions = deductions;
	}
	
	public double getNetPay()
	{
		if(this.hours >= 0 && this.hours <= 40)
		{
			return (this.hours * this.hourRate) - this.deductions;
		}
			
		else if(this.hours > 40 && this.hours <= 50)
		{
			return ((this.hourRate * 40) + ((this.hours - 40) * 1.5)) - this.deductions;
		}
		
		else if(this.hours > 50)
		{
			return ((this.hourRate * 40) + (this.hourRate * 10 * 1.5) + ((this.hours - 50) * 2)) - this.deductions;
		}
		
		else 
		{
			return 0;
		}
			
	}
}
