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
		
		System.out.println("=====Denominations=====");
		System.out.println("\t1000:\t" + temp[0]);
		System.out.println("\t500:\t" + temp[1]);
		System.out.println("\t200:\t" + temp[2]);
		System.out.println("\t100:\t" + temp[3]);
		System.out.println("\t50:\t" + temp[4]);
		System.out.println("\t20:\t" + temp[5]);
		System.out.println("\t10:\t" + temp[6]);
		System.out.println("\t5:\t" + temp[7]);
		System.out.println("\t1:\t" + temp[8]);
	}
}
