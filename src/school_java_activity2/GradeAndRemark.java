package school_java_activity2;

public class GradeAndRemark 
{
	private double midtermExamScore;
	private double finalExamScore;
	
	private String[] remarks = new String[] 
	{
		"Fail","Pass","Fair","Good","Excellent"
	};
	
	private double[] remarkRange = new double[]
	{
		60,	70,	80,	90,	100
	};
	
	public GradeAndRemark() {}
	
	public void setMidtermExamScore(double midtermExamScore)
	{
		this.midtermExamScore = midtermExamScore;
	}
	
	public void setFinalExamScore(double finalExamScore)
	{
		this.finalExamScore = finalExamScore;
	}
	
	public double getGrade()
	{
		return (this.midtermExamScore * 0.4) + (this.finalExamScore * 0.6);
	}

	public String getRemark()
	{
		String output = "";
		for(int i = 0; i < remarks.length; i++)
		{
			if(getGrade() <= remarkRange[i])
			{
				output = remarks[i];
				break;
			}
		}
		
		return output;
	}
}
