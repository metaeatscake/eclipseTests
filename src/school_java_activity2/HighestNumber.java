package school_java_activity2;

import java.util.Arrays;
public class HighestNumber 
{
	private double[] array;
	
	public HighestNumber()
	{
		this.array = new double[3];
	}
	
	public HighestNumber(int arraySize)
	{
		this.array = new double[arraySize];
	}
	
	public void addValue(int index, double value)
	{
		this.array[index] = value;
	}
	
	public double getHighest()
	{
		Arrays.sort(array);
		return this.array[array.length-1];
	}
}
