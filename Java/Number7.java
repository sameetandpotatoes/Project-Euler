public class Number7
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int number = 4, counter = 2;
		do
		{
			number++;
			while(!checkPrime(number))
			{
				number++;
			}
			counter++;
		}
		while(counter != 10001);
		System.out.println(number);
		System.out.println("Time: " + s.elapsedTime());
	}
	public static boolean checkPrime(int number)
	{
		int divisor = 2;
		while (divisor <= (int)(Math.sqrt(number)))
		{
			if (number % divisor == 0)
				return false;
			divisor ++;
		}
		return true;
	}
}
