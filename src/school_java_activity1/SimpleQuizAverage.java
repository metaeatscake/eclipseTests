package school_java_activity1;

public class SimpleQuizAverage 
{
	private double score[];
	private double average;
	
	public SimpleQuizAverage()
	{
		this.score = new double[4];
	}
	public SimpleQuizAverage(int arrayLength)
	{
		this.score = new double[arrayLength];
	}
	
	public void setScore(int index, double value)
	{
		this.score[index] = value;
	}
	
	public int getScoreArrayLength()
	{
		return this.score.length;
	}
	
	public double getAverage()
	{
		double sum = 0;
	
		for(int i = 0; i < getScoreArrayLength(); i++)
		{
			sum += this.score[i];
		}
		
		this.average = sum / getScoreArrayLength();
		
		return this.average;
	}
	
}
