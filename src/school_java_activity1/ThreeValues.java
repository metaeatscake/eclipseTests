package school_java_activity1;

public class ThreeValues 
{
	private double num1;
	private double num2;
	private double num3;
	
	public ThreeValues() {}
	
	public void setNum1(double num1)
	{
		this.num1 = num1;
	}
	public void setNum2(double num2)
	{
		this.num2 = num2;
	}
	public void setNum3(double num3)
	{
		this.num3 = num3;
	}
	
	public double getNum1()
	{
		return this.num1;
	}
	public double getNum2()
	{
		return this.num2;
	}
	public double getNum3()
	{
		return this.num3;
	}
	
	public static double getDifference(double numA, double numB)
	{
		return Math.abs(numA - numB);
	}
	
	public static double getSquareSum(double numA, double numB)
	{
		return Math.pow((numA + numB), 2);
	}
	
	public static double getAverage(double numA, double numB, double numC)
	{
		return((numA + numB + numC)/3);
	}
	
}
