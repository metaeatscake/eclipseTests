package school_java_activity1;

public class MidtermGrade 
{
	private double midtermGrade;
	private double midtermScore;
	private double minorAScore;
	
	private double weightOfMidtermScore;
	private double weightOfMinorAScore;
	
	public MidtermGrade()
	{
		this.weightOfMidtermScore = 2.0/3.0;
		this.weightOfMinorAScore = 1.0/3.0;
	}
	
	public MidtermGrade(double weightOfMidtermScore, double weightOfMinorAScore)
	{
		this.weightOfMidtermScore = weightOfMidtermScore;
		this.weightOfMinorAScore = weightOfMinorAScore;
	}
	
	public void setMidtermScore(double midtermScore)
	{
		this.midtermScore = midtermScore;
	}
	
	public void setMinorAScore(double minorAScore)
	{
		this.minorAScore = minorAScore;
	}
	
	public double getMidtermGrade()
	{
		this.midtermGrade = (midtermScore * weightOfMidtermScore) + (minorAScore * weightOfMinorAScore);
		return this.midtermGrade;
	}
}
