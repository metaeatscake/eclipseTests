package school_java_activity2;

public class CourseEnrolleeRemark 
{
	private int enrolleeCount;
	private String courseTitle;
	
	private String[] remarks = new String[] 
	{
		"Dissolved", "Open", "Closed", "Invalid"
	};
	private int[] remarkRange = new int[]
	{
		3,9,10
	};
	
	public CourseEnrolleeRemark() {}
	
	public void setEnrolleeCount(int enrolleeCount)
	{
		this.enrolleeCount = enrolleeCount;
	}
	
	public void setCourseTitle(String courseTitle)
	{
		this.courseTitle = courseTitle;
	}
	
	public int getEnrolleeCount()
	{
		return this.enrolleeCount;
	}
	
	public String getCourseTitle()
	{
		return this.courseTitle;
	}
	
	public String getRemark()
	{
		boolean belowEleven = false;
		String output = "";
		
		for(int i = 0; i < remarkRange.length; i++)
		{
			if(this.enrolleeCount <= remarkRange[i] && this.enrolleeCount >= 0)
			{
				output = remarks[i];
				belowEleven = true;
				break;
			}
		}
		
		if(!belowEleven) 
		{
			output = remarks[remarks.length - 1];
		}
		
		return output;
	}
}
