public class Number34
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int finalSum = 145;
		for (int number = 146; number < 1000000; number++)
		{
			int sum = 0;
			int copyNum = number;
			while (copyNum > 0)
			{
				int digit = copyNum % 10;
				sum += factorial(digit);
				copyNum /= 10;
			}
			if (number == sum)
				finalSum += number;
		}
		System.out.println(finalSum);
		System.out.println(s.elapsedTime());
	}
	public static int factorial(int i)
	{
		if (i <= 1)
			return 1;
		else
			return i * factorial(i-1);
	}
}
