import java.util.*;
public class Number3
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		ArrayList<Integer> factors = new ArrayList<Integer>();
		long number=600851475143L;
		int divisor = 3;
		while (divisor < (int)(Math.sqrt(number)))
		{
			if(number % divisor == 0)
				factors.add(divisor);
			divisor+=2;
		}
		Collections.reverse(factors);
		for(int factor : factors)
		{
			if (checkPrime(factor))
			{
				System.out.println(factor);
				System.out.println("Time: " + s.elapsedTime());
				break;	
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
			divisor++;
		}
		return true;
	}
}
