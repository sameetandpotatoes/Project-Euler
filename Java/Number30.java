public class Number30
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int finalSum = 0;
		for (int number = 2; number < 1000000; number++)
		{
			int copyNum = number, sumNumber = 0;
			while (copyNum > 0)
			{
				int digit = copyNum % 10;
				sumNumber += Math.pow(digit, 5);
				copyNum /= 10;
			}
			if (number == sumNumber)
				finalSum += number;
		}
		System.out.println(finalSum);
		System.out.println(s.elapsedTime());
	}
}