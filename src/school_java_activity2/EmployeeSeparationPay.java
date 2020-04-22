package school_java_activity2;

public class EmployeeSeparationPay 
{
	private int[] yearRange = new int[] {5, 10, 15};
	private double[] multiplier = new double[] {1.5, 2, 2.5, 3};
	private String employeeName;
	private double basicSalary;
	private double serviceTime;
	
	public EmployeeSeparationPay(){}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public void setBasicSalary(double basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	
	public void setServiceTime(double serviceTime)
	{
		this.serviceTime = serviceTime;
	}
	
	public String getEmployeeName()
	{
		return this.employeeName;
	}
	
	public double getBasicSalary()
	{
		return this.basicSalary;
	}
	
	public double getServiceTime()
	{
		return this.serviceTime;
	}
	
	public double getSeparationPay()
	{
		double output = 0;
		boolean above15 = true;
		for(int i = 0; i < yearRange.length; i++)
		{
			if(this.serviceTime <= 0)
			{
				output = 0;
				above15 = false;
				break;
			}
			else if(this.serviceTime <= yearRange[i])
			{
				output = multiplier[i] * this.basicSalary * this.serviceTime;
				above15 = false;
				break;
			}
		}
		
		if(above15)
		{
			output = multiplier[multiplier.length-1] * this.basicSalary * this.serviceTime;
		}
		
		
		return output;
	}
}
