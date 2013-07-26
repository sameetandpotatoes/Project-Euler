public class Number21
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		short amicPair1 = 5, amicPair2 = 0, sum_of_pair1 = 0, sum_of_pair2 = 0;
		short answer = 0, divisor = 1, higherPair = 0;
		while (amicPair1 < 10000)
		{
			if (amicPair1 == higherPair) //Skip other pair
				amicPair1++;
			else if (amicPair1 == divisor)
			{
				amicPair2 = sum_of_pair1;
				sum_of_pair2 = pair2Sum(sum_of_pair2, amicPair2);
				if(amicPair1 == sum_of_pair2 && amicPair1 != sum_of_pair1)
				{
					answer += amicPair1 + amicPair2;
					higherPair = sum_of_pair1;
				}
				amicPair1++;
				sum_of_pair1 = 0;
				sum_of_pair2 = 0;
				divisor = 1;
			}
			else if (amicPair1 % divisor == 0)
			{
				sum_of_pair1 += divisor;
				divisor++;
			}
			else
				divisor++;
		}
		System.out.println(answer);
		System.out.println(s.elapsedTime());
	}
	public static short pair2Sum (short sum_of_pair2, short amicPair2)
	{
		int divisor = 1;
		while (divisor != amicPair2)
		{
			if (amicPair2 % divisor == 0)
				sum_of_pair2 +=divisor;
			divisor++;
		}
		return sum_of_pair2;
	}
}
