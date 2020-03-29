package school_java_activity1;

public class NumberDenomination 
{
	
	public static int[] getDenominationArray(int input)
	{
		int oneThousand, fiveHundred, twoHundred, oneHundred, fifty, twenty, ten, five, one;
		
		oneThousand = input / 1000;
		input %= 1000;
		fiveHundred = input / 500;
		input %= 500;
		twoHundred = input / 200;
		input %= 200;
		oneHundred = input / 100;
		input %= 100;
		fifty = input / 50;
		input %= 50;
		twenty = input / 20;
		input %= 20;
		ten = input / 10;
		input %= 10;
		five = input / 10;
		input %= 5;
		one = input;
		
		return new int[]{oneThousand, fiveHundred, twoHundred, oneHundred, fifty, twenty, ten, five, one};
	}
	
	public static void printDenominationArray(int input)
	{
		int temp[] = getDenominationArray(input);
		int labels[] = new int[] {1000, 500, 200, 100, 50, 20, 10, 5, 1};
		
		System.out.println("=====Denominations=====");
		for(int i = 0; i < temp.length; i++)
		{
			if(temp[i] != 0)
			{
				System.out.println("\t" + labels[i] + ":\t" + temp[i]);
			}
		}
	}
}
