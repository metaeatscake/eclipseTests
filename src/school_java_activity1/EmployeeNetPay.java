package school_java_activity1;

public class EmployeeNetPay 
{
	private String employeeName;
	private double hoursWorked;
	private double hourRate;
	private double deductions;
	
	public EmployeeNetPay() {}
	public EmployeeNetPay(String employeeName, double hoursWorked, double hourRate, double deductions)
	{
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
		this.hourRate = hourRate;
		this.deductions = deductions;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
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
		return ((hoursWorked*hourRate) - deductions);
	}
	
	public String getEmployeeName()
	{
		return this.employeeName;
	}
}
