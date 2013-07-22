public class Number12 
{
	public static void main(String[] args)
	{
		/*
		Stopwatch s = new Stopwatch();
		long naturalSum = 0;
		for (int i = 1; i < 10000000; i++)
		{
			long triangleNumber =  naturalSum + i;
			naturalSum += i;
			int factors = getFactors(triangleNumber);
			if (factors > 500)
			{
				System.out.println(triangleNumber);
				System.out.println(s.elapsedTime());
				break;
			}
		}*/
	}
	Stopwatch s = new Stopwatch();
	long naturalSum = 0;
	for (int i = 1; i < 10000000; i++)
	{
		long triangleNumber naturalSum + i;
		naturalSum += i;
	}
	public static int getFactors(long triangleNumber)
	{
		int divisor = 1, incrementer = 1;
		if (triangleNumber % 2 == 1)
		{
			incrementer = 2;
		}
		int factors = 1; //Counting itself
		while (divisor <= triangleNumber/2)
		{
			if (triangleNumber % divisor == 0)
				factors++;
			divisor+=incrementer;
		}
		return factors;
	}
}

