import java.util.ArrayList;
public class Number46
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int number = 2; number < 10000; number++)
		{
			if(checkPrime(number))
				primes.add(number);
		}
		for (int number = 3; number <= 100000; number+=2)
		{
			if (!checkPrime(number))
			{
				boolean foundResult = false;
				for (int prime : primes)
				{
					if (number - prime < 0)
						break;
					double subtract = (number - prime);
					for (int i = 1; i < 500; i++)
					{
						if (subtract == 2 * (i * i) &&  (subtract == Math.rint(subtract)))
						{
							foundResult = true;
							break;
						}
					}
					if (foundResult)
						break;
				}
				if (!foundResult)
				{
					System.out.println(number);
					System.out.println(s.elapsedTime());
					break;
				}
			}
		}
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

