import java.util.*;
public class Number50
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		ArrayList<Integer> primes = ESieve(1000000);
		int sum = -10, i = 0; //Euler starts counting at 7, since 2 + 3 + 5 = 10, I subtracted those from the answer
		int answer = 0;
		while (sum < 1000000)
		{
			sum += primes.get(i);
			if (checkPrime(sum))
				answer = sum;
			i++;
		}
		System.out.println(answer);
		System.out.println(s.elapsedTime());
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
	public static ArrayList<Integer> ESieve(int upperLimit)
	{
		boolean[] isPrime = new boolean[upperLimit + 1];
		for (int i = 2; i <= upperLimit; i++)
		    isPrime[i] = true;
		for (int i = 2; i*i <= upperLimit; i++)
	            if (isPrime[i])
	                for (int j = i; i*j <= upperLimit; j++)
	                    isPrime[i*j] = false;
		ArrayList<Integer>primes = new ArrayList<Integer>();
		for (int i = 2; i <= upperLimit; i++)
			if (isPrime[i])
				primes.add(i);
		return primes;
	}
}