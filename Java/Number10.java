public class Number10
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		long sum = 10;
		for (int number = 7; number < 2000000; number+=2)
		{	
			if (checkPrime(number))
				sum += number;
		}
		System.out.println(sum);
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
