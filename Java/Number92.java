public class Number92
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int counter = 0;
		for (int number = 2; number < 10000000; number++)
		{
			int copyNum = number;
			int sum = 0;
			while (copyNum != 1)
			{
				while (copyNum > 0)
				{
					int digit = copyNum % 10;
					sum += (digit*digit);
					copyNum /= 10;
				}
				copyNum = sum;
				if (copyNum == 89)
				{
					counter++;
					break;
				}
				sum = 0;
			}
		}
		System.out.println(counter);
		System.out.println(s.elapsedTime());
	}

}
