public class Number27
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int n = 0, a = -999, b =-999, maxPrimeConsecutive = 0;
		long product = 0, prime = 0;
		while (b < 1000)
		{
			if (a == 999)
			{
				a = -999;
				b++;
			}
			do
			{
				prime = (n * n) + (a * n) + b;
				n++;
			}
			while(checkPrime(prime));
			n--; //to get rid of last one
			if (n > maxPrimeConsecutive)
			{
				maxPrimeConsecutive = n;
				product = a * b;
			}
			a++;
			n = 0;
		}
		System.out.println(product);
		System.out.println(s.elapsedTime());
	}
	public static boolean checkPrime(long number)
	{
		if (number < 0) number *= -1;
		int divisor = 2;
		while (divisor <= (long)(Math.sqrt(number)))
		{
			if (number % divisor == 0)
				return false;
			divisor ++;
		}
		return true;
	}
}
