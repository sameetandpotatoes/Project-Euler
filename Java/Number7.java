public class Number7
{
	public static void main(String[] args)
	{
		long time = System.currentTimeMillis();
		int number = 2, div = 2, counter = 0;
		while (true)
		{
			if (checkPrime(number, div))
			{
				counter++;
				if (counter == 10001)
				{
					System.out.println(number);
					System.out.println("Time: " + (System.currentTimeMillis() - time) + " milliseconds");
					System.exit(0);
				}
			}
			number++;
		}
	}
	public static boolean checkPrime (int number, int div)
	{
		while (div != ((int) Math.sqrt(number) + 1))
		{
			if (number % div != 0) div++;
			else return false;
		}
		return true;
	}
}
