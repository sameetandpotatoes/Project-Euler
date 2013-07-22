import java.util.ArrayList;
public class Number12 
{
	public static void main(String[] args)
	{
		
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
		}
	}
	public static ArrayList<Integer> getPrime()
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		for (int i = 5; i < 100; i++)
		{
			if (checkPrime(i))
				primes.add(i);
		}
		return primes;
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
	public static int getFactors(long triangleNumber)
	{
		ArrayList<Integer> factors = getPrime();
		int product = 1; //product will be number of factors
		for (int i = 0; i < factors.size(); i++)
		{
			int counter = 0;
			while (triangleNumber > 0 && triangleNumber % factors.get(i) == 0)
			{
				counter++;
				triangleNumber/=factors.get(i);
			}
			product *= (counter + 1);
		}			
		return product;
	}
}

